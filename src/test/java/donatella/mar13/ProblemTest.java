package donatella.mar13;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void Count() {
		int[] data = { 2, 2, 2, 1 };
		assertThat(Problem.count(data, 2), is(3));
	}

	@Test
	public void Count1() {
		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.count(data, 1), is(4));
	}

	@Test
	public void Count2() {
		int[] data = { 2, 2, 2, 1 };
		assertThat(Problem.count(data, 1), is(1));
	}

	@Test
	public void Count3() {
		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.count(data, 3), is(2));
	}

	@Test
	public void mostPopular() {
		int[] data = { 2, 2, 2, 1 };
		assertThat(Problem.mostPopular(data), is(2));

	}

	@Test
	public void mostPopular1() {
		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.mostPopular(data), is(1));

	}

//	@Test
//	public void mostPopularSort() {
//		int[] data = { 2, 2, 2, 1 };
//		assertThat(Problem.mostPopularSort(data), is(2));
//	}

}
