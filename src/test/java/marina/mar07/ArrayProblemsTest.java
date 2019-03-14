package marina.mar07;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;

import org.junit.Test;

import marina.mar06.SimpleMethods;

public class ArrayProblemsTest {

	@Test
	public void testSum() {
		double[] values = { 1.0, 2.1, 3.0, 4.2, 5.0 };
		double result = ArrayProblems.sum(values);
		assertEquals(result, 15.3, 0.001);
	}

	@Test
	public void testSumNull() {
		double[] values = null;
		double result = ArrayProblems.sum(values);
		assertEquals(result, 0.0, 0.001);
	}

	@Test
	public void testSumEmpty() {
		double[] values = {};
		double result = ArrayProblems.sum(values);
		assertEquals(result, 0.0, 0.001);
	}
	
	@Test
	public void testAverage() {
		double[] values = { 1.0, 2.0, 3.0 };
		double result = ArrayProblems.average(values);
		assertEquals(result, 2.0, 0.001);
	}

	@Test
	public void testAverageNull() {
		double[] values = null;
		double result = ArrayProblems.average(values);
		assertEquals(result, 0.0, 0.001);
	}
	
	@Test
	public void testMerger() {
		int[] right = { 1, 2, 3 };
		int[] left =  {9, 8, 7 };
		int[] result = ArrayProblems.merger(left, right);
		
		assertEquals(left.length + right.length, result.length);
	}
	
//	@Test
//	public void testMergerNull() {
//		int[] right = null;
//		int[] left =  null;
//		int[] result = ArrayProblems.merger(left, right);
//		
//		assertEquals(result, null);
//	}
	
	@Test
	public void testMergerEx() {
		int[] right = { 1, 2, 5, 8};
		int[] left =  {9, 8, 7, 6 };
		int[] result = ArrayProblems.mergerEx(left, right);		
		
		assertEquals(left.length + right.length, result.length);
	}
	
		
	@Test
	public void mergerExFirstShort() {
		int[] left = { 1, 2 };
		int[] right = { 9, 8, 7, 6 };
		
		int[] result = ArrayProblems.mergerEx(left, right);
		assertEquals(left.length + right.length, result.length);
	}
	
	@Test
	public void mergerExFirstLong() {
		int[] left = { 1, 2, 3, 4 };
		int[] right = { 9, 8 };
		
		int[] result = ArrayProblems.mergerEx(left, right);
		assertEquals(left.length + right.length, result.length);
	}
	
	
		
}
