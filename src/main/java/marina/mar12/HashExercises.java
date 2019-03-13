package marina.mar12;

import java.util.HashSet;
import java.util.Iterator;

public class HashExercises {

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

	public static HashSet<Integer> intersection(HashSet<Integer> left, HashSet<Integer> right) {

		HashSet<Integer> result = new HashSet<>();

		if (left.size() == 0 || right.size() == 0) {
			return result;
		}

		for (Integer value : left) {
			if (right.contains(value)) {
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
	 * 
	 * <pre>
	 * 
	 * @param left  a set
	 * @param right another set
	 * @return difference between left and right
	 */

	public static HashSet<Integer> difference(HashSet<Integer> left, HashSet<Integer> right) {

		HashSet<Integer> result = new HashSet<>();

		for (Integer value : left) {
			if (! right.contains(value)) 

//				if (right.contains(value) == false)
			{
				result.add(value);
			}
		}

		return result;
	}
	
}