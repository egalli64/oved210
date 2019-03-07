package alessandraC.mar04;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testFindUnique() {
		
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
