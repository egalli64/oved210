package alessandraC.mar08;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListProblemsTest {
	@Test
	public void intersectionPlain() {
		double[] left = { 1.1, 4.4, 5.5 };
		double[] right = { 1.1, 7.7 };

		ArrayList<Double> results = ArrayListProblems.intersection(left, right);
		assertThat(results.size(), is(1));
		assertThat(results.get(0), is(left[0]));
	}

	@Test
	public void intersectionEmpty() {
		double[] left = { 1.1, 4.4, 5.5 };
		double[] right = { 1.2, 7.7 };

		ArrayList<Double> results = ArrayListProblems.intersection(left, right);
		assertThat(results.size(), is(0));
	}

	@Test
	public void removeDuplicatesPlain() {
		String[] raw = { "aa", "bb", "aa" };
		ArrayList<String> data = new ArrayList<String>();
		for (int i = 0; i < raw.length; i++) {
			data.add(raw[i]);
		}

		ArrayListProblems.removeDuplicates(data);
		assertThat(data.size(), is(2));
		assertThat(data.get(0), is(raw[0]));
		assertThat(data.get(1), is(raw[1]));
	}

	@Test
	public void removeDuplicatesAll() {
		String[] raw = { "aa", "aa", "aa", "aa", "aa" };
		ArrayList<String> data = new ArrayList<String>();
		for (int i = 0; i < raw.length; i++) {
			data.add(raw[i]);
		}

		ArrayListProblems.removeDuplicates(data);
		assertThat(data.size(), is(1));
//		assertEquals(1, data.size());

		assertThat(data.get(0), is("aa"));
//		assertEquals("aa", data.get(0));
	}

	@Test
	public void missingValue2in3() {
		int[] data = { 1, 3 };

		int missing = ArrayListProblems.missingValue(data);
		assertThat(missing, is(2));
//		assertEquals(2, missing);
	}

	@Test
	public void missingValue4in9() {
		int[] data = { 1, 3, 5, 7, 9, 8, 6, 2 };

		int missing = ArrayListProblems.missingValue(data);
		assertThat(missing, is(4));
	}

	@Test
	public void missingValueSort2in3() {
		int[] data = { 1, 3 };

		int missing = ArrayListProblems.missingValueBySorting(data);
		assertThat(missing, is(2));
	}

	@Test
	public void missingValueSort4in9() {
		int[] data = { 1, 3, 5, 7, 9, 8, 6, 2 };

		int missing = ArrayListProblems.missingValueBySorting(data);
		assertThat(missing, is(4));
	}

	@Test
	public void missingValueLinear2in3() {
		int[] data = { 1, 3 };

		int missing = ArrayListProblems.missingValueLinear(data);
		assertThat(missing, is(2));
	}

	@Test
	public void missingValueLinear4in9() {
		int[] data = { 1, 3, 5, 7, 9, 8, 6, 2 };

		int missing = ArrayListProblems.missingValueLinear(data);
		assertThat(missing, is(4));
	}
}
