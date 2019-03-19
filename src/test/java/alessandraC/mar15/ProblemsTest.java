package alessandraC.mar15;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class ProblemsTest {

	@Test
	public void killDuplicatesSort() {
		List<Integer> values = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> results = Problems.killDuplicatesSort(values);


		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> result = Problems.killDuplicatesSort(array);

		assertThat(result.size(), is(4));
		assertTrue(result.contains(1));
		assertTrue(result.contains(4));
		assertTrue(result.contains(5));
		assertTrue(result.contains(6));

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
	public void multiplesTwo() {

		int[] values = Problems.multiples(2);

		assertThat(values.length, is(10));
		assertThat(values[0], is(2));
		assertThat(values[1], is(4));
		assertThat(values[2], is(6));
		assertThat(values[3], is(8));
		assertThat(values[4], is(10));
		assertThat(values[5], is(12));
		assertThat(values[6], is(14));
		assertThat(values[7], is(16));
		assertThat(values[8], is(18));
		assertThat(values[9], is(20));

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
