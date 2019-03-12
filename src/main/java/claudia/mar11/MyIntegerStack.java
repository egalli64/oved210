package claudia.mar11;

import java.util.ArrayList;
import java.util.Stack;

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
		
		return data.remove(data.size() - 1);

	}

	public boolean isEmpty() {
		return data.isEmpty();
	

	}
}
