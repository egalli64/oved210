package tiziana;

public abstract class Animal {
	String name;
	int weight;

	public Animal(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + "]";
	}

}