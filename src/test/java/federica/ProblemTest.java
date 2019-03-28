package federica;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void testMostPopular2() {
		int [] data = {2, 2, 2, 1, 1};
		assertThat(Problem.mostPopular(data), is(2));		
	}
	
	@Test
	public void testMostPopular1() {
		int [] data = {2, 2, 2, 1, 1, 3, 3, 1, 1};
		assertThat(Problem.mostPopular(data), is(1));
		
	}

	@Test
	public void testCount2() {
		int [] data = {2, 2, 2, 1, 1};
		int value = 2;
		int result = Problem.count(data, value );
		assertThat(result, is(3));
	}
	
	@Test
	public void testCount3() {
		int [] data = {2, 2, 2, 1, 1, 3, 3, 1, 1};
		int value = 3;
		int result = Problem.count(data, value );
		assertThat(result, is(2));

}
}
