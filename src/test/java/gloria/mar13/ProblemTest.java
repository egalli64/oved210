package gloria.mar13;

import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class ProblemTest {

	@Test
	public void count() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.count(data, 2), is(3));
	}
	
	@Test 
	public void countTwo() {
		int[] data = {2, 2, 2, 1, 1, 3, 3, 1, 1};
		assertThat(Problem.count(data, 1), is(4));
	}
	
	@Test
	public void mostPopular() {
		int[] data = {2, 2, 2, 1, 1};
		assertThat(Problem.mostPopular(data), is(2));
	}

}
