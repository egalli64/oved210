package federica;

public class SimpleMethods {
	/**
	 * input: char c output: true if c is an uppercase character ('A') false
	 * otherwise ('h')
	 */
	public static boolean isUpper(char c) {
		if (c >= 'A' && c <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * input: char c output: true if c is an alphabetic character ('A', 'c') false
	 * otherwise ('6', ')')
	 */
	public static boolean isAlpha(char c) {
		if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * input: char c output: char converted to uppercase 'X' --> 'X'
	 */
	public static char toUpper(char c) {
		if (c >= 'a' && c <= 'z') {
			int delta = c - 'a';
			return (char) ('A' + delta);
		}
		return c;
	}

	/**
	 * input: int[] data output: smaller element input: {1,2,5,-7} output: -7
	 */
	public static int smallest(int[] data) {
		// bisogna usare una variabile locale:
		if (data == null || data.length == 0) {
			return Integer.MAX_VALUE;
		}

		int currentMinimum = data[0];
		for (int i = 1; i < data.length; i++) { // metodo simile
			if (data[i] < currentMinimum) {
				currentMinimum = data[i];
			}
		}
		return currentMinimum;
	}

	/**
	 * input: int[] data output: smallest element input: {-7,2,5,-7} output: 0
	 * input: {1,2,5,-7} output: 3
	 * 
	 * input: null, {} output: -1
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

	public static int lastsmallestIndex(int[] data) {
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
	 * {1,2,3}, 2 -> true {1,2,3}, 7 -> false
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
	 * {1,2,3}, 2 -> 1 {1,2,3}, 7 -> -1
	 */
	public static int findPos(int[] data, int target) {
		if (data == null || data.length == 0) {
			return -1;
		}

		for (int i = 1; i < data.length; i++) {
			if (target == data[i]) {
				return i;
			}

		}
		return -1;
	}

	/**
	 * checks if a string is a palindrome. If the passed string is null return
	 * false. otherwise return true only if the string is a palindrome. "abba" ->
	 * true "abbac" -> false
	 * 
	 * @param s the string to be checked if palindrome
	 * @return true only if the input is a palindrome
	 * 
	 * @author Federica
	 */
	public static boolean isPalindrome(String s) {
		if (s == null) {
			return false;

		}

		for (int left = 0, right = s.length() - 1; left < right; left++, right--) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}

		}
		return true;

	}

	/**
	 * {1,2,3} -> {3,2,1}
	 */
	public static void reverse(int[] data) {
		if (data == null || data.length <2 ) {
			return;
		}
		for (int left = 0, right = data.length -1; left < right; left++, right--) {
			int temp = data[left];
			data[left] = data[right];
			data [right] = temp;
		}
	}
	public static int[] reverseReturn(int[] data) {
		if (data == null || data.length < 2) {
			return data;
		}

		int[] result = new int[data.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = data[data.length -1 -i];
		}
         return result;
	}
	
		
	}