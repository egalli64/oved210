package elmonda.mar13;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;




public class ProblemTest {

	@Test
	public void testCount2() {
		
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.count(data, 2), is(3));
		
		
	}
	@Test
	public void testCount1() {
		
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.count(data, 1), is(2));
	
}
	@Test
	public void testCount3() {
		
		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.count(data, 3), is(2));
		
}
	@Test
	public void testCount4() {
		
		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.count(data, 4), is(0));
}
	@Test
	public void mostPopular() {
		
		int[] data = { 2, 2, 2, 1, 1 };
		assertEquals(Problem.mostPopular(data), (2)); 
		
	}
		
		

		@Test
		public void mostPopularSecond() {
			
			int[] data = {2, 2, 2, 1, 1, 3, 3, 1, 1 };  // se mi passa questo array più complicato, 1 è il vincitore e quindi mi aspetto che mi ritorni 1
			assertEquals(Problem.mostPopular(data), (1)); 
}
		@Test
		public void mostPopularSorted() {
			int[] data = {2, 2, 2, 1, 1, 3, 3, 1, 1 };
			assertEquals(Problem.mostPopular(data), (1)); 
			
		}
	
		@Test
		public void mostPopularHash() {
			int[] data = {2, 2, 2, 1, 1, 3, 3, 1, 1 };
			assertEquals(Problem.mostPopular(data), (1));
}
}