package elmonda.mar05;

public class Problem {
/*
 * in: [2, 1, 1] out: 2
 * in: [-1027, 12, -1027, 12, 42] out: 42
 * in: [11, 42] out: true
 */
//	public static int findUnique(int[] data) {
//		return 0;
		
	
	/*
	 * in: [2, 1, 1] out: 2
	 * in: [-1027, 12, -1027, 12, 42] out: 42
	 */
	
	public static boolean hasEven(int[] data) {        // for di tutti gli elementi
		for(int i = 0; i < data.length; i++) { 
			if(data[i] % 2 ==0) {
				return true;
			}
			//if(value etc) {
		//}
	}
		return false;
	/*
	 * in: [2, 1, 1] out: 2
	 * in: [-1027, 12, -1027, 12, 42] out: 42                   se dopo la parentesi }, non avrò trovato pari, mi ritornerà false.
	 */
	}
	public static boolean isEven(int value) {
		if(value % 2 == 0) {
		return true;
	}
		return false;
}
}