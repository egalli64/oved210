package mariangela.mar13;

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
			throw new IllegalArgumentException("Bad input data!");
		}
		int result = data[0];
		int resultCount = count(data, result);

		for (int i = 1; i < data.length; i++) {
			int currentCount = count(data, data[i]);

			if (currentCount > resultCount) {

				resultCount = currentCount;
				result = data[i];
			}
		}
		return result;
	}

	public static int mostPopularSort(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data!");
		}
		Arrays.sort(data);
		int result = data[0];
		int candidate = result;
		int candidateFrequency = 1;
		int resultFrequency = 1;

		for (int i = 0; i < data.length; i++) {
			if (data[i] != candidate) {
				if (candidateFrequency > resultFrequency) {
					result = candidate;
					resultFrequency = candidateFrequency;

				}
				candidate = data[i];
				candidateFrequency = 1;
			} else {
				candidateFrequency++;
			}
		}
		if (resultFrequency < candidateFrequency) {
			return result;
		} else {

			return candidate;
		}
	}

	public static int mostPopularHash(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data!");
		}
		Map<Integer, Integer> counters = new HashMap<>();
		for (int i = 0; i < data.length; i++) {

			if (counters.containsKey(data[i])) {
				int value = counters.get(data[i]);
				counters.put(data[i], value + 1);
			} else {

				counters.put(data[i], 1);
			}

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
	 * {2, 2, 2, 1, 1}, 2 -> 3
	 * {2, 2, 2, 1, 1, 3, 3, 1, 1}, 3 -> 2
	 * </pre>
	 * 
	 * @param data
	 * @param value
	 * @return the number of values in data
	 */
	public static int count(int[] data, int value) {

		int result = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				result++;

			}
		}

		return result;
	}
}
