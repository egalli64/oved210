package claudia.mar15;

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
		List<Integer> result = Problems.killDuplicates(buffer);
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

}
