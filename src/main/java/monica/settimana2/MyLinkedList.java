package monica.settimana2; //04/03/19

public class MyLinkedList {
	private Node head = null;
	private Node tail = null;

	public MyLinkedList() {
	}

	/**
	 * for the test only, return the list head
	 * 
	 * @return
	 */

	// serve per il test solo, ritorna la testa della lista
	Node getHead() {
		return this.head;
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
			Node last = head;
			Node tail = head.getNext();
			while (tail != null) {
				last = tail;
				tail = tail.getNext();
			}
			last.setNext(node);

		}

	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
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
