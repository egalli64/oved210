package donatella.mar08;

import java.util.ArrayList;

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
			String s=data.get(i);
			for (int j =  data.size() -1; j>i;j--) {
				String t=data.get(j);
				if (s.equals(t)){
					data.remove(j);
				}
				}
			}
		}
	}


//Given n-1 values in[1,n], return the missing value
//{1,3} ->2
//{1,3,5,7,9,8,6,2} ->4