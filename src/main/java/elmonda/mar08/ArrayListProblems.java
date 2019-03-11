package elmonda.mar08;

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
	 * @return
	 */
	public static ArrayList<Double> intersection(double[] left, double[] right) {
		ArrayList<Double> results = new ArrayList<>();

		// soluzione Professore

//		for (double lValue : left) {
//			for (double rValue : right) {
//				if (lValue == rValue) {
//					results.add(lValue); // se sono uguali li metto in result
//					
//				}
//			}
//		}

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
	 * Remove duplicates
	 * 
	 * {"aa", "bb", "aa"} -> {"aa", "bb"}
	 * 
	 * @param data a list of Strings
	 */

	// soluzione Professore
//	public static void removeDuplicates(ArrayList<String> data) {
//		System.out.println();
//		for(int i = 0; i < data.size() - 1; i++)
//			String s = data.get(i);
//		for(int j = data.size() - 1; j>i; j--) {
//			String t = data.get(j);
//			if(s.contentEquals(t));
//		}
//	}

	public static void removeDuplicates(ArrayList<String> data) {
		for (int i = 0; i < data.size() - 1; i++) {
			String s = data.get(i);
			for (int j = data.size() - 1; j > i; j--) {
				String t = data.get(j);
				if (s.contentEquals(t)) {

					data.remove(j);
				}
			}

		}
	}

	/**
	 * Given n-1 values in [1, n], return the missing value
	 * 
	 * for(int i = 1; i < 10; i++) {
	 * 
	 * <pre>
	 * {1, 3} -> 2   // ho i numeri da 1  3 , però manca il 2  // dobbiamo sandire il nostro array e trovare quello che manca
	 * {1, 3, 5, 7, 9, 8, 6, 2} -> 4   //
	 * </pre>
	 */

//	// come valore gli ritorniamo solo il valore che manca
//	public static int missingValue(int[] data) {  
//	
//		return 0;
//	}

	public static int missingValue(int[] data) {

		for (int i = 1; i <= data.length + 1; i++) {
			boolean found = false;

			for (int j = 0; j < data.length; j++) {  // opp for(int value : data) { 
				if (data[j] == i) {                 // opp if (value ==i) {
					found = true;
					break;
				}
			}

			if (found == false) {         // opp if(!found) {
				return i;                 // return i;
			}
		}
		
		return 0;             // throw new IllegalStateException;  // eccezioni check devo scriverle nelle classi public static int, in questo caso è uncheck
	}
	
public static int missingValueBySorting(int[] data) {
	
	Arrays.sort(data);
	for( int i = 0; i < data.length; i++) {   
	                        // non dobbiamo lavorare sugli indici ma su data di i
		if(data[i] !=(i+1)) {
		//found = true;
		//break;
	
	return i+1;  // return= i+1
		}
	}
	return 0;
	
	
	
}

// algoritmo lineare O(n)    1345->
public static int missingValueLinear(int[] data) {     
	boolean[] flags = new boolean[data.length + 1];

	for (int i=0 ; i < data.length; i++) {
		flags[data[i] -1] = true; 
		   //valore corrente -1, in flags di 0 ci metto 1
		  // in flags avremo true per gli elenti presenti in data
	}
		for (int i= 0; i < flags.length; i++) {
			if(flags[i]== false) {
				return i+1;
			
		}   // falso per gli elementi non presenti
	}
	return 0;
}
}  // se non trova niente tiro l'eccezione

