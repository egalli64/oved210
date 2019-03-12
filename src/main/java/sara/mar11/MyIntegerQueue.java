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

	}
	
	public Integer dequeue() {
		return 0;
	}
	
	public boolean isEmpty() {
		return true;
	}
}
