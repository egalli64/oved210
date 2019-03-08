package sara.mar06;

public class SimpleMethods {
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


	
	/**
	 * {1, 2, 3}, 2 -> 1
	 * {1, 2, 3}, 7 -> -1
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
}

