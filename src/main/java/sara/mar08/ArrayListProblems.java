package sara.mar08;

import java.util.ArrayList;
import java.util.Arrays;

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

	/**
	 * Given n-1 values in [1, n], return the missing value
	 * 
	 * <pre>
	 * {1,3} -> 2
	 * {1,3,5,7,9,8,6,2} -> 4
	 * </pre>
	 */
	
	//ESERCIZIO MISSING VALUE
	public static int missingValue(int[] data) {

		for (int i = 1; i <= data.length + 1; i++) { // questo for guarda tutta la serie naturale n+1
			boolean found = false; // inizialmente asseriamo che non ci sia il mancante
			for (int j = 0; j < data.length; j++) { // per evitare di avere troppi indici : for (int value: data)
				if (data[j] == i) {
					found = true; // trovato il mancante
					break; // smettere di loopare
				}
			}
			if (found == false) {
				return i;
			}
		}
		return 0;
	}

	
//ESERCIZIO MISSING VALUE BY SORTING
	public static int missingValueBySorting(int[] data) {
		Arrays.sort(data);
		for (int i = 0; i <= data.length; i++) {
			if (data[i] != (i + 1)) {
				return i + 1;
			}
		}
		return 0;
	}

//ESERCIZIO MISSING VALUE LINEAR
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
