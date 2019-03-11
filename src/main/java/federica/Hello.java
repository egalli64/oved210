package federica;

public class Hello {
	public static void main(String[] args) {
		boolean a = true; // 1 bit?
		byte b = 12; // 8 bit
		short s = 1020; // 16 bit
		int i = 1_000_000; // 32 bit
		long l = 2_000; // 64 bit

		if (a == true) {
			int x = 12;
		}
		i = (int) l;
		System.out.println("hello");

		String s1 = "Hello";
		String s2 = new String("Hello");

		Integer[] days2 = new Integer[12];

		days2[0] = new Integer(31);
		days2[0] = 31;
		days2[1] = 28;
		// ...
		days2[11] = 31;

		for (int value : days2) {
			System.out.println(value);
		}
	}
}