let name = prompt("Dove sei?", "Sardegna");


	


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
/