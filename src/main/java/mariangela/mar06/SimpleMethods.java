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
	 * { 1, 2, 5, -7 } -> -7 {MAX_VALUE, MAX_VALUE, MAX_VALUE} -> MAX_VALUE
	 */

	public static int smallest(int[] data) {
		if (data == null || data.length == 0) {
			return Integer.MAX_VALUE;
		}

		int currentMinimum = data[0];
		for (int i = 0; i < data.length; i++) {   // è come scrivere for(int value:data)
			 
		}
		return currentMinimum;
	}
}
