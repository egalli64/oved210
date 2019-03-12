package mariangela.mar05;

import java.util.Arrays;
import java.util.HashSet;

public class Problem {

	/*
	 * in: [2, 1, 1] out:2 in: [-1027, 12 , -1027, 12, 42] out: 42
	 */
	public static int findUnique(int[] data) {
		if (data == null || data.length % 2 == 0) {
			throw new IllegalAccessError("Bad input data");
		}
		Arrays.sort(data);
		for (int i = 1; i < data.length; i += 2) {
			if (data[i] != data[i - 1]) {
				return data[i - 1];
			}
		}
		return data[data.length - 1];
	}

	public static int findUniqueHash(int[] data) {
		if( data == null) {
			throw new IllegalAccessError("Bad input data");	
		}
		
		HashSet<Integer> fuh = new HashSet<>();
		for(int i = 0; i < data.length; i++) {
			if(fuh.contains(data[i])) {
				fuh.remove(data[i]);
			} else {
				fuh.add(data[i]);	
			}
			
		}
		if(fuh.size() != 1) {
			throw new IllegalAccessError("Bad input data");	
		}
		return fuh.iterator().next();
		
	}

	/*
	 * in: [2, 1, 1] out:2 in: [-1027, 12 , -1027, 12, 42] out: 42
	 */
	public static int findBigger(int[] data) {
		return 0;

	}

	/*
	 * in: [2, 1, 1] out: true in: [-1027, 12 , -1027, 12, 42] out: false in: [11,
	 * 42] out: true
	 */
	public static boolean hasEven(int[] data) {
		for (int i = 0; 1 < data.length; i++) {
			if (data[i] % 2 == 0) {
				return true;
			}

		}
		return false;

	}

	/*
	 * in: [2, 1, 1] out:2 in: [-1027, 12 , -1027, 12, 42] out: 42
	 */
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;

	}
}