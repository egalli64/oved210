package alessandraB.mar15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

public class Problems {

	/**
	 * {1,1,1,4,5,6,4,6,5} --> {1,4,5,6} {1,1,1,1,1,1,1} --> {1} {} --> {} null -->
	 * throw exception? {}? data an array list of Integer return a List containing
	 * only unique elements from data.
	 */
	public static List<Integer> killDuplicates(List<Integer> data) {
		if (data == null || data.isEmpty()) {
			throw new IllegalArgumentException("bad input");
		}

		ArrayList<Integer> buffer = new ArrayList<Integer>(data);
		buffer.sort(null);

		ArrayList<Integer> result = new ArrayList<Integer>();

		int previousValue = buffer.get(0);
		result.add(previousValue);

		for (int i = 1; i < buffer.size(); i++) {
			int current = buffer.get(i);
			if (current != previousValue) {
				previousValue = current;
				result.add(current);

			}
		}

		return result;
	}

	public static List<Integer> killDuplicatesHash(List<Integer> data) {
		if (data == null) {
			throw new IllegalArgumentException("bad input");
		}

		HashSet <Integer> noDuplicates = new HashSet<> (data);
		ArrayList <Integer> result = new ArrayList <Integer> (noDuplicates);

      return result;
	}
}
