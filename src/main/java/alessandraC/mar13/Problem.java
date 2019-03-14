package alessandraC.mar13;

public class Problem {

	/**
	 * <pre>
	 * {2, 2, 2, 1, 1}, 2 -> 3
	 * {2, 2, 2, 1, 1, 3, 3, 1, 1}, 3 -> 2
	 * {2, 2, 2, 1, 1, 3, 3, 1, 1}
	 * </pre>
	 * 
	 * @param data an array of Integer
	 * @return the most popular value in data
	 *
	 */

	/**
	 * 
	 * 
	 * @param data
	 * @param value
	 * @return the number of values in data
	 */

	public static int count(int[] data, int value) {
		int result = 0;

		for (int i = 0; i < data.length; i++) {
			if (data [i] == value) {
				result += 1;
			}
		}

		return result;
	}
}
