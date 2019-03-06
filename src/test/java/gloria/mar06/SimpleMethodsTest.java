package gloria.mar06;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class SimpleMethodsTest {
	/**
	 * ISUPPER
	 */
	@Test
	public void isUpperA() {
		assertTrue(SimpleMethods.isUpper('A')); // devo prima richiamare il nome della mia classe

	}

	@Test
	public void isUpperLowerH() {
		assertFalse(SimpleMethods.isUpper('h')); // verifico cosa succede se metto una lettera piccola
	}

	@Test // verifico se inserisco un numero
	public void isUpperNumber() {
		assertFalse(SimpleMethods.isUpper('7'));
	}

	/**
	 * ISALPHA
	 */
	@Test
	public void isAlphaAlphabeticChar() {
		assertTrue(SimpleMethods.isAlpha('A'));
	}

	@Test
	public void isAlphaAlphabetic() {
		assertTrue(SimpleMethods.isAlpha('a'));
	}

	@Test
	public void isAlphaNumber() {
		assertFalse(SimpleMethods.isAlpha('0'));
	}

	@Test
	public void isAlphaCharacter() {
		assertFalse(SimpleMethods.isAlpha(')'));
	}

	/**
	 * TOUPPER
	 */
	@Test
	public void toUpperA() {
		assertThat(SimpleMethods.toUpper('A'), is('A'));
	}

	@Test
	public void toUpperLowerA() {
		assertThat(SimpleMethods.toUpper('a'), is('A'));
	}

	@Test
	public void toUpperNumber() {
		assertThat(SimpleMethods.toUpper('7'), is('7'));
	}

	/**
	 * SMALLEST
	 */
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

	/**
	 * FirstSmallestIndex
	 */
	@Test
	public void firstsmallestIndexEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
	}

	@Test
	public void firstsmallestIndexPlain() {
		int[] data = { 1, 2, 5, -7 };
		assertThat(SimpleMethods.firstSmallestIndex(data), is(3));
	}

	@Test
	public void firstsmallestIndexNull() {
		int[] data = null;
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
	}

	@Test
	public void firstsmallestIndexDouble() {
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.firstSmallestIndex(data), is(0));
	}

	/**
	 * LastsmallestIndex
	 */

	@Test
	public void lastsmallestIndexNull() {
		int[] data = null;
		assertThat(SimpleMethods.lastSmallestIndex(data), is(-1));
	}

	@Test
	public void lastsmallestIndexEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.lastSmallestIndex(data), is(-1));
	}

	@Test
	public void lastsmallestIndexPlain() {
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.lastSmallestIndex(data), is(3));

	}

	@Test
	public void lastsmallestIndexDouble() {
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.lastSmallestIndex(data), is(3));
	}

	/**
	 * Boolean
	 */

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

	/**
	 * findPos
	 */

	@Test
	public void findPosPositive() {
		int[] data = { 1, 2, 3 };
		int target = 2;
		assertEquals(1, SimpleMethods.findPos(data, target));

	}

	@Test
	public void findPosNegative() {
		int[] data = { 1, 2, 3 };
		int target = 7;
		assertEquals(-1, SimpleMethods.findPos(data, target));
	}
}