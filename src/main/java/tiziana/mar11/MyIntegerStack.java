package tiziana.mar11;

import java.util.ArrayList;

public class MyIntegerStack {
	private ArrayList<Integer> data;

	public MyIntegerStack() {
		data = new ArrayList<Integer>();

	}

	/**
	 * For debugging and testing purpose only!
	 * 
	 * 
	 * @return data
	 */

	ArrayList<Integer> getData() {
		return this.data;
	}

	public void push(Integer value) {
		data.add(value);

	}

	public Integer pop() {
		if (data.size() == 0) {
			throw new IllegalAccessError();
		}
		return data.remove(data.size() - 1);

	}

	public boolean isEmpty() {
		if (data.size() == 0) {
			return true;
		}
		return false;

	}
}
