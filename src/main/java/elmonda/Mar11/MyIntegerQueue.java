package elmonda.Mar11;

import java.util.LinkedList;

public class MyIntegerQueue {
	private LinkedList<Integer> data;   //usando linked list come struttura sottostante data

	/**
	 * For debugging and testing purpose only!
	 * 
	 * @return data
	 */
	LinkedList<Integer> getData() {  // il costruttore mi inizializza data
		
		return data;
	}

	public MyIntegerQueue() {
		data = new LinkedList<Integer>();
	}

	public void enqueue(Integer value) {   // ho deciso di aggiungere in fondo
		data.addLast(value);
	}

	public Integer dequeue() {
		if (data.isEmpty()) {
			throw new IllegalAccessError("Can't dequeue() an empty queue");
//		if (!data.isEmpty()) {
//			return data.removeFirst();
		}

		// poll non è consigliabile, perchè i null non ci piaccino, perchè c'è il
		// rischio che chi lo riceve non lo testi, mentre l'eccezione non può non essere
		// testata.
		return data.pollFirst(); // è come fare un remove dell'elemento, la diff tra poll è remove è che poll non
									// tira un'eccezione e se non c'è nulla ritorna null
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}
}
