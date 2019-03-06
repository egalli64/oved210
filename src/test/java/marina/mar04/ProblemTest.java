package marina.mar04;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void isEvenTrue() {
		assertTrue(Problem.isEven(4));
	}
	
	@Test
	public void isEvenFalse() {
		assertFalse(Problem.isEven(-9));
	}
	
	
	@Test
	public void testHasEvenFalse() {
		int[] data = new int [] { 1, 3, 3, 1};
		assertFalse(Problem.hasEven(data));
	}
	
	@Test
	public void testHasEvenTrue() {
		int[] data = new int [] { 1, 3, 4, 1};
		assertTrue(Problem.hasEven(data));
	}
	
	
}
