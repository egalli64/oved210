package sara.mar08;

import java.util.ArrayList;

public class ArrayListProblems {

	/**
	 * Doubles contained in both input arrays
	 * 
	 * <pre>
	 * {1.1, 4.4, 5.5 }, {1.1, 7.7} -> {1.1}
	 * {1.1, 4.4, 5.5 }, {1.2, 7.7} -> {}
	 * </pre>
	 * 
	 * @param left
	 * @param right
	 * @return
	 */

	public static ArrayList<Double> intersection(double[] left, double[] right) {
		ArrayList<Double> result = new ArrayList<>();

		for (int i = 0; i < left.length; i++) {
			for (int j = 0; j < right.length; j++) {
				if (left[i] == right[j]) {
					result.add(left[i]);
				}
			}
		}
		return result;
	}

	/**
	 * Remove duplicates
	 * 
	 * {"aa", "bb", "aa"} -> {"aa","bb"}
	 * 
	 * @param data a list of Strings
	 */

	public static void removeDuplicates(ArrayList<String> data) {

		for (int i = 0; i < data.size() - 1; i++) {
			for (int j = (i + 1); j < data.size(); j++) {
				if (data.get(i) == data.get(j)) {

					data.remove(j);
				}
			}
		}
	}
}
