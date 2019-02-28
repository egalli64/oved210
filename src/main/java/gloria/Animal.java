package gloria;

public class Animal {
	protected double weight;
	protected String name;
	 
	
	
public Animal (String name, double weight) {
    this.name = name;
    this.weight = weight; 
}


@Override
public String toString() {
	return "Animal [weight = " + weight +", name = "+ name +"]";
}

}