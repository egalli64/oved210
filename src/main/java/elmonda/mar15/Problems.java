package elmonda.mar15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Problems {

	/**
	 * <pre>
	 * {1, 1, 1, 4, 5, 6, 5} -> {1, 4, 6, 5}
	 * {1, 1, 1, 1, 1,1, 1, 1, 1, 1} -> {1}
	 * {} -> {}
	 * {} -> exception? {}?
	 * </pre>
	 * 
	 * @param data an array list of integer
	 * @return a List containing only unique elements from data
	 */
// mi elimina i dupplicati e mi ritorna solo gli elementi singoli
	public static List<Integer> killDuplicatesSort(List<Integer> data) {
		if (data == null || data.isEmpty()) {
			return Collections.emptyList();
		}

		ArrayList<Integer> buffer = new ArrayList<Integer>(data); // tutti gli ellemnnti che erano in data sono stati
																	// passati su buffer--> cosi posso fare il sort su
																	// buffer
		buffer.sort(null); // è un metodo che lavora su array list quindi più specifico in questo caso. Per
							// ordinarlo in modo naturale
		// throw new UnsupportedOperationException("Not yet implemented");
		ArrayList<Integer> results = new ArrayList<Integer>(); // ci creiamo un altro array

		int previousValue = buffer.get(0);
		results.add(previousValue);

		for (int i = 1; i < buffer.size(); i++) { // il for mi lavora da i che vale 1 fino in fondo su tutti gli
													// elementi di buffer, la prima cosa che faccio è : prendimi
													// l'elemto 1
			int current = buffer.get(i); // quindi prendi l'elemnto i corrente e confrontalo con quello precedente, se
											// sono diversi, mi devo memorizzare il nuovo elemento
			if (current != previousValue) {

				results.add(current);
				previousValue = current; // in previous ho il precedente e in current ho il corrente

			}
		}

		return results;
	}

	public static List<Integer> killDuplicatesHash(List<Integer> data) {
		if (data == null) {
			return Collections.emptyList();
			// return null;
		}
		return new ArrayList<>(new HashSet<>(data));
	}

	/**
	 * 
	 * If value is odd, return "Weird" se numeri dispari return weird If is even and
	 * in [2..5], return "not weird" // vogliamo vedere se il num è magg o = 2
	 * ---min = 5 vogliamo controllare se il mio num pari è in quest'intervallo If
	 * is even and in [6..20], return weird If value is even and greater than 20,
	 * return "not weird"-- se è pari e maggiore di 20
	 * 
	 * @param value an integer -----------ci prende in input un intero e
	 * @return "Weird" or "Not weird" ---- ci ritorna una stringa
	 */

	public static String ifElse(int value) {
		if (value < 1) {
			throw new IllegalAccessError();
		}
		if (value % 2 == 1) {
			return "Weird";

		} else {

			if (value >= 2 && value <= 5) {
				return "Not Weird";
			}
			if (value >= 6 && value <= 20) {
				return "Weird";

			}
			if (value > 20) {
				return "Not Weird";
			}
		}
		return null;
	}

//// codice abbreviato dal prof.

//  if(value % 2 == 1 || (value > 5 && value < 21)) {
// return "weird";
//}else{
// return "Not Weird";
//}
//}

	/**
	 * 2-> {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}--> ( 2x1, 2x2, 2x3, 2x4,...
	 * 
	 * @param value an integer
	 * @return the first ten multiples of value
	 */
	// voglio funzione che mi ritornerà un'array con 10 interi

	public static int[] multiples(int value) {
		int[] results = new int[10];
		for (int i = 0; i < results.length; i++) {
			results[i] = value * (i + 1);
		}

		return results;

	}

	/**
	 * <pre>
	 * cat, tac -> true
	 * catt, tacc -> false
	 * </pre>
	 * 
	 * @param left  a string
	 * @param right another string
	 * @return true if left is an anagram of right
	 */
	static public boolean isAnagram(String left, String right) { // vogliamo che ritorni true solo se left è l'anagramma
																	// di right
		if (left.length() != right.length()) {
			return false;
		}
		char[] aleft = left.toCharArray();
		char[] aright = right.toCharArray();

		Arrays.sort(aleft);
		Arrays.sort(aright);

		for (int i = 0; i < aleft.length; i++) {
			if (aleft[i] != aright[i]) {
				return false;
			}
		}
		return true;
	}
	static public boolean isAnagramHash(String left, String right) {
		HashMap<Character, Integer> equals = new HashMap<>();
		for (int i = 0; i < left.length(); i++) {    // per ogni elemento singolo in left
			Character key = left.charAt(i);           // la chiave sarà uguale ad ogni singolo elemento di left
			Integer value = equals.get(key);           // ogni valore numerico intero è associato ad una chiave
			if (value == null) {                       // confronta il valore e se non c'è ed è quindi  uguale a null, il valore numerioco sarà uguale a zero.
				value = 0;
				
			}
			equals.put(key, value + 1);       
		}

		for (int i = 0; i < right.length(); i++) {  
			Character key = right.charAt(i);
			Integer value = equals.get(key);
			if (value == null || value.equals(0)) {
				return false;
			}
			equals.put(key, value - 1);
		}

		for (int value : equals.values()) {
			if (value != 0) {
				return false;
			}
		}

		return true;
	}
	///////////////////////////////////////////////////////
	
	static public boolean isAnagramHashA(String left, String right) {
		HashMap<Character, Integer> mapLeft = new HashMap<>();
		HashMap<Character, Integer> mapRight = new HashMap<>();
		
		for (int i = 0; i < right.length(); i++) {
			Integer value = mapRight.get(right.charAt(i));
		if(value == null) {
			mapRight.put(right.charAt(i),1);
			
		}else {
			mapRight.put(right.charAt(i), value +1);
			
		}
	
	}


	for (int i = 0; i < left.length(); i++) {
		Integer value = mapLeft.get(right.charAt(i));
	if(value == null) {
		mapLeft.put(left.charAt(i),1);
		
	}else {
		mapLeft.put(left.charAt(i), value +1);
		
	}

}
	return false;
	

}

}

