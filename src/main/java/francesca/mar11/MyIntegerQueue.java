package francesca.mar11;
import java.util.LinkedList;

public class MyIntegerQueue {
	private LinkedList<Integer> data;
	
	/**
	 * For debugging and testing purpose only!
	 * 
	 * @return data
	 */
	LinkedList<Integer> getData() {
		return data;
	}
	
	public MyIntegerQueue() {
		data = new LinkedList<Integer>();
	}
	
	public void enqueue(Integer value) {
		data.addLast(value); //mettimelo in fondo
		
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

