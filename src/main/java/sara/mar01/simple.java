package sara.mar01;
                         
public class simple {
	
public static void f() {                        // per estendere classe Base/
//	Base base = new Base(23, "hello");
//  System.out.println(base);
	
	Derived derived = new Derived (12,"hi");
	System.out.println(derived);
	
	Other other = new Other (21, "hihi");
	System.out.println(other);
	
	Base[] bases = new Base[2];
	bases[0] = derived;
	bases[1] = other;
	
	
	for(Base base: bases) {       //loop su tutto l'array bases stampando base (perchè all'interno ci sono oggetti derived e other)
		System.out.println(base);
		base.doSomething();  // "base" in questo caso rappresenta gli elementi reali a cui si riferisce, ovvero other e derived
		                        // per esempio se "base" = animal, si riferirebbe una volta a dog e un'altra a cat
	    
		if (base instanceof Derived) {      // si utilizza "instanceof" per far capire che "base" si riferisce ad una caratteristica (metodo) specifica solo di derived 
			 Derived x = (Derived)base;
		     System.out.println(x.getMyStatus());
		}
		
		if (base instanceof Other) {
			 Other x = (Other)base;
		     System.out.println(x.getValue());
	}
}
}
	private static String getMyString( ) {
		return null;
	}
	
	public static void g() {
		String s = getMyString();
		
	    try {                                // quando non siamo sicuri di un codice
	     System.out.println(s.length());
		} catch(Exception ex ) {             // per gestire eccezioni *far stampare un messaggio quando non c'è la pagina*
			System.out.println("I have no lenght for this string!");
		}
	    
	   
	}

	public static void main(String[] args) {
		f();
		g();
		
	
		
		
		
		
		boolean a = true;         // tipo primitivo che occupa 1 bit
		byte b = 12;              // tipo primitivo che occupa 8 bit (256 numeri) *NON MOLTO UTILIZZATO*
		short s = 1020;           // tipo primitivo che occupa 16 bit  *NON MOLTO UTILIZZATO*
		int ix = 1_000_000;        // tipo primitivo che occupa 32 bit  * " _ " utilizzato come separatore per cifre*
		long l = 2_000;           // tipo primitivo che occupa 64 bit 

		float f = 1.34F;          // 32 bit   *BISOGNA UTILIZZARE LETTERA "F" PER DISTINGUERLO DA DOUBLE*
		double d = 12.657;        // 64 bit   *SI UTILIZZA DI PIU' RISPETTO AL FLOAT PERCHE' HANNO UNA DENSITA' DI SPAZIO PIU' AMPIO*
		 
		if (a == true) {
			ix = (int) l;          // fare un CAST ovvero mettere (int) prima di long, perche altrimenti un long non entrerebbe in un int secondo Java
			int x = 12;
		}
	
		
		int[] days = new int[12]; // * nello steck viene creata variabile days che rimanda ad un array (new int [12]) nello heep
		
		
		//inizializzare valori                    // altro modo per scrivere
		                                          // int[] days = { 31, 28, /* ... */ 31 };
		days[0] = 31; 
		days[1] = 28;
		//...
		days[11] = 31;
				
	
	    // loop for
	//	for(int i = 0; i < days.length; i++) {
			// days[i] = i;
	//		System.out.println(days[i]);
	//	}
		//altro modo per fare loop
	//	for (int value : days) {
	//		System.out.println(value);
	//	}
	 	
	}
}

	

