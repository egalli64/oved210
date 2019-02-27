package alessandraB;

public class Operators {
	public static void main(String[] args) {
		int a = 12;
		int b = 30;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println((double) a / b);
		System.out.println(b % a);
		System.out.println(++b); // aumento b di 1 e il nuovo valore di b è b + 1
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);

		b += a; // b = b + a ; 30 + 12 = 42 ora lo prendo come riferimento per gli altri calcoli
		System.out.println(b);
		b -= a; // b = b - a = 42 - 12 = 30;
		System.out.println(b);
		b -= 7; // b = b - 7 = 30 - 7 = 23
		System.out.println(b);
		b *= 7; // b = 23*7 = 23 * 7 = 161
		System.out.println(b);
		b /= 3; // b = b/3 = 161/3 = 53
		System.out.println(b);
		b %= 10; // b = b/10 % = 53/10 (5.3--> %0.3-->3) //% è il modulo (cioè il resto della
					// divisione)
		System.out.println(b);

		if (a == b) // il doppio = è il confronto, un solo = è assimilazione
		{
			System.out.println(" a equals b");
		}
		if (a != b) { // != vuol dire diverso
			System.out.println("a not equals b");
		}
		if (a > b) {
			System.out.println(" a is bigger than b");
		}
		if (a < b) {
			System.out.println(" a is less than b");
		}
		if (a <= b) {
			System.out.println("a is less or equal b");
		}

		int x, y, z;
		x = y = z = 100;
		if (x == 100 && y == 100 && z == 100) // la doppia & commerciale vuol dire "and"
		{
			System.out.println(" as expected");
		}
		int k = x == y ? 10 : 20; // sto definendo k variabile intera, se è vero che (?) x = y allora metto 10,
									// altrimenti (:) 20
		// sotto è scritta la stessa cosa per esteso
		int g;
		if (x == y) {
			g = 10;
		} else {
			g = 20;

		}

		for (int i = 0; i < 10; i++) {
			for (int j = i; j < 10; j++) {
				System.out.print('.'); // la print senza ln stampa e non va a capo, mentre invece  la print ln stampa andando a capo
			} 
			System.out.println();

		}
	}

}
