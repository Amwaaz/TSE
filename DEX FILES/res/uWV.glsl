uniform mat4 uPreviewM;
attribute vec4 vPosition;
attribute vec2 aTexCoordinate;

varying vec2 vTextureCoord;

void main() {
  vTextureCoord = aTexCoordinate;
  gl_Position = uPreviewM * vPosition;
}
