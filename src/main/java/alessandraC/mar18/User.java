package alessandraC.mar18;


public class User {
	public static void main(String[] args) {

		System.out.println("base:");
		Base b = new Base();
		b.k();
		
		System.out.println("derived:");
		Derived d = new Derived();		
		d.k();
		
		Base[] array = { b, d, new Derived2()};
		for(Base base: array) {
			base.k();
		}

		for(int i = 0; i < array.length; i++) {
			array[i].k();
		}
		
		Happy[] happyArray = { new Derived(), new DerivedAnother2()};
		for(Happy happy: happyArray) {
			happy.smile();
			
//			if is a Derived call its k();
			// if happy contains Derived call k()
			
			if(happy instanceof Derived) {
				Derived derived = (Derived) happy;
				derived.k();
				
			}
		}
	
		Another a = new DerivedAnother2();
	}
}
	
	