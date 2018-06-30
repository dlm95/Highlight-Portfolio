var gl;
var points;
var theta=0;
var thetaLoc;
var direction = true; 
var delay = 100;


window.onload = function init(){
    var canvas = document.getElementById( "gl-canvas" );
	var myButton = document.getElementById("DirectionButton");
	var m = document.getElementById("mymenu");


     gl = WebGLUtils.setupWebGL( canvas );    
     if ( !gl ) {
	 alert( "WebGL isn't available" );

	 }
	 
	 document.getElementById("DirectionButton").onclick =
function() { direction = !direction; };

m.addEventListener("click", function() {
   switch (m.selectedIndex) {
      case 0:
          direction = !direction;
          break;
      case 1:
          delay /= 2.0;
          break;
      case 2:
          delay *= 2.0;
          break;
       }
});

window.addEventListener("keydown", function() {
   switch (event.keyCode) {
      case 49: // ’1’ key
         direction = !direction;
         break;
      case 50: // ’2’ key
         delay /= 2.0;
         break;
      case 51: // ’3’ key
         delay *= 2.0;
         break;
   }
});

document.getElementById("slide").onchange =
   function() { delay = event.srcElement.value; };

// Three Vertices  
 var vertices = [vec2(0,1 ),
                vec2( 1, 0 ),
                vec2(  -1,  0 ),
                vec2(  0, -1 )];


//  Configure WebGL   
gl.viewport( 0, 0, canvas.width, canvas.height); //0, 0, canvas.width, canvas.height
gl.clearColor( 1.0, 1.0, 1.0, 1.0 );  // 1.0, 1.0, 1.0, 1.0
     
//  Load shaders and initialize attribute buffers
var program = initShaders( gl, "vertex-shader", "fragment-shader" );
 gl.useProgram( program );  
thetaLoc = gl.getUniformLocation(program, "theta");
 
// Load the data into the GPU        
    var bufferId = gl.createBuffer();
    gl.bindBuffer( gl.ARRAY_BUFFER, bufferId );
    gl.bufferData( gl.ARRAY_BUFFER, flatten(vertices), gl.STATIC_DRAW ); 

// Associate out shader variables with our data buffer
      var vPosition = gl.getAttribLocation( program, "vPosition" );
      gl.vertexAttribPointer( vPosition, 2, gl.FLOAT, false, 0, 0 );
      gl.enableVertexAttribArray( vPosition );    
      render();
}
function render()
{
	
    setTimeout( function()  {
	  requestAnimFrame(render);
     gl.clear(gl.COLOR_BUFFER_BIT);
     if(direction) theta += 0.1;
     else theta -= 0.1;
     gl.uniform1f(thetaLoc, theta);
     gl.drawArrays(gl.TRIANGLE_STRIP, 0, 4);
	} ,delay);

}

