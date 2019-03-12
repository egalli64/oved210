package sara.mar05;

import static org.junit.Assert.*;


import org.junit.Test;

public class ProblemTest {

	@Test
	public void findUniquePlain() {
		int[] data = new int [] {2, 1, 1};
		assertEquals(2, Problem.findUniqueN2(data));	
	}
	
	@Test
	public void findUniqueSort() {
		int[] data = new int [] {2, 1, 1};
		assertEquals(2, Problem.findUniqueSort(data));	
	}
	
	
//	@Test
//	public void findBiggerPlain() {
//		int[] data = new int [] {2, 1, 1};
//		assertEquals(2, Problem.findBigger(data));	
//	}
//	@Test
//	public void testHasEven() {
//		int[] data = new int [] {2, 1, 1};
//		assertTrue(Problem.hasEven(data));	
//	}
//	@Test
//	public void testHasEvenFalse() {
//		int[] data = new int [] {2, 1, 1};
//		assertFalse(Problem.hasEven(data));	
//	}
//	@Test
//	public void isEvenTrue() {
//		assertTrue(Problem.isEven(2));	
//	}
//	@Test
//	public void isEvenFalse() {
//		assertFalse(Problem.isEven(-1));	
//	}
	
	@Test
	public void findUniqueHash() {
		int[] data = new int [] {2, 1, 1};
		assertEquals(2, Problem.findUniqueHash(data));	
	}
	

}
