package claudia.mar04;

public class MyLinkedList {
	private Node head = null;
	
	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}
	public MyLinkedList(){
			
}
	public void addFirst(int value) {
		Node node = new Node(value);
		node.setNext(head);
		head = node;
}

}
	class Node {
	private int value;
	Node next;
	
	public Node(int value) {
		
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

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}
	
}