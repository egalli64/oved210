package monica.settimana3lezione2;  //12/03/19

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * For testing purpose only
 * 
 * @return the underlying map
 */

public class Phones {
	private HashMap<String, Integer> phonesByName;
	//private HashMap< Integer,String> phonesByNumber;
	
	public Phones() {
		phonesByName = new HashMap<String, Integer>();
	}

	HashMap<String, Integer> getPhones() {
		return phonesByName;
	}

	Integer getNumber(String name) { // numero che ritorna nome

		return phonesByName.get(name);
	}

	String getName(Integer number) { // nome che ritorna il numero
	
		 Iterator <Map.Entry <String, Integer>> it = phonesByName.entrySet().iterator();
		 while (it.hasNext()) {
			 Map.Entry <String, Integer> entry = it.next();    //loop 
			 if (entry.getValue().equals(number)) {
				 return entry.getKey();
			 }
		 }
		 return "not found!";
	}

	void put(String name, Integer number) { // aggiungere un elemento
	phonesByName.put(name, number);
	}
}
