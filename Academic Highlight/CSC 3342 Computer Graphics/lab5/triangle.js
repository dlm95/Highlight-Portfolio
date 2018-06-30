var gl;
var points;
window.onload = function init(){
    var canvas = document.getElementById( "gl-canvas" );
     gl = WebGLUtils.setupWebGL( canvas );    
     if ( !gl ) {
	 alert( "WebGL isn't available" );
    }        
// Three Vertices
var num = 15000;
var pos = 0;
var x = -1;
var left = 0;
var bottom = 0;
var width = canvas.width/2;
var height = canvas.height;        
var vertices = [ vec2(0.5,-0.6), vec2(-0.3, -0.4),vec2(0.6, 0.7),
                  vec2(-0.7,-0.7), vec2(-0.4,0.8), 
                  vec2(-0.4,-0.6),  vec2(-0.1,0.7), 
                  vec2(0.3,-0.7) , vec2(0.4,0.6)
];   
//  Configure WebGL   
//gl.viewport( 0, 0, canvas.width, canvas.height );
gl.clearColor( 1.0, 0.5, 0.0, 1.0 );   
     
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
     // render();
	gl.clear( gl.COLOR_BUFFER_BIT );
	gl.clear( gl.COLOR_BUFFER_BIT ); 
    gl.viewport(left,bottom,width,length);
	gl.drawArrays( gl.POINTS, 0, 3 );
	left = width;
	gl.viewport(left,bottom,width,length);
	gl.drawArrays( gl.LINES, 3, 6 );
}

function render() {

}   

