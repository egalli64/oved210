package marina.mar05;

import java.util.Arrays;
import java.util.HashSet;

public class Problem {

	/*
	 * in: [1, 1, 2] out:2 in: [-1027, 12, -1027,12, 42] out:42
	 * 
	 */

	public static int findUnique(int[] data) {

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
		throw new IllegalAccessError("Can't find a single value!");
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

		HashSet<Integer> hash = new HashSet<>();

		for (int i = 0; i < data.length; i++) {
			if (hash.contains(data[i])) {
				hash.remove(data[i]);
			} else {
				hash.add(data[i]);
			}
		}
		if (hash.size() != 1) {
			throw new IllegalStateException("Bad input data");
		}

		return hash.iterator().next();
		
//		ALTRIMENTI:
//		Iterator <Integer> it = hash.iterator();
//		if(it.hasNext()) {
//			return it.next();
//		}

	}

	/*
	 * in: [2, 1, 1] out: 2 in: [-1027, 12, -1027, 12, 42] out: 42
	 */
	public static int findBigger(int[] data) {
		return 0;
	}

	/*
	 * in: [2, 1, 1] out: true in: [-1027, 11, -1029, 15, 41] out: false in: [11,
	 * 42] out: true
	 */

	public static boolean hasEven(int[] data) {

		for (int value : data) {
			if (value % 2 == 0) {
				return true;
			}
		}
		return false;
	}

//	public static boolean hasEven(int[] data) {
//		
//		for (int i = 0; i < data.length; i++) {
//		
//			if (data[i] % 2 == 0) {
//				return true;
//			}
//		}
//		return false;
//	}

	public static boolean isEven(int value) {

		if (value % 2 == 0) {
			return true;
		}
		return false;
	}
}
