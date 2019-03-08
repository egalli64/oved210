package alessandraC.mar04;

import static org.junit.Assert.*;

import org.junit.Test;

import alessandraC.mar04.MyLinkedList.Node;

public class MyLinkedListTest {

	@Test
	public void emptyListHasNullHead() {
		MyLinkedList mll = new MyLinkedList();
		assertNull(mll.getHead());
		assertNull(mll.getTail());
	}

	@Test
	public void addFirstSimple() {
		final int VALUE = 100;

		MyLinkedList mll = new MyLinkedList();
		mll.addFirst(VALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);

		assertEquals(VALUE, myHead.getValue());
	}

	@Test
	public void testAddLast() {
		final int VALUE = 200;

		MyLinkedList mll = new MyLinkedList();
		mll.addLast(VALUE);

		Node myTail = mll.getHead();
		assertNotNull(myTail);

		assertEquals(VALUE, myTail.getValue());

	}

	@Test
	public void TestCoupleAddFirstandAddLast() {
		final int FIRST_VALUE = 100;
		final int SECOND_VALUE = 200;

		MyLinkedList mll = new MyLinkedList();

		mll.addFirst(FIRST_VALUE);
		mll.addLast(SECOND_VALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);

		Node myTail = mll.getTail();
		assertNotNull(myTail);

		assertEquals(FIRST_VALUE, myHead.getValue());
		assertEquals(SECOND_VALUE, myTail.getValue());

		Node myHeadNext = myHead.getNext();
		assertNotNull(myHeadNext);
		assertEquals(SECOND_VALUE, myHeadNext.getValue());

	}

	@Test
	public void CoupleAddFirst() {
		final int FIRST_VALUE = 100;
		final int SECOND_VALUE = 200;
		MyLinkedList mll = new MyLinkedList();
		mll.addFirst(FIRST_VALUE);
		mll.addFirst(SECOND_VALUE);

		Node myHead = mll.getHead();
		Node myHead2 = mll.getHead();
	}

	@Test
	public void CoupleAddLast() {
		final int FIRST_VALUE = 100;
		final int SECOND_VALUE = 200;
		MyLinkedList mll = new MyLinkedList();
		mll.addLast(FIRST_VALUE);
		mll.addLast(SECOND_VALUE);

		Node myTail = mll.getTail();
		Node myTail2 = mll.getTail();
		assertNotNull(SECOND_VALUE);

	}

}
