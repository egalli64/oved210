package claudia.primasettimana;

public class Dog extends Animal {
	
	public Dog(String name, int weight) throws Exception {
		super(name, weight);

		
		
}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", weight=" + weight + "]";
	}
}
