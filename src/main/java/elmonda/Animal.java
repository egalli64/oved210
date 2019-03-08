package elmonda;

public abstract class Animal {
	public enum Fur {
		SHORT, MEDIUM, LONG
	};
	
	protected int weight;
	protected String name;
	protected Fur fur;
	
	public Animal(int weight, String name, Fur fur) {
		if (weight <=0) {   // sto dicendo che costruisco l'eccezione solo se il peso è inf a zero
			throw new IllegalArgumentException("Negative weight not accepted!");
		}
		this.weight = weight;
		this.name = name;
		this.fur = fur;
}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", name=" + name + "]";
	}
}