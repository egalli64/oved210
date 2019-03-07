package alessandraB.mar06;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.core.Is.*;

public class SimpleMethodsTest {

	@Test
	public void testIsUpperA() {
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
		assertTrue(SimpleMethods.isAlpha('a'));
		assertFalse(SimpleMethods.isAlpha('9'));
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
	public void firstSmallestIndexPlain() {
		int[] data = { 1, 2, 5, -7 };
		assertThat(SimpleMethods.firstSmallestIndex(data), is(3));
	}

	@Test
	public void firstSmallestIndexEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));

	}

	@Test
	public void firstSmallestIndexNull() {
		int[] data = null;
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
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
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.lastSmallestIndex(data), is(3));
	}

	@Test
	public void findPlain() {
		int[] data = { 1, 2, 3 };
		int target = 7;

		assertFalse(SimpleMethods.find(data, 7));
		assertTrue(SimpleMethods.find(data, 2));

	}

	@Test
	public void findPos() {
		int[] data = { 1, 2, 3 };
		int target = 7;

		assertThat(SimpleMethods.findPos(data, 7), is(-1));

	}

	@Test
	public void findPos2() {
		int[] data = { 1, 2, 3 };
		int target = 2;

		assertThat(SimpleMethods.findPos(data, 2), is(1));
	}

	@Test
	public void isPalindromeEvenPositive() {
		assertTrue(SimpleMethods.isPalindrome("abba"));

	}

	@Test
	public void isPalindromeEvenNegative() {
		assertFalse(SimpleMethods.isPalindrome("abab"));

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
		assertFalse(SimpleMethods.isPalindrome(""));

	}

	@Test
	public void reverseReturnePlain() {
		int[] data = { 1, 2, 3, 4, 5 };
		int[] reverted = SimpleMethods.reverseReturn(data);

		assertThat(reverted.length, is(data.length));
		for (int i = 0; i < data.length; i++) {
			assertThat(reverted[i], is(data[data.length - 1 - i]));
		}

		assertThat(reverted[0], is(data[4]));
		assertThat(reverted[1], is(data[3]));
		assertThat(reverted[2], is(data[2]));
		assertThat(reverted[3], is(data[1]));
		assertThat(reverted[4], is(data[0]));
	}

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

}
