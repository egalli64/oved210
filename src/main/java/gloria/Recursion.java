package gloria;

public class Recursion { // per calcolare un fattoriale devo utilizzare o il metodo della regressione
							// (quindi il primo metodo sperimentato) oppure devo utilizzare il loop
	static public int recursiveFactorial(int n) {
		if (n == 1) { // è necessario mettere il numero per far si che la ritorsione arrivi fino a
						// quel limite altrimenti avrebbe ritorsioni infinite e darebbe sempre errore
						// creando solo casino.
			return 1; // riporta ad 1 che è la condizione da noi inserita
		}

		return recursiveFactorial(n - 1) * n;

	}

	static public int factorial(int n) {
		int result = n; // result equivale a 5, partiamo da qui e lo moltiplichiamo per 2 e in seguito il risultato lo moltiplico per il numero successivo fino ad arrivare ad 5 

		for (int i = 2; i < n; i++) { // metodo del loop
			result *= i; // result = result * i, operazione che faccio per tutti i numeri da 2 ad n che equivale a 5
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(recursiveFactorial(5));
		System.out.println(factorial(5));

	}

}
