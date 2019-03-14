package sara.mar13;

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
		if (data == null || data.length == 0) {
			throw new IllegalAccessError("bad input data!");
		}

		int result = data[0];
		int resultCount = count(data, result); // richiamo al metodo count che c'è giù per contare

		for (int i = 0; i < data.length; i++) {
			int frequency = count(data, data[i]);
			if (frequency > resultCount) {
				result = data[i];
				resultCount = frequency;
			}
		}
		return result;
	}

	/**
	 * <pre>
	 *{2, 2, 2, 1, 1}, 2 -> 3
	 *{2, 2, 2, 1, 1, 3, 3, 1, 1}, 1 -> 4
	 * </pre>
	 * 
	 * @param data an array of integer
	 * @return the most popular value in data
	 */

	public static int count(int[] data, int value) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				count += 1;
			}
		}
		return count;
	}
}