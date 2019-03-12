package sara.mar11;

import java.util.LinkedList;

//IMPLEMENTATO CON LINKEDLIST
public class MyIntegerQueue {
	private LinkedList<Integer> data;

	LinkedList<Integer> getData() {
		return data;
	}

	public MyIntegerQueue() {
		data = new LinkedList<Integer>();
	}

	public void enqueue(Integer value) {
		data.addLast(value); // aggiungere elemento in fondo alla coda * per la linked list aggiungere alla
								// fine o all'inizio è la stessa cosa *
	}

	public Integer dequeue() {
		if (data.isEmpty()) {
			throw new IllegalAccessError("Can't dequeue() an empty queue");
		}
		return data.pollFirst(); // entrata e uscita diversi in linked list
	} // differenza tra poll e remove, è che poll non tira eccezione e ritorna a null
		// quando qualcosa non va

	public boolean isEmpty() {
		return data.isEmpty();
	}
}