package sara;

public class Hello {
	public static void countdown() {
		System.out.println("Hello, I'm in countdown");
	// un metodo per decremento
		int[] months = new int[12];
		for(int i = 0; i < months.length; i++) {
			months[i] = months.length -1 - i;
		}
		System.out.println("Printing countdown:");
		for(int i = 0; i < months.length; i++) {
			System.out.println("Element "+ i + " = "+ months[i]);
		}
		//un altro modo per stampare
		for(int value : months) {
			System.out.println("Element: " + value);
		}
		System.out.println("Countdown completed");
	}
	// un metodo per decremento
	//int[] months = new int[12];
	//for (int i =11; i>= 0; i--)  {
	// months [i] = 0;
	//}
	
	
	public static void main(String[]args) {
		System.out.println("Hello");
		countdown();
		
		
		long a = 42;
		int b = (int)a;
		
		int x = 12;
		long y = x;
		
		double d = 12.23;
		float f = (float)d;
		
		System.out.println(a + ", " + b + ", " + d + ", " + f);

		int jan = 31;
		int feb = 28;
		
		//inizializzare i valori di ogni mes
		//int[] months = new int[12];
		
		//for(int i = 11; i >=0; i--) {
			// months[i] = i;
		//}
		
		int[] months = {31, 28, 10, 21, 18, 13, 1, 1, 1, 1, 30, 31};
		
		System.out.println("Months is sized " + months.length);
		for(int i = 0; i < months.length; i++) {
			System.out.println("Element" + i + " = " + months[i]);
		}
	}
}
