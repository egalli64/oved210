package elmonda.mar01;

public abstract class Base { // dicendo astratta, dico che nessuno può creare classi base
	protected int x; // la classe base deve avere le proprietà protette in modo che siano visibili
						// alle classi figlie( derivate)
	protected String y;

	public Base() {
	}

	public Base(int x, String y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;

	}

	public abstract void doSomething();

	@Override
	public String toString() { // il metodo to string in object non è il massimo; stampa l'indirizzo di memoria
								// in cui l'oggetto è memorizzato
		return "Base [x=" + x + ", y=" + y + "]"; // se non dico che la mia classe estende esplicitamente glielo sto
													// dicendo implicitamente.
	}

	// ridefiniscimi una funzione già definita di una classe che sta sopra e falle
	// assumere un altro significato che mi aiuti a capire meglio l'oggetto.

}
