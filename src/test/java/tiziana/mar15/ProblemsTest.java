package tiziana.mar15;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ProblemsTest {

	@Test
	public void testkillDuplicates() {
		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> result = Problems.killDuplicates(array);

		assertThat(result.size(), is(4));
		assertThat(result.get(0), is(1));
		assertThat(result.get(1), is(4));
		assertThat(result.get(2), is(5));
		assertThat(result.get(3), is(6));

	}

	@Test
	public void testkillDuplicatesHash() {
		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> result = Problems.killDuplicatesHash(array);

		assertThat(result.size(), is(4));
		assertThat(result.get(0), is(1));
		assertThat(result.get(1), is(4));
		assertThat(result.get(2), is(5));
		assertThat(result.get(3), is(6));

	}

	@Test
	public void testIfElseOdd() {
		assertThat(Problems.ifElse(1), is("Weird"));
	}

	@Test
	public void testIfElseEven4() {
		assertThat(Problems.ifElse(4), is("Not weird"));
	}

	@Test
	public void testIfElseEven8() {
		assertThat(Problems.ifElse(8), is("Weird"));
	}

	@Test
	public void testIfElseEven24() {
		assertThat(Problems.ifElse(24), is("Not weird"));
	}

	@Test
	public void testMultiples2() {
		int[] results = Problems.multiples(2);

		assertThat(results[0], is(2));
		assertThat(results[1], is(4));
		assertThat(results[2], is(6));
		assertThat(results[3], is(8));
		assertThat(results[4], is(10));
		assertThat(results[5], is(12));
		assertThat(results[6], is(14));
		assertThat(results[7], is(16));
		assertThat(results[8], is(18));
		assertThat(results[9], is(20));

	}

	@Test
	public void testMultiples5() {
		int[] results = Problems.multiples(5);

		assertThat(results[0], is(5));
		assertThat(results[1], is(10));
		assertThat(results[2], is(15));
		assertThat(results[3], is(20));
		assertThat(results[4], is(25));
		assertThat(results[5], is(30));
		assertThat(results[6], is(35));
		assertThat(results[7], is(40));
		assertThat(results[8], is(45));
		assertThat(results[9], is(50));

	}

	@Test
	public void testisAnagramTrue() {
		String left = "cat";
		String right = "tac";
		assertTrue(Problems.isAnagram(left, right));

	}

	@Test
	public void testisAnagramFalse() {
		String left = "catt";
		String right = "tacc";
		assertFalse(Problems.isAnagram(left, right));
	}
}
