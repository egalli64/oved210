package donatella.mar07;

public class ArrayProblems {

//	Sum all the values
//	<pre>
//	{1.0,2.1,3.0,4.2,5.0} -> 15.3
//	@param data an array of doubles
//	@return the sum

	public static double sum(double[] data) {
		if (data == null) {
			return (0.0);
		}
		double result = 0;
		int i;
		for (i = 0; i < data.length; i++) {
			result += (data[i]);
		}
		return result;
	}
// average of the value
//	{1.0,2.0,3.0} -> 2.0
//	@param data an array of doubles
//	@return the average

	public static double average(double[] data) {
		if (data == null) {
			return (0.0);

		}
		double result = 0;
		int i;
		for (i = 0; i < data.length; i++) {
			;
			result += (data[i]);
		}
		return result / data.length;
	}
	// oppure return sum(data)/data.lenght dopo return(0.0){;

	// Merge the two passed arrays alternating elements
	// {1,2,3}, {9,8,7} -> {1,9,2,8,3,7}
//	@param left an int array
//	@param right another int array
//	@return the merge of the two input arrays

//	@throws IllegalArgumentException if the two arrays have different size
//	

	public static int[] merger(int[] left, int[] right) {
		if (left.length != right.length) {
			throw new IllegalArgumentException("The input arrays should have the same lenght");
		}
		int results[] = new int[left.length * 2];
		for (int i = 0; i < results.length; i++) {
			if (i % 2 == 0) {
				results[i] = left[i / 2];
			}
			if (i % 2 != 0) {
				results[i] = right[i / 2];
			}

		}
		return results;
	}

// results[i]= i%2==0? left [i/2]: right[i/2];


// Merge the two passed arrays alternating elements
// {1,2}, {9,8,7,6} -> {1,9,2,8,3,7,6}
//@param left an int array
//@param right another int array
//@return the merge of the two input arrays

//
            public static int[] mergerEx(int[]left, int[]right) {
	         int results[]=new int[left.length+right.length];
	
	         int minLen=Math.min(left.length, right.length);
	
	
	         for(int i=0; i< minLen*2; i++) {
		        if(i%2==0) {
			    results[i]=left[i/2];
	            	}	else {
			    results[i]=right[i/2];
		}
	}
		     int[] largest  = left.length == minLen ? right:left;
		     int tailSize = largest.length-minLen;
		     for(int i=0; i< tailSize; i++) {
		    	 results[minLen*2+i]=largest[minLen+i];
		     }
	
	
	
	return results;
}
}