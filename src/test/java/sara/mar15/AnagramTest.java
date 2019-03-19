package sara.mar15;

import static org.junit.Assert.*;

import org.junit.Test;

import trainer.mar15.Problems;

public class AnagramTest {

	@Test
	public void anagramTrue() {
		String left = "cat";
		String right = "tac";
		assertTrue(Anagram.isAnagram(left, right));
	}
	@Test
	public void anagramFalse() {
		String left = "catt";
		String right = "tacc";
		assertFalse(Anagram.isAnagram(left, right));
	}
	
	@Test
	public void anagramHashPositive() {
		assertTrue(Anagram.isAnagramHash("cat", "tac"));
	}

	@Test
	public void anagramHashNegative() {
		assertFalse(Anagram.isAnagramHash("catt", "tacc"));
	}

}
