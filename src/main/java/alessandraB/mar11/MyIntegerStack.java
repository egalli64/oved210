package alessandraB.mar11;

import java.util.ArrayList;

public class MyIntegerStack {
	private ArrayList<Integer> data;

	MyIntegerStack() {
		data = new ArrayList<Integer>();
	}

	public void push(Integer value) { // aggiunge un elemento sull'array
		data.add(value);
	}
/**
 * Solo per debug and testing, non per uso normale
 * @return
 */
	//ArrayList<Integer> getData() {
		//return this.data;
	//}

	public Integer pop() {
		if (data.size() != 0) {
			// elimina l'ultimo elemento nel mio stack e ritornarmelo

		}
		throw new IllegalAccessError();
	}

	public boolean isEmpty() {
		data.isEmpty();
		

		return false;
	}
}
