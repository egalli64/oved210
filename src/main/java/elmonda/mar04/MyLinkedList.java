package elmonda.mar04;



public class MyLinkedList { // la mia linklist ha una // voglio memorizzare tutti gli elementi che sono
							// nella mia lista, me ne basta
							// memorizzare uno
	private Node head = null; // il nodo head srà il reference al primo nodo nella lista, qi non abbiamo
	private Node tail = null; // nessun nodo nella lista quindi null // inizialmente la mia classe è vuota//
	// Node è quello che mi tiene dentro ogni oggetto. perchè non basta metterci il
	// valore intero? perchè serve in valore corrente e il puntatore.
	// private int size; // NODE SARà UNA REFERENCE AL SUCCESSORE

	public MyLinkedList() { // questo costruttore mi sta dicendo che la mia lista è vuota
		// this.head = null;
		// this.size = 0;
	}
	
	Node getHead() {
		return this.head;
	}
	
	Node getTail() {
		return this.tail;
	}

	public void addFirst(int value) { // primo elemento
		Node node = new Node(value); // per rappresentare la struttura, gli dico che node è il valore
		if (tail == null) {
			tail = node;
		}

		{

		}
		node.setNext(head); // il successore del nodo corrente è head
		head = node; // head diventa questo nuovo nodo, diventa il nodo che ho appena creato. per cui
						// avrò 12 all'inizio della lista
	}
		public void addLastPlain(int value) {
			Node node = new Node(value);
			if(head == null) {
				head = node;
			} else {
				Node last = head;
				Node tail = head.getNext();
				while(tail != null) {
					last = tail;
					tail = tail.getNext();
				}
				last.setNext(node);
			}
		// Node node = new Node(value);
		// node.setNext(head); // (il node di hext è head) guarda che il successore è
		// questo indirizzo, che in questo caso è node, dalla seconda volta l'indirizzo
		// diventa il primo elemento
		// head = node; // ora mi punta a questo nuovo nodo che ho creato
	}

	public void addLast(int value) { // ultimo elemento
		Node node = new Node(value);
		if (tail == null) {
			head = node;
			tail = node;

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


class Node { // metteremo le proprietà del mio node
	private int value;
	private Node next; // al suo interno node punterà al successore

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

// chiamami cur un nod che rappresenta l'elemento della mia lista

//IN UNA ARREY LIST IL PRIMO ELEMENTO è 0, NELLA LISTA INVECE DEVO AVERE UN PUNTATORE HEAD CHE MI TIENE L'INDIRIZZO DEL PRIMO ELEMENTO'