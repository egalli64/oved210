package mariangela.mar05;

public class Problem {

	/*
	 * in: [2, 1, 1] out:2 in: [-1027, 12 , -1027, 12, 42] out: 42
	 */
	public static int findUnique(int[] data) {
		return 0;
	}

	/*
	 * in: [2, 1, 1] out:2 in: [-1027, 12 , -1027, 12, 42] out: 42
	 */
	public static int findBigger(int[] data) {
		return 0;

	}

	/*
	 * in: [2, 1, 1] out: true in: [-1027, 12 , -1027, 12, 42] out: false in: [11,
	 * 42] out: true
	 */
	public static boolean hasEvenTrue(int[] data) {
		for (int i = 0; 1 < data.length; i++)
			if (data[i] % 2 == 0) {
				return true;
			}

		return false;
	}

	public static boolean hasEvenFalse(int[] data) {
		for (int i = 0; 1 < data.length; i++)
			if (data[i] % 2 != 0) {
				return false;
			}
		return true;
	}

	/*
	 * in: [2, 1, 1] out:2 in: [-1027, 12 , -1027, 12, 42] out: 42
	 */
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;

	}
}