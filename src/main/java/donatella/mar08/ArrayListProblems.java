package donatella.mar08;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListProblems {

//	Doubles contained in both input arrays
//	{1.1,4.4,5.5},{1.1,};
//	
//	@param left
//	@param right
//	return the doubles contained in both left and right

	static public ArrayList<Double> intersection(double[] left, double[] right) {

		ArrayList<Double> results = new ArrayList<>();

		for (double iValue : left) {
			for (double rValue : right) {
				if (iValue == rValue) {
					results.add(iValue);
				}
			}
		}
		return results;

	}

//	        Remove duplicates
//	        {"aa","bb","aa"}-> {"aa","bb"}
//          @param data a list of String

	public static void removeDuplicates(ArrayList<String> data) {
		System.out.println();
		for (int i = 0; i < data.size() - 1; i++) {
			String s = data.get(i);
			for (int j = data.size() - 1; j > i; j--) {
				String t = data.get(j);
				if (s.equals(t)) {
					data.remove(j);
				}
			}
		}

	}

//Given n-1 values in[1,n], return the missing value
//{1,3} ->2
//{1,3,5,7,9,8,6,2} ->4

// public static int missingValue1(int[]data) {
//	 int maxNumber=3;
//	findMissingNumber(data,maxNumber);
//	 
// }
//
//    private static void findMissingNumber(int[] data, int maxNumber) {
//	// TODO Auto-generated method stub
//	
//}
//
//
//	public static int missingValue2(int[] data) {
//     int maxNumber=9;
//     findMissingNumber(data,maxNumber);
//     
//   private static void findMissingNumber(int[] arr, int max) {
//	int sumOfallNumbers=0;
//	int currentSum=0;
//	
//	sumOfallNumbers(max*(max+1))/2;
//	
//	for(int i=0;i<arr.length;i++) {
//		currentSum+=arr[i];
//	}

	public static int missingValue(int[] data) {

		for (int i = 1; i <= data.length + 1; i++) {

			boolean found = false;

			for (int j = 0; j < data.length; j++) {

				if (data[j] == i) {
					found = true;
					break;
				}
			}
			if (found == false) {
				return i;
			}
		}
		return 0;
//	oppure throw new IllegalStateException();
	}

	public static int missingValueBySorting(int[] data) {
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			if (data[i] != i + 1) {
				return i + 1;
			}
		}
		throw new IllegalStateException();
	}

	public static int missingValueLinear(int[] data) {
		boolean[] flags = new boolean[data.length + 1];
		
		for (int i = 0; i < data.length; i++) {
			flags[data[i]-1]=true;
		}
		
		for(int i=0;i < flags.length; i++) {
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			if(flags[i]==false) {
				return i+1;
			}
		}
		throw new IllegalStateException();
	}

	}

	
