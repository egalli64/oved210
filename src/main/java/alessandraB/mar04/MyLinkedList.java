package alessandraB.mar04;

public class MyLinkedList {// listalinkata di interi
	private Node head = null;
	private Node tail = null;

	public MyLinkedList() {

	}

	public void addFirst(int value) {
		Node node = new Node(value);
        node.setNext(head); //la variabile next all'interno di nodo è "head", il successore del nodo sarà
                            //quello che è l'head corrente
        head = node; //l'indirizzo head diventa l'indirizzo del primo elemento nella mia lista
        
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void addLast(int value) {
	
		Node node = new Node(value);
		if(tail == null)  {
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
		while(cur != null) {
			result.append(cur.getValue());
			result.append(" ");
			cur = cur.getNext();
			
		} result.append("]");
		return result.toString();
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


	

	}

	
}
