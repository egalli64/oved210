package alessandraB.mar15;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.Is.*;
import org.junit.Test;

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
	
}
