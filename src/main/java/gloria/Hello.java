package gloria;

public class Hello {
	
//	metodo per ottenere i risultato dal numero più grande al più piccolo 
//	(metodo decrescente).
		

	public static void countdown() {
		System.out.println("hello, i'm in countdown!");
		
	
		int[] months = new int[12];
		for (int i = 0; i < months.length; i++) {
			months[i] = months.length - 1 - i;
	}
	
		System.out.println("printing countdown:");
		for(int i= 0; i < months.length; i++) {
			System.out.println("element" + i + " = " + months[i]);
			
		}
		
		System.out.println("countdown completed");
	}
	
  

	public static void main(String[] args) {
		System.out.println("Hello");
		countdown();
        
//        for(int i = 0 ; i < months.length ; i++) {
//		System.out.println("Element" + i + " = " + months[i]);
        	
        	
		long a = 42;
		int b = (int) a;

		double d = 12.23;
		float f = (float) d;

		System.out.println(a + "," + b + "," + d + "," + f);

//		int jan = 31;
//		int feb = 28;

// int[] months = new int [12];

//		for(int i = 0 ; i < months.length ; i++) {
//		   months[i] = i;
//		}
//		
//		for(int i = 0 ; i < months.length ; i++) {
//			months[i] = i*i;
//		}

//		int[] months = { 31, 28, 10, 21, 18, 13, 1, 1, 1, 1, 30, 31 };

	}

//		System.out.println("Months is sized" + months.lenght);
//		for(int i = 0 ; i < months.length ; i++) {
//			System.out.println("Element" + i + " = " + months[i]);
//		}

}
