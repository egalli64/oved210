package marina.mar13;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.core.Is.*;

public class ProblemTest {
	
	@Test
	public void mostPopularHashTest() {

		int[] data = { 2, 2, 2, 1, 1 };
		int result = Problem.mostPopularHash(data);
		assertThat(result, is(2));
		}

	@Test
	public void mostPopularHash2Test() {

		int[] data = {2, 2, 2, 1, 1, 3, 3, 1, 1};
		int result = Problem.mostPopularHash(data);
		assertThat(result, is(1));
		}
	

	@Test
	public void popularFirstTest() {

		int[] data = { 2, 2, 2, 1, 1 };
		int result = Problem.mostPopular(data);
		assertThat(result, is(2));
		}

	@Test
	public void popularSecondTest() {

		int[] data = {2, 2, 2, 1, 1, 3, 3, 1, 1};
		int result = Problem.mostPopular(data);
		assertThat(result, is(1));
		}
	
	@Test
	public void mostPopularTest() {

		int[] data = { 2, 2, 2, 1, 1 };
		int result = Problem.mostPopularSorted(data);
		assertThat(result, is(2));
		}

	@Test
	public void mostPopular2Test() {

		int[] data = {2, 2, 2, 1, 1, 3, 3, 1, 1};
		int result = Problem.mostPopularSorted(data);
		assertThat(result, is(1));
		}
	
	@Test
	public void countTest() {

		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		int value = 1;
		int result = Problem.count(data, value);
		assertThat(result, is(4));
	}

}
