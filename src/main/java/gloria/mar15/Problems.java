package gloria.mar15;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Problems {

	/**
	 * <pre>
	 * {1, 1, 1, 4, 5, 6, 4, 6, 5} --> {1, 4, 6, 5};
	 * {1, 1, 1, 1, 1, 1, 1, 1, 1, 1} --> {1};
	 * {} --> {}
	 * null --> exception? {}?
	 * </pre>
	 * 
	 * @param data an array list of integer
	 * @return a List containing only unique elements from data
	 */

	public static List<Integer> killDuplicates(List<Integer> data) {
		if (data == null || data.isEmpty()) {
			return Collections.emptyList();
		}

		ArrayList<Integer> buffer = new ArrayList<>(data);
		buffer.sort(null);
		ArrayList<Integer> results = new ArrayList<>();

		Integer value = buffer.get(0);
		results.add(value);
		for (int i = 1; i < buffer.size(); i++) {
			Integer current = buffer.get(i);
			if (!current.equals(value)) {
				results.add(current);
				value = current;
			}

		}

		return results;
	}

	public static List<Integer> killDuplicatesHash(List<Integer> data) {
		if (data == null) {
			return Collections.emptyList();
		}

		return new ArrayList<>(new HashSet<>(data));

	}


}
