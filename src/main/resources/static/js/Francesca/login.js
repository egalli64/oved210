function checkUser() {
	// 1 : check user name
	  let user = document.getElementById("userId");
	  
	  if(user.value.length == 0) {
		       alert("User name is missing!");
		       user.focus();
		       return false;
	  }
	  
	  // 2 : check password
	  
	  
	  
	  //ok
	  return true;
}