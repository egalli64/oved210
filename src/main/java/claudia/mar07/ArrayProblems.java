package claudia.mar07;

import java.util.ArrayList;

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

	public static int[] mergerEx(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];

		int x = Math.min(left.length, right.length);
		for (int i = 0; i < x * 2; i++) {
			if (i % 2 == 0) {
				result[i] = left[i / 2];
			} else {
				result[i] = right[i / 2];
			}
		}
//	int[] largest = left.length == x ? right : left;
		int[] largest;
		if (left.length > right.length) {
			largest = left;
		} else {
			largest = right;
		}
		int tailSize = largest.length - x;
		for (int i = 0; i < tailSize; i++) {
			result[x * 2 + i] = largest[x + i];
		}
		return result;
	}

	public static ArrayList<Double> intersection(double[] left, double[] right) {
		ArrayList<Double> result = new ArrayList<>();

		for (int i = 0; i < left.length; i++) {
			
			for (int j = 0; j < right.length; j++) 
				if (left[i] == right[j]) {
					result.add(left[i]);
				
			}
		}

		return result;
	}
	
	}


	

