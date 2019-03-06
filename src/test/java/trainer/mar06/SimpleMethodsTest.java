package trainer.mar06;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class SimpleMethodsTest {
	@Test
	public void isUpperA() {
		assertTrue(SimpleMethods.isUpper('A'));
	}

	@Test
	public void isUpperLowerH() {
		assertFalse(SimpleMethods.isUpper('h'));
	}

	@Test
	public void isUpperNumber() {
		assertFalse(SimpleMethods.isUpper('7'));
	}

	@Test
	public void isAlphaA() {
		assertTrue(SimpleMethods.isAlpha('A'));
	}

	@Test
	public void isAlphaLowerC() {
		assertTrue(SimpleMethods.isAlpha('c'));
	}

	@Test
	public void isAlphaNumber() {
		assertFalse(SimpleMethods.isAlpha('7'));
	}

	@Test
	public void isAlphaBracket() {
		assertFalse(SimpleMethods.isAlpha('{'));
	}

	@Test
	public void toUpperA() {
		assertThat(SimpleMethods.toUpper('A'), is('A'));
	}

	@Test
	public void toUpperLowerX() {
		assertThat(SimpleMethods.toUpper('x'), is('X'));
	}

	@Test
	public void toUpperNumber() {
		assertThat(SimpleMethods.toUpper('9'), is('9'));
	}

	@Test
	public void smallestPlain() {
		int[] data = { 1, 2, 5, -7 };
		assertThat(SimpleMethods.smallest(data), is(-7));
	}

	@Test
	public void smallestNull() {
		int[] data = null;
		assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));
	}

	@Test
	public void smallestEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));
	}

	@Test
	public void firstSmallestIndexNull() {
		int[] data = null;
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
	}

	@Test
	public void firstSmallestIndexEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
	}

	@Test
	public void firstSmallestIndexPlain() {
		int[] data = { 1, 2, 5, -7 };
		assertThat(SimpleMethods.firstSmallestIndex(data), is(3));
	}

	@Test
	public void firstSmallestIndexDouble() {
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.firstSmallestIndex(data), is(0));
	}

	@Test
	public void lastSmallestIndexNull() {
		int[] data = null;
		assertThat(SimpleMethods.lastSmallestIndex(data), is(-1));
	}

	@Test
	public void lastSmallestIndexEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.lastSmallestIndex(data), is(-1));
	}

	@Test
	public void lastSmallestIndexPlain() {
		int[] data = { 1, 2, 5, -7 };
		assertThat(SimpleMethods.lastSmallestIndex(data), is(3));
	}
	
	@Test
	public void lastSmallestIndexDouble() {
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.lastSmallestIndex(data), is(3));
	}

}
