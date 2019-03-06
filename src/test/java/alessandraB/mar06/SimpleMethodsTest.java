package alessandraB.mar06;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.core.Is.* ;

public class SimpleMethodsTest {

	@Test
	public void testIsUpperA() {
		assertTrue(SimpleMethods.isUpper('A'));

	}

	@Test

	public void isUpperLowerH() {
		assertFalse(SimpleMethods.isUpper('h'));
	}

	@Test
	public void isUpperNumber() {
		assertFalse(SimpleMethods.isUpper('7'));
	}
	
	@Test
	public void isAlpha()  {
		assertTrue(SimpleMethods.isAlpha('a'));
		assertFalse(SimpleMethods.isAlpha('9'));
	}
	
	@Test
	public void toUpperA()  {
	assertThat(SimpleMethods.toUpper('A'), is ('A'));
			
	}
	@Test
	public void toUpperLowerX() {
		assertThat(SimpleMethods.toUpper('x'), is ('X'));
	}
	
	@Test
	public void toUpperNumber()  {
		assertThat(SimpleMethods.toUpper('9'), is ('9'));
	}
	
	@Test
	public void smallestPlain() {
		int[] data = {1,2,5,-7}; 
		assertThat(SimpleMethods.smallest(data), is (-7));
	}
	

	@Test
	public void smallestNull() {
		int[] data = null; 
		assertThat(SimpleMethods.smallest(data), is (Integer.MAX_VALUE));
	}
	
	@Test
	public void smallestEmpty() {
		int[] data = {}; 
		assertThat(SimpleMethods.smallest(data), is (Integer.MAX_VALUE));
	}
	
	@Test
	public void firstSmallestIndexPlain()  {
		int[]data = {1,2,5,-7}; 
		assertThat(SimpleMethods.firstSmallestIndex(data), is (3));
	}
	@Test
	public void firstSmallestIndexEmpty()  {
		int[]data = {}; 
		assertThat(SimpleMethods.firstSmallestIndex(data), is (-1));
		
	}
	@Test
	public void firstSmallestIndexNull()  {
		int[]data = null; 
		assertThat(SimpleMethods.firstSmallestIndex(data), is (-1));
	}
	

	@Test
	public void lastSmallestIndexNull()  {
		int[]data = null; 
		assertThat(SimpleMethods.lastSmallestIndex(data), is (-1));
	}
	@Test
	public void lastSmallestIndexEmpty()  {
		int[]data = {}; 
		assertThat(SimpleMethods.lastSmallestIndex(data), is (-1));
		
	}
	
	@Test
	public void lastSmallestIndexPlain()  {
		int[]data = {-7,2,5,-7} ; 
		assertThat(SimpleMethods.lastSmallestIndex(data), is (3));
	}
	
	
	@Test
	public void findPlain() {
		int[] data = {1,2,3};
		int target = 7;
		
		assertFalse(SimpleMethods.find(data, 7));
		assertTrue(SimpleMethods.find(data, 2)); 
		
		
	}
	
	
	@Test
	public void findPos()  {
		int[] data = {1,2,3};
		int target = 7;
		
		assertThat(SimpleMethods.findPos(data, 7), is (-1));
	
	}
	@Test
	public void findPos2()  {
		int[] data = {1,2,3};
		int target = 2;
		
		assertThat(SimpleMethods.findPos(data, 2), is (1));
} }


