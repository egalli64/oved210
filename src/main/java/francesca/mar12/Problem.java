package francesca.mar12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Problem {
	/*
	 * in: [2, 1, 1] out: 2 
	 * in: [-1027, 12, -1027, 12, 42] out: 42
	 */
	
	public static int findUniqueN2(int[] data) {
		for (int i = 0; i < data.length; i++) {
			boolean single = true;

			for (int j = 0; j < data.length; j++) { 
				if (i == j) { // se i=j non posso fare il confronto tra i due, come se avessero due posizioni uguali
					continue;
				}
					if (data[i] == data[j]) {
						single = false; // ho trovato la coppia quindi faccio break ed interrompo il mio loopFor interno
						break;
					}
				}
			
			
			if (single) { //torna in uso la variabile single che indica l elemento in posizioni i è un single, cioè l elemento è unico
				return data[i];
			}
		}

		throw new IllegalAccessError("Bad input data");
	}

	
	public static int findUniqueSort (int[] data) {
		if (data == null || data.length % 2 == 0) {
			throw new IllegalAccessError ("Bad input data");
		}
		
		Arrays.sort(data);
		
		for (int i = 1; i < data.length; i += 2) { // partiremo da 1 per guardare il secondo elemento e confrontralo con il primo, per non arrivare all'ultimo e non trovarsi niente
			if (data[i] != data[i - 1]) { 
				return data[i-1]; // il singolo è sicuramente i-1 perchè non c è nessun elemento prima con cui può essere confrontato
			}
		}
		return data[data.length - 1];
	}
	
	// con HASHSET
	
	public static int findUniqueHash(int[] data) {
		if(data == null) {
			throw new IllegalStateException ("Bad input data");
			}
		HashSet<Integer> buffer = new HashSet<Integer>();
		
		for (int i =0; i < data.length; i++) {
			if ( buffer.contains(data[i])) {
				buffer.remove(data[i]);
			}
			
			else {
				buffer.add(data[i]);
			}
		}
		if (buffer.size() != 1) {
			throw new IllegalStateException ("Bad input data");
			
		}
		
		Iterator<Integer> it = buffer.iterator();
		if(it.hasNext()) {
			return it.next();
		}
		
		throw new IllegalStateException ("Never reached");
	
		
		
		
	}
	/*
	 * in: [2, 1, 1] out: 2 in: [-1027, 12, -1027, 12, 42] out: 42
	 */
	public static int findBigger(int[] data) {
		return 0;
	}

	/*
	 * in: [2, 1, 1] out: true
	 * in: [-1027, 11, -1029, 15, 41] out: false
	 * in: [11, 42] out: true
	 */
	public static boolean hasEven(int[] data) {
		for(int i = 0; i < data.length; i++) {
			
		}
		return false;
	}

	/*
	 * in: 2 out: true in: -1027 out: false
	 */
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}

}



