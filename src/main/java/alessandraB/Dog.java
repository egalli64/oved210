package alessandraB;

public class Dog extends Animal {
	
	public Dog(double peso, String nome) {
		super(peso, nome);
	}

	@Override
	public String toString() {
		return "Dog [peso=" + peso + ", nome=" + nome + "]";
	}
	

}
