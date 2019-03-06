package alessandraB.mar06;

public class SimpleMethods {
	/**
	 * input : char c output : true if c is an upper character ('A') false otherwise
	 * ('h'), anche '6' è un carattere se messo tra gli apici.
	 */
	public static boolean isUpper(char c) {

		if (c >= 'A' && c <= 'Z') {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * input: char c output: true if c is an alphabetic character ('A','c') false
	 * otherwise ('6',')')
	 */

	public static boolean isAlpha(char c) {
		if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {

			return true;
		}
		return false;
	}

	/**
	 * 
	 * input: char c outpur: char converted to uppercase 'x' --> 'X'
	 */
	public static char toUpper(char c) {

		if ((c >= 'a' && c <= 'z')) {
			int delta = c - 'a';
			char result = (char) ('A' + delta);

			return (char) ('A' + delta);
		}
		return c;
	}

	/**
	 * input: int[] data output : smaller element {1,2,5,-7} --> -7
	 * 
	 */

	public static int smallest(int[] data) {
		if (data == null || data.length == 0) {
			return Integer.MAX_VALUE;
		}
		int currentMinumum = data[0];

		for (int i = 1; i < data.length; i++) {
			if (currentMinumum > data[i]) {
				currentMinumum = data[i];
			}
		}
		return currentMinumum;
	}

	public static int firstSmallestIndex(int[] data) {
		if (data == null || data.length == 0) {
			return -1;
		}

		int index = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[index] > data[i]) {
				index = i;
			}
		}
		return index;
	}

	public static int lastSmallestIndex(int[] data) {
		if (data == null || data.length == 0) {
			return -1;
		}

		int index = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[index] >= data[i]) {
				index = i;
			}
		}
		return index;

	}

	/**
	 * {1,2,3}, 2 --> true; {1,2,3}, 7 ---> false;
	 */

	public static boolean find(int[] data, int target) {

		for (int i = 0; i < data.length; i++) {
			if (target == data[i])
				return true;
		}
		return false;
	}
}
