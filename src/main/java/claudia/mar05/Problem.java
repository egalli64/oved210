package claudia.mar05;

import java.util.HashSet;

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

	public static int findUniqueHash(int[] data) {
		if (data == null) {
			throw new IllegalStateException("Bad input data");
		}

		HashSet<Integer> buffer = new HashSet<>();
		for (int i = 0; i < data.length; i++) {
			if (buffer.contains(data[i])) {
				buffer.remove(data[i]);
			} else {
				buffer.add(data[i]);
			}
		}		
		
		return buffer.iterator().next();
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