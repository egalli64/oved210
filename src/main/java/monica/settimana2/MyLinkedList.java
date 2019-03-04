package monica.settimana2; //04/03/19

public class MyLinkedList {
	private Node head = null;

	public MyLinkedList() {
	}

	public void addFirst(int value) {
		Node node = new Node(value);
		node.setNext(head);
		head = node;
	}

	public void addLast(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
		} else {

		}

	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}

}

class Node {
	private int value;
	private Node next;

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}

	public Node(int value) {
		this.value = value;
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
