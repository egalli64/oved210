package elmonda.mar05;

import java.util.Arrays;
import java.util.HashSet;
//import java.util.Iterator;

public class Problem {
/*
 * in: [2, 1, 1] out: 2
 * in: [-1027, 12, -1027, 12, 42] out: 42
 * in: [11, 42] out: true
 */
	public static int findUnique(int[] data) {
		for (int i = 0; i < data.length; i++) {
			boolean single = true;   // qui definisco la variabile booleana.

			for (int j = 0; j < data.length; j++) {
				if (i != j) {    // se i è uguale a j, non avrà senso, un elemento è uguale a se stesso
					if (data[i] == data[j]) {
						single = false;  // se single è uguale a false,, ho trovato la coppia, quindi interrompo e faccio un break, 
						break;  // termino il mio loop interno, sono ancora nel loop esterno
					}
				}
			}

			if (single) {            // single, sarà true se e solo se l'elemento è unico, se è unico posso ritornarlo.
				return data[i];
			}
		}

		throw new IllegalStateException("");
	}
	
	public static int findUniqueSort(int[] data) {   //ci aspettiamo una 
		if ( data == null || data.length % 2 == 0) {
			throw new IllegalAccessError("Bad input data");
		}
		
		Arrays.sort(data);
		
		//loop for su tutte le coppie di elementi, invece di partire dall'elemento zero, parto dall'elemnto 1
		for (int i =1; i < data.length; i += 2) {
			if (data[i] != data[i - 1]) {
				return data[i-1];
			}
		}
		//parti da uno e incrementa di due tutte le volte(perchè vogliamo lavorare coppia per coppia), cosi faccio il controllo su tutte le coppie, se per sfortuna l'ultimo 
		// è un singolo glielo passo, altrimjenti se non è l'ultimo lo trovero' sul for.
		// mi aspetto che quello in posizione 1 sia uguale a quello in posizione 0, altrimenti mi ritornerà quello in posizione 1
		return data[data.length - 1];
	}

	// riccado in questa considizione: il singolo sarà considerato l'ultimo
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static int findUniqueHash( int[] data) {
		if (data == null) {
			throw new IllegalStateException("Bad input data");
		}
			//data = new HashSet<Integer>();
			HashSet<Integer> buffer = new HashSet<Integer>();  // creiamoci hashSet chimato buffer, faccio un for each su data
			
			for (int i = 0; i < data.length; i++) {
				if (buffer.contains(data[i])) {    // se contiene, rimuovi, altrimenti aggiungi
					buffer.remove(data[i]);
				}else {
				
					buffer.add(data[i]);
				//if ( contain)
			}
			}
			if (buffer.size() !=1) {   // vuol dire che c'è almeno un elemento per poter utilizzare l'iteratore, motivo per cui inserisco questa condizione
			throw new IllegalStateException("Bad input data");
			
			}
		return buffer.iterator().next();  // mi punta all'elemnto precedente al primo che non esiste
			
	} 
	
		// ci sono due metodi, has next mi riotna true se ha un successore su cui andare e next mi ritorna questo 
	
	/*
	 * in: [2, 1, 1] out: 2
	 * in: [-1027, 12, -1027, 12, 42] out: 42
	 */
	public static int findBigger(int[] data) {
		return 0;
	}	
	/*
	 * in: [2, 1, 1] out: true
	 * in: [-1027, 11, -1029, 15, 41] out: false
	 * in: [11, 42] out: true
	 */
	
	public static boolean hasEven(int[] data) {        // for di tutti gli elementi
		for(int i = 0; i < data.length; i++) { 
			if(data[i] % 2 ==0) {
				return true;
			}
			//if(value etc) {
		//}
	}
		return false;
	/*
	 * in: [2, 1, 1] out: 2
	 * in: [-1027, 12, -1027, 12, 42] out: 42                   se dopo la parentesi }, non avrò trovato pari, mi ritornerà false.
	 */
	}
	public static boolean isEven(int value) {
		if(value % 2 == 0) {
		return true;
	}
		return false;
}
}