package francesca.mar11;

import java.util.Arrays;

public class ArrayListProblems {
	
	/**
	 * Given n-1 values in [1, n], return the missing value
	 * 
	 * <pre>
	 * {1,3} -> 2
	 * {1,3,5,7,9,8,6,2} -> 4
	 * </pre>
	 */

	public static int missingValue(int[] data) {
		
		for (int i = 1; i < data.length; i++) {
			boolean found = false;
			
			for (int j = 0; j < data.length; j ++) {
				if (data[j] == i) {
					found = true; // trovato il mancante
					break; // smettere di loopare
				}
			}
					
					if (!found) {
				
					return  i;
					}
				}
				return 0;
			}
	
	// ESERCIZIO MISSING VALUE LINEAR
	
	public static int missingValueLinear(int[] data) {
		boolean[] flags = new boolean[data.length + 1];
		for (int value : data) {
			flags[value - 1] = true;
		}
		for (int i = 0; i <flags.length; i++) {
			if (flags[i] == false) {
			return i + 1;
			
		}
		}
		
		return 0;
		
		
	}
	
		}
	
					
				
			
		
	

