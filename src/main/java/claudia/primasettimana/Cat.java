package claudia.primasettimana;

public class Cat extends Animal {
	
	public Cat(String name, int weight) throws Exception {
		super(name, weight);
		
		

}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", weight=" + weight + "]";
	}

}
