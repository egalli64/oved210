package claudia.mar11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Phones {
	private HashMap<String, Integer> phones;
	
	public Phones() {
		phones = new HashMap<String, Integer>();
	}
	
	/**
	 * For testing purpose only
	 * 
	 * @return the underlying map 
	 */
	HashMap<String, Integer> getPhones() {
		return phones;
	}
	
	Integer getNumber(String name) {
		return phones.get(name);
	}
	
	String getName(Integer number) {
		Iterator<Map.Entry<String, Integer>> it = phones.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			if(entry.getValue().equals(number)) {
				return entry.getKey();
			}
		}
		return "Not found!";
	}
	
	void put(String name, Integer number) {
		phones.put(name, number);
	}
}
