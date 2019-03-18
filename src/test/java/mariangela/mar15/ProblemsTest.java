package mariangela.mar15;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import mariangela.mar07.ArrayProblems;

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
	public void ifElse3() {
		String result = Problems.ifElse(3);
		assertThat(result, is("Weird"));

	}

	@Test
	public void ifElse22() {
		String result = Problems.ifElse(22);
		assertThat(result, is("Not Weird"));

	}

	@Test
	public void ifElse2to5() {
		String result = Problems.ifElse(2);
		assertThat(result, is("Not Weird"));

	}

	@Test
	public void ifElse6to20() {
		String result = Problems.ifElse(6);
		assertThat(result, is("Weird"));

	}

	@Test
	public void multiples() {
		int [] results = Problems.multiples(2);
		assertThat (results[0], is(2));
		assertThat (results[1], is(4));
		assertThat (results[2], is(6));
		assertThat (results[3], is(8));
		assertThat (results[4], is(10));
		assertThat (results[5], is(12));
		assertThat (results[6], is(14));
		assertThat (results[7], is(16));
		assertThat (results[8], is(18));
		assertThat (results[9], is(20));
	}
	
	@Test
	public void isAnagramPositive() {
		assertTrue(Problems.isAnagram("cat", "tac"));
	}

	@Test
	public void isAnagramNegative() {
		assertFalse(Problems.isAnagram("catt", "tacc"));
	}

	@Test
	public void isAnagramHashPositive() {
		assertTrue(Problems.isAnagramHash("cat", "tac"));
	}

	@Test
	public void isAnagramHashNegative() {
		assertFalse(Problems.isAnagramHash("catt", "tacc"));
	}
}
