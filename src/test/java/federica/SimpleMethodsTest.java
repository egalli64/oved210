package federica;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.core.Is.*;

public class SimpleMethodsTest {

	@Test
	public void testIsUpperA() {
		assertTrue(SimpleMethods.isUpper('A'));
	}

	@Test
	public void testIsUpperLowerH() {
		assertFalse(SimpleMethods.isUpper('h'));
	}

	@Test
	public void testIsUpperNumber() {
		assertFalse(SimpleMethods.isUpper('7'));
	}

	@Test
	public void testIsAlphaA() {
		assertTrue(SimpleMethods.isAlpha('A'));
	}

	@Test
	public void testIsAlphaLowerC() {
		assertTrue(SimpleMethods.isAlpha('c'));
	}

	@Test
	public void testIsAlphaNumber() {
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
	public void toUpperLowerA() {
		assertThat(SimpleMethods.toUpper('a'), is('A'));
	}

	@Test
	public void toBrackets() {
		assertThat(SimpleMethods.toUpper('}'), is('}'));
	}

	@Test
	public void toUpperNumber() {
		assertThat(SimpleMethods.toUpper('6'), is('6'));
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
	public void lastSmallestIndexPlain() {
		int[] data = { 1, 2, 5, -7 };
		assertThat(SimpleMethods.lastsmallestIndex(data), is(3));
	}

	@Test
	public void lastSmallestIndexNull() {
		int[] data = null;
		assertThat(SimpleMethods.lastsmallestIndex(data), is(-1));
	}

	@Test
	public void lastSmallestIndexEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.lastsmallestIndex(data), is(-1));
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
		assertFalse(SimpleMethods.find(data, 7));
	}
	
	@Test
	public void findPosPlain() {
		int[] data = { 1, 2, 3 };
		assertThat(SimpleMethods.findPos(data, 2), is(1));
	}

	@Test
	public void findPosNull() {
		assertThat(SimpleMethods.findPos(null,2), is(-1));
	}

	@Test
	public void findPosEmpty() {
		int[] data = {};
		assertThat(SimpleMethods.findPos(data,2), is(-1));
}
	
	@Test
	public void isPalindromeOddPositive() {
		assertTrue(SimpleMethods.isPalindrome("abba"));
	}
	
	@Test
	public void isPalindromeNegative() {
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
		assertTrue(SimpleMethods.isPalindrome(""));
	}
	
	@Test
	public void reverseSimple() {
		int[] data = { 1, 2, 3 };
		SimpleMethods.reverse(data);
		assertThat(data.length, is(3));
		assertThat(data[0], is (3));
		assertThat(data[1], is (2));
		assertThat(data[2], is (1));
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
		SimpleMethods.reverseReturn(data);
		assertThat(data.length, is (0));
		
	}
	
	@Test
	public void reverseReturnPlain( ) {
		int[] data = {1,2,3,4,5};
		int []reverted = SimpleMethods.reverseReturn(data);
		
		assertThat(reverted.length, is(data.length));
		for(int i=0; i < reverted.length; i++) {
			assertThat(reverted[i], is(data[data.length -1 -i]));
		}
		
		}
	}