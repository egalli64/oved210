package gloria.mar05;

import java.util.Arrays;
import java.util.HashSet;

public class Problem {
	/*
	 * in: [2, 1, 1] out: 2; in: [-1027, 12, -1027, 12, 42] out: 42
	 */

	public static int findUnique(int[] data) {
		for (int i = 0; i < data.length; i++) {
			boolean single = true; // tengo traccia se ho trovato o meno l'elemento single.

			for (int j = 0; j < data.length; j++) { // faccio il secondo loop per vedere se l'elemento corrente è
													// veramente single.
				if (i == j) {
					continue;
				}
				if (data[i] == data[j]) {
					single = false;
					break;
				}

			} // diversamente se non esistessero coppie e quindi esistesse un valore unico,
				// quindi:

			if (single) {
				return data[i];
			}
		}

		return 0;

	}

	public static int findUniqueSort(int[] data) {
		if (data == null || data.length % 2 == 0) {
			throw new IllegalAccessError("Bad input data");
		}

		Arrays.sort(data); // arrays è una classe di java che mi consente di utilizzare un metodo, in
							// questo caso il sorting, per mettere in ordine gli elementi del nostro array.

		for (int i = 1; i < data.length; i += 2) { // i+=2 vuol dire che voglio lavorare sulle coppie, quindi incremento
													// ogni volta di 2, quindi considerata una coppia passeremo subito
													// alla successiva. Se dovessimo trovare il singolo prima non
													// arriveremo mai a quello in fondo.
			if (data[i] != data[i - 1]) { // vuol dire se il valore ad esempio in posizione 1 è diverso dall'elemento in
											// posizione 0 allora ritornamelo perchè vuol dire che non è una copppia ma
											// bensì un singolo, perch+ mi aspetto di trovare sempre coppie, tant'è vero
											// che siamo partiti a luppare dalla posizione 1.
				return data[i - 1]; // ritorno questo perchè prima di lui non c'è nessuno quindi perforza deve
									// essere un singolo.
			}
		}

		return data[data.length - 1]; // se ritrova tutte coppie il single sarà necessariamente l'ultimo
	}

	/*
	 * in: [2, 1, 1] out: 2; in: [-1027, 12, -1027, 12, 42] out: 42
	 */

//	public static int findBigger(int[] data) {
//		for (int i = 0; i < data.length; i++) {
//			boolean bigger = true;
//			for (int j = 0; j < data.length; j++) {
//				if (j < i) {
//					
//					}
//				}
//				return data[i];
//			}
//		}return 0;
//

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}

		return false;

	}

	public static boolean hasEven(int[] data) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				return true;

			}
		}
		return false;
	}

	public static int findUniqueHash(int[] data) {
		if (data == null || data.length % 2 == 0) {
			throw new IllegalStateException("Bad input data");
		}

		HashSet<Integer> buffer = new HashSet<>();
		for (int i = 0; i < data.length; i++) { // for(int value : data) {
			if (buffer.contains(data[i])) {
				buffer.remove(data[i]);
			} else {
				buffer.add(data[i]);
			}
		}

		if (buffer.size() != 1) {
			throw new IllegalStateException("Bad input data");
		}

		return buffer.iterator().next(); // mi ritorna il valore del successore (è l'iteratore che lo fa in quanto
											// puntatore). Mi punta al valore successivo e me lo ritorna. Mentre l'HAS
											// NEXT mi chiede se si può muovere, a differenza del NEXT che si muove
											// direttamente.
	}

}