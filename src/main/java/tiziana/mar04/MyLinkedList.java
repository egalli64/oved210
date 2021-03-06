package tiziana.mar04;

public class MyLinkedList {
	private Node head = null;
	private Node tail = null;

	public MyLinkedList() {

	}

	/**
	 * for test only, return list head
	 * 
	 * @return the object head
	 */

	Node getHead() {
		return this.head;
	}

	Node getTail() {
		return this.tail;
	}

	public void addFirst(int value) {
		Node node = new Node(value);
		if (tail == null) {
			tail = node;
		}
		node.setNext(head);
		head = node;
	}

	public void addLast(int value) {
		Node node = new Node(value);
		if (tail == null) {
			head = node;
			tail = node;

		} else {
			tail.setNext(node);
			tail = node;
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[ ");
		Node cur = head;
		while (cur != null) {
			result.append(cur.getValue());
			result.append(" ");
			cur = cur.getNext();
		}
		result.append("]");

		return result.toString();
	}
}

class Node {
	private int value;
	private Node next;

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

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}

	public void addLast(int value) {

	}
}