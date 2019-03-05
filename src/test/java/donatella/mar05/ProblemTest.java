package donatella.mar05;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testIsEven() {
		int[] data=new int[] {1,2,3,4,3,2,1};
		assertTrue(Problem.isEven(4));
	}
		@Test
		public void hasEven() {
		
		
	}
		
    @Test
    public void isEvenTrue() {
	assertTrue(Problem.isEven(4));
	
}
      @Test
      public void isEvenfalse() {
	  assertFalse(Problem.isEven(-9));
}
}
