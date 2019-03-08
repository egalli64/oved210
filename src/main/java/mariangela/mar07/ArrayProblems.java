package mariangela.mar07;

public class ArrayProblems {
	/**
	 * Sum all values
	 * 
	 * <pre>
	 * {1.0, 2.1, 3.0, 4.2, 5.0} -> 15.3
	 * </pre>
	 * 
	 * @param data an array of doubles
	 * @return the sum
	 */
	public static double sum(double[] data) {
		if (data == null || data.length == 0) {
			return 0.0;
		}
		double value = 0.0;
		for (int i = 0; i < data.length; i++) {
			value += data[i];
		}
		return value;
	}

	/**
	 * Average of the values
	 * 
	 * <pre>
	 *{1.0, 2.0, 3.0} -> 2.0
	 * </pre>
	 *
	 * @param data an array of doubles
	 * @return the average
	 */
	public static double average(double[] data) {
		if (data == null || data.length == 0) {
			return 0.0;
		}
		double value = 0.0;
		for (int i = 0; i < data.length; i++) {
			value += data[i];

		}

		return value / data.length;
	}

	/**
	 * Merge the two passed arrays alternating elements
	 * 
	 * <pre>
	 *{1, 2, 3}, {9, 8, 7} -> {1, 9, 2, 8, 3, 7}
	 * </pre>
	 * 
	 */
	public static int[] merger(int[] left, int[] right) {
		if (left.length != right.length) {
			throw new IllegalArgumentException("the input arrays should have the same length");
		}

		int result[] = new int[left.length + right.length];

		for (int i = 0; i < result.length; i++) {
			
			if (i % 2 == 0) {

				result[i] = left[i / 2];
			}
			
			if (i % 2 != 0) {

				result[i] = right[i / 2];
			}
		}

		return result;

	}

}