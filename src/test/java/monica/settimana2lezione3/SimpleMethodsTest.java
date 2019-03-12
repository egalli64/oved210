package monica.settimana2lezione3; //06/03/19 

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class SimpleMethodsTest {

	@Test
	public void isUpperA() {
		assertTrue(SimpleMethods.isUpper('A'));// mi aspetto che ritorni true
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
		assertTrue(SimpleMethods.isAlphaLowerC('c'));
	}

	@Test
	public void isAlphaNumber() {
		assertFalse(SimpleMethods.isAlpha('7'));
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

//casi con array

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

// primo problema
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

	// secondo problema
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

//terzo problema

	@Test
	public void findTrue() {
		int[] data = { 1, 2, 3 };
		assertTrue(SimpleMethods.find(data, 2));

	}

	@Test
	public void findFalse() {
		int[] data = { 1, 2, 3 };
		assertFalse(SimpleMethods.find(data, 7));

	}

	@Test
	public void findPos() {
		int[] data = { 1, 2, 3 };
		assertThat(SimpleMethods.findPos(data, 2), is(1));
	}

	@Test
	public void findPosFalse() {
		int[] data = { 1, 2, 3 };
		assertThat(SimpleMethods.findPos(data, 7), is(-1));
	}

// 07/03/19 es. numero 1

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
		assertFalse(SimpleMethods.isPalindrome(""));

	}

	// secondo problema

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
	public void reverse() {
		int[] data = { 1, 2, 3 };
		SimpleMethods.reverse(data);

		assertThat(data.length, is(3));
		assertThat(data[0], is(3));
		assertThat(data[1], is(2));
		assertThat(data[2], is(1));
	}

	@Test
	public void reverse5() {
		int[] data = { 1, 2, 3, 4, 5 };
		SimpleMethods.reverse(data);
	
		assertThat(data.length, is(5));
		assertThat( data[0], is(5));
		assertThat(data[1], is(4));
		assertThat(data[2],is (3));
	    assertThat(data[3], is (2));
	    assertThat(data[4], is (1));
	}
	
	//terzo problema
	@Test
	public void reverseReturnPlain() {
		int[] data = { 1, 2, 3, 4, 5 };
		int []reverted = SimpleMethods.reverseReturn(data);
		
		assertThat(reverted.length, is(5));

		assertThat(reverted[0], is(5));
		assertThat(reverted[1], is(4));
		assertThat(reverted[2],is(3));
	    assertThat(reverted[3], is(2));
	    assertThat(reverted[4], is(1));
		
	}
	

	
}