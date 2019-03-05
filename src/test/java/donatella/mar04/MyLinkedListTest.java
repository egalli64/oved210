package donatella.mar04;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {
	
	@Test
	public void emptyListHasNullHead() {
		MyLinkedList mll= new MyLinkedList();
		assertNull(mll.getHead());
		assertNull(mll.getTail());
		
	}

	@Test
	public void addFirstSimple() {
		final int VALUE=12;
		
		MyLinkedList mll= new MyLinkedList();
		assertNull(mll.getHead());
		
		mll.addFirst(VALUE);
		
		Node myHead=mll.getHead();
		assertNotNull(myHead);
		
		assertEquals(VALUE, myHead.getValue());
		
		}

	@Test
	public void addLastSimple() {
    final int VALUE=42;
		
		MyLinkedList mll= new MyLinkedList();
		assertNull(mll.getHead());
		
		mll.addLast(VALUE);
		
		Node myHead=mll.getHead();
		assertNotNull(myHead);
		
		assertEquals(VALUE, myHead.getValue());
		
		}
	
    @Test
      public void addMix() {
	  final int VALUE=24;
	  final int VALUE2=30;
	  MyLinkedList mll= new MyLinkedList();
	  
	  mll.addFirst(VALUE);
	  mll.addLast(VALUE2);
	  
	  Node myHead=mll.getHead();
		assertNotNull(myHead);
		assertEquals(VALUE, myHead.getValue());
		
		 Node myTail=mll.getTail();
			assertNotNull(myTail);
			assertEquals(VALUE2, myTail.getValue());
	 
			Node myHeadNext= myHead.getNext();
			assertNotNull(myHeadNext);
			assertEquals(VALUE2, myHeadNext.getValue());
  }
  
   
 
	   
	   
   
		
		}
	   

	

