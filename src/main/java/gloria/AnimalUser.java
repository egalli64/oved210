package gloria;

public class AnimalUser {
	public static void main(String[] args) {

		Animal[] animals = new Animal[3];

		try {

			animals[0] = new Dog(200, "Bovo");
			animals[1] = new Dog(-73, "Sam");
			animals[2] = new Cat(235, "Ettore");

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return;

		}
		for (int i = 0; i < 3; i++) {

			System.out.println(animals[i]);
		}
		for (Animal animal : animals) {
			System.out.println(animal);

			// ...
		}

	}
}
