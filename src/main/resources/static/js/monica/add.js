
function checkAdd(){
	//controllo su x
	
	let x= document.getElementById("valueX");
	
	if (x.value.length == 0){
		alert("X value is missing!"); //
		 x.focus(); // 

		 return false;
	}
	let y= document.getElementById("valueY");
		 
		 if (y.value.length == 0 ){
			 alert("Y value is missing!");
			 y.focus();
		 
			 return false;
		 
		 }
		  
		 return true; 
		 
	}
	