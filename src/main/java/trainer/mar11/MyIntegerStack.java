package trainer.mar11;

import java.util.ArrayList;

public class MyIntegerStack {
	private ArrayList<Integer> data;

	public MyIntegerStack() {
		data = new ArrayList<Integer>();
	}

	/**
	 * For debugging and testing purpose only!
	 * 
	 * @return data
	 */
	ArrayList<Integer> getData() {
		return data;
	}

	public void push(Integer value) {
		data.add(value);
	}

	public Integer pop() {
		if (data.isEmpty()) {
			throw new IllegalAccessError("Can't pop() an empty stack");
		}

		return data.remove(data.size() - 1);
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}
}
