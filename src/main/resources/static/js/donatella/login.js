function checkUser(){
	let user =document.getElementById("userId");
	
	if(user.value.lenght ==0){
		alert("User name is missing!");
		user.focus();
		return false;
		}
	
	//ok
	return true;
}
let password =document.getElementById("pwdId");

if(password.value.lenght ==0){
	alert("Password is missing!");
	user.focus();
	return false;
	}