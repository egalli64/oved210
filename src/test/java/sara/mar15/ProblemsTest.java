package sara.mar15;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
import org.junit.Test;

public class ProblemsTest {

	@Test
	public void killDuplicates() {
		List<Integer> array = Arrays.asList(1,1,1,4,5,6,4,6,5);
		List<Integer> buffer = Problems.killDuplicates(array);
				
		assertEquals(4, buffer.size());
		assertTrue(buffer.contains(1));
		assertTrue(buffer.contains(4));
		assertTrue(buffer.contains(5));
		assertTrue(buffer.contains(6));	
	}
}