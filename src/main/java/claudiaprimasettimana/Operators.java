package claudiaprimasettimana;

public class Operators {public static void main(String[] args) {
	
	
	int a = 12;
	int b = 30;		
			
	System.out.println(a + b);
	System.out.println(a - b);
	System.out.println(a * b);
	System.out.println((double)a / b);
	System.out.println(b % a);
	System.out.println(++b);
	System.out.println(b--);
	System.out.println(b);
	
//sono operatori diversi b = b + a
	
	b += a;
	System.out.println(b);
	b -= 7;
	System.out.println(b);  
	b *= 7;
	System.out.println(b);
	b /= 3;
	System.out.println(b);
	b %= 10;
	System.out.println(b);  
		
	if(a == b) {
		System.out.println("a equals b");
	}
	
	
	if(a != b) {
		System.out.println("a not equals b");
	}
	
	if(a < b) {
		System.out.println("a is bigger than b");
	}
	
	if(a > b) {
		System.out.println("a is less than b");
	}
	
	if(a <= b) {
		System.out.println("a is less or equal b");
	}
	
	int x, y, z;
	x = y = z = 100;
	if(x == 100 && y == 100 && z == 100) {System.out.println("as expected");
	
	
	}
	
	int k = x == y ? 10 : 20;
	
//	sto definendo k, in k ci sarà o 10 o 20 uno più leggibile e l'altro meno
	
	int g;
	if(x==y ) {
		g = 10;
	}
	
	else {
		g = 20;
	}
	
	
	
	for(int i = 0; i < 10; i++) {
		for(int j = i; j < 10; j++) {
			System.out.print(".");
		}
		System.out.println();
	}
//	
}

}
