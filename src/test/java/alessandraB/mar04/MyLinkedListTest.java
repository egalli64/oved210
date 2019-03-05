package alessandraB.mar04;

import static org.junit.Assert.*; //import static mi fa accedere 

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void emptyListHasNullHead() { // testo che quando creo una lista, la head sia null
		MyLinkedList mll = new MyLinkedList();
		assertNull(mll.getHead());
		assertNull(mll.getTail());
		

	}

	@Test
	public void testAddFirstSimple() {

		final int VALUE = 12; // VALUE in maiuscolo indica una costante

		MyLinkedList mll = new MyLinkedList();

		mll.addFirst(VALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead); // sto asserendo che myhead non deve essere null

		assertEquals(VALUE, myHead.getValue());

	}

	@Test
	public void testAddLast() {
		final int VALUE = 45; // VALUE in maiuscolo indica una costante

		MyLinkedList mll = new MyLinkedList();

		mll.addLast(VALUE);

		Node myHead = mll.getHead();
		assertNotNull(myHead); // sto asserendo che myhead non deve essere null

		assertEquals(VALUE, myHead.getValue());
		
		
	}
	
	@Test
	public void testAddFirstandAddLast() {
		
		MyLinkedList mll = new MyLinkedList();
		final int VALUE = 56;
		
		
		mll.addFirst(VALUE);
		mll.addLast(VALUE);  
	
		Node myHead = mll.getHead();
		Node myTail = mll.getTail();
		
    	assertNotNull(myHead);
		assertNotNull(myTail);
		
		assertEquals(VALUE, myHead.getValue());
		assertEquals(VALUE, myTail.getValue());
		
	}

//	@Test // i test sono definiti da queste annotazioni @Test: mi indica che tutti i
			// metodi
			// presenti in questa classe sono utilizzati per fare un test (se non lo metto
			// non funzionano).
//public void testToString() {
		//fail("Not yet implemented"); // se non esistesse la import static il metodo fail dovrebbe essere
										// definito all'interno di questa classe. E' definito all'interno
										// della classe Assert. Se non avessi l'import static,
										// avrei dovuto scrivere Assert.fail("not.."). La classe Assert è quella che mi
										// permette
										// di fare le asserzioni del test.

	}


