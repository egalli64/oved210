package sara.mar05;

public class Problem {

	
	// vogliamo vedere se un unico valore è vero in: 2 out:true
	public static boolean isEven(int value) {

		if (value % 2 == 0) { // % 2 == 0 per dire che un valore è pari
			return true;
		}

		return false;
	}

	
	
	// vogliamo vedere se c'è un valore pari e torniamo a true,altrimenti false

	// in: [2, 1, 1] out: true
	// in: [-1027, 12, -1027, 12, 42] out: false

	public static boolean hasEven(int[] data) {
		for (int i = 0; i<data.length; i++) {
		if(data[i] % 2 == 0) {
		return true;
			
		}
	}
		return false;
	}

}
