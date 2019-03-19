package gloria.mar15;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Problems {

	/**
	 * <pre>
	 * {1, 1, 1, 4, 5, 6, 4, 6, 5} --> {1, 4, 6, 5};
	 * {1, 1, 1, 1, 1, 1, 1, 1, 1, 1} --> {1};
	 * {} --> {}
	 * null --> exception? {}?
	 * </pre>
	 * 
	 * @param data an array list of integer
	 * @return a List containing only unique elements from data
	 */

	public static List<Integer> killDuplicates(List<Integer> data) {
		if (data == null || data.isEmpty()) {
			return Collections.emptyList();
		}

		ArrayList<Integer> buffer = new ArrayList<>(data);
		buffer.sort(null);
		ArrayList<Integer> results = new ArrayList<>();

		Integer value = buffer.get(0);
		results.add(value);
		for (int i = 1; i < buffer.size(); i++) {
			Integer current = buffer.get(i);
			if (!current.equals(value)) {
				results.add(current);
				value = current;
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
	
	static public boolean isAnagramHash(String left, String right) {
		HashMap<Character, Integer> anagram = new HashMap<>();

		for (int i = 0; i < left.length(); i++) {
			Character key = left.charAt(i);
			Integer value = anagram.get(key);
			if (value == null) {
				value = 0;
			}
			anagram.put(key, value + 1);
		}

		for (int i = 0; i < right.length(); i++) {
			Character key = right.charAt(i);
			Integer value = anagram.get(key);
			if (value == null || value.equals(0)) {
				return false;
			}
			anagram.put(key, value - 1);
		}

		for (int value : anagram.values()) {
			if (value != 0) {
				return false;
			}
		}

		return true;
	}

}
