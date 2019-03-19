package elmonda.mar15;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.*;
import org.junit.Test;



public class ProblemsTest {

	@Test
	public void killDuplicatesSort() {
		List<Integer> values = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> results = Problems.killDuplicatesSort(values);

		assertThat(results.size(), is(4));
		assertTrue(results.contains(1));
		assertTrue(results.contains(4));
		assertTrue(results.contains(5));
		assertTrue(results.contains(6));
		
		
	}

	@Test
	public void killDuplicatesHash() {
		List<Integer> values = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> results = Problems.killDuplicatesHash(values);

		assertThat(results.size(), is(4));
		assertTrue(results.contains(1));
		assertTrue(results.contains(4));
		assertTrue(results.contains(5));
		assertTrue(results.contains(6));
	}
	

	@Test
	public void ifElseOdd() {
		String result = Problems.ifElse(1);
		assertThat(result, is("Weird"));
	}
	@Test
	public void ifElse2() {
		String result = Problems.ifElse(2);
		assertThat(result, is("Not Weird"));
	}
	@Test
	public void ifElse8() {
		String result = Problems.ifElse(8);
		assertThat(result, is("Weird"));
	}
	@Test
	public void ifElse21() {
		String result = Problems.ifElse(22);
		assertThat(result, is("Not Weird"));
	}
	
	// voglio chiamare la mia if else con valore zero, se non ci fosse devo tirare un'eccezione
//	@Test
//	public void ifElseZero() {
//		try {
//			Problems.ifElse(0);
//			fail("ifElse() should throw an exception");
//		} catch(IllegalAccessError ex) {
//			//as expected
//			//System.out.println("Expected");
//		}
		
		@Test
		public void multiples() {
			int[] results = Problems.multiples(2);
			assertThat(results[0], is(2));    //in posizione zero abbiamo 1, quindi 2*1=2
			assertThat(results[1], is(4));
			assertThat(results[2], is(6));
			assertThat(results[3], is(8));
			assertThat(results[4], is(10));
			
	}
		@Test
		public void isAnagramPositive() {
			String aleft = "cat";
			String aright = "tac";
			assertTrue(Problems.isAnagram(aleft,  aright));
		}
		@Test
		public void isAnagramNegative() {
			String aleft = "catt";
			String aright = "tacc";
			assertFalse(Problems.isAnagram(aleft,  aright));
		}
		@Test
		public void isAnagramPositiveHash() {
			String aleft = "cat";
			String aright = "tac";
			assertTrue(Problems.isAnagram(aleft,  aright));
		}
		@Test
		public void isAnagramNegativeHash() {
			String aleft = "catt";
			String aright = "tacc";
			assertFalse(Problems.isAnagram(aleft,  aright));	
		
		
}
}


