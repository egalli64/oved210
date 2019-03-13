package alessandraC.mar13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeExamples {
	public static void treeSetExample() {
		List<Integer> data = Arrays.asList(21, 57, 7, 12, 9);
		TreeSet<Integer> myTree = new TreeSet<>();
		System.out.println("print my tree in natural order");
		Iterator<Integer> it = myTree.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Print my tree in reversed order");
		Iterator<Integer> dit = myTree.descendingIterator();
		while (dit.hasNext()) {
			System.out.println(dit.next());
		}

		myTree.add(42);
		myTree.addAll(Arrays.asList(95, -7, -92));
		System.out.println(myTree);

		// myTree {-92, -7, 7, 9, 12, 21, 42, 57, 95}
		System.out.println(myTree.ceiling(42));
		System.out.println(myTree.ceiling(50));
		System.out.println(myTree.ceiling(100));

		System.out.println(myTree.floor(42));
		System.out.println(myTree.floor(50));
		System.out.println(myTree.floor(-100));

		myTree.clear();
		System.out.println(myTree);

		myTree.addAll(Arrays.asList(95, -7, -92));
		System.out.println(myTree);

		System.out.println(myTree.contains(42));
		if (!myTree.contains(42)) {
			System.out.println("My Tree does not contains 42");
			myTree.add(42);
		}

		System.out.println("The smallest element in my Tree is");
		System.out.println(myTree.first());

		System.out.println("The last element in my Tree is");
		System.out.println(myTree.last());
		
		myTree.addAll(Arrays.asList(21,57, 7, 12, 9));
		System.out.println(myTree);
		SortedSet<Integer> head = myTree.headSet(7);
		// [-92, -7]
		System.out.println(head);
		head = myTree.headSet(7, true);
		//{-92, -7, 7}
		System.out.println(head);
		
		System.out.println(myTree.remove(1_000));
		System.out.println(myTree.remove(-92));
		
		System.out.println("My Tree has" + myTree.size() + "elements");
		myTree.add(103);
		System.out.println("My Tree has" + myTree.size() + "elements");
	}

	public static void main(String[] args) {
		treeSetExample();

	}

}
