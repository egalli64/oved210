package elmonda.mar13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem {
	
	/**
	 * <pre>
	 *   {2, 2, 2, 1, 1}-> 2--> 3 voglio che mi ritorni 3 perchè è il numero di volte che l'elemento 2 si ripete
	 *   {2, 2, 2, 1, 1, 3, 3, 1, 1}-> 3 -> 2  // trovare il count più frequente
	 *   {2, 2, 2, 1, 1, 3, 3, 1, 1}-->4->0
	 *   </pre>
	 * @param data an array of integer
	 * @return the most popular value in data
	 * @return the number of values in data
	 */
	public static int mostPopular(int[] data) {  // se è un metodo statico nome classse. metodo che voglio chiamare, in questo caso essendo corrente posso evitare di mettere il nome della classe
	if(data==null || data.length == 0) {
		throw new IllegalArgumentException("");// se l'utente mi passa un'array vuoto, gli tiro un'eccezione
	}
	
	int result = data[0];    // mi inizializzo le mie variabili locali e faccio il loop
	int resultCount = count(data, result);
	
	for(int i = 1; i < data.length; i++) {  // per vedere la numerosità del resultCount
		int popular = count(data, data[i]);  // fa un loop su tutti gli elementi ---> Complessità O (N)
		if(popular > resultCount) {   // se la numerosità del 
			
			result = data[i];
			resultCount = popular;
		}
	}
	
return result;
	}
	

	
	// vogliamo trovare il risultato con una complessità lg (n)

	public static int mostPopularSorted(int[] data) { 
		if(data==null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data");
			
		}
		Arrays.sort(data);
		
		int result =data [0];  //il risultato corr    (come result 1)
		int resultCount = 1;    // con la sua freq corrente   ( 3)
		int current = result;             // il valore corrente  (5)
		int currentCount = 0;   // con la sua feq corrente    (tutti i 5
		
		
		for( int i = 1; i < data.length; i++) {    
			if(data[i] != current) {   // se il valore che ho salvato è dverso da quello in current,devo smettere di fare il conteggio che stavo facendo e ricominciare da capo
				if(currentCount > resultCount) {   // 
					result = current;
					resultCount = currentCount;
				}
				current = data[i]; // current non è più 3 è 5
				currentCount = 1;
			} else {
				currentCount++;
			}
		}
		
		if(resultCount > currentCount) {  //se questo è vero ritorna quello che mi aspettavo 
		return result;
		}else{
			return current;
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static int count(int[] data, int value) {
		// variabile temporale che tiene conto di quante volte il valore è contenuto in data
		int x =0; // variabile temporale che tiene conto di quante volte il valore è contenuto in data
		
		for (int i= 0; i<data.length; i++) {
			if(data[i]== value) {  // quando trovo un valore che è stato richiesto, incremento, finchè non arrivo in fondo al mio arrey e in result avrò il mio risultato
				x++;  
			}
		}
		
		return x;
}


	
	public static int mostPopularHash(int[] data) { 
		if(data==null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data");
	
			//Map<Integer, Integer> counters = new HashMap<>(); 
			//for(int i=0; i < data.length; i++) {
			//if(counters.containsKey(data[i])) {
//			int value = counters.get(data[i]);
//			counters.put(data[i], value + 1);
//		}else{
//			
//			counters.put(data[i], 1);	
			//}
//}
		
		}
		/////////////////////////////
		Map<Integer, Integer> counters = new HashMap<>();  // get per leggere, put per aggiungere
		//for each
		for(int key : data) {   //	for(int i=0; i < data.length; i++) {
			Integer counter = counters.get(key);
			
		if (counter == null) {  // se counter è uguale a null significa che non ci sono elementi
			counter = 0;
			
		}
		
		 counters.put(key,  counter + 1); // vai a cercare l'elemento key nella mappa se lo trovi aggiorna il valore mettendoci questo. 
		
		}
		int result = 0;
		int frequency = 0;
		for (Map.Entry<Integer, Integer> entry : counters.entrySet()) {
			int currentFrequency = entry.getValue();
			if(currentFrequency > frequency) {
				result = entry.getKey();
				frequency = entry.getValue();
			}
		
		}
 	return result;
		}
	}

