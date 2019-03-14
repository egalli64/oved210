package alessandraC.mar13;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void count1() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.count(data, 1), is(2));
	}

	@Test
	public void count2() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.count(data, 2), is(3));
	}
}
