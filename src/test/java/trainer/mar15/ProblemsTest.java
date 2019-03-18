package trainer.mar15;

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
	public void ifElseZero() {
		try {
			Problems.ifElse(0);
			fail("ifElse() should throw an exception");
		} catch (IllegalAccessError ex) {
			// as expected
		}
	}

	@Test
	public void multiples2() {
		int[] results = Problems.multiples(2);
		assertThat(results.length, is(10));
		for (int i = 0; i < 10; i++) {
			assertThat(results[i], is(2 * (i + 1)));
		}
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
