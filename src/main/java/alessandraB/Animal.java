package alessandraB;

public abstract class Animal {
	protected double peso;
	protected String nome; // la string è un reference type : sta sullo HEEP, ed è un tipo
    //protected enum Fur (SHORT, LONG, MEDIUM);                    // così comune che viene utilizzato come intero. Serve a rappresentare una stringa di lettere.
	
	public Animal(double peso, String nome) { //
		this.peso = peso;
		this.nome = nome;
		//this.fur = fur;
		
}

	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", nome=" + nome + "]";
	
		
	}
}
 //
//  si potrebbe aggiungere anche public enun Fur ( SHORT, LONG, MEDIUM)--> fur è la variabile "lunghezza pelo""
// animals [0] = new Dog (2050, "Bolt", Animal.Fur.LONG) --> si mette anche Animal davanti a Fur perchè la variabile
// è stata specificata in Animal.