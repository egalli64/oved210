package claudia.mar13;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.core.Is.*;

public class ProblemTest {

	@Test
	public void testCounter() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.counter(data, 1), is(2));

	}

	@Test
	public void testCounter2() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.counter(data, 2), is(3));
	}

	@Test
	public void testCounter3() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.counter(data, 4), is(0));
	}

	@Test
	public void testMostPopular() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.mostPopular(data), is(2));
	}
	@Test
	public void testMostPopular2() {
		int[] data = { 2, 2, 2, 1, 1, 3, 3 };
		assertThat(Problem.mostPopular(data), is(2));
}
	@Test
	public void testMostPopularSorted() {
		int[] data = { 1, 1, 1, 3, 5, 5, 5, 5, 7};
		assertThat(Problem.mostPopularSorted(data), is(5));
	}
	@Test
	public void testMostPopularHash() {
		int[] data = { 1, 1, 1, 3, 5, 5, 5, 5, 7};
		assertThat(Problem.mostPopularHash(data), is(5));
	}
}

