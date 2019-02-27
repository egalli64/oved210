package alessandraB;

public class Cat extends Animal {
	public Cat(double peso, String nome) {
		super(peso, nome);
		
	}

	@Override
	public String toString() {
		return "Cat [peso=" + peso + ", nome=" + nome + "]";
	}

}
