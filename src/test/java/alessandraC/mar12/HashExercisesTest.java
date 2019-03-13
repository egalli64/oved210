package alessandraC.mar12;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;

import static org.hamcrest.core.Is.*;

import org.junit.Assert;
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
		Assert.assertTrue(results.contains(2));
		Assert.assertTrue(results.contains(3));
	}

	@Test
	public void intersectionEmpty() {
		HashSet<Integer> left = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		HashSet<Integer> right = new HashSet<Integer>(Arrays.asList(4, 5, 6));

		HashSet<Integer> results = HashExercises.intersection(left, right);
		assertThat(results.size(), is(0));
	}

	@Test
	public void intersectionDifference() {
		HashSet<Integer> left = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		HashSet<Integer> right = new HashSet<Integer>(Arrays.asList(4, 5, 6));

		HashSet<Integer> results = HashExercises.difference(left, right);
		assertThat(results.size(), is(3));
		assertTrue(results.size());
		assertTrue(results.size());
		assertTrue(results.size());
		

	}

	private void assertTrue(int size) {
		// TODO Auto-generated method stub
		
	}
}
