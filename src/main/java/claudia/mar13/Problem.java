package claudia.mar13;

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
		int result = data[0];
		int resultCount = counter(data, result);
		for (int i = 1; i < data.length; i++) {
			int frequency = counter(data, data[i]);

			if (frequency > resultCount) {
				result = data[i];
			}
		}

		return result;
	}

	public static int counter(int[] data, int value) {
		int counter = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				counter++;
			}
		}
		return counter;
	}

	public static int mostPopularSorted(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data");
		}
		Arrays.sort(data);

		int result = data[0];
		int frequency = 1;
		int current = result;
		int currentFrequency = 1;

		for (int i = 1; i < data.length; i++) {
			if (data[i] != current) {
				if (currentFrequency > result) {
					result = current;
					frequency = currentFrequency;
				}
				current = data[i];
				currentFrequency = 1;
			} else {
				currentFrequency++;
			}
		}
		if (frequency > currentFrequency) {
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
}