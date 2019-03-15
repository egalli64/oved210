package mariangela.mar15;

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
	 * null ->exception? {}?
	 * </pre>
	 * 
	 * @param data an array list of integer
	 * @return a List containing only unique elements from data
	 */
	public static List<Integer> killDuplicates(List<Integer> data) {
		if (data == null || data.size() == 0) {
			throw new IllegalArgumentException("Bad input data!");
		}

		ArrayList<Integer> buffer = new ArrayList<Integer>(data);
		buffer.sort(null);

		ArrayList<Integer> result = new ArrayList<Integer>();

		int previous = buffer.get(0);
		result.add(previous);

		for (int i = 1; i < buffer.size(); i++) {
			if (buffer.get(i) != buffer.get(i - 1)) {
				previous = buffer.get(i);
				result.add(previous);

			}
		}

		return result;
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

		if (value % 2 == 1 || (value > 5 && value < 21)) {
			return "Weird";
		} else {
			return "Not Weird";
		}
	}


//		if (value <= 0) {
//			throw new IllegalAccessError();
//		}
//		
//		if (value % 2 != 0) {
//			return "Weird";
//		}
//		
//		if (2 <= value && 5 >= value) {
//			return "Not Weird";
//		}
//
//		if (6 <= value && 20 >= value) {
//			return "Weird";
//		}
//		if (value > 20) {
//			return "Not Weird";
//		}
//		
//		return "Weird";
//	}
	/**
	 * 
	 * 2 -> {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
	 * 
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
	 * 
	 * cat, tac -> true
	 * catt, tacc -> false
	 * 
	 * 
	 * @param left is a string
	 * @param right another string
	 * @return true is left is an anagram of right
	 */
	
	static public boolean isAnagram(String left, String right) {
		return false;
	}
	
	
	
	
	
	
	
	
	
	
}