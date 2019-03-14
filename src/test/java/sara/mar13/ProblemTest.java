package sara.mar13;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void Count() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.count(data, 2), is(3));
	}

	@Test
	public void Count2() {
		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.count(data, 1), is(4));
	}

	@Test
	public void MostPopular() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.mostPopular(data), is(2));
	}
}
