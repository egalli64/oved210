package tiziana.mar12;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class HashExercisesTest {
	@Test
	public void intersectionPlain() {
		HashSet<Integer> left = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		HashSet<Integer> right = new HashSet<Integer>(Arrays.asList(2, 3, 4));

//		HashSet<Integer> left = new HashSet<Integer>();
//		left.add(1);
//		left.add(2);
//		left.add(3);

		HashSet<Integer> results = HashExercises.intersection(left, right);
		assertThat(results.size(), is(2));
		assertTrue(results.contains(2));
		assertTrue(results.contains(3));
	}

	@Test
	public void intersectionEmpty() {
		HashSet<Integer> left = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		HashSet<Integer> right = new HashSet<Integer>(Arrays.asList(4, 5, 6));

		HashSet<Integer> results = HashExercises.intersection(left, right);
		assertThat(results.size(), is(0));
	}

	@Test
	public void differencePlain() {
		HashSet<Integer> left = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		HashSet<Integer> right = new HashSet<Integer>(Arrays.asList(2, 3, 4));

		HashSet<Integer> results = HashExercises.difference(left, right);
		assertThat(results.size(), is(1));
		assertTrue(results.contains(1));
	}

	@Test
	public void differenceDisjointed() {
		HashSet<Integer> left = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		HashSet<Integer> right = new HashSet<Integer>(Arrays.asList(4, 5, 6));

		HashSet<Integer> results = HashExercises.difference(left, right);
		assertThat(results.size(), is(3));
		assertTrue(results.contains(1));
		assertTrue(results.contains(2));
		assertTrue(results.contains(3));
	}

}
