package monica.settimana2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void findUniqueSort() {
		assertEquals(2, Problem.findUniqueSort(new int[] {2,1,1}));
	}

	@Test
	public void findUniqueB() {
		assertEquals(42, Problem.findUniqueSort(new int[] {-1027,12,-1027,12,42}));
	}
	
	@Test
	public void isEvenTrue() {
		assertTrue (Problem.isEven(4));
	
	}


	

	
	
	
}
