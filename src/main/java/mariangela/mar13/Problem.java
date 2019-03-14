package mariangela.mar13;

public class Problem {
	/**
	 * <pre>
	 * {2, 2, 2, 1, 1} -> 2
	 * {2, 2, 2, 1, 1, 3, 3, 1, 1} -> 1
	 * </pre>
	 * 
	 * @param data an array of integer
	 * @return the most popular value in data
	 */
	public static int mostPopular(int[] data) {
		if(data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data!");
		}
		int result = data[0] ;
		int resultCount = count(data, result);
		
		for(int i = 0; i < data.length; i++) {
			int currentCount = count(data, data[i]);
		
		if(currentCount > resultCount){
			
			resultCount = currentCount;
			result = data[i];
		}
		}
		return result;
	}

	/**
	 * <pre>
	 * {2, 2, 2, 1, 1}, 2 -> 3
	 * {2, 2, 2, 1, 1, 3, 3, 1, 1}, 3 -> 2
	 * </pre>
	 * 
	 * @param data
	 * @param value
	 * @return the number of values in data
	 */
	public static int count(int[] data, int value) {

		int result = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				result++;

			}
		}

		return result;
	}
}
