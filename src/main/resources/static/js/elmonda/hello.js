$(function() {
	$('#colorSwapper').click(function() {
		$('.changeColor').toggleClass('redColor');

	});
	$('#header').slideDown(3000);
});

function setTarget(elSrc) { //chiamiamolo elsrc ,che significa: l'elemento che mi ha chiamato
	let target = document.getElementById ('target'); //jquery di prendermi l'elemento che ha id tarhget e di salvarmelo come target
	switch(elSrc.selectedOptions[0].value) { //mi dice quali sono le opzioni selezionate  evale sia per le singole che per le multiple
	 //switchare l'elemento sorgente, qual è l'opzione correntye selezionata
		case '1':
			target.value = "Descrizione";  //a seconda dell'input selez andrò a scrivere qualcosa nel target che è la mia input line
			break;
		case '2':
			target.value = "Prezzo";
			break;
		case '3':
			target.value = "Colori";
			break;
		default:
				target.value = "";
				break;
	}
}

