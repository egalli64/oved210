package francesca.mar12;

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
	
	Integer getNumber(String name) { //name=chiave
		return phonesByName.get(name); // passando la chiave nel get ottengo il valore
	}
	
	String getName(Integer number) {
	Iterator<Map.Entry<String, Integer>> it =
			phonesByName.entrySet().iterator();
	while(it.hasNext()) {
		Map.Entry<String, Integer> entry = it.next();
		if(entry.getValue().equals(number)) {
			return entry.getKey();
		}
	}
		return "Not found"; //?
	}
	
	void put(String name, Integer number) {
		phonesByName.put(name,  number);
	}
}



