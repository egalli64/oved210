package tiziana.mar08;

import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class ArrayListProblemTest {
	@Test
	public void intersectionPlain() {
		double[] left = { 1.1, 4.4, 5.5 };
		double[] right = { 1.1, 7.7 };

		ArrayList<Double> results = ArrayListProblem.intersection(left, right);
		assertThat(results.size(), is(1));
		assertThat(results.get(0), is(left[0]));
	}

	@Test
	public void intersectionEmpty() {
		double[] left = { 1.1, 4.4, 5.5 };
		double[] right = { 1.2, 7.7 };

		ArrayList<Double> results = ArrayListProblem.intersection(left, right);
		assertThat(results.size(), is(0));
	}

	@Test
	public void removeduplicates() {
		String[] rox = { "aa", "bb", "aa" };
		ArrayList<String> data = new ArrayList<String>();
		for (int i = 0; i < rox.length; i++) {
			data.add(rox[i]);
		}

		ArrayListProblem.removeDuplicates(data);
		assertThat(data.size(), is(2));
		assertThat(data.get(0), is(rox[0]));
		assertThat(data.get(1), is(rox[1]));

	}
}
