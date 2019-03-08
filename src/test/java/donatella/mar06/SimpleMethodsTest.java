package donatella.mar06;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class SimpleMethodsTest {

	@Test
	public void IsUpperA() {
		assertTrue(SimpleMethods.IsUpper('A'));
	}

	@Test
	public void IsUpperLowerH() {
		assertFalse(SimpleMethods.IsUpper('h'));
	}

	@Test
	public void IsUpperNumber() {
		assertFalse(SimpleMethods.IsUpper('7'));
	}

	@Test
	public void IsAlpha() {
		assertTrue(SimpleMethods.isAlpha('a'));
		assertFalse(SimpleMethods.isAlpha('9'));
	}

	@Test
	public void toUpper() {
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
		int[] data = {};
		assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));
	}

	@Test
	public void smallestEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));
	}

	@Test

	public void firstSmallerIndexNulla() {
		int[] data = {};
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));

	}

	@Test
	public void FirstIndexEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
	}

	@Test
	public void FirstIndexPlain() {
		int[] data = { 1, 2, 5, -7 };
		assertThat(SimpleMethods.firstSmallestIndex(data), is(3));
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

	@Test
	public void findPlain() {
		int[] data = { 1, 2, 3 };
		assertTrue(SimpleMethods.find(data, 2));
		assertFalse(SimpleMethods.find(data, 7));

	}

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

	@Test
	public void isPalindromeEvenPositive() {
		assertTrue(SimpleMethods.isPalindrome("abba"));
	}

	@Test
	public void isPalindromenegative() {
		assertFalse(SimpleMethods.isPalindrome("abac"));
	}

	@Test
	public void isPalindromeOddPositive() {
		assertTrue(SimpleMethods.isPalindrome("aba"));
	}

	@Test
	public void isPalindromeOddNegative() {
		assertFalse(SimpleMethods.isPalindrome("aab"));

	}

	@Test
	public void isPalindromeNull() {
		assertFalse(SimpleMethods.isPalindrome(null));
	}

	@Test
	public void isPalindromeEmpty() {
		assertTrue(SimpleMethods.isPalindrome(""));

	}


	@Test
	public void reverseSimple() {
		int[] data = { 1, 2, 3, 4, 5 };
		SimpleMethods.reverse(data);

		assertThat(data.length, is(5));
		assertThat(data[0], is(5));
		assertThat(data[1], is(4));
		assertThat(data[2], is(3));
		assertThat(data[3], is(2));
		assertThat(data[4], is(1));
	}

	@Test
	public void reverseNull() {
		int[] data = null;
		SimpleMethods.reverse(data);
		assertNull(data);
	}

	@Test
	public void reverseReturnPlain() {
		int[] data = { 1, 2, 3, 4, 5 };
		int[] reverted = SimpleMethods.reverseReturn(data);

		assertThat(reverted.length, is(data.length));
	
//		for (int i = 0; i < data.length; i++) {
//			assertThat(reverted[i], is(data.length - 1 - i));
//		}

		assertThat(reverted[0], is(data[4]));
		assertThat(reverted[1], is(data[3]));
		assertThat(reverted[2], is(data[2]));
		assertThat(reverted[3], is(data[1]));
		assertThat(reverted[4], is(data[0]));
	}

}