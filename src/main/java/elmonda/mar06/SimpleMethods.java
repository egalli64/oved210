package elmonda.mar06;

public class SimpleMethods {
	/**
	 * input: char c
	 * output: true if c is an upper character ('A')
	 * false otherwise ('h' or '6'...)
	 */
public static boolean isUpper(char c) {
	
	
	if(c >= 'A' && c <= 'Z') {   //se c è compreso tra A e Z ( è all'interno dell'intervallo), ritorna vero. Altrimenti falso
	return true;
		
}
	return false; // in altri casi ritornami false!
}
	//public static boolean isAlpha(char c) {
		
		//if(c<'A'|| c>'Z') { // se il mio carattere sta  a un valore più piccolo di A o più grande di Z ritorna vero altrimenti false.
	//return false; 
	
	//}
		
	//return true;

/**
 * input: char c	
 * output: true if c is an upper character ('A', 'c')
 * false otherwise ('6',')')
 */

 //vogliamo ritornare true se il carattere passato è alfa
public static boolean isAlpha(char c) {
if((c>= 'A' && c<='Z')||(c>='a' && c<'z')) {
	return true;
}
return false;
}


/**
 * input: char c
 * output: char converted to uppercase
 * x---> 'X'
 */
public static char toUpper(char c) {        //  se non è una maiuscola ritorna l'input
	if(c <'a' || c>'z') {
		return c;
	}	
	// codice equivalente
	// return (char) (c + 'A' - 'a');          // altrimenti ritorna questo: delta uguale a c-a, poi sommo ad A e ho il valore, ritorno il valore c a cui ho aggiunto A e tolto a
//}
	{
	int delta = c - 'A'; // NE SEGUE CHE C= K DELTA = 10         
	return (char) ( 'A' + delta);

	//return (char) ('A' + delta);
}
}
//	return (char) ('A' + delta);


/**
 * input: int[] data
 * output: smaller element
 * 
 * {1,2,5,-7}-->il risult dovrà essere -7
 * 
 */
public static int smallest(int []data) {             //      vogliamo che ritorni il valore più alto maxint

	if(data==null||data.length == 0) {
		return Integer.MAX_VALUE;
	}
	
	int currentMinumum = data[0];          //      PARTENDO DAL VALORE CORRENTE IN 0, SE IL VALORE SUCCESSIVO AL CORRENTE è MAGGIORE, RESTITUISCIMI QUEL VALORE 

	for(int i=1; i<data.length; i++) {    // int i=1 è indirizzo della cella su cui sto loopando, inizializzato a 1 faccio un loop e i assumerà tutti i valori tra 1 e length(che sono i miei numeri, la mia arrey)
	
	//}
	//for(int value : data) {  // dalla parentesi aperta a chiusa l'if fa il loop su tutti gli elementi da 1 eseguo questo controllo, se quello fra le parentesi tonde è vero, eseguo quello che c'è nel blocco successivo
		// confronta l'elemento corrente e se è più piccola dell'elemento current minimum, in currentminimum ci mettiamo quello più piccolo
		if(currentMinumum > data[i])  // SE IL MIO VALORE CORRENTE MINIMO AD ES 10 è MAGGIOR DEL SUCCESSIVO (7), SIGNIFICA CHE IL MIO MINIMO CORRENTE MI DEVE RITORNARE IL 7
			currentMinumum = data[i];   // data [i] è la variabile di loop, a ogni loop i assume il valore in ordine di successione 
	}
	return currentMinumum;
}
/**
 * input: int[] data
 * output: smallest element
 * 
 * {1,2,5,-7}-->il risult dovrà essere 3
 * {-7,2,5,-7}--->  0
 * 
 * null, {}--->   -1
 */
	public static int firstSmallestIndex(int[] data) {
		// il primo indici più piccolo vogliamo che ritorni il valore più alto maxint
		if (data == null || data.length == 0) {
			return -1;
		}

		int index = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[index] > data[i]) {
				index = i;
			}
		}
		return index;
	}

	public static int lastSmallestIndex(int[] data) { // ritorno l'ultimo che trovo più piccolo
		if (data == null || data.length == 0) {
			return (-1);
		}
	 
	 int currentIndex = 0;
		for(int i=1; i<data.length; i++) {
			if(currentIndex >= data[i]) {
				currentIndex = i;	
			}
		}
	 
		return currentIndex;
			
}

 /**{1, 2, 3}, 2 ->  true
  * {1, 2, 3}, 7-> false
  * 
  */
public static boolean find(int[] data, int target) {
	int find = 0;
	for(int i=0; i<data.length; i++) {
		if(target==data[i]) {
	
	return true;
}
	}
		return false;
		
		
		/////////// FOR EACH
		//public static boolean find(int[] data, int target) {	
		//if(data==null) {
		//return true;

/**
 * {1,2,3}, 2 -> 1
 * {1,2,3}, 7 -> -1   // -1 se non c'è altrimenti l'indice del mio arrey
 */


	}

public static int findPos(int[] data, int target) {
	if (data == null) {
		return -1;
	}

	
	for (int i = 1; i < data.length; i++) {
		if (data[i] == target) {
			
		
	}
	return i;
}
	return -1;
}
/**
 * "abba" -> true
 * "abac" -> false
 */
public static boolean isPalindrome(String s) {
	return false;
}


}



