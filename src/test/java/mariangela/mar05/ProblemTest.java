package mariangela.mar05;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testHasEvenTrue() {
		int [] data = new int [] { 11, 42 };
		assertTrue(Problem.hasEvenTrue(data));
	}
	@Test
	public void testHasEvenFalse() {
		int [] data = new int [] { 11, 42 };
		assertFalse(Problem.hasEvenFalse(data));
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
