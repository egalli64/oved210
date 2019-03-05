package monica.settimana2; //05/03/19  utilizzo anche la classe MyLinkedList (04/03/19)

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	@Test // questo lo stiamo creando noi
	public void emptyListHasNullHead() {
		MyLinkedList mll = new MyLinkedList();
		assertNull(mll.getHead());
		assertNull(mll.getTail());

	}

	@Test // @Test
			// public void testAddFirst() {
	public void addFirstSimple() {                      // fail("Not yet implemented"); } <- così era prima delle modifiche
		final int VALUE = 12;

		MyLinkedList mll = new MyLinkedList();
//		assertNull(mll.getHead());

		mll.addFirst(VALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);

		assertEquals(VALUE, myHead.getValue());
	}

	@Test
	public void testAddLast() {               // fail("Not yet implemented");

		final int VALUE = 21;
		MyLinkedList mll = new MyLinkedList();
		mll.addLast(VALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());
	}

	@Test

	public void addMix() {
		final int VALUE = 24;
		final int VALUE2 = 30;
		MyLinkedList mll = new MyLinkedList();

		mll.addFirst(VALUE);
		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());

		mll.addLast(VALUE2);
		Node myTail = mll.getTail();
		assertNotNull(VALUE2);

	}

	@Test
	public void coupleFirst() {
		final int VALUE = 24;
		final int VALUE2 = 31;
		MyLinkedList mll = new MyLinkedList();
		mll.addFirst(VALUE);
		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());

		mll.addFirst(VALUE2);
		Node myHead2 = mll.getHead();
		assertNotNull(VALUE2);
	}

	@Test
	public void coupleLast() {
		final int VALUE = 24;
		final int VALUE2 = 30;
		MyLinkedList mll = new MyLinkedList();
		mll.addLast(VALUE);
		Node myTail = mll.getTail();
		mll.addLast(VALUE2);
		Node myTail2 = mll.getTail();
		assertNotNull(VALUE2);

	}
}
