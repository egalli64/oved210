package claudia.mar06;

public class SimpleMethods {

//	input: char c; output: true if c is an uppercase character ('A'), FALSE otherwise ('h')
//	'6' 

	public static boolean isUpper(char c) {
		if (c >= 'A' && c <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isAlpha(char c) {
		if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
			return true;
		} else {

			return false;
		}
	}

	public static char toUpper(char c) {
		if (c < 'a' || c > 'z') {

			return c;
		}

		int delta = c - 'a';
		return (char) ('A' + delta);
	}

//	return(char)(c + 'A' - 'a'); è la stessa cosa del delta

	// input: int[] data --> output: smallest element {1, 2, 5, -7} --> -7

	public static int smallest(int[] data) {

		if (data == null || data.length == 0) {
			return Integer.MAX_VALUE;
		}

//		
		int currentMinimum = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < currentMinimum) {
				currentMinimum = data[i];
			}
		}

		return currentMinimum;

	}

	public static int firstSmallestIndex(int[] data) {

		if (data == null || data.length == 0) {
			return -1;
		}
		int index = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[index] > data[i]) {
				index = i;
			}
		}

		return index;
	}

	public static int lastSmallestIndex(int[] data) {

		if (data == null || data.length == 0) {
			return -1;
		}
		int index = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i] <= data[index]) {
				index = i;
			}
		}
		return index;
	}

	public static boolean find(int[] data, int target) {
//		if (data == null || data.length == 0) {
//			return false;}

		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {

				return true;
			}
		}
		return false;
	}

	public static void reverse(int[] data) {
		if (data == null || data.length < 2) {
			return;
		}

		int left = 0;
		int right = data.length - 1;
		for(; left < right; left++, right--) {
		int temp = data[left];
		data[left] = data[right];
		data[right] = temp;

	}}

	public static int[] reverseReturn(int[] data) {
		if (data == null || data.length < 2) {
			return data;
		}

		int[]result = new int[data.length];
		
		for (int i = 0; i < data.length; i++) {
			result[i] = data[data.length - 1 - i];
		}

		return result;
	}
}
		
