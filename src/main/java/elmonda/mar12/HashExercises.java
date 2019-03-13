package elmonda.mar12;

import java.util.HashSet;

public class HashExercises {
	/**
	 * Intersection of two sets
	 * 
	 * <pre>
	 * {1, 2, 3}, {2, 3, 4} -> {2, 3}
	 * {1, 2, 3}, {4, 5, 6} -> {}
	 * </pre>
	 * 
	 * @param left  a set
	 * @param right another set
	 * @return intersection between left and right
	 */
	public static HashSet<Integer> intersection(HashSet<Integer> left, HashSet<Integer> right) {
		HashSet<Integer> result = new HashSet<>();

		for (Integer value : left) {
			if (right.contains(value)) {  //se right contiene il valore
				result.add(value);
			}
		}

		return result;
	}

	/**
	 * Difference of two sets
	 * 
	 * <pre>
	 * {1, 2, 3}, {2, 3, 4} -> {1}
	 * {1, 2, 3}, {4, 5, 6} -> {1, 2, 3}
	 * </pre>
	 * 
	 * @param left  a set
	 * @param right another set
	 * @return difference between left and right
	 */
	public static HashSet<Integer> difference(HashSet<Integer> left, HashSet<Integer> right) {
		HashSet<Integer> result = new HashSet<>();

		for (Integer value : left) {
			if (!right.contains(value)) {  // se right non contiene il valore, allora lo metto in result
				result.add(value);          // right non contiene i valori di left 1,2,3 quindi li ritorno
			}
		}

		return result;
	}
	}

