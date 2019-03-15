package alessandraC.mar13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem {

	private static Object key;

	/**
	 * 
	 * 
	 * @param data
	 * @param value
	 * @return the number of values in data
	 */

	public static int count(int[] data, int value) {
		int result = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				result += 1;
			}
		}

		return result;
	}

	/**
	 * <pre>
	 * {2, 2, 2, 1, 1} -> 2
	 * {2, 2, 2, 1, 1, 3, 3, 1, 1} -> 1
	 * </pre>
	 * 
	 * @param data an array of Integer
	 * @return the most popular value in data
	 *
	 */
	public static int mostPopular(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data");
		}
		int result = data[0];
		int resultCount = count(data, result);

		for (int i = 1; i < data.length; i++) {
			int CurCount = count(data, data[i]);
			if (CurCount > resultCount) {
				result = data[i];
				resultCount = CurCount;
			}
		}

		return result;

	}

	public static int mostPopularSorted(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data");
		}

		Arrays.sort(data);

		int result = data[0];
		int resultFrequency = 1;
		int candidate = result;
		int candidateFrequency = 1;

		for (int i = 1; i < data.length; i++) {
			if (data[i] != candidate) {
				if (candidateFrequency > resultFrequency) {
					result = candidate;
					resultFrequency = candidateFrequency;

				}
			}
			if (resultFrequency < candidateFrequency) {
				return result;

			} else {

			}

		}
		return candidate;

	}

	public static int mostPopularHash(int[] data) {
		if(data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data");
			
		}
		
		int result = 0;
		int frequency = 0;
		int candidate = result;
		int candidateFrequency = 1;
		
		
		Map<Integer, Integer> counters = new HashMap<>();
		
			for(int i = 0; i < data.length; i++) {
			Integer counter = counters.get(key);
			if(counter == null) {
				counter = 0;
			}
//			counters.put(data[i], value + 1);
			
				
			}
		
	
		
	
		
		
		return 0;
		
	}

}
