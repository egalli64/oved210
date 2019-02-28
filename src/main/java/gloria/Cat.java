package gloria;

public class Cat extends Animal {
	
	public Cat(double weight, String name) {
		super (name, weight );
				
	}

	@Override
	public String toString() {
		return "Cat [weight = " + weight +", name = " + name +"]";
		
	}		
		
			
}
