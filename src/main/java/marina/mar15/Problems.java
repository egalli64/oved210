package marina.mar15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.web.multipart.support.StringMultipartFileEditor;
import org.thymeleaf.templateresolver.StringTemplateResolver;

public class Problems {

	/**
	 * <pre>
	 * {1, 1, 1, 4, 5, 6, 4, 6, 5} -> {1, 4, 6, 5}
	 * {} -> {}
	 * null -> exception ? {}
	 * </pre>
	 * 
	 * 
	 * @param data an array list of Integer
	 * @return a List containing only unique elements from data
	 * 
	 */

	public static List<Integer> killDuplicates(List<Integer> data) {

		if (data == null || data.size() == 0) {
			throw new IllegalArgumentException("Bad input data");
		}

		ArrayList<Integer> buffer = new ArrayList<Integer>(data);
		buffer.sort(null);

		ArrayList<Integer> result = new ArrayList<Integer>();

		Integer previous = buffer.get(0);
		result.add(previous);
		for (int i = 1; i < buffer.size(); i++) {
			Integer current = buffer.get(i);
			if (current != previous) {
				result.add(current);
				previous = current;
			}
		}
		return result;
	}

	public static List<Integer> killDuplicatesHash(List<Integer> data) {

		if (data == null) {
			throw new IllegalArgumentException("Bad input data");
		}

		HashSet<Integer> hash = new HashSet<>(data);
		ArrayList<Integer> result = new ArrayList<Integer>(hash);

		return result;

		// return new ArrayList<>(new HashSet<>(data));

	}

	/**
	 * 
	 * If value is odd, return "Weird" If value is even and in [6 .. 20], return
	 * "Weird"
	 * 
	 * If value is even and in [2 .. 5], return "Not Weird" If value is even and
	 * greater than 20, return "Not Weird"
	 * 
	 * @param value an integer
	 * @return "Weird" or "Not weird"
	 */

	public static String ifElse(int value) {

		if (value < 1) {
			throw new IllegalAccessError("Bad input data");
		}

		if (value % 2 == 1 || (value < 21 && value > 5)) {
			return "Weird";
		} else {
			return "Not Weird";
		}
	}

	/**
	 * 2 -> {2, 4, 6, 8, 10, 12, 14, 18, 20}
	 * 
	 * @param value an integer
	 * @return the first ten multiples of value
	 */

	public static int[] multiples(int value) {

		int[] results = new int[10];

		for (int i = 0; i < results.length; i++) {

			results[i] = value * (i + 1);
		}

// Oppure:
//		
//		for (int i = 1; i < results.length; i++) {
//
//			results[i-1] = value * i;
//		}

		return results;
	}

	/**
	 * <pre>
	 * cat, tac -> true
	 * catt, tacc -> false
	 * </pre>
	 * 
	 * 
	 * @param left  a string
	 * @param right another string
	 * @return true if left is an anagram of right
	 */

	static public boolean isAnagram(String left, String right) {

		if (right.length() == 0 || left.length() == 0 && right.length() != left.length()) {
			return false;
		}
	
		char[] newleft = left.toCharArray();
		char[] newright = right.toCharArray();

		Arrays.sort(newleft);
		Arrays.sort(newright);

		for (int i = 0; i < newright.length; i++) {
			if (newright[i] != newleft[i]) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
}
