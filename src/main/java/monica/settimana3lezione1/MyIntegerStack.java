package monica.settimana3lezione1; //11/03/19 ArrayList

import java.util.ArrayList;

public class MyIntegerStack {

	private ArrayList<Integer> data;

	public MyIntegerStack() {
		data = new ArrayList<Integer>();
	}

	ArrayList<Integer> getData() {
		return this.data;
	}

	public void push(Integer value) { // utilizzo .add
		data.add(value);
	}

	public Integer pop() { // leggere ultimo elemento messo e utilizzo .remove sull'ultimo elemento
		return data.remove(data.size() - 1); // inserito

	}

	public boolean isEmpty() {
		return data.isEmpty();
	}
}
