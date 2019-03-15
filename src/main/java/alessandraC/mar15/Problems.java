package alessandraC.mar15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

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

	public static List<Integer> killDuplicateHash(List<Integer> data) {
		if (data == null || data.size() == 0) {
			throw new IllegalArgumentException("Bad input data");
		}

		HashSet<Integer> result = new HashSet<>(data);

		return data;

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
		if (value <= 0) {
			throw new IllegalArgumentException("Bad input data");
		}

		if (value % 2 == 1) {
			return "Weird";
		}

		if (value >= 2 && value <= 5) {
			return "Not weird";
		}
		
		if(value >= 6 && value <= 20) {
			return "Weird";
			
		}
		if(value > 20) {
			return "Not weird";
		}


		
		return "Weird";
	}

}
