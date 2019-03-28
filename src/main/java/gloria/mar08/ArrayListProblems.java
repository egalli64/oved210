package gloria.mar08;

import java.util.ArrayList;
import java.util.Arrays;

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
	 * <pre>
	 *  {1, 3} --> 2
	 * {1, 3, 5, 7, 9, 8, 7, 6, 2} --> 4
	 * </pre>
	 * 
	 */

	public static int missingValue(int[] data) {
		for (int i = 1; i <= data.length + 1; i++) { // loop esterno che luppa su tutti i possibi valori del mio array
														// come procedimento iniziale.
														// Metto il minore uguale e il più uno perchè voglio
														// vedere tutti gli elementi che sono contenuti all'interno
														// dell'array.
			boolean found = false;

			for (int j = 0; j < data.length; j++) { // loop interno per vedere se il valore corrente esiste o meno nel
													// mio array.
				if (data[j] == i) { // se il valore corrente esiste lo salvo e quindi trovato = true; quindi passo
									// al loop successivo per trovare il valore mancante.
					found = true;

					break; // questo vuol dire che una volta trovato il valore mancante mi posso fermare e
							// non continuare a looppare.
				}
			}
			if (found == false) {
				return i;
			}
		}
		return 0; // posso anche scrivere "throw IllegalStateException();

	}

	public static int missingValueBySorting(int[] data) {
		Arrays.sort(data); // algoritmo per mettere in ordine i numeri in maniera crescente, da un array

		// iniziale in cui i valori erano posizionati in maniera casuale.
		for (int i = 0; i < data.length; i++) {
			if (data[i] != (i + 1)) { // (i+1) vuol dire che è diverso dal valore che mi aspetto subito dopo il valore
										// corrente, quindi indica il valore mancante.
				return i + 1; // quindi qui voglio che mi ritorni il valore mancante rappresentato da i+1.
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
