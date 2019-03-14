package francesca.mar13;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.Iterator;

public class TreeExamples {
	public static void treeSetExamples() {
		List<Integer> data = Arrays.asList(21, 57, 7, 12, 9);
		TreeSet<Integer> myTree = new TreeSet<>(data);
		System.out.println(myTree);
		

		System.out.println("Print my tree in reversed order:");
		Iterator<Integer> dit = myTree.descendingIterator();
		while (dit.hasNext()) {
			System.out.println(dit.next());
		}
		
		System.out.println("Print my tree in natural order:");
		Iterator<Integer> it = myTree.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		myTree.add(42);
		myTree.addAll(Arrays.asList(95, -7, -92));
		System.out.println(myTree);
		
		//myTree [-92, -7, 7, 9, 12, 21, 42, 57, 95] 
		//Metodo Ceiling cerca nella cella l'elemento dato o successivo
		System.out.println(myTree.ceiling(42)); //42
		System.out.println(myTree.ceiling(50)); //57
		System.out.println(myTree.ceiling(100)); // null
		System.out.println(myTree.floor(42)); //42
		System.out.println(myTree.floor(50)); //42
		System.out.println(myTree.floor(-100)); //null
		
		//Metodo Clear che svuota il mio oggetto
		myTree.clear();
		System.out.println(myTree);
		
		myTree.addAll(Arrays.asList(95, -7, -92));
		System.out.println(myTree);
		
		
		//Cerca se l'elemento dato è contenuto
		System.out.println(myTree.contains(42));
	//	if(!myTree.contains(42)) { //se mytree non contiene 42,stampami my tree ecc e aggiungi 42
			if(!myTree.contains(42) == false) { //si può scrivere anche cosi con ==
			System.out.println("My tree did not contain 42!");
			myTree.add(42);
		}
			
			System.out.println("The smallest element in my tree is:");
			System.out.println(myTree.first());
			
			System.out.println("The biggest element in my tree is:");
			System.out.println(myTree.last());
			
			myTree.addAll(Arrays.asList(21, 57, 7, 12, 9));
			//[-92, -7, 7, 9, 12, 21, 57, 95]
		    System.out.println(myTree);
			SortedSet<Integer> head = myTree.headSet(7);
			//[-92, -7]
			System.out.println(head);
			head= myTree.headSet(7, true);
			//[-92, -7, 7]
			System.out.println(head);
			
			// false!
			System.out.println(myTree.remove(1_000)); // 1000 non esiste come elemento
			
			//remove and return true
			System.out.println(myTree.remove(-92)); // -92 viene rimosso perchè esiste come elemento
			
			System.out.println("My tree has " + myTree.size() + " elements");
			myTree.add(103);
			System.out.println("My tree has " + myTree.size() + " elements");
			
		
	}

	public static void main(String[] args) {
	//	treeSetExamples();
		treeMapExample();
		
	}
	 
	public static void treeMapExample() {
		TreeMap<Integer, String> studentsById = new TreeMap<> ();
		studentsById.put(12, "Tom");
		studentsById.put(42, "Tim");
		studentsById.put(27, "Sal");
		
		
		
		System.out.println(studentsById);
		
		Iterator<Map.Entry<Integer, String>>it = studentsById.entrySet().iterator();
		
		
		while(it.hasNext()) {
		Map.Entry<Integer, String> entry = it.next();
		if(entry.getValue().equals("Sal")) {
		System.out.println("Sal has id" + entry.getKey());
			}
		}
	}
}
	
