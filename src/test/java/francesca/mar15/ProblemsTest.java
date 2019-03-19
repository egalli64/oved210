package francesca.mar15;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;





public class ProblemsTest {

	@Test
	public void testKillDuplicates() {
		List<Integer> buffer = Arrays.asList(1, 1, 1, 4, 4, 5, 5, 6, 6);
		List<Integer> result = Problems.killDuplicatesHash(buffer);
		assertThat(result.size(), is(4));
		assertTrue(result.contains(1));
		assertTrue(result.contains(4));
		assertTrue(result.contains(5));
		assertTrue(result.contains(6));
		assertFalse(result.contains(7));
	}

	@Test
	public void testKillDuplicatesHash() {
		List<Integer> buffer = Arrays.asList(1, 1, 1, 4, 4, 5, 5, 6, 6);
		List<Integer> result = Problems.killDuplicatesHash(buffer);
		assertThat(result.size(), is(4));
		assertTrue(result.contains(1));
		assertTrue(result.contains(4));
		assertTrue(result.contains(5));
		assertTrue(result.contains(6));
		assertFalse(result.contains(7));
	}

	@Test
	public void ifElseOdd() {
		String result = Problems.ifElse(1);
		assertThat(result, is("Weird"));
	}
	@Test
	public void ifElse2() {
		String result = Problems.ifElse(2);
		assertThat(result, is("Not Weird"));
	}
	@Test
	public void ifElse8() {
		String result = Problems.ifElse(8);
		assertThat(result, is("Weird"));
	}
	@Test
	public void ifElse22() {
		String result = Problems.ifElse(22);
		assertThat(result, is("Not Weird"));
	}
	
	@Test
	public void ifElseZero() {
		try {
			Problems.ifElse(0);
		} catch(IllegalAccessError ex) {
			
		}
	}
		
		@Test
		public void isAnagramPositive() {
			String left = "cat";
			String right = "tac";
			assertTrue(Problems.isAnagram( left,right));
			}
		
		@Test
		public void isAnagramNegative() {
			assertTrue(Problems.isAnagram("catt", "tacc"));
			
		}
	}


