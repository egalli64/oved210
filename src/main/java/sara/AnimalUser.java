package sara;

public class AnimalUser {
	public static void main(String[] args) {

		Animal[] animals = new Animal[3];

		animals[0] = new Dog(2050, "Bolt");
		animals[1] = new Cat(650, "Shot");

		for (int i = 0; i < 3; i++) {

			System.out.println(animals[i]);

		}

	}
}
