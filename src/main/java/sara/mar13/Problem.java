package sara.mar13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem {
	/**
	 * <pre>
	 * {2, 2, 2, 1, 1} -> 2
	 * {2, 2, 2, 1, 1, 3, 3, 1, 1} -> 1
	 * </pre>
	 * 
	 * @param data an array of integer
	 * @return the most popular value in data
	 */

	public static int mostPopular(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalAccessError("bad input data!");
		}
//metodo O(n2) perchè fa un for 
		int result = 0;
		int resultCount = 0;

		for (int i = 0; i < data.length; i++) {
			int frequency = count(data, data[i]); // richiamo al metodo count che c'è giù per contare
			if (frequency > resultCount) {
				result = data[i];
				resultCount = frequency;
			}
		}
		return result;
	}

	public static int mostPopularSort(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalAccessError("bad input data!");
		}

		Arrays.sort(data);

		int result = 0;
		int current = result;
		int frequencyCurrent = 1;
		int frequencyResult = 1;

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
			throw new IllegalAccessError("bad input data!");
		}

		Map<Integer, Integer> counters = new HashMap<>();
		for (int key : data) {
			Integer counter = counters.get(key);
			if (counter == null) {
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

	/**
	 * <pre>
	 *{2, 2, 2, 1, 1}, 2 -> 3
	 *{2, 2, 2, 1, 1, 3, 3, 1, 1}, 1 -> 4
	 * </pre>
	 * 
	 * @param data an array of integer
	 * @return the most popular value in data
	 */

	public static int count(int[] data, int value) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				count += 1;
			}
		}
		return count;
	}
}