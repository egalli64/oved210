package claudia.mar15;

import java.util.Arrays;
import java.util.HashMap;

public class HackerrankEx {
	/**
	 * 
	 * If value is odd, return "Weird" If value is even and in [2 .. 5], return "Not
	 * Weird" If value is even and in [6 .. 20], return "Weird" If value is even and
	 * greater than 20, return "Not Weird"
	 * 
	 * @param value an integer
	 * @return "Weird" or "Not weird"
	 */
	public static String ifElse(int value) {
		if (value < 1) {
			throw new IllegalAccessError();
		}
		if (value % 2 == 1) {
			return "Weird";
		}
		if (value >= 2 && value <= 5) {
			return "Not Weird";
		}
		if (value >= 6 && value <= 20) {
			return "Weird";
		}

		return "Not Weird";
	}

	public static int[] multiples(int value) {
		int[] result = new int[10];

		for (int i = 1; i <= result.length; i++) {
			result[i - 1] = value * i;
		}

		return result;
	}

	static public boolean isAnagram(String left, String right) {
		if (left.length() != right.length()) {
			return false;
		}
		char[] x = left.toCharArray();
		char[] y = right.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);
		for (int i = 0; i < x.length; i++) {
			if (x[i] != y[i]) {
				return false;
			}

		}
		return true;
	}
	static public boolean isAnagramHash(String left, String right) {
		HashMap<Character, Integer> myHashAnagram = new HashMap<>();
		for (int i = 0; i < left.length(); i++){
			Character key = left.charAt(i);
			Integer value = myHashAnagram.get(key);
			if(value == null) {
				value = 0;
			}
				myHashAnagram.put(key, value +1);
			}
		
		
		
		
		
		
		
		return false;
	}
}
