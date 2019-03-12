package monica.settimana3lezione2;  //12/03/19

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;


public class HashExercisesTest {

	@Test
	public void intersection() {
		
		HashSet<Integer> left = new HashSet<Integer> (Arrays.asList(1,2,3));
		HashSet<Integer> right = new HashSet<Integer> (Arrays.asList(2,3,4));
		
		//HashSet<Integer> left = new HashSet<Integer> (Arrays.asList(1,2,3));
		//left.add(1);
		//left.add(2);
		//left.add(3);
		
		HashSet<Integer> result = HashExercises.intersection( left,right);
		
		assertThat(result.size(), is(2));
		assertTrue(result.contains(2));		
		assertTrue(result.contains(3));		
	}
	
	@Test
	public void intersectionEmpty() {
		HashSet<Integer> left = new HashSet<Integer>(
				Arrays.asList(1, 2, 3));
		HashSet<Integer> right = new HashSet<Integer>(
				Arrays.asList(4, 5, 6));
		
		HashSet<Integer> results = HashExercises.intersection(left, right);
		assertThat(results.size(), is(0));
	}

	@Test
	public void difference() {
		
		HashSet<Integer> left = new HashSet<Integer> (Arrays.asList(1,2,3));
		HashSet<Integer> right = new HashSet<Integer> (Arrays.asList(2,3,4));
		HashSet<Integer> result = HashExercises.difference( left,right);
		assertThat(result.size(), is(1));
		assertTrue(result.contains(1));	
	}
}

