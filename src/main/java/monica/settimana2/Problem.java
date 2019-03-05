package monica.settimana2; //05/03/19

public class Problem {

	public static int findUnique(int[] data) {
		if (data == null || data.length % 2 == 0) {
			throw new IllegalArgumentException();
		}

		return 0;
	}

	
	public static int findBigger(int[] data) {
		int result = Integer.MIN_VALUE;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] > result) {
				result = data[i];
			}
		}
		
		return result;
	}

	
	
	
	public static boolean hasEven(int[] data) {

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				return true;
			}
		}
		return false;
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}

}
