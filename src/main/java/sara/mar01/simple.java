package sara.mar01;
                          //RIEPILOGO SETTIMANA
public class simple {
	
public static void f() {                        // per estendere classe Base
	Base base = new Base(23, "hello");
	System.out.println(base);
}



	// ***//



	    // fare operators
	// public static void main(String[] args) {
	//	int a = 12, b = 30;
	//	System.out.println( a + b);
	//	System.out.println( a - b);
	//	System.out.println( a * b);
	//	System.out.println( (double) a / b);  //divisione con un numero frazionario
	//	System.out.println( b % a);     //divisione fra interi
	//	System.out.println( ++b); //incremento di una unità e poi restituire valore
	//	System.out.println(b--);  //decremento di una unità
		
	//	b += a; // b = b + a
	//	b = +a; // b = a
	//	b -= a; // b = b - a
	//	b = -a; // b = -a
		
		// "==" significa "assegnamento" 
//	}
	


		// *** //



	public static void main(String[] args) {
		boolean a = true;         // tipo primitivo che occupa 1 bit
		byte b = 12;              // tipo primitivo che occupa 8 bit (256 numeri) *NON MOLTO UTILIZZATO*
		short s = 1020;           // tipo primitivo che occupa 16 bit  *NON MOLTO UTILIZZATO*
		int ix = 1_000_000;        // tipo primitivo che occupa 32 bit  * " _ " utilizzato come separatore per cifre*
		long l = 2_000;           // tipo primitivo che occupa 64 bit 
		//numeri decimali:
		float f = 1.34F;          // 32 bit   *BISOGNA UTILIZZARE LETTERA "F" PER DISTINGUERLO DA DOUBLE*
		double d = 12.657;        // 64 bit   *SI UTILIZZA DI PIU' RISPETTO AL FLOAT PERCHE' HANNO UNA DENSITA' DI SPAZIO PIU' AMPIO*
		 
		if (a == true) {
			ix = (int) l;          // fare un CAST ovvero mettere (int) prima di long, perche altrimenti un long non entrerebbe in un int secondo Java
			int x = 12;
		}
		
		
		
		// *** //
		
		
		
		String s1 = "Hello";
		String s2 = new String("Hello"); // con "new" si crea oggetto reference *ovvero stringa sullo steck rimanda ad oggetto sulla heep*

		
		// *** //
		
		
		
	    //array:     serve per gestire gruppi di elementi * dopo il tipo va inserito [] *  
		int[] days = new int[12]; // * nello steck viene creata variabile days che rimanda ad un array (new int [12]) nello heep
		
		
		// *** //
		
		
		
		//inizializzare valori                    // altro modo per scrivere
		                                          // int[] days = { 31, 28, /* ... */ 31 };
		days[0] = 31; 
		days[1] = 28;
		//...
		days[11] = 31;
				
		
		// *** //
		
		
		
	    // loop for
		for(int i = 0; i < days.length; i++) {
			// days[i] = i;
			System.out.println(days[i]);
		}
		//altro modo per fare loop
		for (int value : days) {
			System.out.println(value);
		}
	 	
	}
}

	

