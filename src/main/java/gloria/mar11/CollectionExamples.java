package gloria.mar11;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExamples {
	public static void checkArrayList() {
		ArrayList<String> myStrings = new ArrayList<>();

		myStrings.add("Hello");
		myStrings.add(0, "First"); // vuol dire che FIRST me lo aggiunge alla posizione 0.
		System.out.println(myStrings);

		ArrayList<String> al2 = new ArrayList<>();
		al2.addAll(myStrings); // me le aggiunge tutte alla mia loista corrente.
		al2.clear(); // con il comando CLEAR si svuota la scatola. Questo svuota solo la seconda
						// collezzione, nella
						// prima rimane tutto, quindi first,hello rimangono.
		System.out.println(myStrings + ", " + al2);

		ArrayList<String> al3 = new ArrayList<>(myStrings); // vuol dire che nella mia nuova lista voglio tutte le mie
															// stringhe.
		boolean al3HasFirst = al3.contains("First"); // guarda se in l3 c'è una stringa di nome First, quindi se do la
														// stampa mi stampa TRUE.
		System.out.println(al3HasFirst);

		al3.add("another one");
		System.out.println(al3);
		boolean al3ContainsMyStrings = al3.containsAll(myStrings);
		System.out.println(al3ContainsMyStrings); // chiedo se in al3 sono contenute tutte le mie stringhe e se così
													// fosse in debug mi stampa TRUE.
		for (int i = 0; i < al3.size(); i++) { // le collection usano tutte il METODO SIZE!!!
			System.out.println(al3.get(i));
		}

		al3.add("First");
		System.out.println(al3.indexOf("First"));// indexOf mi ritorna proprio l'INDICE e in questo contesto mi ritorna
													// esattamente al primo FIRST.
		System.out.println(al3.lastIndexOf("First")); // in questo caso gli chiedo l'ultimo first.
		System.out.println(al3.lastIndexOf("Second"));

		Iterator<String> it = al3.iterator(); //
		while (it.hasNext()) { // IT.NEXT serve per looppare sull'elemento successivo, se realmete esiste e
								// quindi mi
								// ritorna true. quando arriva alla fine e vede che non esiste più nulla mi
								// ritorna FALSE finisce il looppaggio. HAS mi dice se esiste un valore
								// successivo realmente esistente, NEXT mi ritorna una stringa che è il valore
								// realmente corrente.
			System.out.println(it.next());
		}

		System.out.println(al3.isEmpty()); // mi ritorna true se la collezione è vuota.
		System.out.println(al3.size() == 0);

		al3.remove(0); // vai a prendere l'elemento 0 e buttalo via e spostare tutti gli elementi alla
						// sua sinistra.
		System.out.println(al3);
	}

	public static void main(String[] args) {
		checkArrayList();
	}

}
