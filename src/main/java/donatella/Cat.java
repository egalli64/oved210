package donatella;



public class Cat extends Animal {

	public Cat(int weight, String name, Fur fur) {
		super(weight, name, fur);
	}

	public void meow() {
		System.out.println("Meow!");
	}

	@Override
	public String toString() {
		return "Cat [weight=" + weight + ", name=" + name + ", fur=" + fur + "]";
	}
}
	   

