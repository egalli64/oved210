package sara.mar15;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class ProblemsTest {

	@Test
	public void killDuplicates() {
		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> buffer = Problems.killDuplicates(array);

		assertEquals(4, buffer.size());
		assertTrue(buffer.contains(1));
		assertTrue(buffer.contains(4));
		assertTrue(buffer.contains(5));
		assertTrue(buffer.contains(6));
	}

	@Test
	public void killDuplicatesHash() {
		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> buffer = Problems.killDuplicatesHash(array);

		assertEquals(4, buffer.size());
		assertTrue(buffer.contains(1));
		assertTrue(buffer.contains(4));
		assertTrue(buffer.contains(5));
		assertTrue(buffer.contains(6));
	}

	@Test
	public void ifElseZero() {
		try {
			Problems.ifElse(0);
			fail("ifElse() should throw an exception");
		} catch (IllegalAccessError ex) {
			System.out.println("Expected");
	}
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

}