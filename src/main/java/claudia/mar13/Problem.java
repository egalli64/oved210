package claudia.mar13;

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
		return 0;
	}

	public static int counter(int[] data, int value) {
		int x = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				return x;
			}

		}
		return 0;
	}
}
