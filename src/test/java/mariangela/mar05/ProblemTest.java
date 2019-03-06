package mariangela.mar05;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testHasEven() {
		int [] data = new int [] { 11, 42 };
		assertTrue(Problem.hasEven(data));

	}

	@Test
	public void testHasEvenFalse() {
		int [] data = new int [] { 11, 33 };
		assertFalse(Problem.hasEven(data));

	}
	@Test
	public void testIsTrue() {
		assertTrue(Problem.isEven(4));
	}
	@Test
	public void testIsFalse() {
		assertFalse(Problem.isEven(-9));
	}
}
