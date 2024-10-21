precision mediump float;

uniform sampler2D sTexture;
varying vec2 vTextureCoord;

const vec3 luminanceWeights = vec3(0.299, 0.587, 0.114);

void main() {
    vec4 color = texture2D(sTexture, vTextureCoord);
    float luma = dot(color.rgb, luminanceWeights);
    gl_FragColor = vec4(luma, luma, luma, luma);
}
