package tiziana.mar04;

public class MyLinkedListUser {
	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList();

		System.out.println(mll.toString());
		mll.addFirst(37);
		System.out.println(mll.toString());
		mll.addFirst(23);
		System.out.println(mll.toString());
		mll.addFirst(16);
		System.out.println(mll.toString());

		System.out.println("******");

		mll.addLast(37);
		System.out.println(mll.toString());
		mll.addLast(23);
		System.out.println(mll.toString());
		mll.addLast(16);
		System.out.println(mll.toString());
	}
}