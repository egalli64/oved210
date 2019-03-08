package claudia.mar04;

public class MyLinkedList {
	private Node head = null;
	private Node tail = null;

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + ", tail=" + tail + "]";
	}

	public MyLinkedList() {
	}

//	per il testing faccio ritornare l'oggetto head
	Node getHead() {
		return this.head;
	}

	public void addFirst(int value) {
		Node node = new Node(value);
		node.setNext(head);
		head = node;
	}

	public void addLast(int value) {
		// create new node for value
		Node node = new Node(value);

		if (tail == null) {
			head = node;
			tail = node;
		} else {
			// current tail.next -> new node
			tail.setNext(node);
			tail = node;
		}
	}
}

class Node {
	private int value;
	private Node next;

	public Node(int value) {
		this.value = value;
		this.next = next;
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
