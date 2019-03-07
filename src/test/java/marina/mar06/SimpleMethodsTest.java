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
		int [] data = {1, 2, 3};
		int target = 2;
		assertTrue(SimpleMethods.find(data, target));
	}
	
	
	@Test
	public void findNegative() {
		int [] data = {1, 2, 3};
		int target = 7;
		assertFalse(SimpleMethods.find(data, target));
	}
	
	@Test
	public void findPosPositive() {
		int [] data = {1, 2, 3};
		int target = 2;
		assertThat(SimpleMethods.findPos(data, target), is (1));
	}
	
	@Test
	public void findPosNegative() {
		int [] data = {1, 2, 3};
		int target = 7;
		assertThat(SimpleMethods.findPos(data, target), is (-1));
	}
	
	
	
	
}
