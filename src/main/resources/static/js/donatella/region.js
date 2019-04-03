let name = prompt("Dove sei?", "Sardegna");


			function generateMessage(user, date) {
	return "Salve " + user + ". You connected at " + date;
}
			$(function() {
	$('Welcome to my region').slideDown(3000);
			}
	let score = 21;
	$('textarea').append('Your current score is ' + score + '\n');
	$('textarea').append(generateMessage(name, new Date()) + '\n');

	$('#signature').text("Hello by JQuery!");
	
	
	$('#spanMsg').replaceWith(name);
	


	$('#colorSwapper').click(function() {
		$('.changeColor').toggleClass('redColor');
	});

	$('#upsize').click(function() {
		let cur = parseInt($('#pmsg').css('font-size'));
		$('#pmsg').css('font-size', cur * 2);
	});

	$('#downsize').click(function() {
		let cur = parseInt($('#pmsg').css('font-size'));
		if(cur > 1) {
			$('#pmsg').css('font-size', cur / 2);
		}
	});
	function setTarget(elSrc) {
		let target = document.getElementById('target');
		switch(elSrc.selectedOptions[0].value) {
		case '1':
			target.value = "Spiaggia Bombarde";
			break;
		case '2':
			target.value = "Spiaggia Lazzaretto";
			break;
		case '3':
			target.value = "Spiaggia Pineta Mugoni";
			break;
		default:
			target.value = "";
			break;
		}
	}