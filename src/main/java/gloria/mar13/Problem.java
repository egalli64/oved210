package gloria.mar13;

public class Problem {

	/**
	 * 
	 * <pre>
	 * {2, 2, 2, 1, 1} --> 2; 
	 * {2, 2, 2, 1, 1, 3, 3, 1, 1} --> 1
	 * </pre>
	 * 
	 * @param data an array of integer
	 * @return the most popular value in data
	 */

	public static int mostPopular(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {

			}
		}
		return 0;
	}

	/**
	 * 
	 * @param data
	 * @param value
	 * @return the number of values in data
	 * 
	 */

	public static int count(int[] data, int value) {
		int result = 0;
		for (int k = 0; k < data.length; k++) {
			if (data[k] == value) {
				return result;
			}
		}
		return 0;
	}
}
