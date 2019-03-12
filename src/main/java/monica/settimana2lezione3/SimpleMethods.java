package monica.settimana2lezione3; //06/03/19

public class SimpleMethods {
	/**
	 * input: char c output: true if c is an uppercase character ('A') false
	 * otherwise ('h')
	 *
	 */
	public static boolean isUpper(char c) {
		if (c >= 'A' && c <= 'Z') {
			return true;
		}

		return false;

	}

	/**
	 * input: c output: true if c is an alphabetic character ('A', 'c') false
	 * otherwise ('7',')')
	 */

	public static boolean isAlpha(char c) {
		if (c >= 'A' && c <= 'Z') {
			return true;
		}
		return false;
	}

	public static boolean isAlphaLowerC(char c) {
		if (c >= 'a' && c <= 'z') {
			return true;
		}
		return false;
	}

	// posso anche scrivere riassumendo i due if :
	// public static boolean isAlpha( char c) {
	// if ( c >= 'A' && c <= 'Z' )||(c >= 'a' && c <= 'z'){
	// return true;
	// }
	// return false;
	// }

	public static boolean isAlphaNumber(char c) {
		if (c == '7') {
			return true;
		}
		return false;
	}

	/**
	 * input:c output: char converted to uppercase 'x'--> 'X'
	 */
	public static char toUpper(char c) {

		if (c < 'a' || c > 'z') {
			return c;
		}

		return (char) (c + 'A' - 'a');
	}

	/**
	 * iniziamo ad utilizzare gli array input : int [] data output: smallest element
	 * 
	 * {1,2,5,-7} -> output -7
	 * 
	 */

	public static int smallest(int[] data) {
		if (data == null || data.length == 0) {
			return Integer.MAX_VALUE;
		}

		int currentMinimum = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < currentMinimum) {
				currentMinimum = data[i];
			}
		}
		return currentMinimum;
	}

	/**
	 * iniziamo ad utilizzare gli array input : int [] data output: smallest element
	 * 
	 * {1,2,5,-7} -> 3 posizione del numero più piccolo {-7,2,5,-7} -> 0
	 */

	// da fare primo problema
	public static int firstSmallestIndex(int[] data) {
		if (data == null || data.length == 0) {
			return -1;
		}

		int currentMinimumIndex = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i] < data[currentMinimumIndex]) {
				currentMinimumIndex = i;
			}
		}
		return currentMinimumIndex;
	}

// da fare secondo problema
	public static int lastSmallestIndex(int[] data) {
		if (data == null || data.length == 0) {
			return -1;
		}

		int currentMinimumIndex = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i] <= data[currentMinimumIndex]) {
				currentMinimumIndex = i;
			}
		}
		return currentMinimumIndex;
	}

	/**
	 * terzo problema: {1,2,3} ->2 true {1,2,3} ->7 false
	 * 
	 * 
	 */
	public static boolean find(int[] data, int target) {

		if (data == null) {
			return false;
		}

		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Quarto Problema
	 * 
	 * {1,2,3}, 2-> 1 {1,2,3}, 7->-1
	 */
	public static int findPos(int[] data, int target) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * es. 1 giorno 07/03/19
	 * 
	 * "abba" -> true "abac" -> false
	 */

	public static boolean isPalindrome(String s) {

		if (s == null || s.length() < 2) {
			return false;
		}

		int left = 0;
		int right = s.length() - 1;

		for (; left < right; left++, right--) {

			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}

		}
		return true;
	}

	/**
	 * secondo problema array di int-> {1,2,3} voglio che diventi {3,2,1}
	 * 
	 */

	public static void reverse(int[] data) {

		if (data == null || data.length < 2) {
			return;
		}

		int left = 0;
		int right = data.length - 1;

		for (; left < right; left++, right--) {
			int temp = data[left];
			data[left] = data[right];
			data[right] = temp;
		}
		return;

	}

	/**
	 * terzo problema {1,2,3} -> {3,2,1}
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
