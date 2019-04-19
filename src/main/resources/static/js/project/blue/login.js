function checkUser() {

	let user = document.getElementById("userId");

	if (user.value.length == 0) {
		alert("User name is missing!");
		
			user.focus();
			return false;

	}
	let password = document.getElementById("pwdId");

	if (password.value.length == 0) {
		alert("Password is missing!");
		password.focus();
		return false;
	}
	return true;
}

function checkId() {
	let name = document.getElementById("name");
	let email = document.getElementById("email");
	let phone = document.getElementById("phone");
	if (name.value == 0) {
		alert("Missing info - Insert your name!");
		
			name.focus();
			return false;
	}

	if (email.value == 0) {
		alert("Missing info - Insert your email!");
		
			email.focus();
	
		return false;
	}
	if (phone.value <= 0) {
		alert("You can't insert a negative phone number!");
		
			phone.focus();
			return false;

		
	}
	return true;
}

function checkRooms() {
	let roomCounter = document.getElementById("roomCounter");
	let hotelName = document.getElementById("hotelName");
	let cityName = document.getElementById("cityName");

	if (hotelName.value == 0) {
		alert("Missing info - Fill the input Hotel Name!");
			hotelName.focus();
			return false;
	}
	if (cityName.value == 0) {
		alert("Missing info - Fill the input Ciy Name!");
		
			cityName.focus();
			return false;
	}
	if (roomCounter.value <= 0 || roomCounter.value >= 50) {
		alert("The number of rooms is incorrect!");
		
			roomCounter.focus();
			return false;
	}
	
	return true;
}

function checkBooking() {
	let checkIn = document.getElementById("checkIn");
	let checkOut = document.getElementById("checkOut");
	let clientId = document.getElementById("clientId");
	let hotelId = document.getElementById("hotelId");
	let room = document.getElementById("room");

	let hasErrors = false;
	
	if (checkIn.value == 0) {
		alert("*Missing check-in date!*");
		checkIn.focus();
		return false;
	}

	if (checkOut.value == 0) {
		alert("*Missing check-out date!*");
		checkOut.focus();
		return false;
	}
	
	if(clientId && clientId.value <= 0) {
		alert("*Missing client id!*");
		clientId.focus();
		return false;
	}
	
	if(hotelId && hotelId.value <= 0) {
		alert("*Missing hotel id!*");
		hotelId.focus();
		return false;
	}

	if (room.value <= 0 || room.value > 50) {
		alert("*Rooms requires a value between 0-50*");
		room.focus();
		return false;
	}

	if (checkOut.value < checkIn.value) {
		alert("*CheckOut date must be successive to CheckIn*");
		checkOut.focus();
		return false;
	}

	return true;
}

