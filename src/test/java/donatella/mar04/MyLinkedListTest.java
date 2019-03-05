package donatella.mar04;

import static org.junit.Assert.*;

import org.junit.Test;







public class MyLinkedListTest {
	
	@Test
	public void emptyListHasNullHead() {
		MyLinkedList mll= new MyLinkedList();
		assertNull(mll.getHead());
		assertNull(mll.getTail());
		
	}

	@Test
	public void addFirstSimple() {
    final int VALUE=12;
		
	MyLinkedList mll = new MyLinkedList();
	mll.addFirst(VALUE);

	Node myHead = mll.getHead();
	assertNotNull(myHead);
	assertEquals(VALUE, myHead.getValue());

	Node myTail = mll.getTail();
	assertNotNull(myTail);
	assertEquals(VALUE, myTail.getValue());
}

	@Test
	public void addFirstCouple() {
		final int FIRST_VALUE = 18;
		final int SECOND_VALUE = 21;

		MyLinkedList mll = new MyLinkedList();
		mll.addFirst(FIRST_VALUE);
		mll.addFirst(SECOND_VALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(SECOND_VALUE, myHead.getValue());

		Node myTail = mll.getTail();
		assertNotNull(myHead);
		assertEquals(FIRST_VALUE, myTail.getValue());
	}
	@Test
	public void addCoupleMixed() {
		final int FIRST_VALUE = 18;
		final int SECOND_VALUE = 21;

		MyLinkedList mll = new MyLinkedList();
		mll.addFirst(FIRST_VALUE);
		mll.addLast(SECOND_VALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(FIRST_VALUE, myHead.getValue());

		Node myTail = mll.getTail();
		assertNotNull(myHead);
		assertEquals(SECOND_VALUE, myTail.getValue());
	}

	@Test
	public void addLastSimple() {
    final int VALUE=42;
		
    MyLinkedList mll = new MyLinkedList();
	mll.addLast(VALUE);

	Node myHead = mll.getHead();
	assertNotNull(myHead);
	assertEquals(VALUE, myHead.getValue());
}
	
	
	
    
  
   
 
	   
	   
   
		
		}
	   

	

