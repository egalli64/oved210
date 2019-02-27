package alessandraB;

public class Hello {

	public static void countdown() {
		System.out.println("hello, I' in countdown");

		int[] months = new int[12];
		for (int i = 0; i < months.length; i++) {
			months[i] = months.length - 1 - i;
		}
		System.out.println("printing !");
		for (int i = 0; i < months.length; ++i) {
			System.out.println("element" + i + " = " + months[i]);
		}
		for(int value : months) { // i due punti significano "in", per tutti i valori interi in months
			System.out.println("element: " + value);
			
		}

		System.out.println("countdown completed");
	}

	public static void main(String[] args) {

		System.out.println("Hello");
		countdown();

		long a = 42;
		int b = (int) a;

		double d = 12.23;
		float f = (float) d;

		int x = 12;
		long y = x;

		int jan = 31;
		int feb = 28;

	}
}
