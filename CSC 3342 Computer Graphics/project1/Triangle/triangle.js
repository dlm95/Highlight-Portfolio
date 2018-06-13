 var gl;
var points;
window.onload = function init(){
    var canvas = document.getElementById( "gl-canvas" );
     gl = WebGLUtils.setupWebGL( canvas );    
     if ( !gl ) {
	 alert( "WebGL isn't available" );
    }        
// Three Vertices 
var l = .5;
var pi= 3.1415926;       
var vertices = [  
	vec2( 0, l ), 
	vec2( l * Math.cos(3*pi/10) ,  - l * Math.sin(3*pi/10) ),
	vec2(  - l * Math.cos(pi/10) ,  l *Math.sin(pi/10) ),
	vec2( l * Math.cos(pi/10) ,  l *Math.sin(pi/10) ),
	vec2( - l * Math.cos(3*pi/10) ,  - l* Math.sin(3*pi/10) ) , 
  
 vec2(  l * Math.cos(pi/10) ,  l *Math.sin(pi/10) )//shading points
 ,vec2(  -l * Math.cos(3*pi/10) ,   l *Math.sin(pi/10) )
 ,vec2(  - l * Math.cos(3*pi/10) ,  - l *Math.sin(3*pi/10) )
 /**vec2(  l * Math.cos(pi/10) ,  l *Math.sin(pi/10) )//shading points
 ,vec2(  -l * Math.cos(3*pi/10) ,   l *Math.sin(pi/10) )
 ,vec2(  - l * Math.cos(3*pi/10) ,  - l *Math.sin(3*pi/10) )
 vec2(  l * Math.cos(pi/10) ,  l *Math.sin(pi/10) )//shading points
 ,vec2(  -l * Math.cos(3*pi/10) ,   l *Math.sin(pi/10) )
 ,vec2(  - l * Math.cos(3*pi/10) ,  - l *Math.sin(3*pi/10) )**/
 ];

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
    gl.drawArrays( gl.LINE_LOOP, 0, 5 );
	gl.drawArrays(gl.TRIANGLES,5,3);
}   

