package monica.settimana2; //05/03/19  utilizzo anche la classe MyLinkedList (04/03/19)

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	@Test // questo lo stiamo creando noi
	public void emptyListHasNullHeadTail() {
		MyLinkedList mll = new MyLinkedList();
		assertNull(mll.getHead());
		assertNull(mll.getTail());

	}

	@Test                                                // @Test
			                                             // public void testAddFirst() {
	public void addFirstSimple() {                       // fail("Not yet implemented"); } <- così era prima delle modifiche
		final int VALUE = 12;

		MyLinkedList mll = new MyLinkedList();
        //		assertNull(mll.getHead());

		mll.addFirst(VALUE);
		
		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());
		
		Node myTail = mll.getTail();
		assertNotNull(myTail);  
		assertEquals(VALUE, myTail.getValue());
	}

	@Test
	public void testAddLast() {               // fail("Not yet implemented");

		final int VALUE = 21;
		MyLinkedList mll = new MyLinkedList();
		mll.addLast(VALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());
		
		Node myTail = mll.getTail();
		assertNotNull(myTail);  
		assertEquals(VALUE, myTail.getValue());
	}

	@Test
	public void addMix() {
		final int VALUE = 24;
		final int VALUE2 = 30;
		MyLinkedList mll = new MyLinkedList();

		mll.addFirst(VALUE);
		mll.addLast(VALUE2);
		
		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());

		
		Node myTail = mll.getTail();
		assertNotNull(myTail);     
		assertEquals(VALUE, myTail.getValue());
	
		Node myHeadNext = myHead.getNext();
		assertNotNull(myHeadNext);
		assertEquals(VALUE2, myHeadNext.getValue());

	}

	@Test
	public void coupleFirst() {
		final int VALUE = 24;
		final int VALUE2 = 31;
		MyLinkedList mll = new MyLinkedList();
		
		mll.addFirst(VALUE);
		mll.addFirst(VALUE2);
		
		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());

		Node myTail = mll.getTail();
		assertNotNull(myTail);     
		assertEquals(VALUE, myTail.getValue());
	
		Node myHeadNext = myHead.getNext();
		assertNotNull(myHeadNext);
		assertEquals(VALUE2, myHeadNext.getValue());
		
	}

	@Test
	public void coupleLast() {
		final int VALUE = 24;
		final int VALUE2 = 30;
		MyLinkedList mll = new MyLinkedList();
		mll.addLast(VALUE);
		mll.addLast(VALUE2);
		
		Node myTail = mll.getTail();
		Node myTail2 = mll.getTail();
		assertNotNull(VALUE2);
		
		

	}
}
