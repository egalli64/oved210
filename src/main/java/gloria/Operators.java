package gloria;

public class Operators {
    public static void main(String[] args) {
    	
    	int a = 12;
    	int b = 30;
    	
    	System.out.println(a+b);
    	System.out.println(a-b);
    	System.out.println(a*b);
    	System.out.println((double) a/b); // mettendo double facciamo il  cast da un intero ad un floating point
    	System.out.println(b%a);
    	System.out.println(b++);
    	System.out.println(b);
    	System.out.println(b--);
    	
    	b += a; //b = b + a = 30 + 12 = 42 ( da qui prendo in riferimento il 42).
    	
    	//b = +a vuol dire b = a; b = -a vuol dire che ad "A" si aggiunge il segno negativo davanti
    	
    	System.out.println(b);
    	b -= 7; // vuol dire b = b - 7 = 42 - 7 = 35 
    	System.out.println(b);
    	b *= 7; // b = b * 7 = 35 * 7 = 245
    	System.out.println(b);
	    b /= 3; // b = b / 3 = 245 / 3 = 81
	    System.out.println(b);
	    b %= 10; // % è il modulo ( il resto della divisione intera)
	    System.out.println(b); // = 81 / 10 = 8.1 qundi il modulo è = 1.
	    
	    
	    if (a == b) { // == vuol dire che voglio fare il confronto, un solo = vuol dire che a quel carattere assegno un certo valore
	    	System.out.println("a equals b");
	    }
	    
	    if (a != b) { // ! significa diverso
	    	System.out.println("a not eqauls b");
	    }
	    
	    if (a > b) {
	    	System.out.println("a is a bigger than b");
	    }
	    
	    if (a < b) {
	    	System.out.println("a is less than b");
	    }
	    
	    if (a <= b) {
	    	System.out.println("a is less or equal b");
	    }
	    
	    int x, y, z;
	    x = y = z = 100;
	    if (x == 100 && y == 100 && z == 100) {
	    	System.out.println("as expected");
	    }
	    
	    int k = x == y ? 10:20; // definisco k dico che è uguale a qualcosa. se è vero tra x ed y allora metti dopo il punto di domanda k, quindi assegna o 10 o 20.
	    int g;
	     if (x == y) {
	    	 g = 10;
	    } else {
	    	 g = 20;
	     }
	    
	     for (int i = 0; i < 10; i++ ) {
	    	 for (int j = i; j < 10; j++) {
	    		 System.out.print('.');
	    		 
	    	 }
	    	 System.out.println();
	     }
	 }
	    
}

