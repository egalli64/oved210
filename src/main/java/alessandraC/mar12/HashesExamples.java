package alessandraC.mar12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashesExamples {
	public static void hashSetExample() {
		HashSet<String> myStrings = new HashSet<>();

		myStrings.add("Hello");
		// myStrings.add(0, "First"); // nonsense!
		System.out.println(myStrings);

		HashSet<String> hs2 = new HashSet<>();
		hs2.addAll(myStrings);
		hs2.clear();
		System.out.println(myStrings + ", " + hs2);

		HashSet<String> hs3 = new HashSet<>(myStrings);
		boolean al3HasFirst = hs3.contains("First");
		System.out.println(al3HasFirst);

		hs3.add("another one");
		System.out.println(hs3);
		boolean al3ContainsMyStrings = hs3.containsAll(myStrings);
		System.out.println(al3ContainsMyStrings);

//			for (int i = 0; i < al3.size(); i++) {
//				System.out.println(al3.get(i));
//			}

		hs3.add("First");
//			System.out.println(al3.indexOf("First"));
//			System.out.println(al3.lastIndexOf("First"));
//			System.out.println(al3.lastIndexOf("Second"));

		Iterator<String> it = hs3.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (String element : hs3) {
			System.out.println(element);
		}

		System.out.println(hs3.isEmpty());
		System.out.println(hs3.size() == 0);
	}

	public static void hashMapExample() {
		HashMap<Integer, String> myStrings = new HashMap<>();

		myStrings.put(42, "Hello");
		System.out.println(myStrings);

		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.putAll(myStrings);
		hm2.clear();
		System.out.println(myStrings + ", " + hm2);

		HashMap<Integer, String> hm3 = new HashMap<>(myStrings);
		boolean hm3HasFirstKey = hm3.containsKey(42);
		boolean hm3HasFirstValue = hm3.containsValue("First");
		System.out.println(hm3HasFirstKey + ", " + hm3HasFirstValue);

		hm3.put(18, "another one");
		System.out.println(hm3);

//			for (int i = 0; i < al3.size(); i++) {
//				System.out.println(al3.get(i));
//			}

		Iterator<Map.Entry<Integer, String>> it = hm3.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(hm3.isEmpty());
		System.out.println(hm3.size() == 0);
	}

	public static void main(String[] args) {
		hashSetExample();
		hashMapExample();
	}
}
