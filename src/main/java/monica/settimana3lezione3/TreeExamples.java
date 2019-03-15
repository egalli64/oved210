package monica.settimana3lezione3; //13/03/19  treeSet

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeExamples {
	public static void treeSetExemple() {
		List<Integer> data = Arrays.asList(1, 57, 7, 12, 9);
		TreeSet<Integer> myTree = new TreeSet<>(data);
		System.out.println(myTree);

		System.out.println("Print my tree in natural order:");
		Iterator<Integer> it = myTree.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Print my tree in reversed order:");
		Iterator<Integer> dit = myTree.descendingIterator();
		while (dit.hasNext()) {
			System.out.println(dit.next());
		}

		myTree.add(42); // aggiungo un elemento
		myTree.addAll(Arrays.asList(95, -7, -92)); // aggiungo con .addAll una collezione di valori attraverso
													// Arrays.asList
		System.out.println(myTree);

		// metodo contains
		System.out.println(myTree.contains(42)); // true perchè il valore è presente nella collezione

		// metodo ceiling
		System.out.println(myTree.ceiling(42)); // 42
		System.out.println(myTree.ceiling(50)); // 57 perchè non ha trovato 50 ma ha preso il numero successivo che è 57
		System.out.println(myTree.ceiling(100)); // null perchè non ci sono valori dopo 100

		// metodo floor
		System.out.println(myTree.floor(42)); // 42 perchè il numero è presente in myTree
		System.out.println(myTree.floor(50)); // 42 prende il numero precedente a 50 cioè 42
		System.out.println(myTree.floor(-100)); // null non ci sono numeri dopo -100

		// metodo clear
		myTree.clear(); // stampa oggetto vuoto
		System.out.println(myTree);

		myTree.addAll(Arrays.asList(95, -5, -92));
		System.out.println(myTree);

		System.out.println(myTree.contains(42));
		if (!myTree.contains(42)) { // se myTree non contiene 42 ! -> significa "non"
			// if ( myTree.contains(42) == False) si poteva anche scrivere così

			System.out.println("my tree did not contain 42!"); // stampa il messaggio
			myTree.add(42); // e aggiungi il numero 42
		}

		// metodo first e last
		System.out.println(myTree.first());
		System.out.println(myTree.last());

		// metodo headSet
		myTree.addAll(Arrays.asList(21, 57, 7, 12, 9)); // l'albero contiene questa collezione di valore
		System.out.println(myTree);
		SortedSet<Integer> head = myTree.headSet(7); // headSet estrae valori e ritorna un SortedSert //[-92,-7]
		System.out.println(head);
		// se voglio tornare anche il 7
		head = myTree.headSet(7, true); // cosi avro [-92,-7,7]
		System.out.println(head);

		System.out.println("My tree has " + myTree.size() + " element");

	}

	public static void main(String[] args) {
		//treeSetExemple();
		treeMapExample();
	}

	// SPIEGAZIONE TREEMAP

	public static void treeMapExample() {
		
		TreeMap<Integer, String> studentsById = new TreeMap<>();
		//TreeMap<Integer, String> studentsByName = new TreeMap<>();
		
		
		studentsById.put(12, "Tom");
		studentsById.put(42, "Tim");
		studentsById.put(27, "Sal");

		System.out.println(studentsById);
		
		Iterator<Map.Entry<Integer, String>> it =  studentsById.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
		if(entry.getValue().equals("Sal")) {
			System.out.println("Sal  has Id" + entry.getKey() );
		}
			
			
		}
	}

}
