package trainer;

public class AnimalUser {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(s);

		String s2 = new String("How are you?");
		System.out.println(s2);

		String s3 = "";
		for (int i = 0; i < 100; i++) {
			s3 += i;
			s3 += ", ";
		}
		s3 += "100.";
		System.out.println(s3);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i);
			sb.append(", ");
		}
		sb.append("100.");
		System.out.println(sb.toString());

		Animal[] animals = new Animal[2];

		animals[0] = new Dog(2050, "Bolt", Animal.Fur.LONG);
		animals[1] = new Cat(650, "Fuzzy", Animal.Fur.SHORT);

		for (Animal animal : animals) {
			System.out.println(animal);

			if (animal instanceof Dog) {
				Dog dog = (Dog) animal;
				dog.bark();
			}
			if (animal instanceof Cat) {
				Cat cat = (Cat) animal;
				cat.meow();
			}
		}
	}
}
