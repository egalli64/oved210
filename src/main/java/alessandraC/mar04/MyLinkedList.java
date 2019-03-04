package alessandraC.mar04;

public class MyLinkedList {
	private Node head = null;
	private Node tail = null;
	
	public MyLinkedList () {
	}
	
	public void addFirst (int value) {
		Node node = new Node (value);
		if(tail == null) {
			tail = node;
		}
		node.setNext(head);
		head = node;
	}
	
	public void addLast (int value) {
		
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder (" [ ");
		Node cur = head;
		while (cur != null) {
			result.append(cur.getValue());
			result.append (" ");
			cur = cur.getNext ();
		}
		result.append ("]");
		return result.toString ();
		
	}
		
	}
	class Node {
		private int value;
		private Node next;
		
		public Node (int value) {
			this.value = value;
		}
		public Node getNext() {
			return next;
		}
		
		public int getValue () {
			return value;
		}
		
		public void setNext (Node next) {
			this.next = next;
		}
		
		public void addLas(int value) {
			Node node = new Node (value);
			Object tail = null;
			if (tail == null) {
				Node head = node;
				tail = node;
			}
			else {
				Node head = null;
				Node last = head;
				Node tail1 = head.getNext ();
				while(tail1 != null) {
					last = tail1;
					tail1 = tail1.getNext();
				}
				
			}
		}
		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}
		
	}