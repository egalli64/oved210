package trainer.mar06;

public class SimpleMethods {
	/**
	 * input: char c
	 * output:	true if c is an uppercase character ('A')
	 * 			false otherwise ('h' or '6' ...)
	 */
	public static boolean isUpper(char c) {
		if(c < 'A' || c > 'Z') {
			return false;
		}
		return true;
	}

	/**
	 * input: char c
	 * output:	true if c is an alphabetic character ('A', 'c')
	 * 			false otherwise ('6', ')')
	 */
	public static boolean isAlpha(char c) {
		if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
			return true;
		}
		return false;
	}

	
	/**
	 * input: char c
	 * output: char converted to uppercase
	 * 'x' --> 'X'
	 */
	public static char toUpper(char c) {
		if (c < 'a' || c > 'z') {
			return c;
		}

		return (char) (c + 'A' - 'a');
	}
	
	/**
	 * input: int[] data
	 * output: smallest element
	 * 
	 * { 1, 2, 5, -7 } -> -7
	 * {MAX_VALUE, MAX_VALUE, MAX_VALUE} -> MAX_VALUE
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

	/**
	 * input: int[] data
	 * output: smallest element
	 * 
	 * { 1, 2, 5, -7 } -> 3
	 * { -7, 2, 5, -7 } -> 0
	 * null, {} -> -1
	 */
	public static int firstSmallestIndex(int[] data) {
		return 0;
	}

	public static int lastSmallestIndex(int[] data) {
		return 0;
	}
	
}
