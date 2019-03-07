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

		if (data == null|| data.length == 0) {
			return (0.0);
		}

		double result = 0.0;
		int i;
		for (i = 0; i < data.length; i++) {
			result += data[i];
		}
		return (result/ data.length);

	}
	
	/**
	 * Merge the two passed arrays alternating elements
	 * 
	 * {1,2,3},{9,8,7} --> {1,9,2,8,3,7}
	 */
	public static int[] merger(int[]left, int[]right) {
		int result[] = new int[0];
		result = new int [left.length + right.length];
		
	    int i = 0;


		return result;
	}

} 
