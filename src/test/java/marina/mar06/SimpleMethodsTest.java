package marina.mar06;

import static org.junit.Assert.*;

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
	public void isAlphaSimbol() {
		assertFalse(SimpleMethods.isAlpha('='));
	}

	@Test
	public void isAlphaNumber() {
		assertFalse(SimpleMethods.isAlpha('8'));
	}

	@Test
	public void isAlphaB() {
		assertTrue(SimpleMethods.isAlpha('B'));
	}

	@Test
	public void isAlphaLowerA() {
		assertTrue(SimpleMethods.isAlpha('a'));
	}

	@Test
	public void toUpperT() {
		assertThat(SimpleMethods.toUpper('T'), is('T'));
	}

	@Test
	public void toUpperLowerD() {
		assertThat(SimpleMethods.toUpper('d'), is('D'));
	}

	@Test
	public void toUpperNumber() {
		assertThat(SimpleMethods.toUpper('8'), is('8'));
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
		int[] data = { 1, 2, 3 };
		int target = 2;
		assertThat(SimpleMethods.findPos(data, target), is(1));
	}

	@Test
	public void findPosNegative() {
		int[] data = { 1, 2, 3 };
		int target = 7;
		assertThat(SimpleMethods.findPos(data, target), is(-1));
	}

	@Test
	public void isPalindromePositive() {
		assertTrue(SimpleMethods.isPalindrome("abba"));
	}

	@Test
	public void isPalindromeNegative() {
		assertFalse(SimpleMethods.isPalindrome("abac"));
	}

	@Test
	public void isPalindromeOddNegative() {
		assertFalse(SimpleMethods.isPalindrome("abc"));
	}

	@Test
	public void isPalindromeOdd2Negative() {
		assertFalse(SimpleMethods.isPalindrome("aab"));
	}

	@Test
	public void isPalindromeOddPositive() {
		assertTrue(SimpleMethods.isPalindrome("aba"));
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
		int[] data = { 1, 2, 3, 4, 5 };
		int[] reverted = SimpleMethods.reverseReturn(data);

		assertThat(reverted.length, is(data.length));
//		assertThat(reverted[0], is(data[2]));
//		assertThat(reverted[1], is(data[1]));
//		assertThat(reverted[2], is(data[0]));
		for (int i = 0; i < data.length; i++) {
			assertThat(reverted[i], is (data[data.length - 1 - i]));
		}
		

	}

}
