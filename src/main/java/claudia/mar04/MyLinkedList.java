package claudia.mar04;

public class MyLinkedList {
	private Node head = null;
	private Node tail = null;
	
	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + ", tail=" + tail + "]";
	}
	public MyLinkedList(){
			
}
	public void addFirst(int value) {
		Node node = new Node(value);
		node.setNext(head);
		head = node;
}

	public void addLast(int value) {
		Node node = new Node(value);
		node.setNext(tail);
		tail = node;
		
	}
}
	class Node {
	private int value;
	Node next;
	
	public Node(int value) {
		
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
	}
	
