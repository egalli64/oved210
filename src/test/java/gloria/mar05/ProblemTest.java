package gloria.mar05;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void findUniquePlain() {
		int[] data = new int[] { 1, 2, 3, 4, 3, 2, 1 };
		assertEquals(4, Problem.findUnique(data));
	}

//	@Test
//	public void findBiggerPlain() {
//		int[] data = new int[] { 1, 2, 3, 4, 3, 2, 1 };
//		assertEquals(4, Problem.findBigger(data));
//	}
	
	@Test
	public void hasEven () {
		int[] data = new int []  { 1, 2, 3, 4, 3, 2, 1 };
		assertTrue(Problem.hasEven(data));
	}
	
	@Test
	public void hasEvenFalse () {
		int [] data = new int [] {1, 3, 3, 1};
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
	
	@Test
	public void findUniqueHash() {
		int [] data = new int [] {1, 2, 3, 4, 3, 2, 1 };
		assertEquals(4, Problem.findUniqueHash(data));
	}
}
