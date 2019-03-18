package trainer.mar18;

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
		}
	
		Another a = new DerivedAnother2();
	}
}
