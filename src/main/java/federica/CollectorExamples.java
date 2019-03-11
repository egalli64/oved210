package federica;

import java.util.ArrayList;

public class CollectorExamples {
	public static void checkArrayList() {
		ArrayList<String> myStrings = new ArrayList<>();
		
		myStrings.add("Hello");
		myStrings.add(0, "First");
		System.out.println(myStrings);
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.addAll(myStrings);
		al2.clear();
		System.out.println(myStrings + "," + al2);
		
		java.util.ArrayList<String> al3 = new ArrayList<>(myStrings);
		boolean al3HasFirst = al3.contains("First");
		System.out.println(al3HasFirst);
		
		al3.add("another one");
		System.out.println(al3);
		boolean al3ContainsMyStrings = al3.containsAll(myStrings);
		System.out.println(al3ContainsMyStrings);
		
		for(int i = 0; 1 < al3.size(); i++) {
			System.out.println(al3.get(i));
		}
	}

}
