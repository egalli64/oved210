package alessandraB.mar12;


import java.util.HashMap;

public class Phones {
	private HashMap<String, Integer> phonesByName;
	private HashMap<Integer, String> phonesByNumber;
	
	public Phones() {
		phonesByName = new HashMap<>();
		phonesByNumber = new HashMap<>();
	}
	
	/**
	 * For testing purpose only
	 * 
	 * @return the underlying map 
	 */
	HashMap<String, Integer> getPhonesByName() {
		return phonesByName;
	}
	
	/**
	 * For testing purpose only
	 * 
	 * @return the underlying map 
	 */
	HashMap<Integer, String> getPhonesByNumber() {
		return phonesByNumber;
	}
	
	Integer getNumber(String name) {
		return phonesByName.get(name);
	}
	
	String getName(Integer number) {
		return phonesByNumber.get(number);
//		Iterator<Map.Entry<String, Integer>> it =
//				phonesByName.entrySet().iterator();
//		while(it.hasNext()) {
//			Map.Entry<String, Integer> entry = it.next();
//			if(entry.getValue().equals(number)) {
//				return entry.getKey();
//			}
//		}
//		return "Not found!"; // ?
	}
	
	void put(String name, Integer number) {
		phonesByName.put(name, number);
		phonesByNumber.put(number, name);
	}
}
