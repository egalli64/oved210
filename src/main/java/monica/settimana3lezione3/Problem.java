package monica.settimana3lezione3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem {

	/**
	 * {2,2,2,1,1} -> 2 {2,2,2,1,1,3,3,1,1} -> 1
	 * 
	 * @param data an array of integer
	 * @return return the most popular value in data
	 */

	public static int count(int[] data, int value) {
		int counter = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				counter = counter + 1; // equivalente a : counter ++ oppure counter += 1

			}
		}
		return counter;
	}

	public static int mostPopular(int[] data) {
		int result = data[0];
		int resultFrequency = Problem.count(data, result);

		for (int i = 0; i < data.length; i++) {
			int frequency = Problem.count(data, data[i]);

			if (frequency > resultFrequency) {
				result = data[i];
				resultFrequency = frequency;
			}

		}
		return result;
	}
// esempio difficile

	public static int mostPopular2(int[] data) {

		Arrays.sort(data);

		int result = data[0];
		int resultFrequency = 1;
		int current = result;
		int currentFrequency = 1;
		for (int i = 1; i < data.length; i++) {
			if (data[i] == data[i - 1]) {
				currentFrequency++;
			}
			if (data[i] != data[i - 1]) {
				current = data[i];
				currentFrequency = 1;

				if (currentFrequency > resultFrequency) {
					result = current;
					resultFrequency = currentFrequency;
				}

				current = data[i];
				currentFrequency = 1;
			} else {
				currentFrequency++;
			}

		}
		if (resultFrequency > currentFrequency) {
			return result;

		} else {
			return current;
		}

	}

//altro problema

	public static int mostPopularHash(int[] data) {

		Map<Integer, Integer> counters = new HashMap<>();

		for (int i = 0; i < data.length; i++) {
			if (counters.containsKey(data[i])) {
				int value = counters.get(data[i]);
				counters.put(data[i], value + 1);
			} else {
				counters.put(data[i], 1);
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
		
			
		}
	return 0;
	}
}
