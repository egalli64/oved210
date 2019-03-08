package monica.settimana2lezione4; //07/03/19

public class ArrayProblems {
	/**
	 * sum all the value {1.0, 2.1, 3.0, 4.2, 5.0} -> 15.3
	 * 
	 * @param data an array of double
	 * @return the sum
	 * 
	 * 
	 */
	public static double sum(double[] data) {
		double result = 0;
		for (int i = 0; i < data.length; i++) {
			result += data[i];
		}

		return result;

	}

	/**
	 * average of the values {1.0, 2.0, 3 .0,} data an array of double return the
	 * average
	 */

	public static double average(double[] data) {
		double result = 0; //
		for (int i = 0; i < data.length; i++) { //
			result += data[i]; //
		}

		return result / data.length; // return sum (data)/ data.lenght (senza scrivere tutto sopra riprendo quello
										// che ho fatto prima)
	}

	/**
	 * Merge the two passed array alternating elements
	 * 
	 * {1, 2, 3, } {9, 8, 7} -> {1, 9, 2, 8, 3, 7}
	 * 
	 */

	public static int[] merger(int[] left, int[] right) {

		if (left.length != right.length) {
			throw new IllegalArgumentException("the input arrays should have the same length");
		}
		int result[] = new int[left.length * 2];
		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 0) {
				result[i] = left[i / 2];
			} else {
				result[i] = right[i / 2];
			}
		}                    // si può anche scrivere: results[i] = i%2 == 0? left[i/2]: right [i/2];
		return result;
	}

 //08.03.2019 V lezione
	/**
	 * Merge the two  array alternating elements (when possible)
	 * 
	 * {1, 2} {9, 8, 7, 6} -> {1, 9, 2, 8, 7,6}
	 * 
	 */
	
	public static int[] mergerEx(int[] left, int[] right) {

		int results[] = new int[left.length + right.length];
		int x = Math.min(left.length, right.length);

		for (int i = 0; i < x * 2; i++) {
			if (i % 2 == 0) {
				results[i] = left[i / 2];
			} else {
				results[i] = right[i / 2];
			}
		}

		int [] y = left.length < right.length ? left  : right;    // int [] y = left.length == x ? right  : left; 
		int tailSize = y.length - x;
		for (int i = x * 2; i <tailSize; i++) {
			
			results [x*2 + i] = y [x+i]; 
		}

		return results;

	}
}
	




