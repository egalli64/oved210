package sara.mar04;

import static org.junit.Assert.*;

import org.junit.Test;

import sara.mar05.Problem;

public class ProblemTest {

	@Test
	public void testHasEvenTrue() {
		int[] data = new int [] { 1, 2, 3, 4, 5, 6, 7 };
		assertTrue(Problem.hasEven(data));
	}
	
	@Test
	public void testHasEvenFalse() {
		int[] data = new int [] {1, 3, 3, 1 };
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
