package sara.mar11;

import java.util.ArrayList;
							//IMPLEMENTATO CON ARRAYLIST
public class MyIntegerStack {
	private ArrayList<Integer> data;

	public MyIntegerStack() {
		data = new ArrayList<Integer>();
	}

	ArrayList<Integer> getData() {
		return this.data;
	}

	public void push(Integer value) {
		data.add(value);
	}

	public Integer pop() {
		if (data.isEmpty()) {
			throw new IllegalAccessError("Can't pop() an empty stack");
		}
		return data.remove(data.size() - 1); //indice dell'elemento più a destra
	}

	public boolean isEmpty() {
		if (data.isEmpty()) {
			return true;
		}
		return false;
	}
}