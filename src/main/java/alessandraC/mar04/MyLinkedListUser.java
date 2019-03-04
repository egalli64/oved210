package alessandraC.mar04;

public class MyLinkedListUser {
	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList ();
		
		System.out.println(mll.toString());
		mll.addFirst(15);
		System.out.println(mll.toString());
		mll.addFirst(36);
		System.out.println(mll.toString());
		mll.addFirst(72);
		System.out.println(mll.toString());
		
		
	}

}
