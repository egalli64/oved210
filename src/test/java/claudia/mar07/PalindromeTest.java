package claudia.mar07;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void isPalindromeEvenPositive() {
		assertTrue(Palindrome.isPalindrome("abba"));
	}
	@Test
	public void isPalindromeEvenNegative() {
		assertFalse(Palindrome.isPalindrome("abab"));
	}
	@Test
	public void isPalindromeOddNegative() {
		assertFalse(Palindrome.isPalindrome("aab"));
	}
	@Test
	public void isPalindromeOddPositive() {
		assertTrue(Palindrome.isPalindrome("aba"));
}
	@Test
	public void isPalindromeNull() {
		assertFalse(Palindrome.isPalindrome(null));
}
	@Test
	public void isPalindromeEmpty() {
		assertTrue(Palindrome.isPalindrome(""));	

}}