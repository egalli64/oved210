package marina.mar07;

public class ArrayProblems {

	/**
	 * sum all the values
	 * 
	 * <pre>
	 * {1.0, 2.1, 3.0, 4.2, 5.0} -> 15.3
	 * </pre>
	 * 
	 * @param data an array of doubles
	 * @return the sum
	 * 
	 */

	public static double sum(double[] data) {

		double result = 0.0;

		if (data == null) {
			return result;
		}

		for (int i = 0; i < data.length; i++) {
			result = data[i] + result; // result += data [i];
		}

// OPPURE
//		for (double value : data) {
//			result += value;
//		}

		return result;
	}

	/**
	 * Average all the values
	 * 
	 * <pre>
	 * {1.0, 2.0, 3.0} -> 2.0
	 * </pre>
	 * 
	 * @param data an array of doubles
	 * @return the average
	 * 
	 */

	public static double average(double[] data) {

		double result = 0.0;

		if (data == null || data.length == 0) {
			return result;
		}

		for (int i = 0; i < data.length; i++) {
			result += data[i];
		}

		return result / data.length; // return sum(data) / data.length;
	}

	/**
	 * Merge the two passed arrays alternating elements
	 * 
	 * <pre>
	 * {1, 2, 3}, {9, 8, 7}  -> {1, 9, 2, 8, 3, 7}
	 * </pre>
	 * 
	 * @param data two same sized array
	 * @return the merge of the two arrays
	 * 
	 */

	public static int[] merger(int[] left, int[] right) {
		
		if (left == null && right == null) {
			return null;
		}

		if (left.length != right.length) {
			throw new IllegalArgumentException("The input array should have the same size");
		}

		int result[] = new int[left.length * 2];

		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 0) {
				result[i] = left[i / 2];
			} else {
				result[i] = right[i / 2];
			}
// result [i] = i%2 == 0 ? left [i/2] : right [i/2];
		}
		return result;
	}

	/**
	 * Merge the two passed arrays alternating elements
	 * 
	 * <pre>
	 * {1, 2}, {9, 8, 7, 6}  -> {1, 9, 2, 8, 7, 6}
	 * </pre>
	 * 
	 * @param data two different sized arrays
	 * @return the merge
	 * 
	 */

	public static int[] mergerEx(int[] left, int[] right) {
	
		int result[] = new int[left.length + right.length];

		int minLen = Math.min(left.length, right.length);

		for (int i = 0; i < minLen * 2; i++) {
			if (i % 2 == 0) {
				result[i] = left[i / 2];
			} else {
				result[i] = right[i / 2];
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
			result[minLen * 2 + i] = largest[minLen + i];
		}

		return result;
	}
}
