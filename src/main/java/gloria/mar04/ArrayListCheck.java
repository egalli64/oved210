package gloria.mar04;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCheck {
	public static void main(String[] args) {
		int[] array = { 1, 4, 12, 27 }; // metodo alternativo: int[] array = new int [4]; array [0] = 1; ...

		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println(arrayList);
		arrayList.add(12);
		arrayList.add(2);
		System.out.println(arrayList);
		arrayList.add(0, 28); // per farlo in ordine decrescente
		arrayList.add(3, -1);
		System.out.println(arrayList);

//		arrayList.clear();
//		System.out.println(arrayList);
//		if(arrayList.isEmpty()) {
//			System.out.println("Empty array!");

		if (arrayList.contains(28)) { // per vedere se in una collezione c'è un determinato oggetto
			System.out.println("There's a 28 in the array list");
		}

		System.out.println(arrayList.get(3)); // mi prende l'elemento di indice 3 che vale -1

		// arrayList.indexOf(o) // simile al contains

		System.out.println(arrayList.indexOf(12)); // mi da che corrisponde alla posizione 1
		System.out.println(arrayList.indexOf(33)); // mi segnala come posizione -1 perchè non esiste all'interno
													// dell'intervallo, non trovandolo risulta -1
		arrayList.add(12);
		System.out.println(arrayList);
		System.out.println(arrayList.indexOf(12) + "," + arrayList.lastIndexOf(12)); // segnala le posizioni che chiedo.
																						// il primo parte dalla
																						// posizione 0 mentre il secondo
																						// parte dall'ultima posizione,
																						// quindi dalla 4 che
																						// corrisponde al 12.

		for (int i = 0; i < arrayList.size(); i++) {
			Integer cur = arrayList.get(i);
			if (cur % 2 == 0) {
				System.out.println(cur);
			}

		}

		Iterator<Integer> it = arrayList.iterator(); // l'iteratore punta alla cella inesistente prima della prima cella
		while (it.hasNext()) { // con has next vediamo se ha un successore valido, punta alla cella dove c'è un
								// integer valido, utilizzabile. Sposta l'iteratore alla cella successiva, mi
								// legge il valore e me lo ritorna. Andiamo avanti fino a che non arriviamo
								// sull'ultima dove l'has next andrà fuori perchè non ci sono più celle valide e
								// quindi mi ritornerà FALSE e il mio loop terminerà così
			Integer cur = it.next();
			if (cur % 2 == 0) {
				System.out.println(cur);
			}
		}

		for (Integer cur : arrayList) {
			if (cur % 2 == 0) {
				System.out.println(cur);
			}
		}

		System.out.println(arrayList);
		arrayList.remove(1); // rimuove l'elemento nella posizione che ho indicato, in questo caso la n° 1
		System.out.println(arrayList);

//		arrayList.trimToSize(); // per ridurre lo spazio al minimo indispensabile
	}
}
