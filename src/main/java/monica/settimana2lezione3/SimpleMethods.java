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
	 * {1,2,5,-7} -> 3 posizione del numero più piccolo
	 * {-7,2,5,-7} -> 0
	 */

	
	//da fare primo problema
	public static int firstSmallestIndex(int[] data) {
		return 0;
	}

// da fare secondo problema
	public static int lastSmallestIndex(int[] data) {
		return 0;
	}
	


}
