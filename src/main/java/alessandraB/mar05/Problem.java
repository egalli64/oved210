package alessandraB.mar05;

public class Problem {
	/*
	 * in : [1, 1, 2] out: 2 in : [-1027, 12, -1027, 12, 42] out 42
	 */
	public static int findUnique(int[] data) {
		return 0;
	}

	public static int findBigger(int[] data) {
		return 0;
	}

	public static boolean isEven(int value) {

		if (value % 2 == 0) {

			return true;
		}
		return false;
	}

	public static boolean hasEven(int[] data) {

		for (int value : data) {
			if (value % 2 == 0) {
				return true;
			}
		}

		return false;
	}
}
