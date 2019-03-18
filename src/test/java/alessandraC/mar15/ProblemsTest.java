package alessandraC.mar15;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		List<Integer> results = Problems.killDuplicateHash(values);

		assertThat(results.size(), is(4));
		assertTrue(results.contains(1));
		assertTrue(results.contains(4));
		assertTrue(results.contains(5));
		assertTrue(results.contains(6));
	}


	@Test
	public void IfElseOdd() {
		assertThat(Problems.ifElse(3), is("Weird"));

	}

	@Test
	public void IfElseEven6() {
		assertThat(Problems.ifElse(6), is("Weird"));
	}

	@Test
	public void IfElseEven2() {
		assertThat(Problems.ifElse(2), is("Not weird"));

	}

	@Test
	public void ifElseEven22() {
		assertThat(Problems.ifElse(22), is("Not weird"));
	
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