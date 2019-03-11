package alessandraC.mar07;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayProblemsTest {

	private Object results;

	@Test
	public void sumPlain() {
		double[] values = { 1.0, 2.1, 3.0, 4.2, 5.0 };
		double result = ArrayProblems.sum(values);
		assertEquals(result, 15.3, 0.001);
	}

	@Test
	public void sumNull() {
		double[] values = null;
		double result = ArrayProblems.sum(values);
		assertEquals(result, 0.0, 0.001);
	}

	@Test
	public void AveragePlain() {
		double[] values = { 1.0, 2.0, 3.0 };
		double result = ArrayProblems.average(values);
		assertEquals(result, 2.0, 0.001);

	}

	@Test
	public void AverageNull() {
		double[] values = null;
		double result = ArrayProblems.average(values);
		assertEquals(result, 0.0, 0.001);
	}

	@Test
	public void MergerPlain() {
		int[] left = { 1, 2, 3 };
		int[] right = { 9, 8, 7 };

		int result = ArrayProblems.merger(left, right);
		assertEquals(left.length + right.length, results);
//		assertEquals(1, result[0]);
//		assertEquals(9, result[1]);
//		assertEquals(2, result[2]);
//		assertEquals(8, result[3]);
//		assertEquals(3, result[4]);
//		assertEquals(7, result[5]);

	}

	@Test
	public void mergerExPlain() {
		int[] left = { 1, 2 };
		int[] right = { 9, 8, 7, 6 };

		int result = ArrayProblems.merger(left, right);

	}
}
