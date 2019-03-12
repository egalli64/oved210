package mariangela.mar12;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class HashExercisesTest {

	@Test
	public void intersectionPlain() {
		
		HashSet<Integer> left = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		HashSet<Integer> right = new HashSet<Integer>(Arrays.asList(2, 3, 4));
		
		HashSet<Integer> results = HashExercises.intersection(left, right);
		assertThat(results.size(), is(2));
		assertTrue(results.contains(2));
		assertTrue(results.contains(3));
	}

}
