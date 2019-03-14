package trainer.mar13;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class ProblemTest {

	@Test
	public void mostPopularFirst() {
		int data[] = {2, 2, 2, 1, 1};
		assertThat(Problem.mostPopular(data), is(2));
	}

	@Test
	public void mostPopularSecond() {
		int data[] = {2, 2, 2, 1, 1, 3, 3, 1, 1};
		assertThat(Problem.mostPopular(data), is(1));
	}

	@Test
	public void countFirst() {
		int data[] = {2, 2, 2, 1, 1};
		assertThat(Problem.count(data, 2), is(3));
	}

	@Test
	public void countOther() {
		int data[] = {2, 2, 2, 1, 1, 3, 3, 1, 1};
		assertThat(Problem.count(data, 3), is(2));
	}

	@Test
	public void countMissing() {
		int data[] = {2, 2, 2, 1, 1, 3, 3, 1, 1};
		assertThat(Problem.count(data, 4), is(0));
	}
	
}
