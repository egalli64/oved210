package tiziana.mar18;

public class BaseUser {
	public static void main(String[] args) {

		System.out.println("Base:");
		Base c = new Base();
		c.k();

		System.out.println("Derived:");
		Derived b = new Derived();
		b.k();

		System.out.println("Derived2");
		Derived2 a = new Derived2();
		a.k();

		Base[] array = { c, b, a };
		for (Base base : array) {
			base.k();

		}

		Happy[] happyArray = { new Derived(), new DerivedAnother() };
		for (Happy happy : happyArray) {
			happy.smile();
			
			// if is a Derived, call its k()
			// se happy fa parte di Derived chiama il metodo k

			if (happy instanceof Derived) {
				Derived derived = (Derived) happy;
				derived.k();
			}

		}
	}
}
