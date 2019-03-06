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

}
