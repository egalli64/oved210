package trainer.mar15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Problems {

	/**
	 * <pre>
	 * {1, 1, 1, 4, 5, 6, 4, 6, 5} -> {1, 4, 6, 5}
	 * {1, 1, 1, 1, 1, 1, 1, 1, 1, 1} -> {1}
	 * {} -> {}
	 * null -> exception? {}?
	 * </pre>
	 * 
	 * @param data an array list of integer
	 * @return a List containing only unique elements from data
	 */
	public static List<Integer> killDuplicatesSort(List<Integer> data) {
		if (data == null || data.isEmpty()) {
			return Collections.emptyList();
		}
		ArrayList<Integer> buffer = new ArrayList<>(data);
		buffer.sort(null);

		ArrayList<Integer> results = new ArrayList<>();

		Integer previous = buffer.get(0);
		results.add(previous);
		for (int i = 1; i < buffer.size(); i++) {
			Integer current = buffer.get(i);
			if (!current.equals(previous)) {
				results.add(current);
				previous = current;
			}
		}

		return results;
	}

	public static List<Integer> killDuplicatesHash(List<Integer> data) {
		if (data == null) {
			return Collections.emptyList();
		}

		return new ArrayList<>(new HashSet<>(data));
	}

	/**
	 * 
	 * If value is odd, return "Weird"
	 * If value is even and in [2 .. 5], return "Not
	 * Weird" If value is even and in [6 .. 20], return "Weird" If value is even and
	 * greater than 20, return "Not Weird"
	 * 
	 * @param value an integer
	 * @return "Weird" or "Not weird"
	 */
	public static String ifElse(int value) {
		if (value < 1) {
			throw new IllegalAccessError();
		}

//		if (value % 2 == 1) {
//			return "Weird";
//		}
//
//		if (value == 2 || value == 4) {
//			return "Not Weird";
//		}
//
//		if (value > 5 && value < 21) {
//			return "Weird";
//		}
//
//		return "Not Weird";

		if (value % 2 == 1 || (value > 5 && value < 21)) {
			return "Weird";
		} else {
			return "Not Weird";
		}
	}
	
	/**
	 * 2 -> {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
	 * 
	 * @param value an integer
	 * @return the first ten multiples of value
	 */
	public int[] multiples(int value) {
		int[] results = new int[10];
		
		// ...
		
		return results;
	}
}
