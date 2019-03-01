package alessandraC;

public class Cat extends Animal {
	
	public Cat (int weight, String name) {
		super (weight, name);
	}
	
	public void meow () {
		System.out.println("Meow!");
	}
	@Override
	public String toString() {
		return "Cat [weight =" + weight + ", name=" + name +"]";
	}

}
