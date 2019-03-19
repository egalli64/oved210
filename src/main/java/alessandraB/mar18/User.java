package alessandraB.mar18;

public class User {
	public static void main(String[] args) {
		System.out.println("base");
		Base b = new Base();
		b.k();
		
		System.out.println("derived");
		Derived d = new Derived();
		d.k();
		

		Derived2 d2 = new Derived2();
	    
		Base[] array = {b, d, d2};
 for (Base base : array) {
	 base.k();
 }
	    for(int i = 0; i < array.length; i++) {
	    	array[i].k();
	    }
	
	
	Happy[] happyArray = {new Derived(), new DerivedAnother2 ()};
	
	for( Happy happy : happyArray) {
		happy.smile();
	
		if (happy instanceof Derived) { //se happy è stato creato col costruttore derived
			Derived derived = (Derived)happy; //faccio un cast, forzo Java 
			derived.k();
		}
	} } }
