package monica.settimana3lezione2; //12/03/19

import java.util.HashSet;
import java.util.Iterator;

public class HashTable {
	public static int findUniqueHash(int[] data) {

		if (data == null) {
			throw new IllegalStateException("bad input data");
		}

		HashSet<Integer> values = new HashSet<>();

		for (int i = 0; i < data.length; i++) {
			if (values.contains(data[i])) {
				values.remove(data[i]);
			}

			else {
				values.add(data[i]);
			}
		}

		return values.iterator().next(); // l'iteratore è un puntatore che viene puntato sopra l'elemento precedente al
											// corrente, ritorna con hasNext e next 
		
	}
}


