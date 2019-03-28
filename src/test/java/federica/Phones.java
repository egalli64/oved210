package federica;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Phones {
	private HashMap<String, Integer> phonesByName;
	private HashMap<Integer, String> phonesByNumber;

	public Phones() {
		phonesByName = new HashMap<String, Integer>();
	}

	/**
	 * For testing purpose only
	 * 
	 * @return the underlying map
	 */
	HashMap<String, Integer> getPhones() {
		return phonesByName;
	}

	Integer getNumber(String name) {
		return phonesByName.get(name);
	}

	String getName(Integer number) {
		return phonesByNumber.get(number);
		// Iterator<Map.Entry<String, Integer>> it = phones.entrySet().iterator();
		// while(it.hasNext()) {
		// Map.Entry<String, Integer> entry = it.next();
		// if(entry.getValue().equals(number)) {
		// return entry.getKey();
		// }
		// }
		// return "Not found!"; //soluzione giusta?
	}

	void put(String name, Integer number) {
		phonesByName.put(name, number);
		phonesByNumber.put(number, name);
		
	}
}
