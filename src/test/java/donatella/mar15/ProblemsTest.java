package donatella.mar15;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ProblemsTest {

	@Test
	public void testKillDuplicatesSort() {
		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 5);
		List<Integer> buffer = Problems.killDuplicatesSort(array);

		assertEquals(4, buffer.size());
		assertTrue(buffer.contains(1));
		assertTrue(buffer.contains(4));
		assertTrue(buffer.contains(6));
		assertTrue(buffer.contains(5));

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
	public void ifElseodd() {
		String result = Problems.ifElse(1);
		assertThat(result, is("Weird"));
	}

	@Test
	public void ifElseodd2() {
		String result = Problems.ifElse(2);
		assertThat(result, is("Not Weird"));
	}

	@Test
	public void ifElse8() {
		String result = Problems.ifElse(8);
		assertThat(result, is("Weird"));
	}

	@Test
	public void ifElse22() {
		String result = Problems.ifElse(22);
		assertThat(result, is("Not Weird"));
	}

//	@Test
//	public void ifElseZero() {
//		try {
//			Problems.ifElse(0);
//			fail("ifElse() should throw an exception ");
//		} catch (IllegalAccessError ex) {
//		}
//	}

	@Test
	public void multiples() {
		int[] results = Problems.multiples(2);
		assertThat(results.length, is(10));

		assertEquals(results[0], is(2));
		assertEquals(results[1], is(4));
		assertEquals(results[2], is(6));
		assertEquals(results[3], is(8));
		assertEquals(results[4], is(10));
		assertEquals(results[5], is(12));
		assertEquals(results[6], is(14));
		assertEquals(results[7], is(16));
		assertEquals(results[8], is(18));
		assertEquals(results[9], is(20));

	}

	@Test
	public static boolean AnagramPositive() {
		String a = "cat";
		String b = "tac";
		assertTrue(Problems.Anagram(a, b));
		return true;
	}

	@Test
	public static boolean AnagramNegative() {
		String a= "catt";
		String b="tacc";
		assertFalse(Problems.Anagram(a,b));
		return false;
	}
	@Test
	public static boolean isAnagramHashPositive() {
		String a = "cat";
		String b = "tac";
		assertTrue(Problems.Anagram(a, b));
		return true;
	}

	@Test
	public static boolean isAnagramHashNegative() {
		String a= "catt";
		String b="tacc";
		assertFalse(Problems.Anagram(a,b));
		return false;
	}
}
