package federica;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import java.util.List;

import java.util.Arrays;
import org.junit.Test;

public class ProblemsTest {

	@Test
	public void testKillDuplicates() {
		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);

		List<Integer> results = Problems.killDuplicates(array);
		assertThat(results.size(), is(4));
		assertTrue(results.contains(1));
		assertTrue(results.contains(4));
		assertTrue(results.contains(5));
		assertTrue(results.contains(6));
	}

	@Test
	public void testKillDuplicatesHash() {
		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);

		List<Integer> results = Problems.killDuplicatesHash(array);
		assertThat(results.size(), is(4));
		assertTrue(results.contains(1));
		assertTrue(results.contains(4));
		assertTrue(results.contains(5));
		assertTrue(results.contains(6));
	}
	
	@Test 
	public void ifElse22() {
		String result = Problems.ifElse(22);
		assertThat(result, is("Not Weird"));
		
	}
	@Test 
	public void ifElse16() {
		String result = Problems.ifElse(16);
		assertThat(result, is("Weird"));
	}
	@Test 
	public void ifElse24() {
		String result = Problems.ifElse(24);
		assertThat(result, is("Not Weird"));
	}
	@Test 
	public void ifElse5() {
		String result = Problems.ifElse(5);
		assertThat(result, is("Weird"));
	}
	@Test 
	public void multiples() {
		int[] result = Problems.multiples(2);
		assertThat(result [0], is(2));
		assertThat(result [1], is(4));
		assertThat(result [2], is(6));
		assertThat(result [3], is(8));
		assertThat(result [4], is(10));
		assertThat(result [5], is(12));
		assertThat(result [6], is(14));
		assertThat(result [7], is(16));
		assertThat(result [8], is(18));
		assertThat(result [9], is(20));
}
	@Test
	public void testIsAnagramTrue() {
		String left = "cat";
		String right = "tac";
		assertTrue(Problems.isAnagram(left, right));
		
	}
	@Test
	public void testIsAnagramFalse() {
		String left = "cat";
		String right = "pat";
		assertFalse(Problems.isAnagram(left, right));
		
	}
}
