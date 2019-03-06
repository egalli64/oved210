package claudia.mar06;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.core.Is.*;

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
		assertFalse(SimpleMethods.isUpper('6'));

	}

	@Test
	public void isAlphaA() {
		assertTrue(SimpleMethods.isAlpha('A'));
	}

	@Test
	public void isAlphaNumber() {
		assertFalse(SimpleMethods.isAlpha('8'));
	}

	@Test
	public void isAlphaBracket() {
		assertFalse(SimpleMethods.isAlpha('['));
	}

	@Test
	public void toUpperA() {
		assertThat(SimpleMethods.toUpper('A'), is('A'));
	}

	@Test
	public void toUpperLowerW() {
		assertThat(SimpleMethods.toUpper('w'), is('W'));
	}

	@Test
	public void toUpperNumber() {
		assertThat(SimpleMethods.toUpper('5'), is('5'));
	}

	@Test
	public void smallestEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));
	}

	@Test
	public void smallestNull() {
		int[] data = null;
		assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));
	}

	@Test
	public void smallestPlain() {
		int[] data = { 1, 2, 5, -7 };
		assertThat(SimpleMethods.smallest(data), is(-7));

	}

	@Test
	public void firstSmallestIndexNull() {
		int[] data = null;
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
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
	@Test
	public void findTrue() {
		int[] data = { 1, 2, 3};
		assertTrue(SimpleMethods.find(data, 2));

	}

	@Test
	public void findFalse() {
		int[] data = { 1, 2, 3};
		assertFalse(SimpleMethods.find(data, 7));

}}
