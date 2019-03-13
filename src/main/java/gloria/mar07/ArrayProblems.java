package gloria.mar07;

public class ArrayProblems {

	/**
	 * SOMMA Sum all the values
	 * 
	 * <pre>
	 * {1.0, 2.1, 3.0, 4.2, 5.0} --> 15.3
	 * </pre>
	 * 
	 * @param data an array of doubles;
	 * @return the sum
	 */

	public static double sum(double[] data) {
		if (data == null) {
			return 0.0;

		}

		double result = 0.0;
		for (int i = 0; i < data.length; i++) {
			result += data[i];

			// OPPURE:
			// for(double value : data){
			// result += value;

		}
		return result;
	}

	/**
	 * MEDIA Average of the values
	 * 
	 * <pre>
	 *   
	 * {1.0, 2.0, 3.0} --> 2.0
	 * </pre>
	 * 
	 * @param data an array of doubles
	 * @return the average
	 */

	public static double average(double[] data) {
		if (data == null || data.length == 0) {
			return 0.0;
		}

		double result = 0.0;
		for (int i = 0; i < data.length; i++) {
			result += data[i];
		}

		return result / data.length;

		// OPPURE
		// return sum(data) / data.length;

	}

	/**
	 * Merge the two passed arrays alternating elements.
	 * 
	 * <pre>
	 * {1, 2, 3}, {9, 8, 7} --> {1, 9, 2, 8, 3, 7}
	 * </pre>
	 * 
	 * @param left  and int array
	 * @param right another int array
	 * @return the merge of the two input arrays
	 * 
	 * @throws IllegalArgumentException if the two arrays have different size
	 */

	public static int[] merger(int[] left, int[] right) {
		if (left.length != right.length) {
			throw new IllegalArgumentException("The input arrays should have");
		}

		int result[] = new int[left.length * 2];

		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 0) {
				result[i] = left[i / 2];
			}
			if (i % 2 == 1) {
				result[i] = right[i / 2];
// OPPURE:  results[i] = i % 2 == 0 ? left[i/2] : right [i/2];
			}
		}

		return result;

	}

	/**
	 * Merge two equally sized arrays alternating elements
	 * 
	 * <pre>
	 * {1, 2}, {9, 8, 7, 6} --> {1, 9, 2, 8, 7, 6}
	 * </pre>
	 * 
	 * @param left  an int arrays
	 * @param right another int array
	 * @return the merge of the two input arrays
	 */

	public static int[] mergerEx(int[] left, int[] right) {
		int results[] = new int[left.length + right.length];
		int minLen = Math.min(left.length, right.length);

		for (int i = 0; i < minLen * 2; i++) {
			if (i % 2 == 0) {
				results[i] = left[i / 2];
			} else {
				results[i] = right[i / 2];
			}
		}

		int[] largest;
		if (left.length > right.length) {
			largest = left;
		} else {
			largest = right;
		}

		int tailSize = largest.length - minLen;
		for (int i = 0; i < tailSize; i++) {
			results[minLen * 2 + i] = largest[minLen + i];
		}
		return results;
	}// int[] largest = left.length == minLen ? right : left;

}
