let name = prompt("What is your name?", "AlessandraBartesaghi"); // pop-up

$(function() {
	$('#title').slideDown(1000);

	$('#like').click(function() {
		let lk = " Amazing job! You are killing it :)\n"; 
		$('#judge').append(lk);
		
		
	});

	$('#dislike').click(function() {
		let dsk = " Not so bad, put you can improve!:(\n";
		$('#judge').append(dsk);
	});
});
