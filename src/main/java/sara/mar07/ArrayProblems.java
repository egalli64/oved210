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
	 */
	public static int[] merger(int[] left, int[] right) {
		int result[] = new int[0];
		
		
		


		

		return result;
	}

}
