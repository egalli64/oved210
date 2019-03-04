package gloria;

public class Animal {
	protected double weight;
	protected String name;

	public Animal(String name, double weight) {
		if (weight <= 0) {
			throw new IllegalArgumentException("Negative weight not accepted!");
		}

		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [weight = " + weight + ", name = " + name + "]";
	}

}