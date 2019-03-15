package claudia.mar13;

import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeExamples {
	public static void treeSetExamples() {
		List<Integer> data = Arrays.asList(1, 5, 7, 12, 9);
		TreeSet<Integer> myTree = new TreeSet<>(data);
		System.out.println(myTree);

		System.out.println("Print my tree in natural order:");
		Iterator<Integer> it = myTree.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

			System.out.println("Print my tree in reverted order:");
			Iterator<Integer> dit = myTree.descendingIterator();
			while (dit.hasNext()) {
				System.out.println(dit.next());
			}

			myTree.add(42);
			myTree.addAll(Arrays.asList(95, -7, -92));
			System.out.println(myTree);
			System.out.println(myTree.ceiling(42));
			System.out.println(myTree.ceiling(50));
			System.out.println(myTree.ceiling(100));

			System.out.println(myTree.floor(42));
			System.out.println(myTree.floor(50));
			System.out.println(myTree.floor(-100));

			System.out.println(myTree.contains(45));
			if (!myTree.contains(45)) {
				System.out.println("My tree did not contain 45!");
				myTree.add(45);

				SortedSet<Integer> head = myTree.headSet(7);
				System.out.println(head);

				System.out.println(myTree.size());
			}
		}
	}

	public static void main(String[] args) {
//		treeSetExamples();
		treeMapExamples();

	}

	public static void treeMapExamples() {
		TreeMap<Integer, String> students = new TreeMap<>();
//		TreeMap<String, Integer> studentsByName = new TreeMap<>();
		students.put(12, "Tom");
		students.put(42, "Tim");
		students.put(27, "Sal");
		System.out.println(students);
		
		Iterator<Map.Entry<Integer, String>> it = students.entrySet().iterator();
		while(it.hasNext()){
//			System.out.println(it.next());
			Map.Entry<Integer, String> entry = it.next();
			if(entry.getValue().equals("Sal")) {
				System.out.println("Sal Id is " + entry.getKey());
			}
		}
		
	}
}
