package claudia.mar07;

public class ArrayProblems {

	public static double sum(double[] data) {
		if (data == null) {
			return 0;
		}
		double result = 0;
		for (int i = 0; i < data.length; i++) {
			result += data[i];
		}
		return result;
	}

	public static double average(double[] data) {
		if (data == null || data.length == 0) {
			return 0;
		}
		double result = 0;
		for (int i = 0; i < data.length; i++) {
			result += data[i];
		}
		return result / data.length;
	}

	public static int[] merger(int[] left, int[] right) {
		if (left.length != right.length) {
			throw new IllegalArgumentException("The input arrays should have the same lenght!");
		}
		
		int[] result = new int[left.length + right.length];
		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 0) {
				result[i] = left[i / 2];
			} else {
				result[i] = right[i / 2];
			}
			
		}
		
		return result;
	}
}
