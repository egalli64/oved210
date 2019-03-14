package mariangela.mar13;

import static org.junit.Assert.*;

import org.assertj.core.util.Arrays;
import org.hamcrest.Matcher;
import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class ProblemTest {

	@Test
	public void testMostPopular2() {
		int[] data = {2, 2, 2, 1, 1};
		int result = Problem.mostPopular(data);
		assertThat (result, is(2));
		
	}
	
	@Test
	public void testMostPopular1() {
		int[] data = {2, 2, 2, 1, 1, 3, 3, 1, 1};
		int result = Problem.mostPopular(data);
		assertThat (result, is(1));
		
	}

	@Test
	public void testCount2() {
		int[] data = { 2, 2, 2, 1, 1 };
		int value = 2;
		int result = Problem.count(data, value);
		assertThat (result, is(3));
		
	}

	@Test
	public void testCount3() {
		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		int value = 3;
		int result = Problem.count(data, value);
		assertThat(result, is(2));
	}

}
