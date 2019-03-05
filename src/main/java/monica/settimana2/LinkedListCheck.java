package monica.settimana2;  //04/03/19

import java.util.LinkedList;

public class LinkedListCheck {

	public static void main(String[] args) {
		doubleLinkedListCheck();
	}

	public static void doubleLinkedListCheck() {

		LinkedList<Double> linkedList = new LinkedList<>();
		linkedList.add(2.5);
		linkedList.addFirst(3.4);
		linkedList.addLast(5.6);

		System.out.println(linkedList);
		System.out.println(linkedList.peekFirst() + " , " + linkedList.peekLast());

	}

}
