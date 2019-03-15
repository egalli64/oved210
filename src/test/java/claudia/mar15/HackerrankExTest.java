package claudia.mar15;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class HackerrankExTest {

	@Test
	public void ifElseOdd() {
		String result = HackerrankEx.ifElse(1);
		assertThat(result, is("Weird"));
	}

	@Test
	public void ifElse2() {
		String result = HackerrankEx.ifElse(2);
		assertThat(result, is("Not Weird"));
	}

	@Test
	public void ifElse8() {
		String result = HackerrankEx.ifElse(8);
		assertThat(result, is("Weird"));
	}

	@Test
	public void ifElse22() {
		String result = HackerrankEx.ifElse(22);
		assertThat(result, is("Not Weird"));
	}

	@Test
	public void ifElseZero() {
		try {
			HackerrankEx.ifElse(0);
			fail("ifElse() should throw an exception");
		} catch (IllegalAccessError ex) {

		}
	}
	@Test
	public void multiples2() {
		int [] values = HackerrankEx.multiples(2);
		
		assertThat(values.length, is(10));
		assertThat(values[1], is(4));
		assertThat(values[2], is(6));
		assertThat(values[3], is(8));
		assertThat(values[4], is(10));
		assertThat(values[5], is(12));
	}
	@Test
	public void isAnagram1() {
		assertTrue(HackerrankEx.isAnagram("cat", "act"));
	}
	@Test
	public void isAnagram2() {
		assertTrue(HackerrankEx.isAnagram("cat", "tac"));
}
	@Test
	public void isAnagram3() {
		assertFalse(HackerrankEx.isAnagram("cat", "tcc"));
}}
