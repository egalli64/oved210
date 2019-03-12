package mariangela.mar11;

import java.util.LinkedList;

public class MyIntegerQueue {
	private LinkedList<Integer> data;

	LinkedList<Integer> getData() {
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

		return data.remove(data.size() - 1);
	}

	public boolean isEmpty() {
		if (data.isEmpty()) {
			return true;
		}
		return false;
	}
}
