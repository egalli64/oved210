function checkUser(){
	//1: check user
	let user = document.getElementById("userId");
	if(user.value.length == 0) {
		
		alert("User name is missing!");
		user.focus();
		return false;
		
	}
	
	
	//2: check password
	let pwd = document.getElementById("pwdId");
	if(pwd.value.length == 0) {
		
		alert("User password is missing!");
		pwd.focus();
		return false;
		
	}
	
	//OK
	return true;
};