package marina.mar01;

public class Simple {

	public void operations() {
		int x = 3;
		int y = 5;
	}

	public static void f() {
		Base base = new Base(23, "hello");
		System.out.println(base);

		Derived derived = new Derived(12, "hi");
		System.out.println(derived);
	}

	public static void main(String[] args) {
		f();
		
	}
}