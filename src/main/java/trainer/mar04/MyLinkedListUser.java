package trainer.mar04;

public class MyLinkedListUser {
	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList();
				
		System.out.println(mll);
		mll.addFirst(21);
		System.out.println(mll.toString());
		mll.addLast(12);
		System.out.println(mll.toString());
		mll.addLast(3);
		System.out.println(mll.toString());
		mll.addLast(42);
		System.out.println(mll.toString());
	}
}
