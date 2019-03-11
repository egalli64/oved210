package monica.settimana2lezione5; //08/03/19

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListProblemsTest {

	@Test
	public void intersection() {
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
	public void removeDuplicatesProblems() {
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
	public void missingValue() {
		int[] data = { 3, 5, 1, 4 };

		int result = ArrayListProblems.missingValue(data); // cosi scrivo il metodo
		assertEquals(2, result); // controllo -> potevo anche scrivere assertThat(missing,is(2))

	}

	@Test
	public void missingValueSort() {
		int[] data = { 1, 3, 4 };

		int missing = ArrayListProblems.missingValueSort(data);
		assertThat(missing, is(2));
	}

	@Test
	public void missingValueLinear() {
		int[] data = { 1, 3, 4 };
		int missing = ArrayListProblems.missingValueLinear(data);
		
		assertThat(missing, is(2));
	}
}
