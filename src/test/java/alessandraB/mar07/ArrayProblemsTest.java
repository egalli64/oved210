package alessandraB.mar07;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;

import org.junit.Test;

public class ArrayProblemsTest {

	@Test
	public void sumPlain() {
		double[] values = { 1.0, 2.1, 3.0, 4.2, 5.0 };
		double result = ArrayProblems.sum(values);
		assertEquals(result, 15.3, 0.001);

	}

	@Test
	public void SumNull() {
		double[] value = null;
		double result = ArrayProblems.sum(value);
		assertThat(result, is(0.0));

	}

	@Test
	public void averagePlain() {
		double[] values = { 1.0, 2.0, 3.0 };
		double result = ArrayProblems.average(values);

		assertEquals(2.0, result, 0.001);

	}

	@Test
	public void testMerger() {
		int[] left = { 1, 2, 3 };
		int[] right = { 9, 8, 7 };

		int[] result = ArrayProblems.merger(left, right);
		assertEquals(left.length + right.length, result.length);
		assertEquals(1, result[0]);
		assertEquals(9, result[1]);
		assertEquals(2, result[2]);
		assertEquals(8, result[3]);
		assertEquals(3, result[4]);
		assertEquals(7, result[5]);

	}

}
