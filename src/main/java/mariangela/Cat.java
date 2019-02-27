package mariangela;

public class Cat extends Animal {

	public Cat(String name, int weight) {
		super(name, weight);
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + "]";
	}



}
