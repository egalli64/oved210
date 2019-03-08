package elmonda.mar04;

public class MyLinkedListUser {
	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList(); // inizalmente voglio che la mia classe sia vuota

		System.out.println(mll.toString());
		mll.addFirst(21);
		System.out.println(mll.toString());
		mll.addLast(12); // qui mi sono creato il nodo
		System.out.println(mll.toString());
		mll.addLast(3); // successore di tre
		System.out.println(mll.toString());
		mll.addLast(42);
		System.out.println(mll.toString());

//		System.out.println(mll.toString());
//		mll.addFirst(12);  // qui mi sono creato il nodo
//		System.out.println(mll.toString());
//		mll.addLast(3); // successore di tre
//		System.out.println(mll.toString());
//		mll.addLast(42);
//		System.out.println(mll.toString());

//		System.out.println(mll.toString());
//		mll.addFirst(42, 12);  // qui mi sono creato il nodo
//		System.out.println(mll.toString());
//		mll.addFirst(3, 12); // successore di tre
//		System.out.println(mll.toString());
//		mll.addFirst(12, 3);
//		System.out.println(mll.toString());
//		

	}

}
