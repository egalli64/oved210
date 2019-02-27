package elmonda;

public class Cat extends Animal {
	public Cat(int weight, String name) {
		super(weight, name);
	}

	@Override
	public String toString() {
		return "Cat [weight=" + weight + ", name=" + name + "]";
	}
	


}
