package alessandraB.mar13;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class ProblemTest {

	@Test
	public void testCount() {
		int[] data = {1,1,2,2,2,3,3,3,3};
		
		assertThat(Problem.count(data, 2), is (3));
	   
	}
	@Test
	public void testCount1() {
		int[] data = {1,1,2,2,2,3,3,3,3};
		
		assertThat(Problem.count(data, 4), is (0));
	   
	}
	@Test
	public void testCount2() {
		int[] data = {1,1,2,2,2,3,3,3,3};
		
		assertThat(Problem.count(data, 3), is (4));
	   
	}
	@Test
	public void testMostPopular() {
		int[] data = {1,1,2,2,2,3,3,3,3};
		
		assertEquals(Problem.mostPopular(data),(3));
	   
	}

	@Test
	public void testMostPopularSorted() {
		int[] data = {2,1,1,3,3,2,2,2,1};
		
		assertEquals(Problem.mostPopular(data),(2));
	   
	}
	@Test
	public void testMostPopularHash() {
		int[] data = {2,1,1,3,3,2,2,2,1};
		
		assertEquals(Problem.mostPopular(data),(2));
	   
	}

}
