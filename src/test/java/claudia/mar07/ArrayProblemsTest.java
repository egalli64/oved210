package claudia.mar07;

import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class ArrayProblemsTest {

	@Test
	public void sumPlain() {
		double[] values = { 1.0, 2.1, 3.0, 4.2, 5.0 };
		double result = ArrayProblems.sum(values);
		assertThat(result, is(15.3));
	}

	@Test
	public void sumNull() {
		double[] values = null;
		double result = ArrayProblems.sum(values);
		assertThat(result, is(0.0));

	}

	@Test
	public void averagePlain() {
		double[] values = { 1.0, 2.0, 3.0 };
		double result = ArrayProblems.average(values);
		assertThat(result, is(2.0));
	}

	@Test
	public void averageNull() {
		double[] values = null;
		double result = ArrayProblems.average(values);
		assertThat(result, is(0.0));
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

	@Test
	public void testMergerEx() {
		int[] left = { 1, 2 };
		int[] right = { 9, 8, 7, 6 };
		int[] result = ArrayProblems.mergerEx(left, right);
		assertEquals(left.length + right.length, result.length);
		assertEquals(1, result[0]);
		assertEquals(9, result[1]);
		assertEquals(2, result[2]);
		assertEquals(8, result[3]);
		assertEquals(7, result[4]);
		assertEquals(6, result[5]);
	}

	@Test
	public void intersectionPlain() {
		double[] left = { 1.1, 4.4, 5.5 };
		double[] right = { 1.1, 7.7 };
		ArrayList<Double> result = ArrayProblems.intersection(left, right);
		assertThat(result.size(), is(1));
		assertThat(result.get(0), is(left[0]));

	}

	@Test
	public void intersectionEmpty() {
		double[] left = { 1.1, 4.4, 5.5 };
		double[] right = { 1.2, 7.7 };
		ArrayList<Double> result = ArrayProblems.intersection(left, right);
		assertThat(result.size(), is(0));
	}

	@Test
	public void missingValue() {
		int[] data = { 1, 3 };

		int result = ArrayProblems.missingValue(data);

		assertEquals(2, result);
	}

	@Test
	public void missingValueSecond() {

		int[] data = { 1, 3, 5, 6, 7, 8, 9, 2 };
		int result = ArrayProblems.missingValue(data);

		assertEquals(4, result);
	}

	@Test
	public void missingValueBySorting() {
		int[] data = { 1, 3 };
		int result = ArrayProblems.missingValueBySorting(data);

		assertEquals(2, result);
	}

	@Test
	public void missingValueBySorting2() {
		int[] data = { 1, 3, 5, 6, 7, 8, 9, 2 };
		int result = ArrayProblems.missingValueBySorting(data);

		assertEquals(4, result);
	}
	
	@Test
	public void missingValueLinear1() {
		int[] data = { 1, 3 };
		int result = ArrayProblems.missingValueLinear(data);

		assertEquals(2, result);
	}

	@Test
	public void missingValueLinear2() {
		int[] data = { 1, 3, 5, 6, 7, 8, 9, 2 };
		int result = ArrayProblems.missingValueLinear(data);

		assertEquals(4, result);
	}
}
