package sara.mar04;

public class MyLinkedList {
	private Node head = null;
	private Node tail = null;

	public MyLinkedList() {
	}

	/**
	 * for test only, return the list head
	 * 
	 * @return the object head
	 */
	Node getHead() {
		return this.head;
	}
	Node getTail() {
		return this.tail;
	}

	// metodo
	public void addFirst(int value) {
		Node node = new Node(value);
		node.setNext(head);
		head = node;
		tail = node;
	}

	public void addLast(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
			
		} else {
						
			tail.setNext(node);
			tail = node;
			
			
		}

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
		result.append("]");
		return result.toString();
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}



	}



class Node { // ogni nodo ha queste proprietà

	// dati
	private int value;
	private Node next;

	public Node(int value) {
		this.value = value;
	}
	// metodo

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
