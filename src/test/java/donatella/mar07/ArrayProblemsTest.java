package donatella.mar07;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Test;

import trainer.mar07.ArrayProblems;

import static org.hamcrest.core.Is.*;

public class ArrayProblemsTest {

	@Test
	public void testSumPlain() {
		double[]values= {1.0,2.1,3.0,4.2,5.0};
		double result = ArrayProblems.sum(values);
		assertEquals(result,15.3,0.001);
		
	}

	 
      @Test
    public void TestSumNull() {
	double[]values=null;
	double result = ArrayProblems.sum(values);
	assertThat(result, is (0.0));
	
}
           @Test
           public void testAveragePlain() {
	       double[]values= {1.0,2.0,3.0};
	       double result=ArrayProblems.average(values);
	       assertEquals(result,2.0,0.001);
	
}
           @Test
             public void testAverageNull() {
	            double []values= null;
	            double result= ArrayProblems.average(values);
	            assertThat(result, is(0.0));
}
           @Test
           public void testMerger() {
        	   int[] left= {1,2,3};
        	   int[] right= {9,8,7};
        	   
        	   int[] result =ArrayProblems.merger(left, right);
        	   assertEquals(left.length+right.length, result.length);
        	   assertEquals(1,result[0]);
               assertEquals(9,result[1]);
               assertEquals(2,result[2]);
               assertEquals(8,result[3]);
               assertEquals(3,result[4]);
               assertEquals(7,result[5]);
           }
           @Test 
           public void TestMergerEx() {
        	   int[]left= {1,2};
        	   int[]right= {9,8,7,6};
        	   
        	   int[]result=ArrayProblems.mergerEx(left, right);
        	   assertEquals(left.length+right.length, result.length);
        	   assertEquals(1,result[0]);
               assertEquals(9,result[1]);
               assertEquals(2,result[2]);
               assertEquals(8,result[3]);
               assertEquals(7,result[4]);
               assertEquals(6,result[5]);
           }
           @Test
       	public void mergerExFirstShort() {
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
      	public void mergerExFirstLong() {
      		int[] left = { 1, 2, 3, 4 };
      		int[] right = { 9, 8 };
      		
      		int[] result = ArrayProblems.mergerEx(left, right);
      		assertEquals(left.length + right.length, result.length);
      		assertEquals(1, result[0]);
      		assertEquals(9, result[1]);
      		assertEquals(2, result[2]);
      		assertEquals(8, result[3]);
      		assertEquals(3, result[4]);
      		assertEquals(4, result[5]);
      	}
}
