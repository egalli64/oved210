package tiziana.mar06;

public class SimpleMethods {

//	/**
//	 * input:char 
//	 * output:true if c is an uppercase character ('A')
//	 * false otherwise
//	 * ('h') ('6')
//	 */

	public static boolean isUpper(char c) {
		if (c <= 'Z' && c >= 'A') {
			return true;

		}
		return false;
	}

//	/*input:char
//	 * output:true if c is an alphabetic character ('A','c')
//	 * false otherwise 
//	 */
//

	public static boolean isAlphabetic(char c) {
		if ((c <= 'z' && c >= 'a') || (c <= 'Z' && c >= 'A')) {
			return true;
		}
		return false;
	}

//	/**
//	 * input:char c
//	 * output:char converted to uppercase
//	 * 'x' --> 'X'
//	 */

	public static char toUpper(char c) {
		if (c < 'a' || c > 'z') {
			return c;
		}
		int delta = c - 'a';
		return (char) ('A' + delta);
	}

//	/*
//	 * input:int[] output;smaller element
//	 * 
//	 * {1,2,5,-7} -> -7
//	 * {MAX_VALUE, MAX_VALUE, MAX_VALUE} -> MAX_VALUE}
//	 */

	public static int smallest(int[] data) {
		if (data == null || data.length == 0) {
			return Integer.MAX_VALUE;
		}
		int currentMinumum = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < currentMinumum) {
				currentMinumum = data[i];
			}

		}
		return currentMinumum;

	}
//	/*
//	 * input:int[] data
//   * output: smallest element
//	 * 
//	 * null, {} -> -1   //NULL
//	 * {-7,2,5,-7} -> 0 //PLAIN
//   * {-7,2,5,-7} -> 3 //EMPTY
//	 */

	public static int firstSmallestIndex(int[] data) {
		if (data == null || data.length == 0) {
			return -1;
		}
		int currentIndex = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i] < data[currentIndex]) {
				currentIndex = i;
			}
		}
		return currentIndex;

	}

	public static int lastSmallestIndex(int[] data) {
		if (data == null || data.length == 0) {
			return -1;
		}
		int currentIndex = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i] <= data[currentIndex]) {
				currentIndex = i;
			}
		}
		return currentIndex;

	}

//	    /**
//	    *{1,2,3},2 -> true
//	    *{1,2,3},7 -> false
//	    */

	public static boolean find(int[] data, int target) {
		if (data == null) {
			return false;
		}
		for (int i = 1; i < data.length; i++) {
			if (data[i] == target) {

				return true;
			}

		}
		return false;
	}

//    /**
//    *{1,2,3},2 -> 1
//    *{1,2,3},7 -> -1
//    */

	public static int findPos(int[] data, int target) {
		if (data == null) {
			return -1;
		}

		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * Checks if a string is a palindrome If the passed string is null returne false
	 * Otherwise return true only if the string is a palindrome
	 *
	 * For example: "abba" -> true "abbab" -> false
	 * 
	 * @param s the string to be checked if palindrome
	 * @return false only if the input is a palindrome
	 */

	public static boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}
		if (s.length() < 2) {
			return false;
		}
		int left = 0;
		int right = s.length() - 1;

//		for (int i = 0; i < s.length(); i++) { /// metodo charAT per una stringa
//			System.out.println(s.charAt(i));
//
//		}

		for (; left < right; left++, right--) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * {1, 2, 3} -> {3, 2, 1}
	 *
	 */

	public static int[] reverseReturn(int[] data) {
		if (data == null || data.length < 2) {
			return data;

		}
		int[] result = new int[data.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = data[data.length - 1 - i];

		}
		return result;

	}
}
