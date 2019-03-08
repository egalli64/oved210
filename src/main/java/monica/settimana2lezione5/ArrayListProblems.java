package monica.settimana2lezione5; //08/03/19

import java.sql.ResultSet;
import java.util.ArrayList;

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
		for (int i = 0; i < data.size()-1; i++) {
			for (int j = i + 1; j < data.size(); j++)
				if (data.get(i) == data.get(j)) {

					
					data.remove((j));
				}
		}
	}
}
