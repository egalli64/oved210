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
}
//    /**
//    *{1,2,3},2 -> 1
//    *{1,2,3},7 -> -1
//    */
