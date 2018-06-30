var gl;
var points;
var maxT=100;
var maxV=3*maxT;
var first=true;
var t1, t2, t3,t4;
var index=0;

window.onload = function init(){
    var canvas = document.getElementById( "gl-canvas" );
     gl = WebGLUtils.setupWebGL( canvas );    
     if ( !gl ) {
	 alert( "WebGL isn't available" );
    }        
//  Configure WebGL   
	gl.viewport( 0, 0, canvas.width, canvas.height );
	gl.clearColor( 0.0, 0.0, 0.0, 1.0 );   
     
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
    
	canvas.addEventListener("mousedown", function(){
		gl.bindBuffer(gl.ARRAY_BUFFER, vBuffer);
		if(first){
			first=false;
			gl.bindBuffer(gl.ARRAY_BUFFER, vBuffer);
			t1= vec2(2*event.clientX/canvas.width-1, 2*(canvas.height-event.clientY)/canvas.height-1);
		}
		else{
			first=true;
			t2= vec2(2*event.clientX/canvas.width-1, 2*(canvas.height-event.clientY)/canvas.height-1);
			t3= vec2(t1[0], t2[1]);
			t4= vec2(t2[0], t1[1]);
			
			gl.bufferSubData(gl.ARRAY_BUFFER,8*index, flatten(t1));
			gl.bufferSubData(gl.ARRAY_BUFFER,8*(index+1), flatten(t3));
			gl.bufferSubData(gl.ARRAY_BUFFER,8*(index+2), flatten(t2));
			gl.bufferSubData(gl.ARRAY_BUFFER,8*(index+3), flatten(t4));
		}
		index=index+4;
		});
	render();
};


function render() {
    gl.clear( gl.COLOR_BUFFER_BIT );
	for(var i=0;i<index;i+=4)
		gl.drawArrays( gl.TRIANGLE_FAN, i, 4 );
	requestAnimFrame(render);
} 


  

