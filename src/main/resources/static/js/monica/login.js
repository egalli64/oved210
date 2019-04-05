//con questa funzione stiamo limitando il login quando l'utente non inserisce lo user

function checkUser(){
	//controllo sull' user
	 let user= document.getElementById("userId");
	 
	 if (user.value.length == 0 || user.char  ){
		 
		 alert("User name is missing!"); //popup che indica l'errore
		 user.focus(); // metti focus del controllo sull' user 
		 
		 return false; //quando l'utente non inserisce niente nel campo user del login
	 }
	
	 
	 
	 let pwd= document.getElementById("pwdId");
	 
	 if (pwd.value.length == 0 ){
		 alert("User password is missing!");
		 pwd.focus();
	 
		 return false;
	 
	 }
	  
	 return true;  //quando l'utente ha inserito lo user e la password
	 
}