function checkUser() {
	// check user name
	let user = document.getElementById("userId");

	if (user.value.length == 0) {
		alert("User name is missing!");
		user.focus();
		return false;
	}

	// check password
	let password = document.getElementById("pwdId");
	if (password.value.length == 0) {
		alert("Password is missing!");
		password.focus();
		return false;
	}

	// 
	return true;

}

function checkRooms() {
	let roomCounter = document.getElementById("roomCounter");
	if (roomCounter.value <= 0) {
		alert("The number of rooms is incorrect!");
		roomCounter.focus();
		return false;

	}

	return true;
}

function checkId() {
	let clientId = document.getElementById("clientId");
	let hotelId =  document.getElementById("hotelId");
	let room = document.getElementById("room");
	if (clientId.value <= 0 || hotelId.value <= 0 || room.value <= 0 ) {
		alert("You can't insert negative values!");
		clientId.focus();
		hotelId.focus();
		room.focus();
		
		return false;

	}

	return true;
}