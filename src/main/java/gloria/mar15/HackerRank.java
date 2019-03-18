package gloria.mar15;

import java.util.Arrays;

public class HackerRank {
	/**
	 * 
	 * <pre>
	 * If value is odd, return "Weird"
	 * If value is even and in [2...5], return "Not Weird"
	 * If value is even and in [6...20], return "Weird"
	 * If value is even and greater than 20, return "Not Weird"
	 * </pre>
	 * 
	 * @param value an integer
	 * @return "Weird" or "Not weird"
	 */

	public static String ifElse(int value) {
		if (value < 1) {
			throw new IllegalAccessError();
		}
		if (value % 2 == 1) { // if(value % 2 == 1 || (value > 5 && value < 21)){ return "Weird"; }else{
								// return "Not Weird"}
			return "Weird";

		} else {

			if (value >= 2 && value <= 5) {
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

	/**
	 * 
	 * 2 -->{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
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
	 * <pre>
	 * cat, tac --> true
	 * catt, tacc --> false
	 * </pre>
	 * 
	 * @param left  a string
	 * @param right another string
	 * @return true if left is an anagram of right
	 */

	static public boolean isAnagram(String left, String right) {

		char[] arrayLeft = left.toCharArray();
		char[] arrayRight = right.toCharArray();

		Arrays.sort(arrayLeft);
		Arrays.sort(arrayRight);

		if (arrayLeft.length != arrayRight.length) {
			return false;
		}

		for (int i = 0; i < arrayRight.length; i++) {
			if (arrayRight[i] != arrayLeft[i]) {
				return false;
			}
		}
		
		return true;

	}
}
