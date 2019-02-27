package monica;

public class AnimalUser {

	private final static int NR_ANIMAL = 5;

	public static void main(String[] args) {
		Animal[] animals = new Animal[NR_ANIMAL];

		animals[0] = new Dog("ugo", 10);
		animals[1] = new Cat("jack", 5);
		animals[2] = new Cat("stellina", 7);
		animals[3] = new Dog("rambo", 15);
		animals[4] = new Dog("mia", 10);

		for (int i=0; i<NR_ANIMAL; i++) {
		
		System.out.println( animals[i]);
	}
}
}