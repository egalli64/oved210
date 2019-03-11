package sara.mar08;

import static org.junit.Assert.*;


import java.util.ArrayList;

import static org.hamcrest.core.Is.*;

import org.hamcrest.Matcher;
import org.junit.Test;

public class ArrayListProblemsTest {

	@Test
	public void inserctionPlain() {
		double[] left = { 1.1, 4.4, 5.5 };
		double[] right = { 1.1, 7.7 };

		ArrayList<Double> result = ArrayListProblems.intersection(left, right);
		assertThat(result.size(), is(1));
		assertThat(result.get(0), is(left[0]));
	}

	@Test
	public void inserctionEmpty() {
		double[] left = { 1.1, 4.4, 5.5 };
		double[] right = { 1.2, 7.7 };

		ArrayList<Double> result = ArrayListProblems.intersection(left, right);
		assertThat(result.size(), is(0));
	}

	@Test
	public void removeDuplicates() {
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
	//ESERCIZIO MISSING VALUE	
	@Test
	public void missingValue4in9() {
		int [] data = {1,3,5,7,9,8,6,2};
		int missing = ArrayListProblems.missingValue(data);
		assertEquals(4, missing); 
	}
	//ESERCIZIO MISSING VALUE BY SORTING	
	@Test
	public void missingValueSort4in9() {
		int [] data = {1,3,5,7,9,8,6,2};
		int missing = ArrayListProblems.missingValueBySorting(data);
		assertEquals(4, missing); 
	}
	//ESERCIZIO MISSING VALUE LINEAR	
	@Test
	public void missingValueLinear4in9() {
		int [] data = {1,3,5,7,9,8,6,2};
		int missing = ArrayListProblems.missingValueLinear(data);
		assertEquals(4, missing); 
	}
	
}
