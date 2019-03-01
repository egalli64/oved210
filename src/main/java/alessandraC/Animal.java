package alessandraC;


public abstract class Animal {
	public enum Fur {
	SHORT, MEDIUM, LONG
	};
	
	protected int weight;
	protected String name;
	protected Fur fur;

	public Animal(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	public int getWeight () {
		return weight;
	}
	public void setWeight (int weight) {
		this.weight = weight;
	}
	
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	Animal[] animals = new Animal[5];

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", name=" + name + "]";
	}
}
