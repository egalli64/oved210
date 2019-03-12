package sara.mar05;

import java.util.Arrays;
import java.util.HashSet;

public class Problem { // trovare il singolo tra le coppie

	// in: [2, 1, 1] out: 2
	// in: [-1027, 12, -1027, 12, 42] out: 42

	// CON IL SORT
	public static int findUniqueSort(int[] data) {

		if (data == null || data.length % 2 == 0) {
			throw new IllegalAccessError("Bad input data");
		}

		Arrays.sort(data);

		for (int i = 1; i < data.length; i += 2) { // partire da 1 per guardare il secondo elemento e confrontarlo con
													// il primo, per non arrivare all'ultimo e non trovarsi niente
			if (data[i] != data[i - 1]) { // se il valore in posizione i è diverso dal valore in posizione diverso,
											// abbiamo trovato il singolo
				return data[i - 1]; // il singolo è sicuramente i-1 perchè non c'è nessun elemento prima con cui può
									// essere confrontato
			}
		}

		return data[data.length - 1];
	}

	// CON IL DOPPIO FOR

	public static int findUniqueN2(int[] data) {

		for (int i = 0; i < data.length; i++) {
			boolean single = true;

			for (int j = 0; j < data.length; j++) {
				if (i == j) { // se confronto due posizioni uguali sarà sempre uguale
					continue;
				}
				if (data[i] == data[j]) { // se i due data sono uguali non è un single ma una coppia
					single = false;
					break;
				}
			}
			if (single) {
				return data[i];
			}
		}
		return 0;
	}

	// CON HASHSET
	public static int findUniqueHash(int[] data) {

		if (data == null || data.length % 2 == 0) {
			throw new IllegalAccessError("Bad input data");
		}

		HashSet<Integer> buffer = new HashSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			if (buffer.contains(data[i])) { // cosi tutte le coppie verranno messe e tolte e rimarrà solo l'elemento
											// singolo
				buffer.remove(data[i]);
			} else {
				buffer.add(data[i]);
			}
		}
		if (buffer.size() != 1) { // cosi ci assicuriamo che c'è solo un elemento! altrimenti tiriamo eccezione
			throw new IllegalAccessError("Bad input data");
		}

		return buffer.iterator().next();
// altrimenti
//		Iterator<String> it = buffer.iterator();
//		if(it.hasNext()) {
//			return it.next();
	}
}