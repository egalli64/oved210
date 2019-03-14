package gloria.mar13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem {

	/**
	 * 
	 * <pre>
	 * {2, 2, 2, 1, 1} --> 2; 
	 * {2, 2, 2, 1, 1, 3, 3, 1, 1} --> 1
	 * </pre>
	 * 
	 * @param data an array of integer
	 * @return the most popular value in data
	 */

	public static int mostPopular(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("");
		}

		int result = data[0]; // int result = 0;
		int resultCount = count(data, result); // int resultCount = 0;

		for (int i = 1; i < data.length; i++) { // for( int i = 0; ... ; ...){
			int popular = count(data, data[i]);
			if (popular > resultCount) {
				result = data[i];
				resultCount = popular;
			}
		}

		return result;
	}

	/**
	 * 
	 * @param data
	 * @param value
	 * @return the number of values in data
	 * 
	 */

	public static int count(int[] data, int value) {
		int count = 0;

		for (int k = 0; k < data.length; k++) {
			if (data[k] == value) {
				count += 1;
			}
		}

		return count;
	}

	/**
	 * <pre>
	 * {2, 2, 2, 1, 1},2 --> 3;
	 * {2, 2, 2, 1, 1, 3 ,3, 1, 1}, 3 --> 2;
	 * {2, 2, 2, 1, 1, 3 ,3, 1, 1}, 4 --> 0;
	 * </pre>
	 * 
	 * @param data  an array of integers (possibly) w/repeti
	 * @param value an integer that could be in data
	 * @return the number of values in data
	 */

	public static int mostPopularArraysSort(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("");
		}

		Arrays.sort(data);

		int result = data[0];
		int current = result;
		int frequencyResult = 1;
		int frequencyCurrent = 1;
		for (int i = 1; i < data.length; i++) {
			if (data[i] != current) {
				if (frequencyCurrent > frequencyResult) {
					result = current;
					frequencyResult = frequencyCurrent;
				}

				current = data[i];
				frequencyCurrent = 1;
			} else {
				frequencyCurrent++;
			}
		}

		if (frequencyResult > frequencyCurrent) {
			return result;
		} else {
			return current;

		}
	}

	public static int mostPopularHash(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data");
		}

		Map<Integer, Integer> counters = new HashMap<>();

		for (int key : data) { // for(int i = 0; i < data.lenght; i++)
			Integer counter = counters.get(key);
			if (counter == null) { // if(counters.containsKey(data[i])); int value = counters.get(data[i]);
									// counters.put(data[i], value +1)}else{counters.put(data[i], 1);
				counter = 0;
			}
			counters.put(key, counter + 1);
		}
		
		int result = 0;
		int frequency = 0;
		for (Map.Entry<Integer, Integer> entry : counters.entrySet()) {
			int currentFrequency = entry.getValue();
			if (currentFrequency > frequency) {
				result = entry.getKey();
				frequency = entry.getValue();
			}
		}
		return result;

	}
}
