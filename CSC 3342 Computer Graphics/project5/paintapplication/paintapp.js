var gl;
var points;
var maxT=100;
var maxV=3*maxT;
var first=true;
var t1, t2,t3,t4;
var index = 0;
var cindex =0;
var colors = [
vec4(0.0,0.0,0.0,1.0),//black
vec4(0.0,1.0,0.0,1.0),//green
vec4(0.0,0.0,1.0,1.0),//blue
vec4(1.0,0.0,0.0,1.0),//red
vec4(1.0,1.0,0.0,1.0),//yellow
vec4(1.0,0.0,1.0,1.0),//magenta
vec4(0.0,1.0,1.0,1.0) ];//cyan


window.onload = function init(){
    var canvas = document.getElementById( "gl-canvas" );
     gl = WebGLUtils.setupWebGL( canvas );    
     if ( !gl ) {
	 alert( "WebGL isn't available" );
    }        
      


//  Configure WebGL   
gl.viewport(0, 0, canvas.width, canvas.height ); //0, 0, canvas.width, canvas.height
gl.clearColor( 1.0, 1.0, 1.0, 1.0 );
     
//  Load shaders and initialize attribute buffers
	var program = initShaders( gl, "vertex-shader", "fragment-shader" );
	gl.useProgram( program );  
 
// Load the data into the GPU        
    var vBuffer = gl.createBuffer();
    gl.bindBuffer( gl.ARRAY_BUFFER, vBuffer );
    gl.bufferData( gl.ARRAY_BUFFER, 8*maxV, gl.STATIC_DRAW ); 

// Associate out shader variables with our data buffer
      var vPosition = gl.getAttribLocation( program, "vPosition" );
      gl.vertexAttribPointer( vPosition, 2, gl.FLOAT, false, 0, 0 );
      gl.enableVertexAttribArray( vPosition ); 
	  
// Load the data into the GPU        
    var cBuffer = gl.createBuffer();
    gl.bindBuffer( gl.ARRAY_BUFFER, cBuffer );
    gl.bufferData( gl.ARRAY_BUFFER, 16*maxV, gl.STATIC_DRAW ); 

// Associate out shader variables with our data buffer
      var vColor = gl.getAttribLocation( program, "vColor" );
    gl.vertexAttribPointer( vColor, 4, gl.FLOAT, false, 0, 0 );
    gl.enableVertexAttribArray( vColor ); 
	  
	  var m=document.getElementById("mymenu");
		m.addEventListener("click",function(){
		cindex = m.selectedIndex;
		});
	  

		canvas.addEventListener("click", function(){
			
			
				gl.bindBuffer(gl.ARRAY_BUFFER, vBuffer);
				t1=vec2(2*event.clientX/canvas.width-1, 2*(canvas.height-event.clientY)/canvas.height-1);
			
		   
	       
		   
		   gl.bufferSubData(gl.ARRAY_BUFFER,8* index, flatten(t1));
		   
		
		   
		   gl.bindBuffer(gl.ARRAY_BUFFER,cBuffer);
		   var c = vec4(colors[index%7]);
		   
		   gl.bufferSubData(gl.ARRAY_BUFFER,16* index, flatten(c));
		   
			
		 index++;
	 });
	 render();
};

function render()
{
	gl.clear(gl.COLOR_BUFFER_BIT);
	
		gl.drawArrays(gl.TRIANGLE_STRIP, 0, index);
	requestAnimFrame(render);
   

}

