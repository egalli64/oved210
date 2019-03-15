package trainer.mar15;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class ProblemsTest {

	@Test
	public void killDuplicatesSort() {
		List<Integer> values = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> results = Problems.killDuplicatesSort(values);

		assertThat(results.size(), is(4));
		assertTrue(results.contains(1));
		assertTrue(results.contains(4));
		assertTrue(results.contains(5));
		assertTrue(results.contains(6));
	}

	@Test
	public void killDuplicatesHash() {
		List<Integer> values = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		List<Integer> results = Problems.killDuplicatesHash(values);

		assertThat(results.size(), is(4));
		assertTrue(results.contains(1));
		assertTrue(results.contains(4));
		assertTrue(results.contains(5));
		assertTrue(results.contains(6));
	}
}
