
/**
 * @fileoverview Helper javascript functions for the web view.
 * @suppress {strictMissingProperties}
 */

window.imageDetection = window.imageDetection || {};

// The minimum opacity for an element to be considered as opaque.
window.imageDetection.OPACITY_THRESHOLD = 0.9;

// The minimum image size for an image to be considered high-quality.
window.imageDetection.IMAGE_SIZE_THRESHOLD = 128.0 * 128.0;

/**
 * Calls the evaluateElementAtPoint method with the given parameters, then
 * returns an image source URL if the element is a high-quality image (the
 * image size is bigger or equal than the image size threshold). In other
 * cases, it returns an empty string. It also returns the image link URL.
 * @param {number} xCoordinate The X coordinate of the target location, in
 *     screen space.
 * @param {number} yCoordinate The Y coordinate of the target location, in
 *     screen space.
 * @param {number} width The size of the webview width.
 * @param {number} height The size of the webview height.
 * @return {Dict!} The dict with the image source and image link URL strings,
 *     and the isImage boolean
 */
window.imageDetection.getImageUrlsAtPoint = function(
    xCoordinate, yCoordinate, width, height) {
  let elementAtPointInformation =
      evaluateElementAtPoint(xCoordinate, yCoordinate, width, height);
  let tagURLDict = {};
  tagURLDict.imgSrc = elementAtPointInformation.imgSrc;
  tagURLDict.imgLinkUrl = elementAtPointInformation.url;
  tagURLDict.isImage = true;

  if (elementAtPointInformation.tagName != 'img') {
    tagURLDict.imgSrc = '';
    tagURLDict.isImage = false;
  }

  if ((elementAtPointInformation.width * elementAtPointInformation.height) <
      window.imageDetection.IMAGE_SIZE_THRESHOLD) {
    tagURLDict.imgSrc = '';
  }

  return tagURLDict;
};

/**
 * Returns information about the topmost element at the given coordinates.
 * Searches through the elements at the given point, sorted by descending
 * z-index, stopping if the number of iterations exceeds the given depth or if
 * an opaque element is reached.
 * @param {number} xCoordinate The X coordinate of the target location, in
 *     screen space.
 * @param {number} yCoordinate The Y coordinate of the target location, in
 *     screen space.
 * @param {number} width The size of the webview width.
 * @param {number} height The size of the webview height.
 * @return {Dict?} The tagDict object on the pointed location.
 */
evaluateElementAtPoint = function(xCoordinate, yCoordinate, width, height) {
  let pointX = xCoordinate * (window.innerWidth / width);
  let pointY = yCoordinate * (window.innerHeight / height);

  let tagURLDict = {};
  tagURLDict.tagName = '';
  tagURLDict.imgSrc = '';
  tagURLDict.url = '';
  tagURLDict.width = 0;
  tagURLDict.height = 0;

  let image =
      findTopmostVisibleElement(
          window.document, pointX, pointY, /* condition= */ checkForImage)
          .element;
  let anchor =
      findTopmostVisibleElement(
        window.document, pointX, pointY, /* condition= */ checkForAnchor)
        .element;

  // Checks if the top most visible element is an image
  if (image) {
    tagURLDict.tagName = 'img';
    tagURLDict.imgSrc = getImageSource(image);

    const boundingClientRect = image.getBoundingClientRect();
    tagURLDict.left = boundingClientRect.left;
    tagURLDict.top = boundingClientRect.top;
    tagURLDict.width = boundingClientRect.width;
    tagURLDict.height = boundingClientRect.height;

    if (anchor) {
      tagURLDict.url = getUrl(anchor);
    }
  }

  return tagURLDict;
};

/**
 * Find the topmost visible element at the given coordinates that satisfies the
 * given condition.
 * @param {Object!} root The Document or ShadowRoot to search within.
 * @param {number} pointX The X coordinate of the target location.
 * @param {number} pointY The Y coordinate of the target location.
 * @param {function(Element!): Element?} condition Condition that the element
 *     must meet to be considered as a candidate.
 * @return {{element: ?Element, isOpaque:boolean}}
 *     element - The topmost element satisfying the condition, or null if no
 *       such element exists.
 *     isOpaque - Whether recursion was halted due to an opaque element.
 */
function findTopmostVisibleElement(root, pointX, pointY, condition) {
  const elements = root.elementsFromPoint(pointX, pointY);
  for (let i = 0; i < elements.length; i++) {
    let element = elements[i];

    // Return immediately if the element satisfies the condition.
    const candidate = condition(element);
    if (candidate) {
      return {element: candidate, isOpaque: false};
    }

    // elementsFromPoint will only return the root of a shadow tree.
    // Therefore, we also need to check elements in the shadow DOM.
    if (element.shadowRoot && element.shadowRoot != root) {
      const {element: shadowElement, isOpaque} = findTopmostVisibleElement(
          element.shadowRoot, pointX, pointY, condition);

      if (shadowElement !== null) {
        return {element: shadowElement, isOpaque: false};
      } else if (isOpaque) {
        return {element: null, isOpaque: true};
      }
    }

    // If the element blocks the user from viewing elements underneath it, break
    // and do not check the rest of the elements.
    if (isOpaqueElement(element)) {
      return {element: null, isOpaque: true};
    }
  }
  return {element: null, isOpaque: false};
}

/**
 * Checks if the element blocks the user from viewing elements underneath it.
 * @param {Element!} element Element in the page.
 * @return {boolean} True if the element blocks viewing of other elements.
 */
function isOpaqueElement(element) {
  const style = window.getComputedStyle(element);

  const isVisible = style.getPropertyValue('display') !== 'none' &&
      style.getPropertyValue('visibility') === 'visible';
  const isOpaque = Number(style.getPropertyValue('opacity')) >=
      window.imageDetection.OPACITY_THRESHOLD;

  // We consider an element opaque if it has a background color with an alpha
  // value of 1. To check this, we check to see if only rgb values are returned
  // or all rgba values are (the alpha value is only returned if it is not 1).
  const hasOpaqueBackgroundColor =
      style.getPropertyValue('background-color').split(', ').length === 3;
  const hasBackground = isImage(element) || hasOpaqueBackgroundColor;

  return isVisible && isOpaque && hasBackground;
}

/**
 * Returns the element if it is a clickable anchor element, otherwise null.
 * @param {Element!} element Element in the page.
 * @return {Element?} The element if it is a clickable anchor element,
 * otherwise null.
 */
function checkForAnchor(element) {
  if (isAnchor(element)) {
    return element;
  }

  const style = window.getComputedStyle(element);
  const eltVisible = style.getPropertyValue('display') !== 'none' &&
      style.getPropertyValue('visibility') === 'visible';
  if (!eltVisible) {
    return null;
  }

  // Search for anchor elements using element.closest(), since
  // elementsFromPoint skips anchor elements within an <svg> element.
  const closestElt = element.closest('a');
  return closestElt && isAnchor(closestElt) ? closestElt : null;
}

/**
 * Checks if the element is a clickable <a> element.
 * @param {Element!} element Element in the page.
 * @return {boolean} True if element is a clickable <a> element.
 */
function isAnchor(element) {
  const tag = element && element.tagName ? element.tagName.toLowerCase() : '';
  const style = window.getComputedStyle(element);
  return tag === 'a' && style.getPropertyValue('display') !== 'none' &&
      style.getPropertyValue('visibility') === 'visible';
}

/**
 * Returns the element if it appears as an image to the user, otherwise null.
 * @param {Element!} element Element in the page.
 * @return {Element?} The element if it appears as an image to the user,
 *    otherwise null.
 */
function checkForImage(element) {
  return isImage(element) ? element : null;
}

/**
 * Checks if the element appears as an image to the user. This is not
 * necessarily an <img> element as images can be represented in various ways in
 * the DOM.
 * @param {Element!} element Element in the page.
 * @return {boolean} True if element appears as an image to the user.
 */
function isImage(element) {
  const style = window.getComputedStyle(element);

  const hasImageSource = getImageSource(element) !== '';
  const isVisible = style.getPropertyValue('display') !== 'none' &&
      style.getPropertyValue('visibility') === 'visible';
  const isOpaque = Number(style.getPropertyValue('opacity')) >=
      window.imageDetection.OPACITY_THRESHOLD;
  return hasImageSource && isVisible && isOpaque;
}

/**
 * Returns true if the element tag is <img>.
 * @param {Element?} element Element in the page.
 * @return {boolean} True if the element tag is <img>.
 */
function isImageElementType(element) {
  const elementTagName =
      element && element.tagName ? element.tagName.toLowerCase() : '';
  return elementTagName === 'img';
}

/**
 * Returns the image source if the element is an <img> or an element with a
 * background image.
 * @param {Element?} element Element in the page.
 * @return {string} Image source.
 */
function getImageSource(element) {
  if (isImageElementType(element) && (element instanceof HTMLImageElement)) {
    // Check width/height to see if src is set and valid.
    const hasSource = element.currentSrc || element.src;
    const sourceIsValid = element.naturalWidth > 0 && element.naturalHeight > 0;

    if (hasSource && sourceIsValid) {
      return element.currentSrc || element.src;
    }
  }

  const backgroundImageString =
      window.getComputedStyle(element).backgroundImage;
  if (backgroundImageString === '' || backgroundImageString === 'none') {
    return '';
  }

  return extractUrlFromBackgroundImageString(backgroundImageString);
}

/**
 * Returns an url if it is the first background image in the string. Otherwise,
 * returns an empty string.
 * @param {string} backgroundImageString String of the CSS background image
 *     property of an element.
 * @return {string} An url if it is the first background image in the string or
 *     an empty string if it is not.
 */
function extractUrlFromBackgroundImageString(backgroundImageString) {
  // backgroundImageString can contain more than one background image, some of
  // which may be urls or gradients.
  // Example: 'url("image1"), linear-gradient(#ffffff, #000000), url("image2")'
  const regex = /^url\(['|"]?(.+?)['|"]?\)/;
  const url = regex.exec(backgroundImageString);

  if (!url || url === '') {
    return '';
  }

  return url[1];
}

/**
 * Returns the URL of the given element.
 * @param {Element!} element Element in the page.
 * @return {string} URL of the element or an empty string.
 */
function getUrl(element) {
  const href = element.href;

  if (href === undefined || href === null) {
    return '';
  } else if (href instanceof SVGAnimatedString) {  // SVGAElement case
    return href.baseVal;
  } else {  // HTMLAElement case
    return href;
  }
}