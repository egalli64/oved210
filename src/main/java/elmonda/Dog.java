package elmonda;

public class Dog extends Animal {
	
	public Dog(int weight, String name) {
	super(weight, name);
	}

	@Override
	public String toString() {
		return "Dog [weight=" + weight + ", name=" + name + "]";
	}
}
