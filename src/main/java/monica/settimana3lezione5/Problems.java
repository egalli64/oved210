package monica.settimana3lezione5; // 15/03/19

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * {1,1,1,4,5,6,4,6,5} -> {1,4,6,5} {} -> {} null -> exception? {}?
 * {1,1,1,1,1,1,1,1,1,1} -> {1} data un array list of integer a list containing
 * only unique elements from data //elimina i duplicati e mantiene i valori
 * 
 *
 */

public class Problems {

	public static List<Integer> killDuplicates(List<Integer> data) {
		if (data == null || data.isEmpty()) {

			throw new UnsupportedOperationException("not yet implmentes");
		}

		ArrayList<Integer> buffer = new ArrayList<Integer>(data); // in questo modo non modifico i dati originali
		buffer.sort(null); // Collections.sort(data); //passo null per avere l'ordine in modo naturale

		ArrayList<Integer> result = new ArrayList<Integer>();

		Integer value = buffer.get(0);
		result.add(value);

		for (int i = 1; i < buffer.size(); i++) {
			int current = buffer.get(i); // cosi gli dico di lavorare sull'elemento corrente
			if (current != value) { // confrontami l'elemento corrente con quello precedente
				result.add(current);
				value = current;
			}

		}
		return result;

	}

	public static List<Integer> killDuplicatesHash(List<Integer> data) {
		if (data == null || data.isEmpty()) {
			throw new UnsupportedOperationException("not yet implmentes");
		}

		HashSet<Integer> hashData = new HashSet<>(data);
		List<Integer> result = new ArrayList<Integer>(hashData);

		return result;

	}

	static public boolean isAnagramHash(String left, String right) {
		if (left.length() != right.length()) {
			return false;
		}

		HashMap<Character, Integer> countersLeft = new HashMap<>();
		for (int i = 0; i < left.length(); i++) {
			Character keyL = left.charAt(i);
			Integer valueL = countersLeft.get(keyL);

			if (countersLeft.containsKey(keyL)) {
				countersLeft.put(keyL, valueL + 1);
			} else {
				countersLeft.put(keyL, 1);
			}
		}
		HashMap<Character, Integer> countersRight = new HashMap<>();
		for (int k = 0; k < right.length(); k++) {
			Character keyR = right.charAt(k);
			Integer valueR = countersRight.get(keyR);

			if (countersRight.containsKey(keyR)) {
				countersRight.put(keyR, valueR + 1);

			} else {
				countersRight.put(keyR, 1);
			}
		}

		Iterator<Map.Entry<Character, Integer>> it = countersLeft.entrySet().iterator();
		while (it.hasNext()) {
			
		it.next(); 
		}
		return true;
	} }

