package gloria.mar11;

import java.util.LinkedList;

public class MyIntegerQueue {
	private LinkedList<Integer> data;

	/**
	 * For debugging and testing purpose only!
	 * 
	 * @return data
	 */

	LinkedList<Integer> getData() {
		return data;
	}

	public MyIntegerQueue() {
		data = new LinkedList<Integer>();
	}

	public void enqueue(Integer value) {
		data.addLast(value); // se qui c'è last vuol dire che in poll deve esserci first.

	}

	public Integer dequeue() {
		if (data.isEmpty()) {
			throw new IllegalAccessError("Can't dequeue() an empty queue");
		}

		return data.pollFirst(); // specifico di LinkedList. POLL non tira l'eccezione se non c'è nulla, ritorna
									// semplicemente un NULL. Questo deve essere l'opposto di add, la funzione
									// prima, se uno è first l'altro deve essere lasta e viceversa.
	}

	public boolean isEmpty() {
		return data.isEmpty();

	}
}
