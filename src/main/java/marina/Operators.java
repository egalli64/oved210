package marina;

public class Operators {

	public static void main(String[] args) {

		int a = 12;
		int b = 30;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println((double) a / b);
		System.out.println(b % a);
		System.out.println(b++);
		System.out.println(b--);
		System.out.println(b);
		
		System.out.println("spazio");
		
		
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
		
		
		if (a == b) {
			System.out.println("a equals b");
		}
			if (a != b) {
				System.out.println("a not equals b");
			}
			if (a > b) {
				System.out.println("a is bigger than b");
			}
			if (a < b) {
				System.out.println("a is less than b");
			}
			if (a <= b) {
				System.out.println( " a is less or egual b");}
			
			int g=20;
			int k=10;
								
			System.out.println("k is" + k + " and g is " + g);
			
			for(int i = 0; i < 10; i++) {
				for(int j= i; j < 10; j++) {
					System.out.print('.');
				}
					System.out.println();
					
			}
			
				
	}
	
		
		
	}

