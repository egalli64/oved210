package monica.settimana2lezione5; //08/03/19

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListProblems {
	/**
	 * 
	 * Doubles contained in both input array
	 * 
	 * left right {1.1, 4.4, 5.5}, {1.1, 7.7} -> {1.1} {1.1, 4.4, 5.5}, {1.2, 7.7}
	 * ->{} left right
	 * 
	 */

	public static ArrayList<Double> intersection(double[] left, double[] right) {
		ArrayList<Double> results = new ArrayList<>();

		for (int i = 0; i < left.length; i++) {

			for (int j = 0; j < right.length; j++)

				if (left[i] == right[j]) {
					results.add(left[i]);
				}
		}

		return results;
	}

	/**
	 * nuovo problema
	 * 
	 * {"aa","bb","aa"} -> { "aa","bb"}
	 * 
	 */
	public static void removeDuplicates(ArrayList<String> data) {
		for (int i = 0; i < data.size() - 1; i++) {
			for (int j = i + 1; j < data.size(); j++)
				if (data.get(i) == data.get(j)) {

					data.remove((j));
				}
		}
	}

	/**
	 * 11/03/19
	 * 
	 * nuovo problema
	 * 
	 * {3,5,1,4} -> { 2} cercare il valore mancante
	 * 
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

		return 0; // oppure -> throw new IllegalStateException();

	}

	public static int missingValueSort(int[] data) {

		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			if (data[i] != i + 1) {
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

		return 0;
	}
}