function checkUser() {
	let user = document.getElementById("userId");
	let password = document.getElementById("pwdId");

	if (user.value.length == 0) {
		alert("User name is missing!");
		user.focus();
		return false;
	}

	if (password.value.length == 0) {
		alert("Password is missing!");
		password.focus();
		return false;
	}
	
	return true;
}
