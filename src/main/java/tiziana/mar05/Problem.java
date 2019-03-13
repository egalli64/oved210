package tiziana.mar05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Problem {
	/**
	 * <pre>
	 * in: [2, 1, 1] out: 2
	 * in: [-1027, 12, -1027, 12, 42] out: 42
	 * </pre>
	 */
	public static int findUniqueN2(int[] data) {
		for (int i = 0; i < data.length; i++) {
			boolean single = true;

			for (int j = 0; j < data.length; j++) {
				if (i == j) {
					continue;
				}
				if (data[i] == data[j]) {
					single = false;
					break;
				}
			}

			if (single) {
				return data[i];
			}
		}

		throw new IllegalAccessError("Can't find unique element");
	}

	public static int findUniqueSort(int[] data) {
		if (data == null || data.length % 2 == 0) {
			throw new IllegalAccessError("Bad input data");
		}

		Arrays.sort(data);

		for (int i = 1; i < data.length; i += 2) {
			if (data[i] != data[i - 1]) {
				return data[i - 1];
			}
		}

		return data[data.length - 1];
	}

	public static int findUniqueHash(int[] data) {
		if (data == null) {
			throw new IllegalStateException("Bad input data");
		}

		HashSet<Integer> buffer = new HashSet<>();
		for (int value : data) {
			if (buffer.contains(value)) {
				buffer.remove(value);
			} else {
				buffer.add(value);
			}
		}
		if (buffer.size() != 1) {
			throw new IllegalStateException("Bad input data");
		}

		Iterator<Integer> it = buffer.iterator();
		if (it.hasNext()) {
			return it.next();
		}

		throw new IllegalStateException("Never reached");
	}

	/**
	 * <pre>
	 * in: [2, 1, 1]
	 * out: 2 in: [-1027, 12, -1027, 12, 42] out: 42
	 * </pre>
	 */
	public static int findBigger(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalAccessError("bad input data");
		}

		int bigger = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > bigger) {
				bigger = data[i];
			}
		}
		return bigger;
	}

	/**
	 * <pre>
	 * in: [2, 1, 1] out: true
	 * in: [-1027, 11, -1029, 15, 41] out: false
	 * in: [11, 42] out: true
	 * </pre>
	 */
	public static boolean hasEven(int[] data) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <pre>
	 * in: 2 out: true
	 * in: -1027 out: false
	 * </pre>
	 */
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}
}
