package trainer.mar06;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
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
	public void firstSmallestIndexDouble() {
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.firstSmallestIndex(data), is(0));
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
		int[] data = {1, 2, 3};
		int target = 2;
		assertTrue(SimpleMethods.find(data, target));
	}

	@Test
	public void findNegative() {
		int[] data = {1, 2, 3};
		int target = 7;
		assertFalse(SimpleMethods.find(data, target));
	}

	@Test
	public void findPosPositive() {
		int[] data = {1, 2, 3};
		int target = 2;
		assertEquals(1, SimpleMethods.findPos(data, target));
	}

	@Test
	public void findPosNegative() {
		int[] data = {1, 2, 3};
		int target = 7;
		assertEquals(-1, SimpleMethods.findPos(data, target));
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
	public void isPalindromeOddPositive() {
		assertTrue(SimpleMethods.isPalindrome("aba"));
	}

	@Test
	public void isPalindromeOddNegative() {
		boolean result = SimpleMethods.isPalindrome("aab");
		assertFalse(result);
	}

	@Test
	public void isPalindromeNull() {
		boolean result = SimpleMethods.isPalindrome(null);
		assertFalse(result);
	}

	@Test
	public void isPalindromeEmpty() {
		boolean result = SimpleMethods.isPalindrome("");
		assertTrue(result);
	}

	@Test
	public void reverseReturnPlain() {
		int[] data = { 1, 2, 3, 4, 5 };
		int[] reverted = SimpleMethods.reverseReturn(data);

		assertThat(reverted.length, is(data.length));
		for(int i = 0; i < reverted.length; i++) {
			assertThat(reverted[i], is(data[data.length - 1 - i]));			
		}
//		assertThat(reverted[0], is(data[4]));		
//		assertThat(reverted[1], is(data[3]));		
//		assertThat(reverted[2], is(data[2]));		
//		assertThat(reverted[3], is(data[1]));		
//		assertThat(reverted[4], is(data[0]));		
	}
	
	@Test
	public void reverseSimple() {
		int[] data = {1, 2, 3};
		SimpleMethods.reverse(data);

		assertThat(data.length, is(3));
		assertThat(data[0], is(3));		
		assertThat(data[1], is(2));		
		assertThat(data[2], is(1));		
	}

	@Test
	public void reverse5() {
		int[] data = {1, 2, 3, 4, 5};
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
	public void reverseEmpty() {
		int[] data = {};
		SimpleMethods.reverse(data);
		assertThat(data.length, is(0));
	}
}
