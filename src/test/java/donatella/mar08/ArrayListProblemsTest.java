package donatella.mar08;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import java.util.ArrayList;

import org.hamcrest.Matcher;
import org.junit.Test;

public class ArrayListProblemsTest {

	private Matcher result;

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
	public void removePlain() {
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

		assertThat(data.get(0), is("aa"));
//		  assertEquals("aa",data.get(0));
	}

	@Test
	public void missingValue1() {
		int[] data = { 1, 3 };

		int missing = ArrayListProblems.missingValue(data);
		assertThat(missing, is(2));
	}

//@Test
	public void missingValue2() {
		int[] data = { 1, 3, 5, 7, 9, 8, 6, 2 };
		int missing = ArrayListProblems.missingValue(data);
		assertThat(missing, is(4));

	}

	@Test
	public void missingValueBySorting() {
		int[] data = { 1, 3 };
		int result = ArrayListProblems.missingValueBySorting(data);
		assertEquals(result, 2);
	}

	@Test
	public void missingValueBySorting2() {
		int[] data = { 1, 3, 5, 7, 9, 8, 6, 2 };
		int result = ArrayListProblems.missingValueBySorting(data);
		assertEquals(result, 4);

	}

	@Test
	public void missingvalueLinear() {
		int[] data = { 1, 3 };
		int result = ArrayListProblems.missingValueLinear(data);
		assertEquals(result, 2);

	}

	@Test
	public void missingValueLinear2() {
		int[] data = { 1, 3, 5, 7, 9, 8, 6, 2 };
		int result = ArrayListProblems.missingValueLinear(data);
		assertEquals(result, 4);
	}
}