package francesca.mar11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class CollectionExamples {
	public static void checkArrayList() {
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
		
		for(int i = 0; i < al3.size(); i++) {
			System.out.println(al3.get(i)); // mi stampo tutti gli elementi riga per riga
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
	
	public static void  checkArrayList1() {
		ArrayList<String> myStrings =new ArrayList<>();
	}
}



