package tiziana.mar05;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void isEvenTrue() {
		assertTrue(Problem.isEven(6));
	}

	@Test
	public void isEvenFalse() {
		assertFalse(Problem.isEven(1));
	}

	@Test
	public void haEvenTrue() {
		int[] data = new int[] { 1, 8, 7, 9 };
		assertTrue(Problem.hasEven(data));
	}

	@Test
	public void hasEvenFalse() {
		int[] data = new int[] { 3, 5, 7, 9 };
		assertFalse(Problem.hasEven(data));
	}

}