package alessandraB.mar04;

import java.util.LinkedList;

public class LinkedListCheck {
	public static void doubleLinkedListCheck()  {
		LinkedList<Double> linkedList = new LinkedList<>();  //Linked perchè ogni elemento ha 2 puntatori
		                                                     //un puntatore all'elemento precedente
		                                                     //un puntatore all'elemeno successivo
		linkedList.add(2.5);
		linkedList.addFirst(3.4); //aggiungi un elemento alla testa dell'array
		linkedList.addLast(5.6);
		
		System.out.println(linkedList);
		System.out.println(linkedList.peekFirst() + ", "+ linkedList.peekLast());
		 
	}
public static void main(String[] args) {
	doubleLinkedListCheck();
	
}
}
