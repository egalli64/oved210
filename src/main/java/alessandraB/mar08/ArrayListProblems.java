package alessandraB.mar08;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListProblems {

	/**
	 * Doubles contained in both input arrays
	 * 
	 * {1.1, 4.4, 5.5},{1.1, 7.7}-->{1.1} {1.1, 4.4, 5.5},{1.2, 7.7}-->{}
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static ArrayList<Double> intersection(double[] left, double[] right) {
		ArrayList<Double> results = new ArrayList<>();

		for (int i = 0; i < left.length; i++) {
			for (int j = 0; j < right.length; j++) {
				if (left[i] == right[j]) {
					results.add(right[j]);
				}
			}
		}
		return results;
	}

	/**
	 * remove duplicates
	 * 
	 * {"aa","bb","aa"}--> {"aa","bb"}-
	 * 
	 * data a list of Strings
	 * 
	 * @return
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
	 * given n-1 values in [1,n], return the missing value
	 * 
	 * {1,3}-->2 {1,3,5,7,9,8,6,2} --> 4 {1,2,3,5,6,7}
	 */
	public static int missingValue(int[] data) {

		for (int i = 1; i <= data.length + 1; i++) {
			boolean found = false;
			for (int j = 0; j < data.length; j++) {
				if (data[j] == i) {
					found = true;
					break;
				}
			}

			if (found == false) {
				return i;
			}
		}
		throw new IllegalStateException(); // eccezione unchecked

	}

// Arrays.sort(data);  --> quando uso la s finale in JAVA significa 
// che sto utilizzando delle proprietà che lavorano sull'array (in questo caso)
// la funzione sort. mi rimette l'array in ordine naturale (crescente).

	public static int missingValueBySorting(int[] data) {
		Arrays.sort(data);

		for (int i = 0; i < data.length; i++) {
			if (data[i] != i + 1) {
				return i + 1;
			}
		}
		throw new IllegalStateException();

	}

	public static int missingValueLinear(int[] data) {
		boolean[] flags = new boolean[data.length + 1];

		for (int i = 0; i < data.length; i++) {
			flags[data[i] - 1] = true;}
		for (int i = 0; i < flags.length; i++) {
			if (flags[i] != true) {
				return i + 1;

			}
		}
		throw new IllegalStateException();
	}
}