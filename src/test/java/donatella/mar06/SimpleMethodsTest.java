package donatella.mar06;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import org.junit.Test;



public class SimpleMethodsTest {

	@Test
	public void IsUpperA() {
		assertTrue(SimpleMethods.IsUpper('A'));
	}
		@Test
		public void IsUpperLowerH() {
			assertFalse(SimpleMethods.IsUpper('h'));
	}
		@Test
		public void IsUpperNumber() {
			assertFalse(SimpleMethods.IsUpper('7'));
	}
       @Test
      public void IsAlpha() {
	  assertTrue(SimpleMethods.isAlpha('a'));
	  assertFalse(SimpleMethods.isAlpha('9'));
}
		@Test 
		public void toUpper() {
		assertThat(SimpleMethods.toUpper('A'), is('A'));
}		
		
		@Test 
		public void toUpperLowerX() {
		assertThat(SimpleMethods.toUpper('x'), is('X'));
}		

		@Test 
		public void toUpperNumber() {
		assertThat(SimpleMethods.toUpper('9'), is('9'));
}		
              @Test
              public void smallestPlain() {
	          int[]data= {1,2,5,-7};
	           assertThat(SimpleMethods.smallest(data), is(-7));
	  
 }
              
               @Test 
               public void smallestNull() {
	            int[]data= {};
	            assertThat(SimpleMethods.smallest(data),is(Integer.MAX_VALUE));
               }
	
	 
               @Test
	           public void smallestEmpty() {
		       int[]data= {};
		       assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));
	 }
	 
	 
	            @Test
	 
	            public void firstSmallerIndexNulla() {
		        int[] data={};
		        assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
		 
	 }
	            @Test
	            public void FirstIndexEmpty() {
	            	int[] data= {};
	            	assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
	            }
	            
	            @Test
	            public void FirstIndexPlain() {
	            	int[] data= {1,2,5,-7};
	            	assertThat(SimpleMethods.firstSmallestIndex(data), is(3));
	            }
	        	
	            @Test
	        	public void lastSmallestIndexNull() {
	        		int[] data = null;
	        		assertThat(SimpleMethods.lastSmallestIndex(data), is(-1));
	        	}

	        	@Test
	        	public void lastSmallestIndexEmpty() {
	        		int[] data = {};
	        		assertThat(SimpleMethods.lastSmallestIndex(data), is(-1));
	        	}

	        	@Test
	        	public void lastSmallestIndexPlain() {
	        		int[] data = { 1, 2, 5, -7 };
	        		assertThat(SimpleMethods.lastSmallestIndex(data), is(3));
	        	}
	        	
	        	@Test
	        	public void lastSmallestIndexDouble() {
	        		int[] data = { -7, 2, 5, -7 };
	        		assertThat(SimpleMethods.lastSmallestIndex(data), is(3));
	        	}

	        @Test
	        public void findPlain() {
	        	int[] data = {1,2,3};
	        	assertTrue(SimpleMethods.find(data,2));
	        	assertFalse(SimpleMethods.find(data,7));
	 
	        }
		
		@Test
		public void findPost1() {
			int[] data= {1,2,3};
				int target=7;
				assertThat(SimpleMethods.findPost(data), is(-1));
		
		
		}
			
         @Test
		public void findPost() {
			int[] data= {1,2,3};
				int target=2;
				assertThat(SimpleMethods.findPost(data), is(1));
		
	         

}}






