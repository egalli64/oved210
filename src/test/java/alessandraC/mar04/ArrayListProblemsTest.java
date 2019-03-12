package alessandraC.mar04;

import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

import alessandraC.mar08.ArrayListProblems;

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
	}

	@Test
	public void removeDuplicateAll() {
		String[] raw = { "aa", "aa", "aa", "aa", "aa" };
		ArrayList<String> data = new ArrayList<String>();
		for (int i = 0; i < raw.length; i++) {
			data.add(raw[i]);

		}
		ArrayListProblems.removeDuplicates(data);
		assertThat(data.size(), is(1));
//	assertEquals(1, data.size());

		assertThat(data.get(0), is("aa"));
		assertEquals("aa", data.get(0));

	}
}
