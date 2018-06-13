var gl;
var points;
window.onload = function init(){
    var canvas = document.getElementById( "gl-canvas" );
     gl = WebGLUtils.setupWebGL( canvas );    
     if ( !gl ) {
	 alert( "WebGL isn't available" );
    }        
// Three Vertices        
var vertices = [ ];
var nop = 50;
var r = 0.5;
vertices.push(vec2(0,0));

for ( var i = 0; i <= nop; i++ )
{
	vertices.push(vec2(r*Math.cos(i/nop*2*Math.PI),r*Math.sin(i/nop*2*Math.PI)));
}
//  Configure WebGL   
gl.viewport( 0, 0, canvas.width, canvas.height ); //0, 0, canvas.width, canvas.height
gl.clearColor( 1.0, 1.0, 0.0, 1.0 );  // 1.0, 1.0, 1.0, 1.0
     
//  Load shaders and initialize attribute buffers
var program = initShaders( gl, "vertex-shader", "fragment-shader" );
 gl.useProgram( program );        
// Load the data into the GPU        
    var bufferId = gl.createBuffer();
    gl.bindBuffer( gl.ARRAY_BUFFER, bufferId );
    gl.bufferData( gl.ARRAY_BUFFER, flatten(vertices), gl.STATIC_DRAW ); 

// Associate out shader variables with our data buffer
      var vPosition = gl.getAttribLocation( program, "vPosition" );
      gl.vertexAttribPointer( vPosition, 2, gl.FLOAT, false, 0, 0 );
      gl.enableVertexAttribArray( vPosition );    
      render();
};
function render() {
    gl.clear( gl.COLOR_BUFFER_BIT ); 
    gl.drawArrays( gl.TRIANGLE_FAN, 0,52 );
}   

