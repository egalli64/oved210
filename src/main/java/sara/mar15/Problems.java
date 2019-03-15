package sara.mar15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problems {

	/**
	 * <pre>
	 * {1,1,1,4,5,6,4,6,5} -> {1,4,6,5}
	 * {1,1,1,1,1,1,1,1,1,1} -> {1}
	 * {} -> {}
	 * null -> exception? {}?
	 * </pre>
	 * 
	 * @param data an array list of integer
	 * @return a List containing only unique elements from data
	 */
	public static List<Integer> killDuplicates(List<Integer> data) {
		if (data == null || data.isEmpty()) {
			throw new UnsupportedOperationException("Not yet implemented");
		}

		ArrayList<Integer> buffer = new ArrayList<Integer>(data);
		buffer.sort(null); // ordine naturale
		ArrayList<Integer> result = new ArrayList<Integer>();

		int value = buffer.get(0);
		result.add(value);

		for (int i = 1; i < buffer.size(); i++) {
			int current = buffer.get(i);
			if (current != value) {
				buffer.add(value);

			}

		}
		return result;

	}

} 
