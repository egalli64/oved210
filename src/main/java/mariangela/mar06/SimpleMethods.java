package mariangela.mar06;

public class SimpleMethods {
	/**
	 * input: char c output: true is c is an uppercase character ('A') false
	 * otherwise ('h')
	 */
	public static boolean isUpper(char c) {
		if (c >= 'A' && c <= 'Z') {
			return true;
		}
		{
			return false;
		}
	}

	/**
	 * input: char c output: true if is an alphabetic character ('A', 'c') false
	 * otherwise ('6', ')')
	 */

	public static boolean isAlpha(char c) {
		if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
			return true;
		}
		return false;
	}

	/**
	 * input: char c output: char converted to uppercase 'x' --> 'X'
	 */

	public static char toUpper(char c) {
		if (c >= 'a' && c <= 'z') {
			int delta = c - 'a'; // if c== 'k' -> delta = 10
			return (char) ('A' + delta);
		}
		return c;
	}

	/**
	 * input: int[] data output: smallest element
	 * 
	 * { 1, 2, 5, -7} -> -7 {MAX_VALUE, MAX_VALUE, MAX_VALUE} -> MAX_VALUE
	 */

	public static int smallest(int[] data) {
		if (data == null || data.length == 0) {
			return Integer.MAX_VALUE;
		}

		int currentMinimum = data[0];
		for (int i = 0; i < data.length; i++) { // è come scrivere for(int value:data)
			if (data[i] < currentMinimum) {
				currentMinimum = data[i];
			}
		}
		return currentMinimum;
	}

	/**
	 * input: int[] data output: smallest element
	 * 
	 * { -7, 2, 5, -7} -> 0 { -7, 2, 5, -7} -> 3
	 * 
	 * null, {} -> -1
	 */

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

	/**
	 * {1, 2, 3}, 2 -> true {1, 2, 3}, 7 -> false
	 */
	public static boolean find(int[] data, int target) {
		if (data == null) {
			return false;
		}
		for (int i = 0; i < data.length; i++) {
			if (target == data[i]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * {1, 2, 3}, 2 -> 1 {1, 2, 3}, 7 -> -1
	 */
	public static int findPos(int[] data, int target) {
		if (data == null) {
			return -1;
		}

		for (int i = 0; i < data.length; i++) {
			if (target == data[i]) {
				return i;

			}

		}
		return -1;
	}

	/**
	 * Checks if a string is a palindorme. If the passed string is null return
	 * false. Otherwise return true only if the string is a palindrome.
	 * 
	 * "abba" -> true "abac" -> false
	 * 
	 * @param s the string to be checked if palindorme
	 * @return true only if the input is a palindrome
	 * 
	 * @author Mariangela
	 */
	public static boolean isPalindrome(String s) {
		if (s == null) {
			return true;
		}

		for (int left = 0, right = s.length() - 1; left < right; left++, right--) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}

		}
		return true;
	}

	/**
	 * {1, 2, 3] -> {3, 2, 1}
	 */

	public static void reverse(int[] data) {
		if (data == null || data.length < 2) {
			return;

		}

		for (int left = 0, right = data.length - 1; left < right; left++, right--) {

			int temp = data[left];
			data[left] = data[right];
			data[right] = temp;
		}

	}

	/**
	 * {1, 2, 3] -> {3, 2, 1}
	 */
	public static int[] reverseReturn(int[] data) {
		if (data == null || data.length < 2) {
			return data;
		}
		int[] result = new int[data.length];
		for (int i = 0; i < data.length; i++) {

			result[i] = data[data.length - 1 - i];

		}
		return result;
	}
}
