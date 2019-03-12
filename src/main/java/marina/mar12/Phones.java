package marina.mar12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Phones {

	private HashMap<String, Integer> phonesbyName;
	private HashMap<Integer, String> phonesbyNumber;

	public Phones() {
		phonesbyName = new HashMap<String, Integer>();
	}
	
	/**
	 * For testing purpose only
	 * 
	 * @return the underlying map 
	 */
	
	HashMap<String, Integer> getPhones() {
		return phonesbyName;
	}
	
	Integer getNumber(String name) {
		return	phonesbyName.get(name);
	}
	
	String getName(Integer number) {
		return phonesbyNumber.get(number);
		
//		Iterator<Map.Entry<String, Integer>> it = 
//				phonesbyName.entrySet().iterator();
//		while (it.hasNext()) {
//			Map.Entry<String, Integer> entry = it.next();
//			if(entry.getValue().equals(number)) {
//				return entry.getKey();
//			}
//		}
//		return "Not found!";
	}
	
	void put(String name, Integer number) {
		phonesbyName.put(name, number);
		phonesbyNumber.put(number, name);
	}

}
