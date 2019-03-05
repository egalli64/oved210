package monica.settimana2; //04/03/19

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
	public static void main(String[] args) {
		int[] array = { 1, 4, 12, 27 }; // = new int [4]; array [0]= 1; ... potevo scrivere anche così
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); // posso scrivere anche =new Array <> ..significa la
																	// stessa cosa

		System.out.println(arrayList);
		arrayList.add(12); // primo metodo

		arrayList.add(2); // aggiungo e avro [12,2]

		System.out.println(arrayList);
		arrayList.add(0, 28); // aggiungo un terzo numero e con il secondo metodo mi mette il 28 al primo
								// posto perche lo 0 è l'indice del documento cioè la posione
		arrayList.add(3, -1); // posso inserire la posizione fino al 3 perchè poi è nullo dà l'eccezione

		System.out.println(arrayList);

		// arrayList.clear();
		// System.out.println(arrayList);

		if (arrayList.contains(28)) {
			System.out.println("there's a 28 in the array list");
		}

		System.out.println(arrayList.get(3));

		System.out.println(arrayList.indexOf(12));
		System.out.println(arrayList.indexOf(33));

		arrayList.add(12);
		System.out.println(arrayList);
		System.out.println(arrayList.indexOf(12) + " , " + arrayList.lastIndexOf(12));

		System.out.println("*******");

		for (int i = 0; i < arrayList.size(); i++) { // cosi si stampano solo i numeri pari
			Integer cur = arrayList.get(i);
			if (cur % 2 == 0) {
				System.out.println(cur);

			}

		}
		System.out.println("*******");

		Iterator<Integer> it = arrayList.iterator(); // usa l'iteratore pe nascondere gli indici per avere meno roba nel
														// codice
		while (it.hasNext()) {
			Integer cur = it.next(); // leggo il valore ad es. 28
			if (cur % 2 == 0) {
				System.out.println(cur);
			}
		}

		for (Integer cur : arrayList) {
			if (cur % 2 == 0)
				System.out.println(cur);
		}
		System.out.println(arrayList);
		arrayList.remove(1); // elimina il numero nella posizone 1 quindi il 12
		System.out.println(arrayList);

	}

}
