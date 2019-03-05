package alessandraC.mar04;

public interface Note {

	Note getNext();

	class Node {
		private int value;
		private Node next;
		private Note head;
		
		public Node(int value2) {
		
		}

		public void node (int value) {
		}
	
		public void addFirst (int value) {
			System.out.println(18);
			System.out.println(36);
			System.out.println(72);
		}
			
		public static void main(String[] args) {
			
		}

		@Override
		public String toString() {
			StringBuilder result = new StringBuilder (" [ ");
			Note cur = head;
			while (cur != null) {
				result.append(cur.getValue());

				cur = cur.getNext();
			}
			return "Node []";			
			
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

	Object getValue();


}
