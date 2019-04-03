function setTarget(elSrc) {
	let target = document.getElementById('target');
	switch (elSrc.selectedOptions[0].value) {
	case '1':
		target.value = "Maths";
		break;
	case '2':
		target.value = "Econometrics";
		break;
	case '3':
		target.value = "Accounting";
		break;
	}
}

$(function() {

	$('#colorSwapper').click(function() {
		$('.changeColor').toggleClass('blueColor');
	});
	
	$('#header').slideDown(1000);
});