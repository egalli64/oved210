package alessandraB;

public abstract class Animal {
	protected double peso;
	protected String nome;
	
	public Animal(double peso, String nome) {
		this.peso = peso;
		this.nome = nome;
}

	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", nome=" + nome + "]";
	}
}
