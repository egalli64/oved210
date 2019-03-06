package mariangela.mar06;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.junit.Test;
import static org.hamcrest.core.Is.*;

public class SimpleMethodsTest {

	@Test
	public void IsUpperA() {
		assertTrue(SimpleMethods.isUpper('A'));

	}

	@Test
	public void IsUpperLowerH() {
		assertFalse(SimpleMethods.isUpper('h'));
	}

	@Test
	public void IsUpperNumber() {
		assertFalse(SimpleMethods.isUpper('7'));
	}

	@Test
	public void IsAlphaA() {
		assertTrue(SimpleMethods.isAlpha('A'));
	}

	@Test
	public void IsAlphaLowerA() {
		assertTrue(SimpleMethods.isAlpha('a'));
	}

	@Test
	public void IsAlphaNumber() {
		assertFalse(SimpleMethods.isAlpha('6'));
	}

	@Test
	public void IsAlphaBracket() {
		assertFalse(SimpleMethods.isAlpha('}'));
	}

	@Test
	public void toUpperA() {
		assertThat(SimpleMethods.toUpper('A'), is('A'));
	}

	@Test
	public void toUpperLowerA() {
		assertThat(SimpleMethods.toUpper('m'), is('M'));
	}

	@Test
	public void toUpperBracket() {
		assertThat(SimpleMethods.toUpper('}'), is('}'));
	}

	@Test
	public void toUpperNumber() {
		assertThat(SimpleMethods.toUpper('9'), is('9'));

	}
	@Test
	public void smallestPlain() {
		int[] data = { 1, 2, 5, -7};
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