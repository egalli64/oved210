package sara.mar06;

public class SimpleMethods {

						// ESERCIZIO 1
	/**
	 * input: char c output: true if c is an uppercase character ('A') false
	 * otherwise ('h')
	 */

	// il metodo deve verificare che "c" sia compreso tra a e z e sia maiuscolo
	// ritorno true

	public static boolean isUpper(char c) {
		if (c >= 'A' && c <= 'Z') {
			return true;
		}
		return false;
	}

						// ESERCIZIO 2
	/**
	 * input: char c output: true if c is an alphabetic character ('A', 'c') false
	 * otherwise ('6,')')
	 */
//il metodo deve dirmi che il carattere è alfabetico
	public static boolean isAlpha(char c) {
		if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
			return true;
		}
		return false;
	}

						// ESERCIZIO 3
	/**
	 * input: char c output: char converted to uppercase 'x' --> 'X'
	 */
	public static char toUpper(char c) {

		if (c < 'a' || c > 'z') {
			return c;
		}

		int delta = c - 'a';
		return (char) ('A' + delta);

	}

					// ESERCIZIO 4
	/**
	 * input: int[] data output: smallest element
	 * 
	 * { 1, 2, 5, -7} --> -7 max value
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

	// ESERCIZIO 5
	/**
	 * input: int[] data output: smallest element
	 * 
	 * { 1, 2, 5, -7} --> 3 { -7, 2, 5, -7} --> 0 null, {} -> -1
	 */
	public static int firstSmallestIndex(int[] data) {
		if (data == null || data.length == 0) {
			return -1;
		}
		int currentMinIndex = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i] < data[currentMinIndex]) {
				currentMinIndex = i;
			}
		}
		return currentMinIndex;

	}

	// ESERCIZIO 6
	public static int lastSmallestIndex(int[] data) {

		if (data == null || data.length == 0) {
			return -1;
		}

		int currentLastIndex = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] <= data[currentLastIndex]) {
				currentLastIndex = i;
			}
		}
		return currentLastIndex;
	}

	// ESERCIZIO 7
	/**
	 * {1, 2, 3}, 2 -> true {1, 2, 3}, 7 -> false
	 */
	public static boolean find(int[] data, int target) {

		for (int i = 0; i < data.length; i++) {
			if (target == data[i]) {
				return true;

				// oppure for(int value: data) {
				// if (value == target) {
				// return true;
			}
		}
		return false;
	}

	// ESERCIZIO 8

	/**
	 * {1, 2, 3}, 2 -> 1 {1, 2, 3}, 7 -> -1
	 */
	public static int findIndex(int[] data, int target) {

		if (data == null || data.length == 0) {
			return 1;
		}

		int currentFindIndex = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return i;
			}
		}
		return -1;
	}

	// ESERCIZIO 9
	/**
	 * isPAlindrome() checks if a String is a palindrome if the passed String is
	 * null , return false otherwise return true only if the string is a palindrome
	 * 
	 * for example: "abba" -> true "abac" -> false
	 * 
	 * @param s the string to be checked if palindrome
	 * @return true only if the input is a palindrome
	 * 
	 */

	public static boolean isPalindrome(String s) {

		if (s == null) {

			return false;
		}

		if (s.length() < 2) { // la stringa con un solo carattere è un palindromo
			return true;
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

	// ESERCIZIO 10
	/**
	 * {1, 2, 3} -> {3, 2, 1}
	 * 
	 */

	public static int[] reverseReturn(int[] data) {

		if (data == null || data.length == 0) {
			return data;
		}

		int[] result = new int[data.length];

		for (int i = 0; i < result.length; i++) {

			result[i] = data[data.length - 1 - i]; //nel primo elemento di result mettiamo l'ultimo di data
		}											//mettendo -1 fa il giro, penultimo ecc
		return result;														
	}

	// ESERCIZIO 11

	public static void reverse(int[] data) {

		if (data == null || data.length == 0) {
			return;
		}

		// per fare swap

		int left = 0;
		int right = data.length - 1;

		for (; left < right; left++, right--) {
			int temp = data[left];
			data[left] = data[right];
			data[right] = data[left];
			data[right] = temp;
		}
	}
}
