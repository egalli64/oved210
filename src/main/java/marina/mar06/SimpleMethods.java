package marina.mar06;

public class SimpleMethods {

	/*
	 * input: char c output: true if c is an uppercase character ('A') false
	 * otherwise ('h')
	 */

	public static boolean isUpper(char c) {

		if (c >= 'A' && c <= 'Z') {
			return true;
		}
		return false;

	}

	/*
	 * input: char c output: true if c is an alphabetic character ('A', 'c') false
	 * otherwise ('6', ')')
	 */

// MIO METODO:

//	public static boolean isAlpha(char c) {
//
//		if (c >= 'A' && c <= 'Z') {
//			return true;
//		} else {
//			if (c >= 'a' && c <= 'z') {
//				return true;
//			}
//		}
//		return false;
//	}

	public static boolean isAlpha(char c) {

		if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
			return true;
		}
		return false;
	}

	/*
	 * input: char c output: char converted to Uppercase 'x' --> 'X'
	 */

	public static char toUpper(char c) {

		if (c < 'a' || c > 'z') {
			return c;
		}
		{
			int delta = c - 'a';
			return (char) ('A' + delta);
		}
	}

	/*
	 * input: int[] data output: smallest element
	 * 
	 * {1, 2, 5, -7} -> -7
	 * 
	 */

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

	/*
	 * input: int[] data output: smallest element RITORNARE L'INDICE DEL NUMERO PIù
	 * PICCOLO {1, 2, 5, -7} -> 3 {-7, 1, 2, 5, -7} -> 0 null, {} -> -1
	 * 
	 */

	public static int firstSmallestIndex(int[] data) {
		if (data == null || data.length == 0) {
			return -1;
		}

		int first = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i] < data[first]) {
				first = i;
			}
		}
		return first;
	}

	public static int lastSmallestIndex(int[] data) {
		if (data == null || data.length == 0) {
			return -1;
		}

		int last = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i] <= data[last]) {
				last = i;
			}
		}
		return last;
	}

	/*
	 * metodo find che prend edue parametri un array e un numero (intero) true: se
	 * l'intero che passo come secondo parametro è in data false: se gli passo uno
	 * che non c'è è falso
	 */

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

// ALTRO METODO:
//
//	public static boolean fin(int[] data, int target) {
//	  if (data == null) {
//		return false;
//	  }
//		for (int value : data) {
//			if (value == target) {
//				return true;
//			}
//		}
//		return false;
//	}

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
	 * 
	 * Checks if a string is a palindrome If the passed string is null, return
	 * false. otherwise return true only if a string is a palindrome
	 * 
	 * For example:
	 * 
	 * "abba" -> true "abac" -> false
	 * 
	 * @param s the string to be checked if palindrome
	 * @return true only if the input is a palindrome
	 * 
	 * @author my name
	 * 
	 */

	public static boolean isPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return false;
		}

		if (s.length() < 2) {
			return true;
		}

//		int left = 0;
//		int right = s.length() - 1;

		for (int left = 0, right = s.length() - 1; left < right; left++, right--) {
			if (s.charAt(left) == s.charAt(right)) {
				return true;
			}
		}
		return false;

	}

	/*
	 * {1, 2, 3} -> {3, 2 ,1} ribaltare il contenuto di data
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
	}

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