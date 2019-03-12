package sara.mar12;

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
	 * 
	 * For testing purpose only
	 * 
	 * @return the underlying map
	 */
	HashMap<String, Integer> getPhones() {
		return phonesByName;
	}

	Integer getNumber(String name) { //name -> chiave
		return phonesByName.get(name);
	}

	String getName(Integer number) { //number -> valore
		Iterator<Map.Entry<String, Integer>> it = phonesByName.entrySet().iterator();
		while (it.hasNext()) { //loopiamo su tutta la collezione di key/value
			Map.Entry<String, Integer> entry = it.next(); // entry è la coppia chiave/valore corrente
			if (entry.getValue().equals(number)) { //se c'è il valore
				return entry.getKey(); //torniamo la chiave
			}
		}
		return "Not found!"; //per numero che non c'è
	}

	void put(String name, Integer number) {
		phonesByName.put(name, number);
	}
}