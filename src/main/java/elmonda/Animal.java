package elmonda;

public abstract class Animal {
	protected double weight;
	protected String name;
	
	public Animal(int weight, String name) {
		this.weight = weight;
		this.name = name;
}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", name=" + name + "]";
	}
}