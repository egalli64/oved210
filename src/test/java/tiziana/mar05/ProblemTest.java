package tiziana.mar05;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void findUniqueN2Begin() {
		int[] data = new int[] { 2, 1, 1 };
		assertEquals(2, Problem.findUniqueN2(data));
	}

	@Test

	public void findUniqueSort() {
		int[] data = new int[] { 1, 2, 3, 4, 3, 2, 1 };
		assertEquals(4, Problem.findUniqueSort(data));

	}

	@Test

	public void findUniqueN2Middle() {
		int[] data = new int[] { 1, 2, 3, 4, 3, 2, 1 };
		assertEquals(4, Problem.findUniqueN2(data));
	}

	@Test
	public void findUniqueSortBegin() {
		int[] data = new int[] { 2, 1, 1 };
		assertEquals(2, Problem.findUniqueSort(data));
	}

	@Test
	public void findUniqueSortMiddle() {
		int[] data = new int[] { 1, 2, 3, 4, 3, 2, 1 };
		assertEquals(4, Problem.findUniqueSort(data));
	}

	@Test
	public void findUniqueSortSmallest() {
		int[] data = new int[] { 1, 2, 3, 4, 3, 2, 4 };
		assertEquals(1, Problem.findUniqueSort(data));
	}

	@Test
	public void findUniqueHashSmallest() {
		int[] data = new int[] { 1, 2, 3, 4, 3, 2, 4 };
		assertEquals(1, Problem.findUniqueHash(data));
	}

	@Test
	public void findUniqueHashBegin() {
		int[] data = new int[] { 2, 1, 1 };
		assertEquals(2, Problem.findUniqueHash(data));
	}

	@Test
	public void findUniqueHashMiddle() {
		int[] data = new int[] { 1, 2, 3, 4, 3, 2, 1 };
		assertEquals(4, Problem.findUniqueHash(data));
	}

	@Test
	public void findBiggerPlain() {
		int[] data = new int[] { 1, 2, 3, 4, 3, 2, 1 };
		assertEquals(4, Problem.findBigger(data));
	}

	@Test
	public void testHasEven() {
		int[] data = new int[] { 1, 2, 3, 4, 3, 2, 1 };
		assertTrue(Problem.hasEven(data));
	}

	@Test
	public void testHasEvenFalse() {
		int[] data = new int[] { 1, 3, 3, 1 };
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