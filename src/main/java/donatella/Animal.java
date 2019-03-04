package donatella;


public abstract class Animal {
	public enum Fur {
		SHORT, MEDIUM, LONG
	};

	protected int weight;
	protected String name;
	protected Fur fur;

	public Animal(int weight, String name, Fur fur) {
		if (weight <= 0) {
			throw new IllegalArgumentException("Negative weight not accepted!");
		}

		this.weight = weight;
		this.name = name;
		this.fur = fur;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fur getFur() {
		return fur;
	}

	public void setFur(Fur fur) {
		this.fur = fur;
	}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", name=" + name + ", fur=" + fur + "]";
	}
}