package monica.settimana3lezione5;  //15/03/19

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class ProblemsTest {

	@Test
	public void killDuplicates() {
		List<Integer> buffer = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);

		List<Integer> results = Problems.killDuplicates(buffer);

		assertThat(results.size(), is(4));
		assertTrue(results.contains(1));
		assertTrue(results.contains(4));
		assertTrue(results.contains(5));
		assertTrue(results.contains(6));
	}

	@Test
	public void killDuplicatesHash() {
		List<Integer> buffer = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);

		List<Integer> results = Problems.killDuplicatesHash(buffer);

		assertThat(results.size(), is(4));
		assertTrue(results.contains(1));
		assertTrue(results.contains(4));
		assertTrue(results.contains(5));
		assertTrue(results.contains(6));
	
	}

}