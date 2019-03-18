package claudia.mar15;

public class HackerrankEx {/**
	 * 
	 * If value is odd, return "Weird"
	 * If value is even and in [2 .. 5], return "Not Weird"
	 * If value is even and in [6 .. 20], return "Weird"
	 * If value is even and greater than 20, return "Not Weird"
	 * 
	 * @param value an integer
	 * @return "Weird" or "Not weird"
	 */
	public static String ifElse(int value) {
		if(value < 1) {
			throw new IllegalAccessError();
		}
		if(value %2 == 1) {
			return "Weird";
			
		}
		return null;
		
    }

}
