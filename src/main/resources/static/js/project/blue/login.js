function checkUser() {

	let user = document.getElementById("userId");

	if (user.value.length == 0) {
		alert("User name is missing!");
		{
			user.focus();
			return false;
		}

		return true;

	}
	let password = document.getElementById("pwdId");

	if (password.value.length == 0) {
		alert("Password is missing!");
		password.focus();
		return false;
	}
	return true;

}

function checkRooms() {
	let roomCounter = document.getElementById("roomCounter");
	if (roomCounter.value <= 0 || roomCounter.value >= 50) {
		alert("The number of rooms is incorrect!");
		roomCounter.focus();
		return false;

	}

	return true;
}

function checkBooking() {

	let clientId = document.getElementById("clientId");
	let hotelId = document.getElementById("hotelId");
	let room = document.getElementById("room");

	if ((room.value <= 0 || room.value > 50) && clientId.value <= 0
			&& hotelId.value <= 0) {
		alert("*Rooms requires a value between 0-50 & Hotel Id and Client Id must be a positive value*");
		{

			room.focus();
			clientId.focus();
			hotelId.focus();
			return false;

		}

		return true;
	}

	if ((room.value <= 0 || room.value > 50) && clientId.value <= 0) {
		alert("*Rooms requires a value between 0-50 & Client Id must be a positive value*");
		{

			room.focus();
			clientId.focus();

			return false;

		}

		return true;
	}
	if ((room.value <= 0 || room.value > 50) && hotelId.value <= 0) {
		alert("*Rooms requires a value between 0-50 & Hotel Id must contain a positive value*");
		{

			room.focus();

			hotelId.focus();
			return false;

		}

		return true;
	}
	if (clientId.value <= 0 && hotelId.value <= 0) {
		alert("*Hotel Id and Client Id must contain a positive value*");
		{

			clientId.focus();
			hotelId.focus();
			return false;

		}

		return true;
	}

	if (room.value <= 0 || room.value > 50) {
		alert("*Rooms - Room must be a value between 0 and 50*");
		{

			room.focus();
			return false;

		}

		return true;
	}

	if (clientId.value <= 0) {
		alert("*Client Id - You can't insert a negative value in this field!*");
		{

			clientId.focus();
			return false;

		}

		return true;
	}

	if (hotelId.value <= 0) {
		alert("*Hotel Id - You can't insert a negative value in this field!*");
		{

			hotelId.focus();
			return false;

		}

		return true;
	}

	if (checkOut.value < checkIn.value) {

		alert("*CheckOut date must be successive to CheckIn*");
		{
			checkIn.focus();
			checkOut.focus();
			return false;
		}
		return true;
	}

}
