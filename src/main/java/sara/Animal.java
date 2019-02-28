package sara;

public abstract class Animal {
	
	protected String name;  
	protected double weight; //protected significa essere viste anche dalle classi derivate
	
	public Animal (String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + "]";
	}

	



}
