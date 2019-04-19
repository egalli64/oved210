function checkUser() {
	// 1. check user name
	let user = document.getElementById("userId");

	if (user.value.length == 0) {
		alert("User name is missing!");
		user.focus();
		return false;
	}

	// 2. check password
	let password = document.getElementById("pwdId");
	if (password.value.length == 0) {
		alert("Password is missing!");
		password.focus();
		return false;
	}

	// OK
	return true;
}
function checkDate() {
	let dateIn = document.getElementById("dataInId").value;
	let dateOut = document.getElementById("dataOutId").value;
	
	let now = new Date();
	let date1 = new Date(dateIn);
	let date2 = new Date(dateOut);
	
	if(date1 < now) {
		alert("Date uncorrect!");
		return false;
		
	}
	
	
	if(date2 < date1) {
		alert("Date uncorrect!");
		return false;
		
	}
	
	return true;
	
	}



