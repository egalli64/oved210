let name = prompt("What's your name?", "Guest");
// alert("hello");

	function generateMessage(user, date) {
		return "Hello " + user + ". You connected at " + date;
	}
	
	//same as: $(document).ready(function()) {
	$(function() {
		$('#header').slideDown(1000); <!--viene eseguita quando la pagina è completa-->
		
		let score = 42;
		$('textarea').append('Your current score is ' + score + '\n');
		$('textarea').append(generateMessage(name, new Date()) + '\n');
		
		$('#signature').text("Hello by JQuery!");
		//document.getElementById('signature').innerText = 'Hello by HTML5';
		
		$('#spanMsg').replaceWith(name);
		
//		$('#colorSwapper').click(function(){
//			$('#pmsg').toggleClass('red');
//		});

		$('#colorSwapper').click(function(){
			$('.changeColor').toggleClass('redColor');
		});

		$('#upsize').click(function(){
			let cur = parseInt($('#pmsg').css('font-size'));
				$('#pmsg').css('font-size', cur * 2);	
		});
		
		$('#downsize').click(function(){
			let cur = parseInt($('#pmsg').css('font-size'));
			if(cur > 1) {
				$('#pmsg').css('font-size', cur / 2);	
			}
		
		});
		
		$('html').dblclick(function(e) {
			let s = "Double click @ " +
			e.pageX + ', ' + e.pageY + '\n';
			$('textarea').append(s);
		});
		
		$('#pmsg').mouseover(function(){
			$('textarea').append("Mouse over message\n");
		});
		
		$('#useless').click(function(){
			$(this).val("Don't click me anymore \n");
		});
			
	});
	
	
	function setTarget(elSrc) {
		let target = document.getElementById('target');
		switch(elSrc.selectedOptions[0].value) { <!--permette di selezionare l'opzione corrente sia singola che multipla, in questo caso singola xk in posizione 0-->
		case '1':
			target.value = "One";
			break;
		case '2':
			target.value = "Two";
			break;
		case '3':
			target.value = "Three";
			break;
		default:
			target.value = "";
			break;
			
		}
		
	}