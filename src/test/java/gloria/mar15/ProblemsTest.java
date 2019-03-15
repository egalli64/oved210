package gloria.mar15;

import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class ProblemsTest {

	@Test
	public void killDuplicates() {
		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 5, 6);
		List<Integer> buffer = Problems.killDuplicates(array);

		assertEquals(4, buffer.size());
		assertTrue(buffer.contains(1));
		assertTrue(buffer.contains(5));
		assertTrue(buffer.contains(4));
		assertTrue(buffer.contains(6));
	}
}
