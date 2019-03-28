package sara.mar15;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

	/**
	 * <pre>
	 * cat,tac -> true
	 * catt, tacc -> false
	 * </pre>
	 * 
	 * @param left  a string
	 * @param right another string
	 * @return true if left is an anagram of right
	 */

	static public boolean isAnagram(String left, String right) {

//		sort su String
		char[] arrayLeft = left.toCharArray();
		char[] arrayRight = right.toCharArray();

		Arrays.sort(arrayLeft);
		Arrays.sort(arrayRight);

		for (int i = 0; i < arrayLeft.length; i++) {
			if (arrayLeft[i] != arrayRight[i]) {
				return false;
			}
		}
		return true;
	}

	static public boolean isAnagramHash(String left, String right) {
		HashMap<Character, Integer> anagram = new HashMap<Character, Integer>();

		for (int i = 0; i < left.length(); i++) {
			Character key = left.charAt(i);
			Integer value = anagram.get(key);
//				if (value == null) {
//					value = 0;
//				}
//				
			if (anagram.containsKey(key)) {

			}

			

			for (int j = 0; j < right.length(); j++) {
				Character keyright = right.charAt(j);
				Integer valueright = anagram.get(key);
				if (value == null || value.equals(0)) {
					return false;
				}
				

				return true;
			}
		}
		return false;
	}
}