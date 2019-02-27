package sara;

public class Dog extends Animal {
	
	public Dog(double weight, String name) {
		super(name, weight);
			}

	@Override
	public String toString() {
		return "Dog [weight=" + weight + ", name= " + name + "]";
	}

	
	
	}
