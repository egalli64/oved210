package gloria.mar04;

public class MyLinkedList {

	private Node head = null; // inizialmente è un non indirizzo e poi il primo diventa il primo elemento che
								// c'è nella mia lista

	public MyLinkedList() {

	}

	public void addFirst(int value) {
		Node node = new Node(value); // mi sono creato l'oggetto nodo
		node.setNext(head); // il successore è questo, la variabile next sarà questo
		head = node;
	}

	public void addLast(int value) {

	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		Node cur = head;
		while (cur != null) {
			result.append(cur.getValue());
			result.append(" ");
			cur = cur.getNext();
		}
		result.append("[");
		return result.toString();

	}

}

class Node {
	private int value;
	private Node next;

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

}
