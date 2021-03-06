package trainer.mar11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionExamples {
	public static void checkLinkedList() {
		List<String> myStrings = new LinkedList<>();

		myStrings.add("Hello");
		myStrings.add(0, "First");
		System.out.println(myStrings);

		List<String> al2 = new LinkedList<>();
		al2.addAll(myStrings);
		al2.clear();
		System.out.println(myStrings + ", " + al2);

		List<String> al3 = new LinkedList<>(myStrings);
		boolean al3HasFirst = al3.contains("First");
		System.out.println(al3HasFirst);

		al3.add("another one");
		System.out.println(al3);
		boolean al3ContainsMyStrings = al3.containsAll(myStrings);
		System.out.println(al3ContainsMyStrings);

		for (int i = 0; i < al3.size(); i++) {
			System.out.println(al3.get(i));
		}
		
		al3.add("First");
		System.out.println(al3.indexOf("First"));
		System.out.println(al3.lastIndexOf("First"));
		System.out.println(al3.lastIndexOf("Second"));
		
		Iterator<String> it = al3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(al3.isEmpty());
		System.out.println(al3.size() == 0);
		
		al3.remove(0);
		System.out.println(al3);
	}

	public static void checkArrayList() {
		ArrayList<String> myStrings = new ArrayList<>();

		myStrings.add("Hello");
		myStrings.add(0, "First");
		System.out.println(myStrings);

		ArrayList<String> al2 = new ArrayList<>();
		al2.addAll(myStrings);
		al2.clear();
		System.out.println(myStrings + ", " + al2);

		ArrayList<String> al3 = new ArrayList<>(myStrings);
		boolean al3HasFirst = al3.contains("First");
		System.out.println(al3HasFirst);

		al3.add("another one");
		System.out.println(al3);
		boolean al3ContainsMyStrings = al3.containsAll(myStrings);
		System.out.println(al3ContainsMyStrings);

		for (int i = 0; i < al3.size(); i++) {
			System.out.println(al3.get(i));
		}
		
		al3.add("First");
		System.out.println(al3.indexOf("First"));
		System.out.println(al3.lastIndexOf("First"));
		System.out.println(al3.lastIndexOf("Second"));
		
		Iterator<String> it = al3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(al3.isEmpty());
		System.out.println(al3.size() == 0);
		
		al3.remove(0);
		System.out.println(al3);
	}
	
	public static void main(String[] args) {
		checkArrayList();
		checkLinkedList();
	}
}
