package federica;

import java.util.LinkedList;

public class MyIntegerQueue {
	private LinkedList<Integer> data;
	
	LinkedList<Integer>getdata() {
		return data;
	}

	public MyIntegerQueue() {
		data = new LinkedList<Integer>();
	}

	public void enqueue(Integer value) {
		data.add(value);
	}

	public Integer dequeue() {
		if (data.isEmpty()) {
			throw new IllegalAccessError("Can't dequeue() an empty queue");
		}
		return data.pollFirst();
	}

	public boolean isEmpty() {
	return data.isEmpty();
	}

}
