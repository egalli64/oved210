package monica.settimana2; //05/03/19

import java.util.Arrays;

public class Problem {

	public static int findUniqueSort(int[] data) {
		if (data == null || data.length % 2 == 0) {
			throw new IllegalArgumentException();
		}
		Arrays.sort(data);
		for (int i = 1; i < data.length; i += 2) {
			if (data[i] != data[i - 1]) {
				return data[i - 1];
			}
		}
		return data[data.length - 1];

	}

	public static int findUnique(int[] data) {
		for (int i = 1; i < data.length; i++) {
			boolean single = true;

			for (int j = 0; j < data.length; j++) {
				if (i == j) { // significa che ogni elemento è sempre uguale a se stesso
					continue;
				}
				if (data[i] == data[j]) {

					single = false;

					break;
				}

				if (single) {
					return data[i];

				}
			}
		}
		throw new IllegalAccessError("Can't ");

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
