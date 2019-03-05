package sara.mar04;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	@Test // aggiungere sempre @test
	public void emptyListHasNullHead() { // un test per verificare che la lista quando è nulla abbia la head nulla
		MyLinkedList mll = new MyLinkedList();
		assertNull(mll.getHead());
		assertNull(mll.getTail());
	}

	@Test
	public void AddFirstSimple() { // non è necessario mettere test davanti ad addfirst
		final int VALUE = 12; // COSTANTE

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
	public void AddLastSimple() {
		final int VALUE = 42;

		MyLinkedList mll = new MyLinkedList();
		mll.addLast(VALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());

	}

	@Test
	public void AddFirstandAddLast() {

		MyLinkedList mll = new MyLinkedList();
		final int VALUE = 12;
		final int VALUE2 = 42;

		mll.addFirst(VALUE);
		mll.addLast(VALUE2);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());

		Node myTail = mll.getTail();
		assertNotNull(myTail);
		assertEquals(VALUE2, myTail.getValue());

	}

	@Test
	public void AddFirstCouple() {

		MyLinkedList mll = new MyLinkedList();
		final int VALUEf = 12;
		final int VALUE1 = 3;

		mll.addFirst(VALUEf);
		mll.addFirst(VALUE1);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUEf, myHead.getValue());
		
		Node myTail = mll.getTail();
		assertNotNull(myTail);
		assertEquals(VALUE1, myTail.getValue());

	}

	@Test
	public void AddLastCouple() {

		MyLinkedList mll = new MyLinkedList();
		final int VALUE = 54;
		final int VALUE1 = 3;

		mll.addLast(VALUE);
		mll.addLast(VALUE1);

		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());
		
		Node myTail = mll.getTail();
		assertNotNull(myTail);
		assertEquals(VALUE1, myTail.getValue());
		
	}
}
