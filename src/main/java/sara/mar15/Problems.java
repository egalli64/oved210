package sara.mar15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Problems {

	/**
	 * <pre>
	 * {1,1,1,4,5,6,4,6,5} -> {1,4,6,5}
	 * {1,1,1,1,1,1,1,1,1,1} -> {1}
	 * {} -> {}
	 * null -> exception? {}?
	 * </pre>
	 * 
	 * @param data an array list of integer
	 * @return a List containing only unique elements from data
	 */

	public static List<Integer> killDuplicates(List<Integer> data) {
		if (data == null || data.isEmpty()) {
			throw new UnsupportedOperationException("Not yet implemented");
		}

		ArrayList<Integer> buffer = new ArrayList<Integer>(data);
		buffer.sort(null); // ordine naturale
		ArrayList<Integer> result = new ArrayList<Integer>();

		Integer previous = buffer.get(0);
		result.add(previous);

		for (int i = 1; i < buffer.size(); i++) {
			Integer current = buffer.get(i);
			if (current != previous) {
				previous = current;
				result.add(previous);
			}
		}
		return result;
	}

	public static List<Integer> killDuplicatesHash(List<Integer> data) {
		if (data == null) {
			return Collections.emptyList();
		}
		return new ArrayList<>(new HashSet<>(data));
	}

	/**
	 * 
	 * if value is odd, return "Weird" if value is even and in [2...5] , return "Not
	 * Weird" if value is even and in [6... 20], return "Weird" if value is even and
	 * greater than 20, return "Not Weird"
	 * 
	 * @param value an integer
	 * @return "Weird" or "Not Weird"
	 */

	public static String ifElse(int value) {
		if (value < 1) {
			throw new IllegalAccessError();
		}

		if (value % 2 == 1) {
			return "Weird";
			
		} else {
			if (value == 2 || value == 4) {
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
}
