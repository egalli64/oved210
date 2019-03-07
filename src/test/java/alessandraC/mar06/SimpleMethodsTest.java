package alessandraC.mar06;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import org.junit.Test;

public class SimpleMethodsTest {

	@Test
	public void IsUpperA() {
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
	public void isAlpha() {
		assertTrue(SimpleMethods.isAlpha('A'));
	}

	@Test
	public void isAlphaLowerC() {
		assertTrue(SimpleMethods.isAlpha('c'));
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
		assertThat(SimpleMethods.toUpper('X'), is('x'));
	}

	@Test
	public void toUpperNumber() {
		assertThat(SimpleMethods.toUpper('1'), is('1'));

	}

	@Test
	public void SmallestPlain() {
		int[] data = { 1, 2, 5, -7 };
		assertThat(SimpleMethods.smallest(data), is(-7));

	}

	@Test
	public void SmallestNull() {
		int[] data = null;
		assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));
	}

	@Test
	public void SmallestEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));
	}

	@Test
	public void SmallestIndexPlain() {
		int[] data = { 1, 2, 5, -7 };
		assertThat(SimpleMethods.smallest(data), is(3));

	}

	@Test
	public void SmallestIndexNull() {
		int[] data = null;
		assertThat(SimpleMethods.smallest(data), is(-1));
	}

	@Test
	public void SmallestIndexEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.smallest(data), is(-1));
	}

	@Test
	public void findPositive() {
		int[] data = { 1, 2, 3 };
		int target = 2;
		assertTrue(SimpleMethods.find(data, target));
	}

	@Test
	public void findNegative() {
		int[] data = { 1, 2, 3 };
		int target = 7;
		assertFalse(SimpleMethods.find(data, target));
	}
	@Test
	public void findPosPositive() {
		int [] data = {1, 2, 3};
		int target = 2;
		assertEquals(1, SimpleMethods.findPos(data, target));
	}

}
