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
		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.count(data, 1), is(4));
	}

	@Test
	public void mostPopular() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.mostPopular(data), is(2));
	}

	@Test
	public void mostPopularSecond() {
		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.mostPopular(data), is(1));
	}

	@Test
	public void mostPopularSort() {
		int[] data = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.mostPopularArraysSort(data), is(1));
	}

	@Test
	public void mostPopularHash() {
		Problem problem = new Problem();
	}

	@Test
	public void countFirst() {
		int data[] = { 2, 2, 2, 1, 1 };
		assertThat(Problem.count(data, 2), is(3));
	}

	@Test
	public void countOther() {
		int data[] = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.count(data, 3), is(2));
	}

	@Test
	public void countMissing() {
		int data[] = { 2, 2, 2, 1, 1, 3, 3, 1, 1 };
		assertThat(Problem.count(data, 4), is(0));
	}

}
