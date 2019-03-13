package gloria.mar04;

import static org.junit.Assert.*;

import org.junit.Test;

import gloria.mar05.Problem;

public class MyLinkedListTest {

	@Test
	public void emptyListHasNullHead() {

		MyLinkedList mll = new MyLinkedList();
		assertNull(mll.getHead());
		assertNull(mll.getTail());
	}

	@Test
	public void AddFirstSimple() {
		final int VALUE = 12;

		MyLinkedList mll = new MyLinkedList();

		mll.addFirst(VALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue()); // verifico che il valore associato ad head sia il valore atteso

		Node myTail = mll.getTail();
		assertNotNull(myTail);
		assertEquals(VALUE, myTail.getValue());
	}

	@Test  // --->?
	public void AddLastSimple() {
		MyLinkedList mll = new MyLinkedList();
		assertNull(mll.getHead());

		mll.addLast(42);

		Node myHead = mll.getHead();
		assertNotNull(myHead);

		assertEquals(42, myHead.getValue());
	}

	@Test
	public void AddLastandAddFirst() {
		MyLinkedList mll = new MyLinkedList();
		final int VALUE = 12;
		final int VALUEf = 42;

		mll.addFirst(VALUE);
		mll.addLast(VALUEf);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());
		
		Node myTail = mll.getTail();
		assertNotNull(myTail);
		assertEquals(VALUEf, myTail.getValue());
		
		Node myHeadNext = myHead.getNext();
		assertNotNull(myHeadNext);
		assertEquals(VALUEf, myHeadNext.getValue());
	}

	@Test
	public void AddFirstCouple() {
		MyLinkedList mll = new MyLinkedList();
		final int VALUE = 12;
		final int VALUE1 = 42;

		mll.addFirst(VALUE);
		mll.addFirst(VALUE1);

		Node myHead = mll.getHead();
		assertNotNull(myHead);

		assertEquals(VALUE, VALUE1, myHead.getValue());
	}

	@Test
	public void AddLastCouple() {
		MyLinkedList mll = new MyLinkedList();
		final int VALUE = 12;
		final int VALUEa = 42;

		mll.addLast(VALUE);
		mll.addLast(VALUEa);

		Node myHead = mll.getHead();
		assertNotNull(myHead);

		assertEquals(VALUE, VALUEa, myHead.getValue());
	}
	@Test
	public void testHasEvenFalse() {
		int[] data = new int[] {1, 3, 3, 1};
		assertFalse(Problem.hasEven(data));
	}
	
	@Test
	public void isEvenTrue() {
		assertTrue(Problem.isEven(4));
	}
	
	@Test
	public void isEvenFalse() {	
		assertFalse(Problem.isEven(-9));
		
	}

}
