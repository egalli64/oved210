package monica.settimana2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTestTest {

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
}
