package sara;

public class Recursion {
	static public int recursiveFactorial(int n) {
		if (n == 1) {
			return 1;
		}
		return recursiveFactorial(n-1) * n;
	}
	
	static public int factorial(int n) { //altro metodo utilizzato per loopare il fattoriale senza recursive
		int result = n; //impostiamo n per fare un fattoriale generico
		
		for(int i = 2; i < n; i++) { //impostiamo i da 2 a n, perchè 0 e 1 non si moltiplicano per se stessi
			result *= i; // result = n che va moltiplicato per ogni numero successivo ovvero i
	}
		return result;
}
	
	public static void main(String[] args) {
		System.out.println(recursiveFactorial(5));
		System.out.println(factorial(5));
	}
}
	
