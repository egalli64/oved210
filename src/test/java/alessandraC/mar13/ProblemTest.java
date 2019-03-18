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

	@Test
	public void mostPopularValue() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.mostPopular(data), is(2));

	}

	@Test
	public void mostPopularValue2() {
		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.mostPopular(data), is(1));

	}

	@Test
	public void mostPopularSorted() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.mostPopularSorted(data), is(2));

	}

	@Test
	public void mostPopularSorted2() {
		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.mostPopularSorted(data), is(1));
	}
	@Test
	public void get() {
		int [] data = {2, 2, 2, 1, 1};
		assertThat(Problem.mostPopularHash(data), is(2));
	}
//	@Test
//	public void 
}
