package alessandraB;

public class AnimalUser {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[5];
		
		animals [0] = new Dog (23, "Gatto");
		animals [1] = new Cat (9,  "Pallino");
		animals [2] = new Cat (12, "Otto");
		animals [3] = new Dog (30, "Ryan");
		animals [4] = new Dog ( 17, "Aron");
		
	for(int i = 0; i < 5; i++) {
		
		System.out.println(animals [i]);
		
	}
	}

}
