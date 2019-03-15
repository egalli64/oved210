package mariangela.mar15;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class ProblemsTest {

	@Test
	public void testKillDuplicates() {
		
		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		
		List<Integer> results = Problems.killDuplicates(array);
		assertThat(results.size(), is(4));
		assertTrue(results.contains(1));
		assertTrue(results.contains(4));
		assertTrue(results.contains(5));
		assertTrue(results.contains(6));
	}
	
	@Test
	public void testKillDuplicatesHash() {
		
		List<Integer> array = Arrays.asList(1, 1, 1, 4, 5, 6, 4, 6, 5);
		
		List<Integer> results = Problems.killDuplicatesHash(array);
		assertThat(results.size(), is(4));
		assertTrue(results.contains(1));
		assertTrue(results.contains(4));
		assertTrue(results.contains(5));
		assertTrue(results.contains(6));
	}
	
	@Test
	public void ifElse3() {
		String result = Problems.ifElse(3);
		assertThat (result, is("Weird"));
		
	}
	
	@Test
	public void ifElse22() {
		String result = Problems.ifElse(22);
		assertThat (result, is("Not Weird"));
		
	}
	
	@Test
	public void ifElse2to5() {
		String result = Problems.ifElse(2);
		assertThat (result, is("Not Weird"));
		
	}
	
	@Test
	public void ifElse6to20() {
		String result = Problems.ifElse(6);
		assertThat (result, is("Weird"));
		
	}
}
