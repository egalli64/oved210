package marina.mar11;

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

		al3.add("Another One");
		System.out.println(al3);
		boolean al3ContainsMyStrings = al3.containsAll(myStrings);
		System.out.println(al3ContainsMyStrings);
		
		
		for (int i = 0; i < al3.size(); i++) {
			System.out.println(al3.get(i));
		}
		
		al3.add("First");
		System.out.println(al3.indexOf("First"));
		System.out.println(al3.lastIndexOf("First"));
	}
	
	
	
	public static void main(String[] args) {
		checkArrayList();
	}
			
			
}
