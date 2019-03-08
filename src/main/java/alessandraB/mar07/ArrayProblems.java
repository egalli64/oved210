package alessandraB.mar07;

public class ArrayProblems {
	/**
	 * sum all the values
	 * 
	 * 
	 * {1.0,2.1,3.0,4.2,5.0} --> 15.3
	 * 
	 * data an array of doubles the sum
	 * 
	 */
	public static double sum(double[] data) {

		if (data == null) {
			return (0.0);
		}

		double result = 0.0;
		int i;
		for (i = 0; i < data.length; i++) {
			result += data[i];

		}
		return result;

	}

	/**
	 * average of the values
	 * 
	 * {1.0,2.0,3.0} -->2.0
	 * 
	 * data an array of doubles return the average
	 */

	public static double average(double[] data) {

		if (data == null || data.length == 0) {
			return (0.0);
		}

		double result = 0.0;
		int i;
		for (i = 0; i < data.length; i++) {
			result += data[i];
		}
		return (result / data.length);

	}

	/**
	 * Merge the two passed arrays alternating elements
	 * 
	 * {1,2,3},{9,8,7} --> {1,9,2,8,3,7}
	 */
	public static int[] merger(int[] left, int[] right) {
		if (left.length != right.length) {
			throw new IllegalArgumentException("The input arrays should have");
		}

		int results[] = new int[left.length * 2];

		for (int i = 0; i < results.length; i++) {
			if (i % 2 == 0) {
				results[i] = left[i / 2];
			}
			if (i % 2 != 0) {
				results[i] = right[i / 2];
			}
		}

		return results;
	} // altrimenti avrei potuto scrivere results[i] = i%2==0 ? left[i/2] : right[i/2]
		// il punto di domanda mi dice " prendi il primo valore, cioè left [i/2], se è
		// vero che i%2==0.

	/**
	 * Merge the two passed arrays alternating elements
	 * 
	 * {1,2},{9,8,7,6} --> {1,9,2,8,7,6}
	 */

	public static int[] mergerEx(int[] left, int[] right) {

		int results[] = new int[left.length + right.length];
		int minlen = Math.min(left.length, right.length);

		for (int i = 0; i < (minlen * 2); i++) {
			if (i % 2 == 0) {
				results[i] = left[i / 2];

			} else {

				results[i] = right[i / 2];
			}

		}

		int[] largest = left.length == minlen ? right : left;
		int tailSize = largest.length - minlen;

		for (int i = 0; i < tailSize; i++) {
			results[minlen * 2 + i] = largest[minlen + i];
		}
		return results;
	}
}
