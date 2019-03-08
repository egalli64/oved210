package mariangela.mar06;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.junit.Test;
import static org.hamcrest.core.Is.*;

public class SimpleMethodsTest {

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

	@Test
	public void IsAlphaA() {
		assertTrue(SimpleMethods.isAlpha('A'));
	}

	@Test
	public void IsAlphaLowerA() {
		assertTrue(SimpleMethods.isAlpha('a'));
	}

	@Test
	public void IsAlphaNumber() {
		assertFalse(SimpleMethods.isAlpha('6'));
	}

	@Test
	public void IsAlphaBracket() {
		assertFalse(SimpleMethods.isAlpha('}'));
	}

	@Test
	public void toUpperA() {
		assertThat(SimpleMethods.toUpper('A'), is('A'));
	}

	@Test
	public void toUpperLowerA() {
		assertThat(SimpleMethods.toUpper('m'), is('M'));
	}

	@Test
	public void toUpperBracket() {
		assertThat(SimpleMethods.toUpper('}'), is('}'));
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
	public void smallestFirst() {
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.firstSmallestIndex(data), is(0));

	}

	@Test
	public void smallestFirstNull() {
		int[] data = null;
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
	}

	@Test
	public void smallestFirstEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
	}

	@Test
	public void smallestLast() {
		int[] data = { -7, 2, 5, -7 };
		assertThat(SimpleMethods.lastSmallestIndex(data), is(3));

	}

	@Test
	public void smallestLastNull() {
		int[] data = null;
		assertThat(SimpleMethods.lastSmallestIndex(data), is(-1));
	}

	@Test
	public void smallestLastEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.lastSmallestIndex(data), is(-1));

	}

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
	public void findNull() {
		assertFalse(SimpleMethods.find(null, 2));
	}

	@Test
	public void findEmpty() {
		int[] data = {};
		assertFalse(SimpleMethods.find(data, 2));
	}

	@Test
	public void findPosNull() {
		assertThat(SimpleMethods.findPos(null, 2), is(-1));
	}

	@Test
	public void findPosEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.findPos(data, 2), is(-1));
	}

	@Test
	public void findPosPlain() {
		int[] data = { 1, 2, 3 };
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
	public void isPalindromeEvenOddNegative() {
		assertFalse(SimpleMethods.isPalindrome("aab"));
	}

	@Test
	public void isPalindromeNull() {
		assertTrue(SimpleMethods.isPalindrome(null));
	}

	@Test
	public void isPalindromeEmpty() {
		assertTrue(SimpleMethods.isPalindrome(""));
	}
	
	@Test
	public void reverseNull() {
		int[] data = null;
		SimpleMethods.reverse(data);
		assertNull(data);
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
	public void reverseReturnPlain() {
		int[] data = {1, 2, 3, 4, 5};
		int[] reverted = SimpleMethods.reverseReturn(data);
		
		assertThat(reverted.length, is(data.length));
		for(int i = 0; i < reverted.length; i++) {
			assertThat(reverted[i], is(data[data.length-1 -i]));
			
		}
	}
}