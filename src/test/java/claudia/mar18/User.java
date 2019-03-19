package claudia.mar18;

public class User {
public static void main(String[] args) {
	System.out.println("Superior:");
	Superior s = new Superior();
	s.k();

	
	System.out.println("Inferior:");
	Inferior i = new Inferior();
	
	i.k();
	
	
	Inferior2 i2 = new Inferior2();

	Superior [] array = { s, i, i2};
	array[2].k();
	
	for(Superior superior : array) {
		superior.k();
	}
	
	for(int j = 0; j < array.length; j++) {
		array[j].k();
	}
	Happy[] happyArray = { new Inferior(), new DerivedAnother2()};
	for(Happy happy : happyArray) {
		happy.smile();
		
		if(happy instanceof Inferior) {
			Inferior inferior = (Inferior)happy;
			inferior.k();
		}
	}
}
}
