package claudia.mar05;

import static org.junit.Assert.*;

import org.junit.Test;
public class ProblemTest {

	@Test
	public void findUniqueA() {
		assertEquals(2, Problem.findUnique(new int[] {2,1,1}));
	}

	@Test
	public void findUniqueB() {
		assertEquals(42, Problem.findUnique(new int[] {-1027,12,-1027,12,42}));
	}
	
	@Test
	public void isEvenTrue() {
		assertTrue (Problem.isEven(4));
	}
	@Test
	public void findUniqueHash() {
		assertEquals(2, Problem.findUniqueHash(new int[] {2,1,1}));
	}
	@Test
	public void findUniqueHash2() {
		assertEquals(42, Problem.findUniqueHash(new int[] {-1027,12,-1027,12,42}));
	}
}
