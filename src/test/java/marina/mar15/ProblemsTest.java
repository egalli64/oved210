package marina.mar15;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class ProblemsTest {

	@Test
	public void testKillDuplicates() {

		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> result = Problems.killDuplicates(array);
		assertThat(result.size(), is(4));
		assertThat(result.get(0), is(1));
		assertThat(result.get(1), is(4));
		assertThat(result.get(2), is(5));
		assertThat(result.get(3), is(6));
	}

	@Test
	public void testKillDuplicatesEmpty() {
		List<Integer> array = Arrays.asList();
		try {
			Problems.killDuplicates(array);
			fail("ifElse() should throw an exception");
		} catch (IllegalArgumentException ex) {
			// as expected
		}
	}

	@Test
	public void testKillDuplicatesHash() {

		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> result = Problems.killDuplicatesHash(array);
		assertThat(result.size(), is(4));
		assertThat(result.get(0), is(1));
		assertThat(result.get(1), is(4));
		assertThat(result.get(2), is(5));
		assertThat(result.get(3), is(6));
	}

	@Test
	public void testKillDuplicatesHashEmpty() {
		List<Integer> array = Arrays.asList();
		List<Integer> result = Problems.killDuplicatesHash(array);
		assertThat(result.size(), is(0));
	}

	@Test
	public void testifElseOdd() {

		assertThat(Problems.ifElse(1), is("Weird"));
	}

	@Test
	public void testifElseEven20() {

		assertThat(Problems.ifElse(20), is("Weird"));
	}

	@Test
	public void testifElseEven() {

		assertThat(Problems.ifElse(2), is("Not Weird"));
	}

	@Test
	public void testifElse0() {

		try {
			Problems.ifElse(0);
			fail("ifElse() should throw an exception");
		} catch (IllegalAccessError ex) {
			// as expected
		}
	}

	@Test
	public void testMultiplesTwo() {

		int[] results = Problems.multiples(2);
		assertThat(results.length, is(10));
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
	public void testMultiplesThree() {

		int[] results = Problems.multiples(3);
		assertThat(results.length, is(10));
		assertThat(results[0], is(3));
		assertThat(results[1], is(6));
		assertThat(results[2], is(9));
		assertThat(results[3], is(12));
		assertThat(results[4], is(15));
		assertThat(results[5], is(18));
		assertThat(results[6], is(21));
		assertThat(results[7], is(24));
		assertThat(results[8], is(27));
		assertThat(results[9], is(30));

	}

	@Test
	public void testisAnagram() {
		String right = "cat";
		String left = "tac";
		assertTrue(Problems.isAnagram(right, left));

	}

	@Test
	public void testisAnagram2() {
		String right = "cat";
		String left = "act";
		assertTrue(Problems.isAnagram(right, left));

	}

	@Test
	public void testisAnagram3() {
		String right = "catt";
		String left = "tacc";
		assertFalse(Problems.isAnagram(right, left));
	}

	@Test
	public void testisAnagramEmpty() {
		String right = "";
		String left = "";
		assertFalse(Problems.isAnagram(right, left));

	}

}
