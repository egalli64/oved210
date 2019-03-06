package tiziana.mar04;

public class Problem {

	public static boolean isEven(int value) { // ordinare l'array e trovare il valore più grande
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean hasEven(int[] data) {
		for (int i = 0; i < data.length; i++)
			if (data[i] % 2 == 0) {
				return true;
			}
		return false;
	}
}
