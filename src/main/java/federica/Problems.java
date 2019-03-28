package federica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Problems {

	/**
	 * <pre>
	 * {1,1,1,4,5,6,4,6,5} -> {1,4,6,5} {1,1,1,1,1,1,1,1,1,1} -> {1} {} -> {} null
	 * -> exception? {}?
	 * 
	 * <pre>
	 * 
	 * @param array an array list of integer
	 * @return a List containing only unique elements from data
	 */

	public static List<Integer> killDuplicates(List<Integer> array) {
		if (array == null || array.size() == 0) {
			throw new IllegalArgumentException("Bad input data!");
		}

		ArrayList<Integer> buffer = new ArrayList<Integer>(array);
		buffer.sort(null);

		ArrayList<Integer> results = new ArrayList<Integer>();

		int previous = buffer.get(0);
		results.add(previous);

		for (int i = 1; i < buffer.size(); i++) {
			if (buffer.get(i) != buffer.get(i - 1)) {
				previous = buffer.get(i);
				results.add(previous);
			}
		}
		return results;
	}

	public static List<Integer> killDuplicatesHash(List<Integer> data) {
		if (data == null) {
			return Collections.emptyList();
		}
		HashSet<Integer> single = new HashSet<Integer>();
		single.addAll(data);
		ArrayList<Integer> result = new ArrayList<Integer>(single);
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
			throw new IllegalAccessError();
		}

		if (value % 2 != 0) {
			return "Weird";
		}

		if (2 <= value && 5 >= value) {
			return "Not Weird";
		}

		if (6 <= value && 20 >= value) {
			return "Weird";

		}
		if (value > 20) {
			return "Not Weird";
		}
		return "Weird";
// alternativa più breve:
		// if (value %2 == 1 || (value > 5 && value < 21)) {
		// return "Weird";
		// } else {
		// return "Not Weird";
	}

	/**
	 * 2 -> {2,4,6,8,10,12,14,16,18,20}
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
	 * cat, tac -> true
	 * cat, pat -> false
	 * </pre>
	 * 
	 * @param left  is a string
	 * @param right another string
	 * @return true is left is an anagram of right
	 */
	public static boolean isAnagram(String left, String right) {
		if (left.length() != right.length()) {
			return false;
		}

		char[] chLeft = left.toCharArray();
		char[] chRight = right.toCharArray();

		Arrays.sort(chLeft);
		Arrays.sort(chRight);

		for (int i = 0; i < left.length(); i++) {
			// 'a', 'b'
			// 'a', 'a'
			if (chLeft[i] != chRight[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAnagramHash(String left, String right) {
		HashMap<Character, Integer> hml = new HashMap<>();
		HashMap<Character, Integer> hmr = new HashMap<>();

		for (int i = 0; i < right.length(); i++) {
			if (hmr.containsKey(right.charAt(i))) {
				int value = hmr.get(right.charAt(i));
				hmr.put(right.charAt(i), value + 1);

			} else {
				hmr.put(right.charAt(i), 1);
			}
		}

		for (int i = 0; i < left.length(); i++) {
			if (hml.containsKey(left.charAt(i))) {
				int value = hml.get(left.charAt(i));
				hml.put(left.charAt(i), value + 1);

			} else {
				hml.put(right.charAt(i), 1);
			}
		}

		Iterator<Map.Entry<Character, Integer>> it = hml.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Character, Integer> entry = it.next();

			Integer rightValue = hmr.get(entry.getKey());
			if (rightValue == null || !rightValue.equals(entry.getValue())) {
				return false;
			}
		}
		return true;
	}
}
