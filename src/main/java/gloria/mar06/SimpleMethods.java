package gloria.mar06;

public class SimpleMethods {
	/**
	 * input: char c output: true if c is an uppercase character ('A'). False
	 * otherwise ('h')
	 * 
	 */

	public static boolean isUpper(char c) { // static vuol dire che non vedo stanziare la classe.
		if (c >= 'A' && c <= 'Z') { // if(c<'A' || c>'Z') return false; return true
			return true;
		} // altrimenti in altri casi
		return false;
	}

	/**
	 * input: char c output: true if c is an alphabetic character ('A', 'c'). False
	 * in otherwise ('0', ')')
	 */

	public static boolean isAlpha(char c) {
		if (c < 'A' || c > 'Z' && c < 'a' || c > 'z') { // quando utilizzo il segno che simboleggia "OR" allora devo
														// invertire i RETURN rispetto alla consegna. oppure posso anche
														// scrivere: if(c >= 'A'
														// && c <= 'Z' || c >= 'a' && c <= 'z') return true; return
														// false;
			return false;
		}
		return true;
	}

	/**
	 * input: char c. Output: char converted to uppercase 'x' --> 'X'
	 */

	// int y compresa tra c e a quindi c-a fa 10 per l'alfabeto che equivale a k
	// (y=10). per trovare il k maiuscolo sarà A + y

	public static char toUpper(char c) {
		if (c < 'a' || c > 'z') { // questa scrittura vuol dire che la lettera è ESCLUSA dall'intervallo
			return c;
		}

		int delta = c - 'a'; // if c =='k' -> delta = 10; quindi
		return (char) ('A' + delta); // oppure posso togliere l'INT e scrivere solo "RETURN (CHAR) (C + 'A' - 'a');
										// il DELTA va ad indicare il valore numerico della tabella dei segni che
										// corrisponde alla lettera che intendo indicare. Ad esempio se voglio dire che
										// voglio la lettera K corrisponde alla posizione 10 quindi se mi viene data una
										// minuscola devo fare la la lettera maiuscola più il valore delta.
	}

	/**
	 * input: int[] data output: smallest element.
	 * 
	 * {1, 2, 5, -7} --> il risultato dovrà essere -7;
	 * 
	 */

	public static int smallest(int[] data) {
		if (data == null || data.length == 0) {
			return Integer.MAX_VALUE;
		}

		int currentMinumum = data[0];

//		for(int value : data) {			
//		for (int i = 0; i < data.length; i++) {
//		}

		for (int i = 1; i < data.length; i++) {
			if (data[i] < currentMinumum) { // oppure: currentMinimum > data[i]
				currentMinumum = data[i];
			}
		}
		return currentMinumum;
	}

	/**
	 * input: int[] data output: smallest element.
	 * 
	 * {1, 2, 5, -7} --> il risultato dovrà essere 3; {-7, 2, 5, -7} --> il
	 * risultato dovrà essere 0; null {} --> il risultato dovrà essere -1.
	 * 
	 */

	public static int firstSmallestIndex(int[] data) {
		if (data == null || data.length == 0) {
			return -1;
		}

		int currentMinIndex = 0; // zero mi indica la posizione dove indico esserci la variabile più piccola
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
	 * {1, 2, 3}, 2 --> true; {1, 2, 3}, 7 --> false
	 */

	public static boolean find(int[] data, int target) {
		for (int i = 0; i < data.length; i++) {
			if (target == data[i]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * {1, 2, 3}, 2 --> 1; {1, 2, 3},7 --> -1
	 */

	public static int findPos(int[] data, int target) {
		if (data == null) { // || data.length == 0) {
			return -1;
		}

//		int currentfindPos = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return i; // data[currentfindPos];
			}
		}
		return -1;
	}

	/**
	 * "abba" -> true; "abac" -> false
	 */

	public static boolean isPalindrome(String s) {
		return false;
	}
}
