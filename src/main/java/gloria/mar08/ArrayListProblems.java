package gloria.mar08;

import java.util.ArrayList;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

import com.fasterxml.classmate.members.RawConstructor;

public class ArrayListProblems {

	/**
	 * Doubles contained in both input arrays
	 * 
	 * <pre>
	 * {1.1, 4.4, 5.5}, {1.1, 7.7} --> {1.1}
	 * {1.1, 4.4, 5.5}, {1.2, 7.7} --> {}
	 * </pre>
	 *
	 * @param left
	 * @param right
	 * @return
	 */

	public static ArrayList<Double> intersection(double[] left, double[] right) {
		ArrayList<Double> results = new ArrayList<>();

		for (int i = 0; i < left.length; i++) {
			for (int k = 0; k < right.length; k++) {
				if (left[i] == right[k]) {

					results.add(left[i]);

					// for ( double lValue : left){
					// for(double jValue : right){
					// if (lValue == jValue){
					// results.add(lValue);
				}

			}
		}
		return results;
	}

	/**
	 * Remove Duplicates
	 * 
	 * { "aa", "bb", "aa"} --> {"aa", "bb"}
	 * 
	 * @param data a list of Strings
	 */

	public static void removeDuplicates(ArrayList<String> data) {
        
		for (int i = 0; i < data.size() - 1; i++) {
			for (int k = (i + 1); k < data.size(); k++) {
				if (data.get(i) == data.get(k)) {
					data.remove(k); 
					
				}
			}

		}

	}
	
	/**
	 * Given n-1 values in [1, n], return the missing value
	 * 
	 * <pre> {1, 3} --> 2
	 * {1, 3, 5, 7, 9, 8, 7, 6, 2} --> 4
	 * </pre>
	 * 
	 */
	
//	public static int missingValue(int[] data) {
//		
//	}
}
