package gloria.mar13;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeExamples {
	public static void treeSetExamples() {
		List<Integer> data = Arrays.asList(21, 57, 7, 12, 9);
		TreeSet<Integer> myTree = new TreeSet<>(data);
		System.out.println(myTree);

		System.out.println("Print my tree in natural order:"); // in ordine crescente
		Iterator<Integer> it = myTree.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Print my tree in reversed order:"); // in ordine decrescente
		Iterator<Integer> dit = myTree.descendingIterator();
		while (dit.hasNext()) {
			System.out.println(dit.next());
		}

		myTree.add(42); // voglio aggiungere nel mio albero il numero 42 se già non c'è
		System.out.println(myTree);
		myTree.addAll(Arrays.asList(95, -7, -92)); // come parametro gli passo la lista che mi viene generata da
													// "asList" nei passaggi precedenti e in più ci aggiungo i miei 3
													// valori, il tutto viene passato al metodo "addAll" che quindi me
													// li aggiunge tutti(quelli precedenti e i 3 in più) e me li mette
													// nel mio albero
		System.out.println(myTree);

		// myTree [-92, -7, 7, 9, 12, 21, 42, 57, 95]
		System.out.println(myTree.ceiling(42)); // mi stampa solo il 42 con questo syso
		System.out.println(myTree.ceiling(50)); // provo a stampare un numero che nel mio albero non è contenuto e
												// quindi mi ritorna il valore subito successivo a quello da me
												// inserito, che in questo caso è il 57
		System.out.println(myTree.ceiling(100)); // in questo caso invece, 100 è sempre un valore NON contenuto
													// all'interno del mio albero ma ora mi stampera NULL in quanto non
													// ho numeri successivi al 100
		System.out.println(myTree.floor(42)); // 42 è il valore che mi ritorna perchè con la parola FLOOR mi va a
												// prendere i valori immediatamente precedenti a quello da me indicato
												// nel syso
		System.out.println(myTree.floor(50)); // 42
		System.out.println(myTree.floor(-100)); // null perchè il 100 non esiste e quindi non mi può andare a prendere
												// nessun numero precedente

		myTree.clear(); // mi svuota completamente il mio albero
		System.out.println(myTree);

		myTree.addAll(Arrays.asList(95, -7, -92)); // ricompongo il mio albero con soli 3 elementi
		System.out.println(myTree);

		System.out.println(myTree.contains(42));
		// if(myTree.contains(42) == false){
		if (!myTree.contains(42)) { // se il mio albero non contiene il 42:
			System.out.println("My tree does not contain 42!");
			myTree.add(42); // aggiungi il 42 al mio albero
			myTree.add(42);
		}

		System.out.println("The smallest element in my tree is:");
		System.out.println(myTree.first()); // mi ritorna il primo elemento a sinistra del mio albero (il più piccolo)

		System.out.println("The biggest element in my tree is:");
		System.out.println(myTree.last()); // stessa cosa di qauella precedente ma con il valore più grande

		myTree.addAll(Arrays.asList(21, 57, 7, 12, 9));
		// [-92, -7, 7, 9, 12, 21, 42, 57, 95]
		System.out.println(myTree);
		SortedSet<Integer> head = myTree.headSet(7); // chiede di prendere i valori in testa all'albero, FINO AL 7
		// [-92, -7]
		System.out.println(head); // mi ritorna i primi due valori in testa (HEAD) al mio albero
		head = myTree.headSet(7, true); // in questo modo, aggiungendo il TRUE, gli chiedo di comprendere nella stampa
										// anche il valore 7
		// [-92, -7, 7]
		System.out.println(head);

		// false
		System.out.println(myTree.remove(1_000)); // mi ritorna false perchè nel mio albero non esiste 1000
		// remove and return true
		System.out.println(myTree.remove(-92)); // mi ritorna true perche il numero indicato esiste nel mio albero e
												// quindi me lo può rimuovere
		
		System.out.println("My tree has" + myTree.size() + "elements");
		myTree.add(103);
		System.out.println("My tree has" + myTree.size() + "elements");
		

	}

	public static void main(String[] args) {
		treeSetExamples();
	}

}
