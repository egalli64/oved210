package alessandraB;

public class Box { 
	
	protected static int counter = 0;  // il corpo della box è sullo heep
	protected double x; //oppure si chiama x_ 
	protected double y;   // protected vuol dire che lo vedono anche le classi figlie
	protected double z;
	
// se mettiamo "private" la variabile è visibile SOLO
//all'interno di questa classe --> se voglio invece renderle utilizzabili
// e visibili anche nell'altra classe vado su Source "Getter and Setters".
	
	public Box() { // non avendo inizializzato con nessun valore, JAVA mette 0
		Box.counter += 1;  // ogni volta che Box è costruito 
	}

	
	public static int getCounter() {
		return counter;
	}


	public static void setCounter(int counter) {
		Box.counter = counter;
	}


	public double getX() { //prende la proprietà x e me la ritorna
		return x;
	}

	public void setX(double x) { 
		this.x = x;
		
		//prende la proprietà x e ad essa assegna il valore che gli ho passato (il che
		// vuol dire che posso cambiare il valore (ad esempio 40)
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Box(double x, double y, double z)  { // Box si chiama "costruttore"
		// è la funzione che viene chiamata quando costruiamo l'oggetto
		this.x = x; // oppure x_ = x
		this.y = y;
		this.z = z;
		Box.counter += 1;
		
		//il this ci indica il puntatore sull'oggetto corrente su cui stiamo lavorando,
		// la x di questa (this) scatola è uguale all'x che ho come parametro 
	}
	
	public double getVolume() {
		return x * y * z ; // adesso box sa come calcolare il suo volume 
		                           //attraverso il metodo get volume
	}
	 @Override  
	public String toString() {   // Source--> generate toString ()
		return "Box [x = " + x+ ", y =" + y + ", z =" + z + "]";
	 }  //to string dà una rappresentazione dell'oggetto
	 
	 
	}
	

