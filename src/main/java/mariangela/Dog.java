package mariangela;

public class Dog extends Animal {

	public Dog(String name, int weight) {
		super(name, weight);
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + "]";
	}

}
