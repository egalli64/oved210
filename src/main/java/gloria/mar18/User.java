package gloria.mar18;

public class User {
	public static void main(String[] args) {
		System.out.println("base:");
		Base b = new Base();
		b.k();

		System.out.println("derived:");
		Derived d = new Derived();
		d.k();

		Derived2 d2 = new Derived2();

		Base[] array = { b, d, new Derived2() }; // solo oggetti di tipo base o derivato
		for (Base base : array) { // chiama tutti gli elementi dell'array e su di essi chiama il metodo k
			base.k();
		}

		for (int i = 0; i < array.length; i++) { // metodo alternativo per scrivere il for
			array[i].k();
		}

//		Happy[] happyArray = { new Derived(), new DerivedAnother2() }; // posso mettere solo oggetti le cui classi
		// implementano Happy. Non ha senso creare
		// oggetti di tipo happy perchè quest'ultima è
		// un'interfaccia
//		for (Happy happy : happyArray) {
//		happy.smile(); // unico metodo che è stato definito nell'interfaccia happy
//	}

		Another a = new DerivedAnother(); // fosse stato solo new Another non avrei ppotuto perchè quella classe è
											// astratta, ma derivedAnother si perchè non è definita abstarct!!!
		Happy[] happyArray = { new Derived(), new DerivedAnother2() };
		for (Happy happy : happyArray) {
			happy.smile();

			// if is a Derived, call its k()
			if (happy instanceof Derived) { // instanceof vuol dire che happy è un oggetto derived
				Derived derived = (Derived) happy;
				derived.k();
			}

		}

	}
}
