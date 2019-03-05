package donatella.mar04;



public class MyLinkedList {
	private Node head=null;
	private Node tail=null;
	


	
	public MyLinkedList() {
		
	}
	
	
//	*for test only,return to the list head
//	*
//	@return the object head

	Node getHead() {
	return	this.head;
	}
	
	public void addFirst(int value) {
		Node node=new Node(value);
		node.setNext(head);
		head=node;
	
	
	}
	public void addLast(int value) {
		Node node= new Node(value);
		if(tail ==null) {
			head=node;
			tail=node;
			
			} else {
				tail.setNext(node);
				tail = node;
			
		}}
	
	
	
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
			
					
		
			
				
			}
	

		
	
	
	

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[ ");
		Node cur = head;
		while(cur != null) {
			result.append(cur.getValue());
			result.append(" ");
			cur = cur.getNext();
		}
		result.append("]");
		
		return result.toString();
	}


	public Node getTail() {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	
	






	class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
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

