package sara.mar12;

import static org.hamcrest.core.Is.*;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class HashExercisesTest {
	
	@Test
	public void inserctionPlain() {
		HashSet<Integer> left = new HashSet<Integer>(Arrays.asList(1, 2, 3 ));
		HashSet<Integer> right = new HashSet<Integer>(Arrays.asList(4, 5, 6 ));

		HashSet<Integer> results = HashExercises.intersection(left, right);
		assertThat(results.size(), is (2));
		assertTrue(results.contains(2));
		assertTrue(results.contains(3));
		}
	
	@Test
	public void differencePlain() {
		HashSet<Integer> left = new HashSet<Integer>(Arrays.asList(1, 2, 3 ));
		HashSet<Integer> right = new HashSet<Integer>(Arrays.asList(4, 5, 6 ));

		HashSet<Integer> results = HashExercises.difference(left, right);
		assertThat(results.size(), is (1));
		assertTrue(results.contains(1));
		}
	
	
	@Test
	public void inserctionEmpty() {
		HashSet<Integer> left = new HashSet<Integer>(Arrays.asList(1, 2, 3 ));
		HashSet<Integer> right = new HashSet<Integer>(Arrays.asList( 2, 3, 4 ));
	}
}
