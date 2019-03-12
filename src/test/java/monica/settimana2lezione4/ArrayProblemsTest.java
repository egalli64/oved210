package monica.settimana2lezione4;//07/03/19

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class ArrayProblemsTest {

	@Test
	public void sum() {
		double [] values = {1.0, 2.1, 3.0, 4.2, 5.0};
		double result = ArrayProblems.sum(values);
		assertThat (result,is(15.3));		
		}
	
	@Test
	public void average() {
		double [] values = {1.0, 2.0, 3.0,};
		double result = ArrayProblems.average(values);
		assertThat (result,is(2.0));	
}
	
	
	@Test
	public void merger() {
		int [] left = {1, 2, 3};
		int [] right = {9, 8, 7};
		
		
		int []result = ArrayProblems.merger(left, right);
		assertEquals (left.length+ right.length, result.length);
		assertEquals(1, result[0]);
		assertEquals(9,result[1]);
		assertEquals(2, result[2]);
		assertEquals(8,result[3]);
		assertEquals(3, result[4]);
		assertEquals(7,result[5]);
		}



//08.03.2019 V lezione
@Test
public void mergerEx() {
	int [] left = {1, 2};
	int [] right = {9, 8, 7,6};
	
	int []results = ArrayProblems.mergerEx(left, right);
	assertEquals (left.length+ right.length, results.length);
	assertEquals(1, results[0]);
	assertEquals(9,results[1]);
	assertEquals(2, results[2]);
	assertEquals(8,results[3]);
	assertEquals(7, results[4]);
	assertEquals(6,results[5]);
	}

}
