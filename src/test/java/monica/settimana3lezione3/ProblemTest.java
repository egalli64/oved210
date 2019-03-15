package monica.settimana3lezione3;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class ProblemTest {

	@Test
	public void count() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.count(data, 1), is(2));
	}
	
	
	@Test
	public void countA() {
		int[] data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.count(data, 2), is(3));
	}
	
	@Test 
	public void countB() {
		int[] data = {2,2,2,1,1,3,3,1,1};
		assertThat(Problem.count(data, 3), is(2));
	}
	
	@Test
	public void countC() {
		int []data = {2,2,2,1,1,3,3,1,1};
		assertThat(Problem.count(data, 4), is(0));
	}
	@Test
	public void mostPopularA() {
		int []data = { 2, 2, 2, 1, 1 };
		assertThat(Problem.mostPopular(data), is(2));
	}
	
	@Test
	public void mostPopular2() {
		int []data = { 2, 2, 2, 1, 1, 3, 5, 5 };
		assertThat(Problem.mostPopular2(data), is(2));
		}

	@Test
	public void mostPopularHas() {
		int []data = { 2, 2, 2, 1, 1, 3, 5, 5 };
		assertThat(Problem.mostPopularHash(data), is(2));

	}

}
