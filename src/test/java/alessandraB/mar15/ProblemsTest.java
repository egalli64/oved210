package alessandraB.mar15;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.Is.*;
import org.junit.Test;

import claudia.mar15.HackerrankEx;

public class ProblemsTest {

	@Test
	public void testKillDuplicates() {
		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> buffer = Problems.killDuplicates(array);

		assertEquals(4, buffer.size());
		assertTrue(buffer.contains(1));
		assertTrue(buffer.contains(4));
		assertTrue(buffer.contains(5));
		assertTrue(buffer.contains(6));
	}

	@Test
	public void testKillDuplicatesHash() {
		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> buffer = Problems.killDuplicates(array);

		assertEquals(4, buffer.size());
		assertTrue(buffer.contains(1));
		assertTrue(buffer.contains(4));
		assertTrue(buffer.contains(5));
		assertTrue(buffer.contains(6));
	}

	@Test
	public void testifElse() {
		String result = Problems.ifElse(21);
		assertThat(result, is("Weird"));
	}

	@Test
	public void testifElse2() {
		String result2 = Problems.ifElse(4);
		assertThat(result2, is("not Weird"));
	}

	@Test
	public void testifElse3() {
		String result3 = Problems.ifElse(18);
		assertThat(result3, is("Weird"));
	}

	@Test
	public void testifElse4() {
		String result4 = Problems.ifElse(46);
		assertThat(result4, is("not Weird"));
	}
	
	@Test
	public void ifElseZero() {
		try {
		Problems.ifElse(0);
		fail("ifElse should throw an exception");
	} catch (IllegalAccessError ex) {
		System.out.println("Expected");
	}
} 
	@Test
	public void multiples () {
		
		int [] results = Problems.multiples(2);
		
		assertThat(results[0],is(2));
		assertThat(results[1],is(4));
		assertThat(results[2],is(6));
		assertThat(results[3],is(8));
		assertThat(results[4],is(10));
		assertThat(results[5],is(12));
		assertThat(results[6],is(14));
		assertThat(results[7],is(16));
		assertThat(results[8],is(18));
		assertThat(results[9],is(20));
	}
	
	@Test
	public void isAnagram() {
		String left = "cat";
		String right = "act";
		
	assertTrue(Problems.isAnagram(left, right));	
	 	
		
	} }
