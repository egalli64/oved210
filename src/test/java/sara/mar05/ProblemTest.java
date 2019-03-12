package sara.mar05;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void findUniquePlain() {
		int[] data = new int [] {2, 1, 1};
		assertEquals(2, Problem.findUniqueN2(data));	
	}
	
	
	

}
