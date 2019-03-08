package sara.mar06;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;

import org.junit.Test;

public class SimpleMethodsTest {
					//ESERCIZIO 1
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
					//ESERCIZIO 2
	@Test
	public void IsAlphaA() {
		assertTrue(SimpleMethods.isAlpha('A'));
	}

	@Test
	public void IsAlphac() {
		assertTrue(SimpleMethods.isAlpha('c'));
	}

	@Test
	public void IsAlphaNumber() {
		assertFalse(SimpleMethods.isAlpha('6'));
	}

	@Test
	public void IsAlphaBracket() {
		assertFalse(SimpleMethods.isAlpha(')'));
	}
					//ESERCIZIO 3
	@Test
	public void toUpper() {
		assertThat(SimpleMethods.toUpper('A'), is('A'));
	}

	@Test
	public void toUpperLowerX() {
		assertThat(SimpleMethods.toUpper('x'), is('X'));
	}

	@Test
	public void toUpperA() {
		assertThat(SimpleMethods.toUpper('9'), is('9'));
	}
						//ESERCIZIO 4
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
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.lastSmallestIndex(data), is(3));
	}

	@Test
	public void lastSmallestIndexDouble() {
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.lastSmallestIndex(data), is(3));
	}
	
						// ESERCIZIO 7
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

				// ESERCIZIO 8
	@Test
	public void findIndexNull() {
		int[] data = null;
		int target = 2;
		assertThat(SimpleMethods.findIndex(data, target), is(1));
	}

	@Test
	public void findIndexPlain() {
		int[] data = { 1, 2, 3 };
		int target = 7;
		assertThat(SimpleMethods.findIndex(data, target), is(-1));
	}

					// ESERCIZIO 9

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

						// ESERCIZIO 10

	@Test
	public void reverseReturnNull() {
		int[] data = null;
		SimpleMethods.reverseReturn(data);
		assertNull(data);
	}

	@Test
	public void reverseReturnEmpty() {
		int[] data = {};
		SimpleMethods.reverseReturn(data);
		assertThat(data.length, is(0));
	}

	@Test
	public void reverseReturnPlain() {
		int[] data = { 1, 2, 3};
		int[] reverted = SimpleMethods.reverseReturn(data);
		
		assertThat(reverted.length, is(data.length));
		
		assertThat(reverted.length, is(data.length));
		assertThat(reverted[0], is(data[2]));
		assertThat(reverted[1], is(data[1]));
		assertThat(reverted[2], is(data[0]));
		}
	
	
	
					//ESERCIZIO 11
	
	@Test
	public void reverseNull() {
		int[] data = null;
		SimpleMethods.reverse(data);
		assertNull(data);
	}
	@Test
	public void reverseEmpty() {
		int[] data = {};
		SimpleMethods.reverseReturn(data);
		assertThat(data.length, is(0));
	}
	
	@Test
	public void reverseSimple() {
		int[] data = { 1, 2, 3};
		SimpleMethods.reverse(data);
		
		assertThat(data.length, is(3));
		assertThat(data[0], is(3));
		assertThat(data[1], is(2));
		assertThat(data[2], is(1));
	
	}
}
