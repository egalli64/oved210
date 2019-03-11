package alessandraC.mar08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProblems {

	/**
	 * Doubles contained in both input arrays;
	 * 
	 * <pre>
	 * {1.1, 4.4, 5.5}, {1.1, 7.7} -> {1.1}
	 * {1.1, 2.2, 3.3}; {1.2, 7.7} -> {}
	 * </pre>
	 * 
	 * @param left
	 * @param right
	 * @return the doubles contained in both left and right
	 */

	public static ArrayList<Double> intersection(double[] left, double[] right) {
		ArrayList<Double> results = new ArrayList();
		for (int i = 0; i < left.length; i++) {
			for (int j = 0; j < right.length; j++) {
				if (left[i] == right[j]) {
					results.add(left[i]);
				}
			}

		}

		return results;
	}

	public static double Doubles(double[] values) {

		return 0;
	}

	/**
	 * Remove duplicates {"aa", "bb", "aa"} -> {"aa", "bb"}
	 * 
	 * @param data a list of Strings
	 */

	public static void removeDuplicates(ArrayList<String> data) {
		System.out.println();

		ArrayList results = new ArrayList();

		for (int i = 0; i < data.size() - 1; i++) {
			String s = data.get(i);
			for (int j = data.size() - 1; j > i; j--) {
				String t = data.get(j);
				if (s.equals(t)) {
					data.remove(j);
				}
			}
			}
			
			/**
			 * Given n -1 values in [1, n], return the missing value;
			 * 
			 * <pre>
			 * {1, 3} -> 2
			 * {1, 3, 5, 7, 9, 8, 6, 2} -> 4
			 * </pre>
			 * 
			 */
			
			
			 

		}
	}


