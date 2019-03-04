package trainer.mar01;

public class Simple {

	public void operations() {
		int x = 3;
		int y = 5;
	}

	public static void f() {
//		Base base = new Base(23, "hello");
//		System.out.println(base);

		Derived derived = new Derived(12, "hi");
		System.out.println(derived);

		Other other = new Other(21, "hihi");
		System.out.println(other);

		Base[] bases = new Base[2];
		bases[0] = derived;
		bases[1] = other;

		for (Base base : bases) {
			System.out.println(base);
			base.doSomething();
			if (base instanceof Derived) {
				Derived x = (Derived) base;
				System.out.println(x.getMyStatus());
			}
			if (base instanceof Other) {
				Other x = (Other) base;
				System.out.println(x.getValue());
			}
		}

	}

	private static String getMyString() {
		return null;
	}

	public static void g() {
		String s = getMyString();

		try {
			System.out.println(s.length());
		} catch (Exception ex) {
			System.out.println("I have no length for this string!");
		}

		try {
			int[] array = new int[3];
			for (int i = 0; i <= array.length; i++) {
				array[i] = i;
			}
		} catch (Exception ex) {
			System.out.println("Can't initialize the array!");
		}

	}

	public static void main(String[] args) {
		f();
		g();

		boolean a = true; // 1 bit
		byte b = 12; // 8 bit
		short s = 1020; // 16 bit
		int ix = 1_000_000; // 32 bit
		long l = 2_000; // 64 bit

		float f = 1.34F; // 32 bit
		double d = 12.657; // 64 bit

		if (a == true) {
			ix = (int) l;
			int x = 12;
		}

		String s1 = "Hello";
		String s2 = new String("Hello");

//		int[] days = new int[12];
		int[] days = { 31, 28, /* ... */ 31 };
		for (int i = 0; i < days.length; i++) {
			// days[i] = i;
			System.out.println(days[i]);
		}

		for (int value : days) {
			System.out.println(value);
		}

//		days[0] = 31;
//		days[1] = 28;
//		// ...
//		days[11] = 31;

		Integer[] days2 = new Integer[12];
		days2[0] = 31; // new Integer(31);

		int iz = 2;
		Integer iz2 = 2; // new Integer(2);
	}
}
