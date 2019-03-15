package gloria.mar12;

import java.util.HashMap;

import java.util.Map;

import java.util.Iterator;

public class Phones {
	private HashMap<String, Integer> phonesByName;
	private HashMap< Integer,String> phonesByNumber;

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

	Integer getNumber(String name) { // nella stringa ho la chiave quindi basta che la passo nel get ed è fatto, mi
										// ritorna il valore
		return phonesByName.get(name);
	}

	String getName(Integer number) {
//		return phonesByNumber.get(number);
		Iterator<Map.Entry<String, Integer>> it = 
				phonesByName.entrySet().iterator(); // l'iteratore permette di scorrere su
																				// tutti gli elementi chiave e valore
																				// all'interno della mappa.
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			if(entry.getValue().equals(number)) {
				return entry.getKey();
			}
		}
		
		return "Not found!"; // ???
	}

	public void put(String name, Integer number) {
		phonesByName.put(name, number);
//		phonesByNumber.put(number,  name);
	}

}
