package alessandraB;

public class Recursion {
	static public int recursivefactorial(int n) {  // esempio di numero fattoriale 3! (3 x 2 x 1)
	   if (n == 1)  {
		   return 1;
	   }
	   
	 return recursivefactorial(n-1)* n; //( 5-1) = 4 
	 // (4 - 1) = 3
	 // (3 - 1) = 2
	 // (2 - 1) = 1  --> if(n ==1) return 1; quindi ora si passa a rimoltiplicare tutto per n
	 // 2 x 1 = 2    2 x 3 = 6   6 x 4 = 24  24 x 5 = 120
	 
	 //parto a risolvere in modo ricorsivo fino ad 1 il fattoriale nella parentesi, poi 
	 //moltiplico risalendo per tutti i valori di n.
	}
	
	 static public int factorial(int n) { // static: fissa la variabile int all'interno della classe
		                                  // indipendentemente da tutti gli oggetti (si comporta in modo 
		                                  // indipendente.
		 int result = n;
		 for (int i = 2; i < n; i++) {
			 result = result * i;  //alternativamente scrivo resutl =* i
	
		 }
		   return result;
		   //io chiamo la mia variabile risultato n, per ogni valore compreso tra i ed n, incremento 
		   // i ogni volta facendo in modo che result * i = result; alla fine dell'operazione il mio
		   // result è stato modificato perchè moltiplicato ogni volta per il numero precedente
		   
	 }
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(recursivefactorial(5));
		
		
	}
	}


