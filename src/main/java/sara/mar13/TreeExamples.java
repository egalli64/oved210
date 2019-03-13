package sara.mar13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

//TREE SET
public class TreeExamples {
	public static void treeSetExample() {
		List<Integer> data = Arrays.asList(21, 57, 7, 12, 9);
		TreeSet<Integer> myTree = new TreeSet<>(data);
		System.out.println(myTree);
//PER STAMPARE LA COLLEZIONE IN ORDINE NATURALE
		System.out.println("Print my tree in natural order:");
		Iterator<Integer> it = myTree.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
//PER STAMPARE LA COLLEZIONE IN ORDINE DECRESCENTE
		System.out.println("Print my tree in reversed order:");
		Iterator<Integer> dit = myTree.descendingIterator();
		while (dit.hasNext()) {
			System.out.println(dit.next());
		}

// PER AGGIUNGERE ELEMENTI
		myTree.add(42); // PER AGGIUNGERE UN ELEMENTO
		myTree.addAll(Arrays.asList(95, -7, -92)); // PER AGGIUNGERE COLLEZIONE
		System.out.println(myTree);

//CON IL METODO CEILING : CERCA NELLA COLLEZIONE L'ELEMENTO DATO O IL SUCCESSIVO		
		System.out.println(myTree.ceiling(42));
		System.out.println(myTree.ceiling(50));
		System.out.println(myTree.ceiling(100)); // risultato : null perchè non c'è elemento e neanche uno successivo

//CON IL METODO FLOOR :  CERCA NELLA COLLEZIONE L'ELEMENTO DATO O IL PRECEDENTE
		System.out.println(myTree.floor(42));
		System.out.println(myTree.floor(50));
		System.out.println(myTree.floor(-100)); // risultato : null perchè non c'è elemento e neanche uno precedente

//METODO CONTAINS : CERCA SE L'ELEMENTO DATO E' CONTENUTO
		System.out.println(myTree.contains(42));
		if (!myTree.contains(42)) { // oppure scrivere if(myTree.contains(42) == false) *SE NON CONTIENE IL 42
			System.out.println("My tree did not contains 42!"); // STAMPA LA FRASE
			myTree.add(42); // E RIAGGIUNGI L'ELEMENTO
		}

		System.out.println("The smallest element in my tree is:");
		System.out.println(myTree.first());

		System.out.println("The biggest element in my tree is:");
		System.out.println(myTree.last());

//METODO CLEAR : PULISCE TUTTA LA COLLEZIONE		
		myTree.clear();
		System.out.println(myTree);

		myTree.addAll(Arrays.asList(21, 57, 7, 12, 9));
		System.out.println(myTree);
//METODO HEAD SET E TAIL SET
		SortedSet<Integer> head = myTree.headSet(7);
		System.out.println(head);

		head = myTree.headSet(7, true);
		System.out.println(head);
//METODO REMOVE		
		System.out.println(myTree.remove(1_000)); // ELEMENTO NON C'E' : FALSE
		System.out.println(myTree.remove(9));

		System.out.println("My Tree has" + myTree.size() + "elements");

		myTree.add(103);
		System.out.println("My Tree has" + myTree.size() + "elements");
	}

//IL MAIN PER POTER STAMPARE
	public static void main(String[] args) {
		// treeSetExample();
		treeMapExample();
	}

//TREE MAP
	private static void treeMapExample() {
		TreeMap<Integer, String> studentsById = new TreeMap<>();

		studentsById.put(12, "Tom");
		studentsById.put(42, "Tim");
		studentsById.put(27, "Sal");
		studentsById.put(2, "Sal");

		System.out.println(studentsById);

//ENTRYSET
		Iterator<Map.Entry<Integer, String>> it = studentsById.entrySet().iterator();
		while (it.hasNext()) { //finchè c'è un next looppa
			Map.Entry<Integer, String> entry = it.next(); //prima va chiamato has next!
			if (entry.getValue().equals("Sal")) {
				System.out.println("Sal has id" + entry.getKey());
			}
		}
	}
}
