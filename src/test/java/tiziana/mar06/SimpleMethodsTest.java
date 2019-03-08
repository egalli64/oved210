package tiziana.mar06;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;

public class SimpleMethodsTest {

	@Test
	public void testIsUpper() {
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
	public void testisAlphabetic() {
		assertTrue(SimpleMethods.isAlphabetic('A'));
	}

	@Test
	public void testisAlphabetic1() {
		assertTrue(SimpleMethods.isAlphabetic('c'));
	}

	@Test
	public void isAlphabeticNumber1() {
		assertFalse(SimpleMethods.isAlphabetic('5'));
	}

	@Test
	public void toUpperB() {
		assertThat(SimpleMethods.toUpper('B'), is('B'));

	}

	@Test
	public void toUpperF() {
		assertThat(SimpleMethods.toUpper('f'), is('F'));

	}

	@Test
	public void toUpperNumber9() {
		assertThat(SimpleMethods.toUpper('9'), is('9'));
	}

	@Test
	public void smallestPlain() {
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.smallest(data), is(-7));

	}

	@Test
	public void smallestNull() {
		int[] data = null;
		assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));
	}

	@Test
	public void smallestEmpty() {
		int[] data = null;
		assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));
	}

	@Test
	public void firstSmallestIndexNull() {
		int[] data = null;
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
	}

	@Test
	public void firstSmallestIndexPlain() {
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.firstSmallestIndex(data), is(0));

	}

	@Test
	public void firstSmallestIndexEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
	}

	@Test
	public void lastSmallestIndexNull() {
		int[] data = null;
		assertThat(SimpleMethods.lastSmallestIndex(data), is(-1));
	}

	@Test
	public void lastSmallestIndexPlain() {
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.lastSmallestIndex(data), is(3));

	}

	@Test
	public void lastSmallestIndexEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.lastSmallestIndex(data), is(-1));
	}

	@Test
	public void findTrue() {
		int[] data = { 1, 2, 3 };
		int target = 2;
		assertTrue(SimpleMethods.find(data, target));
	}

	@Test
	public void findFalse() {
		int[] data = { 1, 2, 3 };
		int target = 7;
		assertFalse(SimpleMethods.find(data, target));
	}

	@Test
	public void findNull() {
		int target = 5;
		assertFalse(SimpleMethods.find(null, target));
	}

	@Test
	public void findEmpty() {
		int[] data = {};
		int target = 5;
		assertFalse(SimpleMethods.find(data, target));

	}
	///////////

	@Test
	public void isPalindromePositive() {
		assertTrue(SimpleMethods.isPalindrome("abba"));
	}

	@Test
	public void isPalindromeNegative() {
		assertFalse(SimpleMethods.isPalindrome("abbab"));

	}

	@Test
	public void isPalindromeNull() {
		assertFalse(SimpleMethods.isPalindrome(null));
	}

	@Test
	public void isPalindromeEmpty() {
		assertFalse(SimpleMethods.isPalindrome(""));
	}
	////////////

	@Test
	public void reverseReturnPlain() {
		int[] data = { 1, 2, 3 };
		int[] reverted = SimpleMethods.reverseReturn(data);

		assertThat(reverted.length, is(data.length));

		for (int i = 0; i < reverted.length; i++) {
			assertThat(reverted[i], is(data[data.length - 1 - i]));
		}

	}

//		assertThat(reverted[0], is(data[2]));
//		assertThat(reverted[1], is(data[1]));
//		assertThat(reverted[2], is(data[0]));

	@Test
	public void isreverseNull() {
		int[] data = null;
		SimpleMethods.reverseReturn(data);
		assertNull(data);

	}

	@Test
	public void isreverseEmpty() {
		int[] data = {};
		SimpleMethods.reverseReturn(data);
		assertThat(data.length, is(0));

	}
}
