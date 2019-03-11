package marina.mar04;

public class Problem {
	/*
	 * in: [1, 1, 2] out:2 
	 * in: [-1027, 12, -1027,12, 42] out:42
	 * 
	 */

	public static boolean hasEven(int[] data) {

		for (int value : data) {
			if (value % 2 == 0) {
				return true;
			}
		}
		return false;
	}

//	public static boolean hasEven(int[] data) {
//		
//		for (int i = 0; i < data.length; i++) {
//		
//			if (data[i] % 2 == 0) {
//				return true;
//			}
//		}
//		return false;
//	}

	public static boolean isEven(int value) {

		if (value % 2 == 0) {
			return true;
		}
		return false;
	}
}
