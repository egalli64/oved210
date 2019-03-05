package alessandraB.mar04;

public class MyLinkedListUser {
	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList();
		
		System.out.println(mll.toString());
		
		mll.addFirst(12);
		System.out.println(mll.toString());
		mll.addFirst(3);
		System.out.println(mll.toString());
		mll.addFirst(42);
		System.out.println(mll.toString());
	}

	
}
