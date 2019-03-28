package federica;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.assertj.core.util.Arrays;
import org.junit.Test;

public class HashExercisesTest {

	@Test
	public void testIntersectionPlain() {
	HashSet<Integer> left = new HashSet<Integer>(Arrays.asList(1));
	HashSet<Integer> right = new HashSet<Integer>(Arrays.asList(2));
	
//	HashSet<Integer> left = new HashSet<Integer>();
//	left.add(1);
//	left.add(2);
//	left.add(3);
	}
    HashSet<Integer> results = HashExercises.intersection(left, right);
    assertThat(results.size(), is(2));
    assertTrue(results.contains(2));
    assertTrue(results.contains(3));
}

   @Test
   public void intersectionEmpty() {
	   HashSet<Integer> left = new HashSet<Integer>(Arrays.asList(1,2,3));
	   HashSet<Integer> right = new HashSet<Integer>(Arrays.asList(4,5,6));
} 
