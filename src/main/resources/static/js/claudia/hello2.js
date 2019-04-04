$(function() {
	$('#colorSwapper').click(function() {
		$('.changeColor').toggleClass('red');
		$('.changeColor').toggleClass('blue');
	});
	
	$('#upsize').click(function() {
		let cur = parseInt($('#info').css('font-size'));
		$('#info').css('font-size', cur * 2);
	});
	
	$('#downsize').click(function() {
		let cur = parseInt($('#info').css('font-size'));
		if(cur > 1) {
			$('#info').css('font-size', cur / 2);
		}
	});
});
