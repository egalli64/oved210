package claudia.primasettimana;

public abstract class Animal {

	String name;
	int weight;
	
	public Animal (String name, int weight) throws Exception {
		if(weight <= 0) {
			throw new Exception();
//			throw new IllegalArgumentException()
		}
		this.name = name;
		this.weight = weight;
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + "]";
	}
}
