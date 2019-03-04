package monica.settimana2;   //04/03/19

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
	
		System.out.println(mll.toString());
		mll.addLast(12);
		System.out.println(mll.toString());
		mll.addLast(3);
		System.out.println(mll.toString());
		mll.addLast(42);
		System.out.println(mll.toString());
	
	
	
	
	
	}

}
