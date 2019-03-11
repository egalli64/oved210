package trainer.mar08;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListProblems {
	/**
	 * Doubles contained in both input arrays
	 * 
	 * <pre>
	 * { 1.1, 4.4, 5.5 }, {1.1, 7.7} -> {1.1}
	 * { 1.1, 4.4, 5.5 }, {1.2, 7.7} -> {}
	 * </pre>
	 * 
	 * @param left
	 * @param right
	 * @return the doubles contained in both left and right
	 */
	public static ArrayList<Double> intersection(double[] left, double[] right) {
		ArrayList<Double> results = new ArrayList<>();

		for (double lValue : left) {
			for (double rValue : right) {
				if (lValue == rValue) {
					results.add(lValue);
				}
			}
		}

		return results;
	}

	/**
	 * Remove duplicates
	 * 
	 * { "aa", "bb", "aa" } -> { "aa", "bb" }
	 * 
	 * @param data a list of Strings
	 */
	public static void removeDuplicates(ArrayList<String> data) {
		for (int i = 0; i < data.size() - 1; i++) {
			String s = data.get(i);
			for (int j = data.size() - 1; j > i; j--) {
				String t = data.get(j);
				if (s.equals(t)) {
					data.remove(j);
				}
			}
		}
	}

	/**
	 * Given n-1 values in [1, n], return the missing value
	 *
	 * <pre>
	 * {1,3} -> 2
	 * {1,3,5,7,9,8,6,2} -> 4
	 * </pre>
	 */
	public static int missingValue(int[] data) {
		for (int i = 1; i <= data.length + 1; i++) {
			boolean found = false;
			for (int value : data) {
				if (value == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				return i;
			}
		}

		throw new IllegalStateException();
	}

	public static int missingValueBySorting(int[] data) {
		Arrays.sort(data);
		int expectedValue = 1;
		for (int value : data) {
			if (value != expectedValue) {
				return expectedValue;
			} else {
				expectedValue += 1;
			}
		}

		throw new IllegalStateException();
	}

	public static int missingValueLinear(int[] data) {
		boolean[] flags = new boolean[data.length + 1];
		for (int value : data) {
			flags[value - 1] = true;
		}

		for (int i = 0; i < flags.length; i++) {
			if (flags[i] == false) {
				return i + 1;
			}
		}

		throw new IllegalStateException();
	}
}
