package marina.mar01;

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
			System.out.println("can't initialize the array!");
		}

	}
}
