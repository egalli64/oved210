package claudia.mar05;

public class Problem {

//	int[] data = {2, 1, 1}; 

	public static int findUnique(int[] data) {
		for (int i = 0; i < data.length; i++) {
			boolean found = true;

			for (int j = 0; j < data.length; j++) {
				if (i == j) {
					continue;
				}

				if (data[i] == data[j]) {
					found = false;
					break;
				}
			}

			if (found) {
				return data[i];
			}

		}
		throw new IllegalAccessError("Can't find unique!");

	}

	public static int findBigger(int[] data) {
		int result = Integer.MIN_VALUE;

		for (int i = 0; i < data.length; i++) {
			if (data[i] > result) {
				result = data[i];
			}
		}

		return result;
	}

	public static boolean hasEven(int[] data) {

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				return true;
			}
		}
		return false;
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}

}