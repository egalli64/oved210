package elmonda;

public class Dog extends Animal {
	
	public Dog(int weight, String name, Fur fur) {
	super(weight, name, fur);
	
	}
	public void bark() {
		System.out.println("Bark!");
	}

	@Override
	public String toString() {
		return "Dog [weight=" + weight + ", name=" + name + "]";
	}
}
