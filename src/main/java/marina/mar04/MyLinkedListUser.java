package marina.mar04;

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
	
	System.out.println("*****");
	
	System.out.println(mll.toString());
	mll.addLast(28);
	System.out.println(mll.toString());
	mll.addLast(39);
	System.out.println(mll.toString());
	mll.addLast(9);
	System.out.println(mll.toString());
	
	
	
}
}
