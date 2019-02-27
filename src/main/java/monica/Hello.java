package monica;

public class Hello {
	
	public static void countdown() {
		System.out.println(" hello, I'm in coutdown ");
		int[] months = new int[12];
		for (int i = 0; i < months.length; i++) {
			months[i] = months.length - 1 - i;
		}
			System.out.println(" countdown ");
			for(int i=0; i<months.length; i++ ) {
		      System.out.println(" element " +i+ "=" + months[i] );
			}
	System.out.println("Countdown completed");
	
	}
	}