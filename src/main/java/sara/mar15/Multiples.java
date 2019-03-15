package sara.mar15;

public class Multiples {

	/**
	 * 2 -> { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
	 * 
	 * @param value an integer
	 * @return the first ten multiples of value
	 */

	public static int[] multiples(int value) {
		int[] result = new int[10];

		for (int i = 0; i < result.length; i++) {
			result[i] = value * (i + 1);
		}

		return result;
	}
	
	/**
	 * <pre>
	 * cat,tac -> true
	 * catt, tacc -> false
	 * </pre>
	 * 
	 * @param left a string
	 * @param right another string
	 * @return true if left is an anagram of right
	 */
	
	static public boolean isAnagram(String left, String right) {
		
		
		return false;
		
	}
}
