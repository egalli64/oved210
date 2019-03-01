package gloria.mar01;

public class Simple {
	public static void main(String[] args) {
		boolean a = true; // 1 bit, tipo primitivo 
		byte b = 12; //  8 bit, sempre primitivio ma più piccolo 
		short s = 1020; // 16 bit 
		int ix = 1_000_000; // 32 bit, contiene tutte le architetture (hardware e software) 
		long l = 2_000_000_000; // 64 bit
		// sono tutti primitivi, messi tutti sulla stecchetta 
		
		
		float f = 1.34F; // 32 bit, devo sempre merttere la F dopo il numero per fargli capire che so che sto utilizzando un FLOAT, 
		                 // altrimenti pensa che stia sbagliando o che sto utilizzando il double e che voglio mettere un float dentro un double.
		double d = 12.657; // 64 bit
		//questi sono decimali 
		
		if (a == true) {
		
			//ix = l; // vuol dire prendi il valore "l" e mettilo dentro "i"; scritto così però non me lo legge Java e quindi non me lo esgue
		       // devo quindi scriverlo così, eseguendo un CAST:
			ix = (int)l;
		int x = 12;
						
		}
		
		String s1 = "Hello";
		String s2 = new String ("Hello"); // sono due metodi di scrittura equivalenti ma creano due oggetti completamente diversi. 
		                                  // Nel secondo non stiamo creando un tipo primitivo MA un reference type, un vero e proprio oggetto
		
		int[] days = null; // days è una variabile di arrey di interi (segnalato dalla presenza della parentesi).
		                   // l'arrey contiene un insieme di variabili dello stesso tipo.
		                   // nulla è un indirizzo fittizio per dire che non esiste nessuna variabile days, 
		                   // se avessimo saputo cosa mettere dentro days allora avremmo scritto il nostro ARREY, cioè:
		    int[] days00 = new int [12]; // ho inserito quindi 12 elementi e ci scrivo prima "new int", i 12 elementi sono tutti inizializzati da 0.
		    		                  // per far si che ci siano tutti i valori corretti, cioè mettere il numero dei giorni giusti per ogni mese e non solo 0 devo 
		      days[0] = 31; // non è necessario inserire dopo l'uguale il "new int" perchèà si tratta di interi primitivi
		      days [1] = 28;
		      //...
		      days[11] = 31;
		
		      
		// altro metodo di scrittura:
		Integer [] days0 = new Integer [12]; // la differenza tra int ed integere che contengono lo stesso numero, integer rimanda alla memoria heep che contiene un intero di 12, ( occupa più spazio).
		                                     // quindi parte dallo steck, vado nello heep e c'è una memoria che contiene un intero 12.
		                                     // int occupa solo lo spazio, in questo caso di 12, e non deve rimandare a niente.
		  days [0] = new Integer (31); // la prima cella dell'arrey ha il numero 0, mentre l'ultima avra il numero richiesto - 1 (normalmente).
		                               // altrimenti per inizializzare da 1:
	      int [] days1 = { 31, 28, /*...*/ 1, 31}; // qui quindi lascio fare tutto a java e sarà lui che mi inizializzerà i valori partendo da quello che gli ho fornito. nell'arrey.
	      
	    
	    //Il LOOP FOR:
	    int [] days2 = new int[12];
	    for(int i=0; i < days2.length; i++) {
	    	days2[i] = i;
	    }
	    
//     int a = 12, b = 30; c = 21;
//     System.out.println(a+b);
//     System.out.println(a-b);
//     System.out.println(a*b);
//     System.out.println((double) a/b);
//     System.out.println(b%a);
//     System.out.println(++b); //prima incrementalo e poi restituisci il suo valore incrementato
//     System.out.println(b);
//     System.out.println(b--);
//     System.out.println(b);
//     b+ = a; // b = b+a;
//     b = +a; // b = a;
//     b = -a; // b = -12;
//     b = c-a; // 21-12 = b;
//     b- = a; // b = b-a;
//     //...
//     
//     if(a=b) {
//    	 System.out.println("a equals b");
//     }
//     if(a!=b) {
//    	 System.out.println("a not eqauls b");
//     }
//     if(a<b) {
//    	 System.out.println();
//     }
	 //...   
		  
		
	}

}
