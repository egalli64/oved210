package elmonda.mar04;

import java.util.ArrayList;
import java.util.Iterator;

public class ArreyListCheck {
	public static void main(String[] args) {
		int[] array = { 1, 4, 12, 27 }; // equivalene a scrivere = new int[4]; array[0] = 1; ...
		// posso fare array list
		ArrayList<Integer> arrayList = new ArrayList<>(); // opp scrivere: ArrayList<Integer> arrayList = new
															// ArrayList<Integer>();// gli devo mettere un tipo
															// reference quindi INTEGER, e devo chiamare il costruttore
															// new array list
		System.out.println(arrayList); // se non specifico niente mi stampa [], se specifico 12 mi stampa il valore, lo
										// converte in integer e me lo mette denro la collezione
		arrayList.add(12);
		arrayList.add(2);
		System.out.println(arrayList);

		// 2 metodo, mi mette un elemento nella posizione che voglio.
		// voglio inserire l'elemento 28 e mantenere l'ordine decrescente
		arrayList.add(0, 28);
		arrayList.add(3, -1); // in 0 ho 28, nel posto tre ho -1; in esecuzione ----> [28, 12, 2, -1]
		System.out.println(arrayList);

		// arrayList.clear();
		// System.out.println(arrayList); //il metodo clear ci elimina gli elementi che
		// sono dentro la arrey list. ---> []

		// metodo clone, è un metodo molto complicato e si usa raramente e con
		// attenzione!

		// metodo contains per vedere se in una collezione c'è un determinato oggetto.

		if (arrayList.contains(28)) { // se è true mi esegue la stampa sotto
			System.out.println("There's a 28 in the array list"); // in questo caso esegue perche vero
		}

		// METODO arrayList.ensureCapacity(arg0); ---> la mia arrey list ha una
		// capacità, blocco di memoria che java mi ha allocato per memorizzare quelle
		// informazioni
		// METODO EQUALS MI FA CONFRONTARE ..
		// GET è la controparte per accedere ad un elemento in una certa posizione e
		// leggerlo, se voglio stampare il terzo elemento

		System.out.println(arrayList.get(3));
		System.out.println(arrayList.indexOf(12));
		System.out.println(arrayList.indexOf(33)); // index of ti dice in quale posizione si trova quello che stai
													// cercando

		arrayList.add(12);
		System.out.println(arrayList);
		System.out.println(arrayList.indexOf(12) + "," + arrayList.lastIndexOf(28)); // last ti dice la posizione
																						// partendo dalla coda
		// // lavorare su tutti gli elementi che vanno da 0 a n-1

		for (int i = 0; i < arrayList.size(); i++) {
			Integer cur = arrayList.get(i);
			if (cur % 2 == 0) {
				System.out.println(cur);
			}
		}
// iteratore, è la rappresentazione di quello che è il puntatore
		// VOGLIAMO SCANDIRE TUTTI I VALORI, PER LUPPARE SUI SUCCESSORI USO NEXT CHE
		// VUOL DIRE LEGGIMI IL VALORE E RITORNAMELO FINO ALL'ULTIMA CELLA, SULL'ULTIMA
		// CELLA IL LOOP TERMINERà PERCHè L'ITERATORE NON AVRà UN SUCCESSORE
		Iterator<Integer> it = arrayList.iterator(); // L'ITERATORE PUNTA ALLA CELLA ESISTENTE PRIMA DELLA PRIMA CELLA,
														// COME SE FOSSE -1
		while (it.hasNext()) { // con has next valutiamo se c'è un successore valido (cella succ su cui
								// lavorare), has next punta ad una cella dove c'è un integer
								// utilizzabile,all'ultima cella has next andra fuori e has next mi ritornerà
								// false, e il mio loop sarà finito avendo terminato tutti gli elementi nella
								// mia list
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
		arrayList.remove(1);    // il numero 12 sparirà ---> [28, 12, 2, -1, 12]
		                                                   // [28, 2, -1, 12]
		
		System.out.println(arrayList);

	}
}