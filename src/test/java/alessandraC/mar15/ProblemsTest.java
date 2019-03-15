package alessandraC.mar15;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.junit.Test;

public class ProblemsTest {

	@Test
	public void killDuplicatesSort() {

		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> result = Problems.killDuplicateHash(array);

		assertThat(result.size(), is(4));
		assertTrue(result.contains(1));
		assertTrue(result.contains(4));
		assertTrue(result.contains(5));
		assertTrue(result.contains(6));

	}

	@Test
	public void killDuplicateHash() {

		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> result = Problems.killDuplicateHash(array);

		assertThat(result.size(), is(4));
		assertTrue(result.contains(1));
		assertTrue(result.contains(4));
		assertTrue(result.contains(5));
		assertTrue(result.contains(6));

	}

	@Test
	public void IfElseOdd() {
		assertThat(Problems.ifElse(3), is("Weird"));

	}

	@Test
	public void IfElseEven6() {
		assertThat(Problems.ifElse(6), is("Weird"));
	}

	@Test
	public void IfElseEven2() {
		assertThat(Problems.ifElse(2), is("Not weird"));

	}

	@Test
	public void ifElseEven22() {
		assertThat(Problems.ifElse(22), is("Not weird"));
	}

	@Test
	public void ifElseZero() {
		try {

		Problems.ifElse(0);
		fail("ifElse() should throw an exception");
	} catch(IllegalAccessError ex) {
	
	}
	}
}