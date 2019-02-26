package elmonda;

public class operations {
public static void main(String[] args) {
	
	int a = 12, b = 30;
	
	System.out.println(a + b);
	System.out.println(a - b);
	System.out.println(a * b);
	System.out.println((double)a / b);
	System.out.println(b % a);
	System.out.println(++b);
	System.out.println(b--);
	
	b += a;
	System.out.println(b); // 30+12=42
	b -= 7; 
	System.out.println(b); // 42-7= 35
	b *= 7;
	System.out.println(b); // 35*7= 245
	b /= 3;
	System.out.println(b); // 245/30=81.6
	b %=10;
	System.out.println(b); //81/10=8.1 il modulo è 1
	
	if(a==b) {
		System.out.println("a equals b");
	}
	if(a !=b) {
		System.out.println("a not equals b");
	}
	if(a > b) {
		System.out.println("a is bigger than b");
	}
	if(a <= b) {
		System.out.println("a is less or equal b");

	}
	
	int x, y, z;  // sconsigliato scrivere cosi le variabili
	x = y = z = 100; // tutti i valori sono inizializzati a 100, per chiarezza è meglio scrivere x=100, y= 100 ...
	if(x== 100 && z == 100) {
		System.out.println("as expected");
	}
	
	int k = x == y ? 10 : 20; // rigo 47 è equivalente a (48-49-50-51-52-53)
	int g;
	if (x==y) {
		g = 10;
	}else {
		g = 20;
		
	}
	
	for(int i = 0; i < 10; i++) {
		for(int j = i; j < 10; j++) {
			System.out.print('.');
		}
		System.out.println();
	}
}
}