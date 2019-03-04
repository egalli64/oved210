package mariangela.mar04;

public class MyLinkedList {
	private Node head = null;

	public MyLinkedList() {
	}

	public void addFirst(int value) {
		Node node = new Node(value);
		node.setNext(head);
		head = node;
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

	}


