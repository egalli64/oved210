package trainer.mar11;

import java.util.ArrayList;

public class CollectionExamples {
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
		
	}
	
	public static void main(String[] args) {
		checkArrayList();
	}
}
