package elmonda.mar13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
public class TreeExamples {
	public static void treeSetExample() {
		List<Integer> data = Arrays.asList(21, 57, 7, 12, 9);
		TreeSet<Integer> myTree = new TreeSet<>(data);
		System.out.println(myTree);
		
	
//		System.out.println("Print my tree in natural order:");
//		Iterator<Integer> it = myTree.Iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next));
	//	}
		
		
		System.out.println("Print my tree in reversed order:");
		Iterator<Integer> dit = myTree.descendingIterator();
		
		while(dit.hasNext()) { // finchè c'è un successore stampami
			System.out.println(dit.next());  // dit stampa dal più grande al più piccolo
		}
		
		myTree.add(42);
		myTree.addAll(Arrays.asList(95, -7, -92));  // qst 3 numeri sono passati al metodo has list che è un metodo array,as list prende quanti oggetti voglio e me li mette in sieme in una lista
		System.out.println(myTree);                    // il risultato sarà prendere i valori della lista e aggiungerli al mio albero
		
		
		// myTree [-92, -7, 7, 9, 12, 21, 42, 57,95]
		System.out.println(myTree.ceiling(42));   // mi ritorna 42
		System.out.println(myTree.ceiling(50));  // mi ritorna il valore successivo 57
		System.out.println(myTree.ceiling(100));  // mi ritorna null perchè non c'è niente a destra di 100
		System.out.println(myTree.floor(42)); //42
		System.out.println(myTree.floor(50));//42
		System.out.println(myTree.floor(-100));//null
		
		
		myTree.clear();
		System.out.println(myTree);
		
		myTree.addAll(Arrays.asList(95, -7, -92));   // rimettiamoci dentro qualcosa 
		System.out.println(myTree);
		
		System.out.println(myTree.contains(42));
		//if(!myTree.contains(42)) {    // se l'albero non contiene l'elemento 42, stampami un m essaggio di stupore e poi aggiungilo
		if(myTree.contains(42) == false) { // oppure si può scrivere in questo modo.
			System.out.println("My tree does did not contain 42!");
			myTree.add(42);
		}
		System.out.println("The smallest element in my tree is:");
		System.out.println(myTree.first());      // mi ritorna il primo elemento nel mio albero a sinistra, in questo caso ordinati, quindi il più piccolo
		
		System.out.println("The biggest element in my tree is:");
		System.out.println(myTree.last());
		
		myTree.addAll(Arrays.asList(21, 57, 7, 12, 9));
		// [-92, -7, 7, 9, 12, 21, 42, 57,95]
		System.out.println(myTree);
		SortedSet<Integer> head = myTree.headSet(7); // l'insieme ordinato di tuti gli elementi minori di 7
		// [-92, -7]
		System.out.println(head);
		head = myTree.headSet(7, true);// se volessi tenere compresso ank il 7, gli potrei dire che 7 è inclusivo
        // [-92, -7, 7]
		System.out.println(head);
		
		System.out.println(myTree.remove(1_000));  // 1000 non c'è quindi mi ritona false
		System.out.println(myTree.remove(-92)); // 92 c'è quindi me lo rimuove
		
		System.out.println(" My tree has " + myTree.size() + "elements" ); // per stampare i miei elementi uso size
		myTree.add(103);
		System.out.println(" My tree has " + myTree.size() + "elements" );
		
	}
public static void main(String[] args) {
	//treeSetExample();
	treeMapExample();
	
	//System.out.println((int)Math.ceil(42.45));   // 
	//System.out.println((int)Math.floor(42.45));
}

public static void treeMapExample() {
	//le chiavi sono stringhe e le mappe sono valori
	TreeMap<Integer, String> studentsById = new TreeMap<>();
	//TreeMap<Integer, String> studentsByName = new TreeMap<>();
	
	studentsById.put(12,  "Tom");
	studentsById.put(42,  "Tim");
	studentsById.put(27,  "Sal");
	studentsById.put(2,  "Sal");
	
	System.out.println(studentsById);
	Iterator<Map.Entry<Integer, String>> it = studentsById.entrySet().iterator();  // in it abbiamo un iteratore all'entry set che è posizionato prima del primo elemento
	// quindi possiamo looppare su tutti i valori
	while(it.hasNext()) { // mi gira su tutti gli elementi della mia mappa e me li stampa
		Map.Entry<Integer, String> entry = it.next();
		if(entry.getValue().equals("Sal")) {// prendi il valore che c'è in entry confrontalo con sal, se sono uguali esegui il blocco
		System.out.println("Sal has id" + entry.getKey());  // mi ritorna un entry di string
		//break;
	}
	
	//Iterator<Map.<K, V>.Entry<K, V>> it =
	// voglio risalire dal nome dell'utente alla sua matricola, è una cosa che faccio raramente
	
	}			
}
}
