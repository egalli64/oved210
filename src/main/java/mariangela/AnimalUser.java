package mariangela;

public class AnimalUser {
	public static void main(String[] args) {

		Animal[] animals = new Animal[2];

		animals[0] = new Dog("Fido", 1400);
		animals[1] = new Cat("Silvestro", 800);

		System.out.println(animals[0]);              //posso anche non inserire .toString() Java riconosce lo stesso il comando
		System.out.println(animals[1].toString());

	}

}
