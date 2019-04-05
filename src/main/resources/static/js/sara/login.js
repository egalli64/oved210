function checkUser(){
	//first: check user
	let user = document.getElementById("userId");
	
	if(user.value.length == 0){
		alert("User name is missing!");
		user.focus();
		return false;
	}
	
	//second: check password
	let password = document.getElementById("pwdId");
	if(password.value.length == 0){
		alert("Password is missing!");
		password.focus();
		return false;
	}
	
	return true;
	
}