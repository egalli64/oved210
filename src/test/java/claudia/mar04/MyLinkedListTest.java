package claudia.mar04;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	
	@Test
	public void emptyList() {
		MyLinkedList mll = new MyLinkedList();
		assertNull(mll.getHead());
		
	}
	

	@Test
	public void addFirstOne() {
		final int VALUE = 12;
		MyLinkedList mll = new MyLinkedList();
		mll.addFirst(VALUE);
		
		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());
	}

	@Test
	public void addLastOne() {
		final int VALUE = 42;
		MyLinkedList mll = new MyLinkedList();
		mll.addLast(VALUE);
		
		Node myHead = mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());
		
		
	}
	
	

}
