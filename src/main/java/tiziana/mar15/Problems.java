package tiziana.mar15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

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

	public static List<Integer> killDuplicates(List<Integer> array) {
		if (array == null || array.size() == 0) {
			throw new IllegalArgumentException("Bad input data");
		}

		ArrayList<Integer> buffer = new ArrayList<Integer>(array);
		buffer.sort(null);

		ArrayList<Integer> result = new ArrayList<Integer>();

		Integer previous = buffer.get(0); /// int o Integer è uguale, più vantaggioso Integer
		result.add(previous);
		for (int i = 1; i < buffer.size(); i++) {
			Integer current = buffer.get(i);
			if (buffer.get(i) != previous) {
				result.add(current);
				previous = current;

			}
		}

		return result;

	}

	public static List<Integer> killDuplicatesHash(List<Integer> array) {
		if (array == null || array.size() == 0) {
			throw new IllegalArgumentException("Bad input data");
		}

		HashSet<Integer> newhash = new HashSet<>(array); /// abbiamo creato una nuova lista hashset(newhash) dove ci
		/// mettiamo
		ArrayList<Integer> result = new ArrayList<Integer>(newhash); /// l'array e poi trasferiamo in una nuova lista
																		/// arraylist(result) la lista hashnew.

		return result;

	}

	/**
	 * <pre>
	 * If value is odd, return "Weird" 
	 * If value is even and in [2 .. 5], return "Not Weird" 
	 * If value is even and in [6 .. 20], return "Weird" 
	 * If value is even and greater than 20, return "Not Weird"
	 * </pre>
	 * 
	 * @param value an integer
	 * @return "Weird" or "Not weird"
	 */

	public static String ifElse(int value) {
		if (value <= 0) {
			throw new IllegalAccessError("Bad input data");
		}
		if (value % 2 == 1) {
			return "Weird";
		} else {

			if (value >= 2 && value <= 5) {
				return "Not weird";

			}
			if (value >= 6 && value <= 20) {
				return "Weird";

			}

			if (value > 20) {
				return "Not weird";

			}
			return "Weird";
		}
	}

	///// oppure

//		if (value % 2 == 1 || (value > 5 && value < 21)) {
//			return "Weird";
//		} else {
//			return "Not weird";
//		}

	/**
	 * <pre>
	 * 2-> {2,4,6,8,10,12,14,16,18,20}
	 * </pre>
	 * 
	 * @param value an integer
	 * @return the first ten multiples of value
	 */

	public static int[] multiples(int value) {
		int[] results = new int[10];
		for (int i = 0; i < results.length; i++) {
			results[i] = value * (i + 1);

		}

		return results;

	}

	/**
	 * <pre>
	 * cat, tac -> true;
	 * catt, tacc -> false;
	 * </pre>
	 * 
	 * @param left  a string
	 * @param right another string
	 * @return true if left is an anagram of right
	 */

	static public boolean isAnagram(String left, String right) {
		if (left.length() == 0 || right.length() == 0) {
			return false;
		}
		if (left.length() != right.length()) {
			return false;
		}

		char[] first = left.toCharArray();
		Arrays.sort(first);

		char[] second = right.toCharArray();
		Arrays.sort(second);

		for (int i = 0; i < second.length; i++) {
			if (first[i] != second[i]) {

				return false;
			}

		}
		return true;
	}

	static public boolean isAnagramHash(String left, String right) {
		HashMap<Character, Integer> hml = new HashMap<>();
		HashMap<Character, Integer> hmr = new HashMap<>();

		for (int i = 0; i < left.length(); i++) {
			Character key = left.charAt(i);
			Integer value = hml.get(key);
			if (value == null) {
				hml.put(key, 1);
			} else {
				hmr.put(key, value + 1);
			}
		}

		for (int i = 0; i < right.length(); i++) {
			Character Key = right.charAt(i);
			Integer value = hmr.get(Key);
			if (value == null) {
				hmr.put(Key, 1);
			} else {
				hmr.put(Key, value + 1);

			}
		}

		for (Map.Entry<Character, Integer> entry : hml.entrySet()) {
			Integer rightValue = hmr.get(entry.getKey());
			if (rightValue == null || !rightValue.equals(entry.getValue())) {
				return false;
			}
		}

		return true;
	}
}
