package alessandraB.mar05;

import static org.junit.Assert.*;

import org.junit.Test;

import alessandraB.mar06.SimpleMethods;

public class ProblemTest {

	@Test
	public void testisEven() {
		
		int[] data = new int [] {1,2,3,4,3,2,1};
		assertTrue(Problem.isEven(4));
		
	}

	
	@Test
	public void testhasEven() {
		int [] data = new int [] {1,2,3,4,3,2,1};
		assertTrue(Problem.isEven(2));
	}
	
}
