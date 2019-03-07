package sara.mar07;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;

import org.hamcrest.Matcher;
import org.junit.Test;

public class ArrayProblemsTest {
	// ESERCIZIO SOMMA
	@Test
	public void SumNull() {
		double[] values = null;
		double result = ArrayProblems.sum(values);
		assertThat(result, is(0.0));
	}

	@Test
	public void SumPlain() {
		double[] values = { 1.0, 2.1, 3.0, 4.2, 5.0 };
		double result = ArrayProblems.sum(values);
		assertEquals(result, 15.3, 0.001); // si inserisce un delta 0.001 per arrotondare
	}

	// ESERCIZIO MEDIA
	@Test
	public void AverageNull() {
		double[] values = null;
		double result = ArrayProblems.average(values);
		assertThat(result, is(0.0));
	}

	@Test
	public void AveragePlain() {
		double[] values = { 1.0, 2.0, 3.0 };
		double result = ArrayProblems.average(values);
		assertEquals(result, 2.0, 0.001); // si inserisce un delta 0.001 per arrotondare
	}

	// ESERCIZIO UNIONE DUE ARRAY

	@Test
	public void MergerPlain() {
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
