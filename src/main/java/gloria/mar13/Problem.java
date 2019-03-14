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
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("");
		}

		int result = data[0];
		int resultCount = count(data, result);

		for (int i = 1; i < data.length; i++) {
			int popular = count(data, data[i]);
			if (popular > resultCount) {
				result = data[i];
				resultCount = popular;
			}
		}

		return result;
	}

	/**
	 * 
	 * @param data
	 * @param value
	 * @return the number of values in data
	 * 
	 */

	public static int count(int[] data, int value) {
		int count = 0;

		for (int k = 0; k < data.length; k++) {
			if (data[k] == value) {
				count += 1;
			}
		}

		return count;
	}

	/**
	 * <pre>
	 * {2, 2, 2, 1, 1},2 --> 3;
	 * {2, 2, 2, 1, 1, 3 ,3, 1, 1}, 3 --> 2;
	 * {2, 2, 2, 1, 1, 3 ,3, 1, 1}, 4 --> 0;
	 * </pre>
	 * 
	 * @param data  an array of integers (possibly) w/repeti
	 * @param value an integer that could be in data
	 * @return the number of values in data
	 */

}
