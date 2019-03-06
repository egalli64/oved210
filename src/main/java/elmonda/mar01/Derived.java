package elmonda.mar01;

//
public class Derived extends Base { // devo usare il costrutore di base, ma mi hai definito l'operatore di base che
									// prende due parametri ma mi hai impedito di creare il costruttore di
									// default--< che non ha parametri
// la cosa più semplice che posso fare è creare il costruttore di default, che non prende alcun parametro "PUBLIC BASE nella classe base java"
	private double z;

	public Derived(int x, String y) { // questo costruttore mi prende un valore in int e lo usa per inizializzare in ..
		super(x, y); // SUPER è riferito al costruttore della classe madre
		this.z = x / 3.0;
	}

	@Override
	public String toString() {
		return "Derived [z=" + z + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public void doSomething() {
		System.out.println("something");
		
		
	}
	public double getMyStatus() {  // inseriamo questo metodo
		return 2.4;

		
	}		
	
}
