package monica.settimana3lezione2; //12/03/19

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * Intersection of two sets
 * 
 * <pre>
 * {1, 2, 3}, {2, 3, 4} -> {2, 3} {1, 2, 3}, {4, 5, 6} -> {}
 * 
 * <pre>
 * 
 * @param left  a set
 * @param right another set
 * @return intersection between left and right
 */

public class HashExercises {
	public static HashSet<Integer> intersection(HashSet<Integer> left, HashSet<Integer> right) {
		HashSet<Integer> result = new HashSet<>();
		for (Integer value : left) { // esempio di for in HashSet
			if (right.contains(value)) {
				result.add(value);
			}
		}

		return result;
	}

	public static HashSet<Integer> difference(HashSet<Integer> left, HashSet<Integer> right) {
		HashSet<Integer> result = new HashSet<>();
		for (Integer value : left ) {
			if (!right.contains(value)) {
				result.add(value);
			}
		}
		return result;

	}

}
