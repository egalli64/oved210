package sara.mar07;

public class ArrayProblems {
	// ESERCIZIO SOMMA
	/**
	 * Summ all the values
	 * 
	 * <pre>
	 * {1.0, 2.1, 3.0, 4.2, 5.0} -< 15.3
	 * </pre>
	 * 
	 * @param data an array of doubles
	 * @return the sum
	 */

	public static double sum(double[] data) {
		if (data == null) {
			return 0.0;
		}
		// METODO SUM
		double result = 0.0;
		for (int i = 0; i < data.length; i++) {
			result += data[i];
		}

		return result;
	}

	// ESERCIZIO MEDIA
	/**
	 * Average of tha values
	 * 
	 * <pre>
	 * {1.0, 2.0, 3.0} -< 2.0
	 * </pre>
	 * 
	 * @param data an array of doubles
	 * @return the average
	 */

	public static double average(double[] data) {
		if (data == null || data.length == 0) {
			return 0.0;
		}
		// METODO SUM
		double result = 0.0;
		for (int i = 0; i < data.length; i++) {
			result += data[i]; // FACCIAMO SOMMA
		}

		return result / data.length; // DIVIDIAMO SOMMA PER LA LUNGHEZZA
		// OPPURE SEMPLICEMENTE return sum(data) / data.length
	}

	// ESERCIZIO UNIONE DUE ARRAY

	/**
	 * Merge the two passed arrays alternating elements
	 * 
	 * <pre>
	 * {1, 2, 3}, {9, 8, 7} -< {1, 9, 2, 8, 3, 7}
	 * </pre>
	 * 
	 * @param left  an int array
	 * @param right another int array
	 * @return the merge of the two input arrays
	 * 
	 * @throws IllegalArgumentException if the two arrays have different size
	 */
	public static int[] merger(int[] left, int[] right) {
		if (left.length != right.length) {
			throw new IllegalArgumentException("The input arrays should have");
		}
		// a left assegniamo indici pari e a right assegniamo indici dispari

		int result[] = new int[left.length + right.length];

		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 0) {
				result[i] = (left[i / 2]);
			}
			if (i % 2 == 1) {
				result[i] = (right[i / 2]);
			}
			//altrimenti solo -> result[i] = i%2 == 0 ? left[i/2] : right [i/2];
		}
		return result;
	}
}
