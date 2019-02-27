package alessandraB;

public class CubiBox extends Box { //il cubo è una scatola con 3 dimensioni uguali
	
	public CubiBox(double x) { //dalla mia classe Box, voglio la classe CubiBox
    super (x,x,x); // la CubiBox estende Box, il costruttore per accedere da CubiBox a Box 
                   // seleziona 3 parametri: x x x (il cubo ha una sola variabile uguale, 
                   // per questo è un cubo). E' come se fosse x y z ma tutti identici--> x x x
	}              // le variabili x y z nel cubo sono tutte uguali, quindi posso usare x.

	@Override
	public String toString() {
		return "CubiBox [x = "+ x + "]";
	}

}
