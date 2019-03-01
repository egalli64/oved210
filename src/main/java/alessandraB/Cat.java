package alessandraB;

public class Cat extends Animal {
	public Cat(double peso, String nome) {
		super(peso, nome);
		
	}

	@Override
	public String toString() {
		return "Cat [peso=" + peso + ", nome=" + nome + "]"; // se aggiungo la string di tipo cane,
														     // come su tipo gatto, mi fa capire che non è un
															 // animale generico (animal), ma precisamente un cane
	}

}
