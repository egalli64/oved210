package mariangela.mar04;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void emptyListHasNullHead() {
		MyLinkedList mll = new MyLinkedList();
		assertNull(mll.getHead());
		
	}

	@Test
	public void addFirstSimple() {
		final int VALUE = 12;

		MyLinkedList mll = new MyLinkedList();

		mll.addFirst(VALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());
		
		
	}

	@Test
	public void addFirstCouple() {
		final int VALUE = 8;
		final int SECONDVALUE = 12;
		MyLinkedList mll = new MyLinkedList();

		mll.addFirst(VALUE);
		mll.addFirst(SECONDVALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(SECONDVALUE, myHead.getValue());
		
		Node myHeadNext = myHead.getNext();
		assertNotNull(myHeadNext);
		assertEquals(VALUE, myHeadNext.getValue());
		
		Node myTail = mll.getTail();
		assertNotNull(myTail);
		assertEquals(VALUE, myTail.getValue());
	}

	@Test
	public void addLastSimple() {
		final int VALUE = 9;

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
	public void addLastCouple() {
		final int VALUE = 9;
		final int SECONDVALUE = 13;

		MyLinkedList mll = new MyLinkedList();

		mll.addLast(VALUE);
		mll.addLast(SECONDVALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());
		
		Node myTail = mll.getTail();
		assertNotNull(myTail);
		assertEquals(SECONDVALUE, myTail.getValue());
		
		Node myTailNext = mll.getTail();
		assertNotNull(myTailNext);
		assertEquals(SECONDVALUE, myTail.getValue());
		
		
	}

	@Test
	public void coupleMixed() {
		final int VALUE = 12;
		final int FINALVALUE = 9;
		
		MyLinkedList mll = new MyLinkedList();

		mll.addFirst(VALUE);
		mll.addLast(FINALVALUE);
		
		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());
		
		Node myHeadNext = myHead.getNext();
		assertNotNull(myHeadNext);
		assertEquals(FINALVALUE, myHeadNext.getValue());

		Node myTail = mll.getTail();
		assertNotNull(myTail);
		assertEquals(FINALVALUE, myTail.getValue());
		
		
		
	}

}
