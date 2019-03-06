package tiziana.mar04;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void TestEmptyListHasNullHeadAndTail() {
		MyLinkedList mll = new MyLinkedList();
		assertNull(mll.getHead());
		assertNull(mll.getTail());

	}

	@Test
	public void TestAddFirst() {
		final int VALUE = 12; // definisci un valore 12

		MyLinkedList mll = new MyLinkedList();
		mll.addFirst(VALUE);

		Node myHead = mll.getHead(); // prendi la testa della mia LinkedList
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());

	}

	@Test
	public void TestAddLast() {
		final int VALUE = 45;

		MyLinkedList mll = new MyLinkedList();
		mll.addLast(VALUE);

		Node myTail = mll.getTail();
		assertNotNull(myTail);
		assertEquals(VALUE, myTail.getValue());

	}

	@Test
	public void TestMixFirstandAndLast() {
		final int FIRSTVALUE = 12;
		final int SECONDVALUE = 45;

		MyLinkedList mll = new MyLinkedList();
		mll.addFirst(FIRSTVALUE);
		mll.addLast(SECONDVALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(FIRSTVALUE, myHead.getValue());

		Node myTail = mll.getTail();
		assertNotNull(myTail);
		assertEquals(SECONDVALUE, myTail.getValue());

		Node myHeadNext = myHead.getNext();
		assertNotNull(myHeadNext);
		assertEquals(SECONDVALUE, myHeadNext.getValue());

	}

	@Test
	public void TestDoubleAddFirst() {
		final int VALUE1 = 12;
		final int VALUE2 = 15;

		MyLinkedList mll = new MyLinkedList();
		mll.addFirst(VALUE1);
		mll.addFirst(VALUE2);

		Node myHead = mll.getHead();
		Node myHead2 = mll.getHead();
		assertNotNull(VALUE2);

	}

	@Test
	public void TestDoubleAddLast() {
		final int VALUE1 = 37;
		final int VALUE2 = 55;

		MyLinkedList mll = new MyLinkedList();
		mll.addLast(VALUE1);
		mll.addLast(VALUE2);

		Node myTail = mll.getTail();
		Node myTail2 = mll.getTail();
		assertNotNull(VALUE2);

	}
}
