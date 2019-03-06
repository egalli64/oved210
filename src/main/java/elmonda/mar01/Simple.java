package elmonda.mar01;

public class Simple {
	public void operations() {
		int x = 3;
		int y = 5;
	}
	public static void f() {
//		Base base = new Base(23, "hello");
//		System.out.println(base);
		
		Derived derived = new Derived(12, "hi");
		System.out.println(derived);
		
		Other other = new Other(21, "hihi");
		System.out.println(other);
		
		Base[] bases = new Base[2];
		bases[0] = derived;
		bases[1] = other;
		
		for(Base base: bases) {    // in questo loop vorrei chiamare i due metodi della mia gerarchia,  "INSTANCEOF" per ricchiamare caratteristiche specifiche che non è della classe base
			System.out.println(base);
			base.doSomething();
			if(base instanceof Derived) {
				Derived x = (Derived)base;
				System.out.println(x.getMyStatus());
			}
			if(base instanceof Derived) {
				Other x = (Other)base;
				System.out.println(x.getValue());
			}
		}
	}

	
	private static String getMyString() {
		return null;
	}
//	public static void main(String[] args) {
	public static void g() {
		String s = getMyString();
		//if(s != null) {
		try {
			System.out.println(s.length());     // try catch metodo per gestire in modo più semplice gli errori
		}catch(Exception ex) {
			System.out.println("I have no length for this string!");
		}
		try {
		int[] array = new int[3];
		for(int i = 0; i <= array.length; i++) {
			array[i] = i;
		}	
		}catch(Exception ex) {
			System.out.println("Can't initialize the arrey!");
		}
		}
	
		public static void main(String[]args) {
			
		f();
		g();
		
		boolean flag = true; // 1 bit
		byte b = 12; // 8 bit
		short s = 1020; // 16 bit
		int ix = 1_000_000; // 32 underscore utilizzato come separatore;
		long l = 2_000; // 64 bitse devo lavorare su miliardi utilizzerò long; per lavorare su milioni
						// mi va bene int
//  qst sono numeri interi
		// per i decimali;

		float f = 1.34F; // 32 bit TRATTAMELO COME FLOAT E METTIMELO DENTRO AL FLOAT INDICARLO CON F
		double d = 12.657; // 64 bit normalmente si usano double per il discorso degli arrotondamenti
		// convertire i base due in base 10 decimali introduce due errori
		// il metodo scientifico adatto è double, essendo 64 bit mi danno una densità di
		// spazio ampia per ridurre gli errori

		if (flag == true) {
			ix = (int) 1; // lo so che L non è un intero ma trattamelo come se lo fosse
			int x = 12;

		}
		String s1 = "Hello";
		String s2 = new String("Hello"); // mettimi sullo steck due variabili che si chiamano s e s2, mi vanno a puntare
											// due oggetti distinti sullo hip, e anche se contengono la stessa stringa
		// quando esco dal blocco le variabili che mi vengono gestite sono gli oggetti
		// che sono sullo hip ma non riesco ad accedervi , restano sulla memoria
// finchè non arriva un processo "GARBAGE COLLECTOR" che gira sullo hip e verifica se ci sono oggetti non utilizzati da nessuno e li butta via.
// quando lavoriamo sullo hip i nostri oggetti non sono sullo steck e anche se non sono più utilizzabili da noi vivono per un certo lasso di tempo
//int[] days = null; // scrivere il codice cosi non è visto bene, quando sappiamo cosa metterci dentro mettiamo il nostro arrey. ad es per i mesi avrò bisogno di 12 spazi per i mesi
//int[] days = new int[12]; // lasciarci dentro roba a caso non è il massimo quindi meglio lasciare tutti 0 e costruire la nostra arrey di interi
// vorrei i valori effettivi, come faccio a farlo' bisogna inizializzare
//days[0] = 31; // ogni tipo primitivo ha il suo corrispettivo rapper type,
//Integer[] days2 = new Integer[12];
//days2[0] = 31; // new Integer(31);  // la new serve solo per i reference, per gli oggetti reference

//per inizializzqare con il ciclo for:

//String s1 = "Hello";
//String s2 = new String("Hello");

//int[] days = new int[12];
		int[] days = { 31, 28, /* ... */31 };
		for (int i = 0; i < days.length; i++) {
			// days[i] = i;
			System.out.println(days[i]);
		}
		for (int value : days) {
			System.out.println(value);
		}
		Integer[] days2 = new Integer[12];
		days2[0] = 31; // new Integer(31);

		int iz = 2;
		Integer iz2 = 2; // new Integer(2);

// per inizializzare

//int[]days = new int[12];
// days[0] = 31;
//days[1] = 28;
// //....
//days[11] = 31;

// metodo alternativo
//
//int[] days = {31, 28, /*...*/31};
//int ix = 2;
//Integer ix2 = 2;      // new Integer(2);
	}
	//private static void g() {
		// TODO Auto-generated method stub
		
	}

