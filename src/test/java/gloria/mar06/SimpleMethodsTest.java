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

	/**
	 * Palindrome
	 */

	@Test
	public void isPalindromeEvenPositive() {
		assertTrue(SimpleMethods.isPalindrome("abba"));
	}

	@Test
	public void isPalindromeEvenNegative() {
		assertFalse(SimpleMethods.isPalindrome("abab"));
	}

	@Test
	public void isPalindromeEvenOddPositive() {
		assertTrue(SimpleMethods.isPalindrome("aba"));
	}

	@Test
	public void isPalindromeEvenOddNegative() {
		assertFalse(SimpleMethods.isPalindrome("aab"));
	}

	@Test
	public void isPalindromeEvenNull() {
		assertFalse(SimpleMethods.isPalindrome(null));
	}

	@Test
	public void isPalindromeEvenEmpty() {
		assertTrue(SimpleMethods.isPalindrome(""));
	}

	/**
	 * reverse
	 */
	@Test
	public void reverseSimple() {
		int[] data = { 1, 2, 3 };
		SimpleMethods.reverse(data);

		assertThat(data.length, is(3));
		assertThat(data[0], is(3));
		assertThat(data[1], is(2));
		assertThat(data[2], is(1));
	}

	@Test
	public void reverseNull() {
		int[] data = null;
		SimpleMethods.reverse(data);
		assertNull(data);

	}

	@Test
	public void reverseEmpty() {
		int[] data = {};
		SimpleMethods.reverse(data);
		assertThat(data.length, is(0));

	}

	@Test
	public void reverseReturnPlain() {
		int[] data = { 1, 2, 3};
		int[] reverted = SimpleMethods.reverseReturn(data);

		assertThat(reverted.length, is(data.length));
		assertThat(reverted[0], is(data[2]));
		assertThat(reverted[1], is(data[1]));
		assertThat(reverted[2], is(data[0]));
		
		assertThat(reverted.length, is(data.length));
		for (int i = 0; i < data.length; i++) {
			assertThat(reverted[i], is(data[data.length - 1 - i]));

		}

//		@Test
//		public void reverse5() {
//			int[] data = {1, 2, 3, 4, 5};
//			
//			assertThat(data.length, is(5));
//			assertThat(data[0], is(5));
//			assertThat(data[1], is(4));
//			assertThat(data[2], is(3));
//			assertThat(data[0], is(2));
//			assertThat(data[0], is(1));
//		}
	}
}
