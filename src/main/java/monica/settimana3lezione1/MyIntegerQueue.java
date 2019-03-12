package monica.settimana3lezione1; //11/03/2019

import java.io.DataInputStream;
import java.util.LinkedList;

public class MyIntegerQueue {

	private LinkedList<Integer> data;

	LinkedList<Integer> getData() {
		return data;
	}

	public MyIntegerQueue() { // costruttore
		data = new LinkedList<Integer>();

	}

	public void enqueue(Integer value) { // aggiunge l'elemento alla fine infatti metto .addLAst invece che .add
		data.addLast(value);
	}

	public Integer dequeue() { // leggo l'inizio
		if (data.isEmpty()) {
			throw new IllegalAccessError("Can't dequeue() an empty queue");
		}
		return data.pollFirst(); // per le LinkedList è specifico .poll per eliminare il primo
	} // la differenza tra .poll e .remove e che poll non tira eccezioni però ritorna
		// null

	public boolean isEmpty() { // delega a data di fare la stessa cosa
		return data.isEmpty();
	}

}
