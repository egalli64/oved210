package mariangela.mar05;

import static org.junit.Assert.*;

import java.util.HashSet;

import static org.hamcrest.core.Is.*;

import org.junit.Test;

public class ProblemTest {
	
	@Test
	public void findUnique2() {
		int [] data = new int [] { 2, 1, 1 };
		assertThat(Problem.findUnique(data), is(2));

	}
	@Test
	public void findUniqueHash() {
		int [] data = new int [] { 2, 1, 1 };
		assertThat(Problem.findUniqueHash(data), is(2));

	}
}

//	@Test
//	public void testHasEven() {
//		int [] data = new int [] { 11, 42 };
//		assertTrue(Problem.hasEven(data));
//
//	}
//
//	@Test
//	public void testHasEvenFalse() {
//		int [] data = new int [] { 11, 33 };
//		assertFalse(Problem.hasEven(data));
//
//	}
//	@Test
//	public void testIsTrue() {
//		assertTrue(Problem.isEven(4));
//	}
//	@Test
//	public void testIsFalse() {
//		assertFalse(Problem.isEven(-9));
//	}
//}
