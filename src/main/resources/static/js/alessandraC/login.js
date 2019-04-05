function checkUser() {
	//1:check user name
	let user = document.getElementById("userId");
	
	if(user.value.length == 0) {
		alert("User name is missing!");
		user.focus(); 								//metti il controllo sullo user;
		return false;
	}

	//2:check password
	let password = document.getElementById("pwdId");
	
	if(password.value.length == 0) {
		alert("Password is missing!");
		password.focus(); 								//metti il controllo sulla password;
		return false;
	}
	
	//OK
	return true;
	
}