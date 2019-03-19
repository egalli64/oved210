package donatella.mar13;

import java.util.HashMap;
import java.util.Map;

public class Problem {

	private static int i;

//	{2,2,2,1,},-> 2
//	{2,2,2,1,1,3,3,1,1},->1

//	@param data an array of integer
//	@return the most popular value in data
//	@param data
//	@param value
//	@return the number of values in data

	public static int mostPopular(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data");
		}

		int result = data[0];
		int resultCount = count(data, result);
		for (int i = 1; i < data.length; i++) {
			int frequency = count(data, data[i]);
			if (frequency > resultCount) {

				result = data[i];

			}
		}
		return result;

	}

	public static int count(int[] data, int value) {
		int x = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				x++;
			}
		}

		return x;

	}

//	public static int mostPopularSort(int[] data) {
//		if (data == null || data.length == 0) {
//			throw new IllegalArgumentException("Bad input data");
//		}
//		Arrays.sort(data);
//		
//		int currentCount = 1;
//		int resultCount = 1;
//		int result =data[0];
//		int current = result;
//		for (int i = 0; i < data.length; i++) {
//			if(data[i]!=current) {
//				result=current;
//			}
//
//			return 0;
//		}
//		return current;
//	}
//
//}

	public static int mostPopularHash(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data");
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
}
