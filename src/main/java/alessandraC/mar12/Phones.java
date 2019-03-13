package alessandraC.mar12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Phones {
	private HashMap<String, Integer> phonesByName;
	private HashMap<Integer, String> phonesByNumber;

	public Phones(HashMap<String, Integer> phones) {
		phones = new HashMap<String, Integer>();
	}

	/**
	 * For testing purpose only
	 * @param phones 
	 * 
	 * @return the underlying map
	 */
	HashMap<String, Integer> getPhones(HashMap<String, Integer> phones) {
		return phones;
	}

	Integer getNumber(String name, HashMap<String, Integer> phones) {
		return phones.get(name);
	}

	String getName(Integer number, HashMap<String, Integer> phones) {
		return phonesByNumber.get(number);
		
//		Iterator<Map.Entry<String, Integer>> it = phones.entrySet().iterator();
//		while (it.hasNext()) {
//			Map.Entry<String, Integer> entry = it.next();
//			if (entry.getValue().equals(number)) {
//				return entry.getKey();
//			}
//		}
//		return "Not found";
				
	}

	private Object entry(Object value) {

		return null;
	}

	private Object getValue() {

		return null;
	}

	void put(String name, Integer number, Phones phones) {
		phonesByName.put(name, number);
		phonesByNumber.put(number, name);

	}

	
		
	}
	
	
