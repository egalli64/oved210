package francesca.mar13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem {
	/**
	 * <pre>
	 * {2, 2, 2, 1, 1} -> 2 //contami quanti 2 ci sono qua dentro
	 * {2, 2, 2, 1, 1, 3, 3, 1, 1} -> 1
	 * </pre>
	 * @param data an array of integer
	 * @return the most popular value in data
	 */
	public static int mostPopular(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data!");
			
		}
		
		int result = 0;
		int resultCount = 0;
		
		// dire quale elemento si presenta con la massima frequenza, in questo caso il numero 1 si presenta con la frequenza piu alta sia rispetto al 2 e sia rispetto ale 3
		for (int i = 0; i < data.length; i++) {
			int currentCount = count(data, data[i]);
			if (currentCount > resultCount) {
				result = data[i];
				resultCount = currentCount;
			}
		}
		return result;
	}
	
	/**
	 * 
	 * {2, 2, 2, 1, 1}, 2 -> 3
	 * 
	 * @param data
	 * @param value
	 * @return the number of values in data
	 */
	public static int count(int[] data, int value) {
		int count =  0; 
		for (int i = 0; i < data.length; i++) {
			if(data[i] == value) {
				count += 1;
				
				
			}	
		}
		return count;	
	}
	
	public static int mostPopularsort(int[] data) {
		
		int result = data[0];
		int resultCount = 1;
		int current = result;
		int currentCount = 1;
		int frequencyresult = 0;
		int frequencycurrent = 0;
		
		for (int i = 1; i < data.length; i++) {
			if (data[i] == data[i - 1]) {
				frequencycurrent ++;
			} else {
				frequencyresult ++;
			}
			if (frequencyresult > frequencycurrent) {
				result = data[i];
				frequencycurrent = frequencyresult;
			}
		}
		return result;
	}
	
	public static int mostPopularHash(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad input data!");
			
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
			if(currentFrequency > frequency) {
				result = entry.getKey();
				frequency = entry.getValue();
			}
		
	}
	
	return 0;
	}
}

	
		
	

		
	
	
	


