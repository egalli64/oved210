package alessandraC.mar15;

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
	 * {1,1,1,1,1,1,1,1,1} -> {1}
	 * {} -> {}
	 * null -> exception? {}?
	 * </pre>
	 * 
	 * @param data an array list of integer
	 * @return a list containing only unique elements from data
	 */

	public static List<Integer> killDuplicatesSort(List<Integer> data) {

		if (data == null || data.size() == 0) {
			throw new UnsupportedOperationException("Not yet implement");

		}

		ArrayList<Integer> buffer = new ArrayList<>(data);
		buffer.sort(null);

		ArrayList<Integer> result = new ArrayList<Integer>();

		Integer previous = buffer.get(0);
		result.add(previous);

		for (int i = 1; i < buffer.size(); i++) {
			Integer current = buffer.get(i);
			if (!current.equals(previous)) {
				result.add(current);
				previous = current;
			}

		}

		return result;

	}

	public static List<Integer> killDuplicatesHash(List<Integer> data) {
		if (data == null || data.size() == 0) {
			throw new IllegalArgumentException("Bad input data");
		}

		HashSet<Integer> hash = new HashSet<>(data);
		ArrayList<Integer> result = new ArrayList<Integer>(hash);

		return result;
	}

	/**
	 * <pre>
	 * If value is odd, return "weird"
	 * If value is even and in [6 .. 20], return "weird" 
	
	 * if value is even and in [2 .. 5], return "Not weird"
	 * if value is even and greater than 20, return " Not weird"
	 * </pre>
	 * 
	 * @param value an integer
	 * @return
	 * @return "weird" or "Not weird"
	 * 
	 */

	public static String ifElse(int value) {
		if (value < 1) {
			throw new IllegalAccessError("Bad input data");
		}

		if (value % 2 == 1) {
			return "Weird";
		}

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

	/**
	 * 2 -> {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
	 * 
	 * @param value an integer
	 * @return the first ten multiples of value
	 */
	static public int[] multiples(int value) {
		int[] results = new int[10];

		for (int i = 0; i < results.length; i++) {
			results[i] = value * (i + 1);
		}

		return results;
	}

	/**
	 * <pre>
	 * cat, tac -> true
	 * cat, tca -> true
	 * catt, tacc -> false
	 * </pre>
	 * 
	 * @param left  a string
	 * @param right another string
	 * @return true if left is an anagram of right
	 */
	static public boolean isAnagram(String left, String right) {
		if (left == null || right == null || left.length() != right.length()) {
			return false;
		}

		char[] lhs = left.toCharArray();
		Arrays.sort(lhs);

		char[] rhs = right.toCharArray();
		Arrays.sort(rhs);

		for (int i = 0; i < lhs.length; i++) {
			if (lhs[i] != rhs[i]) {
				return false;
			}
		}

		return true;
	}

	public static boolean isAnagramHash(String left, String right) {
		HashMap<Character, Integer> hml = new HashMap<>();
		for (int i = 0; i < left.length(); i++) {
			Character key = left.charAt(i);
			Integer value = hml.get(key);
			if (value == null) {
				hml.put(key, 1);
			} else {
				hml.put(key, value + 1);
			}
		}

		HashMap<Character, Integer> hmr = new HashMap<>();
		for (int i = 0; i < right.length(); i++) {
			Character key = right.charAt(i);
			Integer value = hmr.get(key);
			if (value == null) {
				hmr.put(key, 1);
			} else {
				hmr.put(key, value + 1);
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
