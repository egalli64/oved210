package alessandraB.mar01;

public class Simple {
	
	public static void main(String[] args) {
		boolean a = true; //tipo primitivo: cioè viene messo sullo stack e heep
		                  // sullo stack si collocano le variabili automatiche
		                  //occupa 1 bit
	//NUMERI INTERI	
		byte b = 12; //occupa 8 bit
		
		short s = 1020; // occupa 16 bit
		
		int i = 1_000_000; //occupa 32 bit
		
		long l = 2_000_000_000; // occupa 64 bit
		
	//NUMERI DECIMALI	
		float f = 1.34F; //32 bit --> La F mi serve per dire a Java che so che è un float (questo perchè
		                 // Java è abituato a lavorare in double con i decimali.
		
		//CAST quando converti un long in un intero (occupano spazi diversi, long non ci sta in int)
		// si fa così --> i = (int) l    cioè sto dicendo di trattarmi l (che è un long) come se fosse un intero.
		double d = 12.567; // 64 bit
		
		
		if(a == true) {
			int x= 12; 
			
		}
		
		String s1 = "Hello!";
		String s2 = new String ("Hello!");  // stiamo creando un REFERENCE TYPE, un oggetto vero e proprio.
	
	
	// se esco dallo scope, gli oggetti rimasti sullo heep non spariscono come fanno invece quelli sullo stack.
	// i due oggetti continuano a esistere nello heep ma non riesco più ad accedervi. Restano lì finchè non arriva
	// il garbage collector che verifica che non ci siano oggetti referenziati da nessuno, e a quel punto li butta via.

		
		// ARRAY --> le parentesi quadre [] servono a indicarmi che non è più un solo intero, ma una sequenza.
		//int [] days;   --> per ora nell'array non c'è nulla, quindi Java nello Stack mette NULL.
		                    // al momento l'oggetto days non esiste.
		                   // quando esisterà l'oggetto, andrà sullo heep.
		
		int [] days = new int [12]; // se non do indicazioni specifiche Java in automatico inizializza a 0;
	    
		days[0] = 31;  //gennaio
		days[1] = 28;  //febbraio
		//...
		days[11] = 31; // dicembre
		
		//altrimenti si può scrivere  int [] days = { 31, 28, /*...*/, 31);  fino a 12 elementi
		
		for(int i1 = 0; i1 < days.length; i1++) {
			days [i1] = i1; 
			System.out.println(days[i]);	
			
		}
	for(int value : days) {
		System.out.println(value);
	}
	}   
}
