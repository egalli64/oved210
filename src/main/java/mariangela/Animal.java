package mariangela;

public abstract class Animal {
	protected String name;
	protected int weight;

	public Animal(String name, int weight) {
		this.name = name;
		this.weight = weight;

	}

	@Override
	public String toString() {
		return "name=" + name + ", weight=" + weight;
	}

}
