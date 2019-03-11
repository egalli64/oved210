package mariangela.mar08;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListProblems {

	/**
	 * Doubles contained in both input arrays
	 * 
	 * <pre>
	 * {1.1, 4.4, 5.5}, {1.1, 7.7} -> {1.1}
	 * {1.1, 4.4, 5.5}, {1.2, 7.7} -> {}
	 * </pre>
	 * 
	 * @param left
	 * @param right
	 * @return
	 * 
	 */
	public static ArrayList<Double> intersection(double[] left, double[] right) {
		ArrayList<Double> results = new ArrayList<>();
		if (left.length == 0 || right.length == 0) {
			return results;
		}

		for (int i = 0; i < left.length; i++) {
			for (int j = 0; j < right.length; j++) {
				if (left[i] == right[j]) {
					results.add(left[i]);

				}

			}
		}

		return results;
	}

	/**
	 * Remove duplicates
	 * 
	 * {"aa", "bb", "aa"} -> {"aa", "bb"}
	 * 
	 * @param data list of Strings
	 * @return
	 */

	public static void removeDuplicates(ArrayList<String> data) {

		for (int i = 0; i < data.size() - 1; i++) {
			for (int j = data.size() - 1; j > i; j--) {
				if (data.get(i) == data.get(j)) {
					data.remove(j);
				}
			}

		}
		return;
	}

	/**
	 * Given n-1 values in [1, n], return the missing value
	 * 
	 * <pre>
	 * {1,3} -> 2
	 * {1,3,5,7,9,8,6,2} -> 4
	 * </pre>
	 * 
	 */
	public static int missingValue(int[] data) {

		for (int i = 1; i <= data.length + 1; i++) {
			boolean found = false;

			for (int j = 0; j < data.length; j++) {
				if (data[j] == i) {
					found = true;
				}
			}

			if (found == false) {
				return i;
			}

		}

		return 0;
	}

	public static int missingValueBySorting(int[] data) {
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {

			if (data[i] != (i + 1)) {
				return i + 1;
			}
		}

		return 0;

	}

	public static int missingValueLinear(int[] data) {
		boolean[] flags = new boolean[data.length + 1];

		for (int i = 0; i < data.length; i++) {
			flags[data[i] - 1] = true;
		}
		
		for (int i = 0; i < flags.length; i++) {
			if (flags[i] == false) {
				return i + 1;
			}
		}
		throw new IllegalStateException();
	}
}
