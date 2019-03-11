package elmonda.mar08;

import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.hamcrest.core.Is.*;
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
	String[] raw = { "aa", "bb", "aa"};
	ArrayList<String> data = new ArrayList<String>();
	for(int i = 0; i < raw.length; i++) {
		data.add(raw[i]);
	}
	ArrayListProblems.removeDuplicates(data);
	assertThat(data.size(), is(2));
	assertThat(data.get(0), is(raw[0]));
	assertThat(data.get(1), is(raw[1]));

}
	@Test
	public void removeDuplicatesAll() {
		String[] raw = { "aa", "aa", "aa", "aa", "aa"};
		ArrayList<String> data = new ArrayList<String>(); //  (raw) per inizializzare facilmente. Nell'arrey list buttami denro tutti gli elementi dell'arrey
		for(int i = 0; i < raw.length; i++) {
			data.add(raw[i]);
}
		ArrayListProblems.removeDuplicates(data);  // non ritorna niente, riceve in data, lo manipola  ein data ci dev'essere il risultato,
		// tutti i duplicati devono essere buttati via
		//assertThat(data.size(),is(1));        // voglio che data conenga un solo elemento
		  
		assertThat(data.size(), is(1));
		//assertEquals(1, data.size());
		assertThat(data.get(0), is("aa"));
		//assertEquals("aa", data.get(0));
	}
	
	@Test
	public void missingValue() {
		
		int[] data = {1, 3, 4, 5};
		
		//int result = ArrayListProblems.missingValue(data);
		int missing = ArrayListProblems.missingValue(data);
		//assertEquals(2, result);
		assertThat(missing, is(2));
	}
	
	@Test
	public void missingValue4in9() {
		int[] data = {1, 3, 5, 7, 9, 8, 6, 2 };
		
		int missing = ArrayListProblems.missingValue(data);
		assertThat(missing, is(4));
	}
	
	@Test
	public void missingValueSort2in3() {
		int[] data = {1, 3};
		
		int missing = ArrayListProblems.missingValueBySorting(data);
		assertThat(missing, is(2));
	}
	@Test
	public void missingValueSort4in9() {
		int[] data = {1, 3, 5, 7, 9, 8, 6, 2};
		
		int missing = ArrayListProblems.missingValueBySorting(data);
		assertThat(missing, is(4));
	}
	
	@Test
	
	public void missingValueLinear() {
		int[] data = {1, 3, 5, 7, 9, 8, 6, 2};
		
		int missing = ArrayListProblems.missingValueLinear(data);
		assertThat(missing, is(4));
	}
}

