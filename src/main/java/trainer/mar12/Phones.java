package trainer.mar12;

import java.util.HashMap;

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
		return 0;
	}
	
	String getName(Integer number) {
		return null;
	}
	
	void put(String name, Integer number) {
	}
}
