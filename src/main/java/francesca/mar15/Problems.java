package francesca.mar15;

import java.util.ArrayList;
import java.util.Arrays;
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
	 * If value is odd, return "Weird" If value is even and in [2 .. 5], return "Not
	 * Weird" If value is even and in [6 .. 20], return "Weird" If value is even and
	 * greater than 20, return "Not Weird"
	 * 
	 * @param value an integer
	 * @return "Weird" or "Not weird"
	 */
	public static String ifElse(int value) {
		if (value % 2 == 1) {
			return "Weird";
		}

		if (value >= 2 && value <= 5) {
			return "Not Weird";
		}

		if (value >= 6 && value <= 20) {
			return "Weird";
		}

		if (value > 20) {
			return "Not Weird";
		}
		return null;
	}

	/**
	 * 2 -> {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
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

	static public boolean isAnagram(String left, String right) {

		char[] arrayLeft = left.toCharArray();
		char[] arrayRight = right.toCharArray();

		Arrays.sort(arrayLeft);
		Arrays.sort(arrayRight);

		if (arrayLeft.length != arrayRight.length) {
			return false;
		}
		for (int i = 0; i < arrayLeft.length; i++) {
			if (arrayLeft[i] == arrayRight[i]) {
				arrayLeft = arrayRight;
				return true;
			}

		}
		return false;
	}
}
