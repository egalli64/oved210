

let name = prompt("welcome", "user");
	
	function generateMessage(user, date) {
		return "Hello " + user + ". You connected at " + date;
	}
	
	$(function() {
	$('#header').slideDown(1000);	
	$('#header2').slideDown(3000);	
	$('#signature').text("SeaHotel Inc. 1978");
	$('#colorSwapper').click(function(){
		$('.changeColor').toggleClass('blueColor');
	});
	
	});


	<p class="changeColor" id="signature">&copy; SeaHotel Inc. 1978</p>
	