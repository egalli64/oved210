package elmonda;

public class Recursion {
	static public int recursiveFactorial(int n) {
		if (n == 1) {
			return 1;
		}

		return recursiveFactorial(n - 1) * n;
	
	}

	 static public int factorial(int n) {
		int result = n;  // lo voglio moltiplicare per tutti i numeri che vanno da 1 a 5 escluso, quindi faccio un for che va da 1 a n, posso  
		
		for(int i = 2; i < n; i++) {  // posso farlo con 2
			result *=i;  // gli dico che result è uguale a 2
		
	}
return result;
	}
	public static void main(String[] args) {
		System.out.println(recursiveFactorial(5));
		System.out.println(factorial(5));
	}
	
	
}

