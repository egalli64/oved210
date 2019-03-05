package marina.mar04;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void emptyListHasNullHeadAndTail() {
		MyLinkedList mll = new MyLinkedList();
		assertNull(mll.getHead());
		assertNull(mll.getTail());
	}

	@Test
	public void testAddFirst() {
		final int VALUE = 12;

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
	public void testAddLast() {
		final int VALUE = 24;

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
	public void TestCoupleAddFirstandAddLast() {
		final int VALUE = 12;
		final int VALUE2 = 24;

		MyLinkedList mll = new MyLinkedList();
		
		mll.addFirst(VALUE);
		mll.addLast(VALUE2);
		
		Node myHead = mll.getHead();
		assertNotNull(myHead);
		
		Node myTail = mll.getTail();
		assertNotNull(myTail);

		assertEquals(VALUE, myHead.getValue());
		assertEquals(VALUE2, myTail.getValue());
		
		Node myHeadNext = myHead.getNext();
		assertNotNull(myHeadNext);
		assertEquals (VALUE2, myHeadNext.getValue());
	}
	
	@Test
	public void CoupleAddFirst() {
		final int VALUE = 24;
		final int VALUE2 = 30;

		MyLinkedList mll = new MyLinkedList();
		mll.addFirst(VALUE);
		mll.addFirst(VALUE2);


		Node myHead = mll.getHead();
		Node myHead2 = mll.getHead();
		assertNotNull(VALUE2);
	}
	
	@Test
	public void CoupleAddLast() {
		final int VALUE = 24;
		final int VALUE2 = 30;

		MyLinkedList mll = new MyLinkedList();
		mll.addLast(VALUE);
		mll.addLast(VALUE2);


		Node myTail = mll.getTail();
		Node myTail2 = mll.getTail();
		assertNotNull(VALUE2);
	}
	
//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}

}
