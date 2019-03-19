package elmonda.mar18;

public class User {
	
	public static void main(String[] args) {
		System.out.println("base:");
		Base b = new Base();
		b.k();
	System.out.println("derived:");
	Derived d = new Derived();
	d.k();
	
	Derived2 d2 = new Derived2();
	d2.k();
	
	Base[] array = {b, d, new Derived2()};
	for(Base base: array) {
		base.k();
		
	}
	
	for(int i = 0; i < array.length; i++) {
		array[i].k();
	}
	//array[2].k();
	
	//		for(int a: ia) {
				//System.out.println();
			//}
//	Happy[] happyArray = {new Derived(), new DerivedAnother2()}; // oggetti le cui classi imnplementano quest'oggetto
//	for(Happy happy: happyArray) {
//		happy.smile();  // è l'unico metodo che è stato definbito nell'interfaccia happy, quindi posso chiamare solo smile
//	}
	Another a = new DerivedAnother2(); // posso creare oggetti derived se ho la classe abstract in Another
	// per Another mi interessa degli oggetti non il completo essere ma quello che soddisfa a sinistra quindi l'interfaccia, per happy l'interfaccia happy .
	
	Happy[] happyArray = { new Derived(), new DerivedAnother2() };
		for(Happy happy: happyArray) {
		happy.smile();
	
		
	
	
	// if is a Derived, call its k()
	if(happy instanceof Derived) {  // (l'istanza è quando l'oggetto arriva da una classe, happy è stato creato usando il costruttore derived)se è un'istanza di derived allora posso fare quest'istanza, cast
		Derived derived = (Derived)happy; // cast chiedo a java di fare qualcosa di forzato.
		derived.k();
	}
	}
		
}
}
	



