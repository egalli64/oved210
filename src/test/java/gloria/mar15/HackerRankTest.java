package gloria.mar15;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class HackerRankTest {

	@Test
	public void ifElseOdd() {
		String result = HackerRank.ifElse(1);
		assertThat(result, is("Weird"));
	}

	@Test
	public void ifElseFirst() {
		String result = HackerRank.ifElse(2);
		assertThat(result, is("Not Weird"));
	}

	@Test
	public void ifElseSecond() {
		String result = HackerRank.ifElse(8);
		assertThat(result, is("Weird"));
	}

	@Test
	public void ifElseThird() {
		String result = HackerRank.ifElse(26);
		assertThat(result, is("Not Weird"));
	}

	@Test
	public void ifElseZero() {
		try {
			HackerRank.ifElse(0);
			fail("ifElse()should throw an exception");
		} catch (IllegalAccessError ex) {

		}
	}

	@Test
	public void multiples() {
		int[] results = HackerRank.multiples(2);
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
	public void isAnagram() {
		String a = "cat";
		String b = "tac";

		assertTrue(HackerRank.isAnagram(a, b));

	}

	@Test
	public void isAnagramNot() {
		String a = "catt";
		String b = "tacc";
		assertFalse(HackerRank.isAnagram(a, b));
	}
}
