package alessandraB.mar15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

public class Problems {

	/**
	 * {1,1,1,4,5,6,4,6,5} --> {1,4,5,6} {1,1,1,1,1,1,1} --> {1} {} --> {} null -->
	 * throw exception? {}? data an array list of Integer return a List containing
	 * only unique elements from data.
	 */
	public static List<Integer> killDuplicates(List<Integer> data) {
		if (data == null || data.isEmpty()) {
			throw new IllegalArgumentException("bad input");
		}

		ArrayList<Integer> buffer = new ArrayList<Integer>(data);
		buffer.sort(null);

		ArrayList<Integer> result = new ArrayList<Integer>();

		int previousValue = buffer.get(0);
		result.add(previousValue);

		for (int i = 1; i < buffer.size(); i++) {
			int current = buffer.get(i);
			if (current != previousValue) {
				previousValue = current;
				result.add(current);

			}
		}

		return result;
	}

	public static List<Integer> killDuplicatesHash(List<Integer> data) {
		if (data == null) {
			throw new IllegalArgumentException("bad input");
		}

		HashSet<Integer> noDuplicates = new HashSet<>(data);
		ArrayList<Integer> result = new ArrayList<Integer>(noDuplicates);

		return result;
	}

	/**
	 * 
	 * value an integer if value odd --> " Weird" if value even and [2,5] --> "not
	 * Weird" if value even and [6,20] --> "Weird" if value even and greater than
	 * 20, return "not Weird" return "Weird" or "not Weird"
	 */

	public static String ifElse(int value) {

		if (value % 2 == 1) {
			return "Weird";

		} else {

			if (value >= 2 && value <= 5) {
				return "not Weird";
			}
			if (value >= 6 && value <= 20) {
				return "Weird";
			}
			if (value > 20) {
				return "not Weird";
			} else {

				throw new IllegalAccessError();

			} // if(value %2 == 1 || (value > 5 && value < 21)) {
				// return "Weird";
				// } else {
				// return "Not Weird";
		}
	}

	/**
	 * 2 --> {2,4,6,8,10,12,14,16,18,20}
	 * 
	 * @param value an integer
	 * @return the first ten multiples of value
	 */

	public static int[] multiples(int value) {
		int[] results = new int[10];

		for (int i = 0; i < results.length; i++) {
			int x = value * (i + 1);
			results[i] = x;

		}

		return results;
	}

	/**
	 *
	 * @param left  a string
	 * @param right another string
	 * @return true if left is an anagram of right
	 */

	static public boolean isAnagram(String left, String right) {

		if (left.length() != right.length()) {
			return false;
		}

		char[] x = left.toCharArray(); // torna la versione in caratteri delle stringhe
		char[] y = right.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);

		for (int i = 0; i < x.length; i++) {
			if (x[i] == y[i]) {
				return true;
			} 
		}
		return false;
	}
}
