package alessandraC;

public class Hello {
	
	public static void countdown() {
		System.out.println("Hello, I'm in countdown!");

		int[] months = new int[12];
		for (int i = 0; i < months.length; i++) {
			months[i] = months.length - 1 - i;
		}

		System.out.println("Printing countdown:");
		for (int i = 0; i < months.length; i++) {
			System.out.println("Element " + i + " =" + months[i]);
		}

		System.out.println("Countdown completed");
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		countdown ();

		long a = 42;
		int b = (int) a;

		int x = 12;
		long y = x;

		int jan = 31;
		int feb = 28;

//		int[] months = new int [12];
//		for (int i = 10; i >= 0; i--) {
//			months[i] = i + 1;
//			System.out.println("Element" + i + " = " + months[i]);

		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Months is sized" + months.length);

	}

}
