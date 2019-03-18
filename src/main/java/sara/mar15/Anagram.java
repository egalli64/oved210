package sara.mar15;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;

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
}