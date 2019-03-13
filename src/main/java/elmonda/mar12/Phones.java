package elmonda.mar12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Phones {
	private HashMap<String, Integer> phonesByName;   // ci conviene avere due mappe // la stringa sarà il nome e l'intero sarà il numero
	private HashMap<String, Integer> phonesByNumber;
	
	public Phones() {
		phonesByName = new HashMap<String, Integer>();
	}
	
	/**
	 * For testing purpose only
	 * 
	 * @return the underlying map 
	 */
	HashMap<String, Integer> getPhones() {
	//phones.putAll(phones);
		return phonesByName;
	}
	
	Integer getNumber(String name) {
		return phonesByName.get(name);   // mi ritorna il valore associato
	}
	
	String getName(Integer number) {
		//return phonesByNumber.get(number);  // creando due mappe, la soluzione sarà solo questa.
		Iterator<Map.Entry<String, Integer>> it = phonesByName.entrySet().iterator();
		// come se prendessi le coppie chiave-valore, come scandisco? con l'iteratore
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next(); // entry è la mia coppia chiave-valore
			if(entry.getValue().equals(number)) {
				return entry.getKey();
			}
		}
		return "Not found!";  // se non mi trova la chiave...
	}
	
	void put(String name, Integer number) {
		phonesByName.put(name, number); // siccome voglio aggiungere un nuovo elemento, chiamero' il metodo put
		                            // passando chiave  evalore.
		
			
		}
	}

