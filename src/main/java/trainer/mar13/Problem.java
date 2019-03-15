package trainer.mar13;

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
			throw new IllegalArgumentException("Bad input data");
		}

		int result = 0;
		int resultCount = 0;
		for (int i = 0; i < data.length; i++) {
			int currentCount = count(data, data[i]);
			if (currentCount > resultCount) {
				result = data[i];
				resultCount = currentCount;
			}
		}
		return result;
	}

	public static int mostPopularSort(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data");
		}

		Arrays.sort(data);

		int result = data[0];
		int resultCount = 1;
		int current = result;
		int currentCount = 1;
		for (int i = 1; i < data.length; i++) {
			if (data[i] != current) {
				if (currentCount > resultCount) {
					result = current;
					resultCount = currentCount;
				}

				current = data[i];
				currentCount = 1;
			} else {
				currentCount++;
			}
		}

		if (resultCount > currentCount) {
			return result;
		} else {
			return current;
		}

//		return resultCount > currentCount ? result : current;
	}

	public static int mostPopularHash(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data");
		}
		
		Map<Integer, Integer> counters = new HashMap<>();

		for(int i = 0; i < data.length; i++) {
			if(counters.containsKey(data[i])) {
				int value = counters.get(data[i]);
				counters.put(data[i], value + 1);
			} else {
				counters.put(data[i], 1);				
			}
		}
		
//		for (int key : data) {
//			Integer counter = counters.get(key);
//			if (counter == null) {
//				counter = 0;
//			}
//			counters.put(key, counter + 1);
//		}

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
	 * {2, 2, 2, 1, 1, 3, 3, 1, 1}, 4 -> 0
	 * </pre>
	 * 
	 * @param data  an array of integers (possibly) w/ repetitions
	 * @param value an integer that could be in data
	 * @return the number of values in data
	 */
	public static int count(int[] data, int value) {
		int result = 0;

		for (int current : data) {
			if (current == value) {
				result += 1;
			}
		}

		return result;
	}

}
