
 
//alert("Hello"); //altro modo per fare il pop-up ma non chiede nulla
	let name = prompt("What is your name?", "Guest"); //pop-up 

	function generateMessage(user, date) {

		return "Hello " + user + ". You connected at" + date;
	}

	//same as: $(document).ready(function() {  })
	//$ il dollaro ci serve per indicare che stiamo usando una funzionalità di Jquery, non ho nemmeno dato un nome alla funzione (gli chiamo solo la funzione e gli dico di eseguirla al volo)

	$(function() {
		$('#header').slideDown(1000); //fa diventare visibile h1 con l'effetto slideDown (1000 indica i millisecondi, quindi ci mette 1 secondo)
	
		let score = 42;
	    $('textarea').append('Your current score is ' + score + '\n');
	    $('textarea').append(generateMessage(name, new Date()) +'\n');
	    $('#signature').text("Hello by JQuery!");    //document.getElementById('signature').innerText = 'Hello by Html5';
	    
	    $('#spanMessage').replaceWith(name);
	    
	    //$('#colorSwapper').click(function(){
	    //	$('#pmsg').toggleClass('red');  // a tutti gli elementi pmsg cambia classe, cioè se ce l'hanno già togligliela, se non ce l'hanno mettila
	    
	    //});
	    
	    $('#colorSwapper').click(function(){
	    $('.changeColor').toggleClass('red');  // a tutti gli elementi pmsg cambia classe, cioè se ce l'hanno già togligliela, se non ce l'hanno mettila
	    
	    });
	    
	
	    $('#upsize').click(function(){
	    	let cur = parseInt($('#pmsg').css('font-size'));  // a tutti gli elementi pmsg cambia classe, cioè se ce l'hanno già togligliela, se non ce l'hanno mettila
	         $('#pmsg').css('font-size', cur * 2);
	    });
	    

	    $('#downsize').click(function(){
	    	let cur = parseInt($('#pmsg').css('font-size'));  // a tutti gli elementi pmsg cambia classe, cioè se ce l'hanno già togligliela, se non ce l'hanno mettila
	         $('#pmsg').css('font-size', cur > 1 ? cur / 2 : 1);
	    });
	    
	    $('html').dblclick(function(e) {
	    	let s = "Double click @" + e.pageX + ',' + e.pageY + '\n';
	    	
	    	$('textarea').append(s);
	    	
	    });
	    
	    
	    $('#pmsg').mouseover(function() {
	    	$('textarea').append("Mouse over message\n");
	    	
	    });
	    
	    $('#useless').click(function() {
	    	$(this).val("Don't click me anymore!"); //  val è la funzione che ti fa cambiare l'elemento corrente
	    	
	    });   
	       
	});
	
	
	function setTarget(elSrc) {
		let target = document.getElementById('target');
		switch(elSrc.selectedOptions[0].value) {
		case '1':
			target.value = "One";
			break;
		case '2':
			target.value = "Two";
			break;
		case '3':
			target.value = "Three";
			break;
		default :
			target.value = "";
			break;
		
		}
	};

	