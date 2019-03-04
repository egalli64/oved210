package francesca.mar01;

public class Simple {
	
	private static final String String = null;



	public void operations() {
		int x = 3;
		int y = 5;
	}
	
	public static void f() {
		
		//Base base1 = new Base(23, "hello");
		//System.out.println(base1);
		
		Derived derived = new Derived(12,"hi");
				System.out.println(derived);
				
				Other other = new Other(21, "hihi");
				System.out.println(other);
				
				Base[] bases = new Base[2];
				bases[0] = derived;
				bases[1] = other;
				
				for (Base base: bases) {
					System.out.println(base);
					base.doSomething();
					
					if (base instanceof Derived) {
						Derived x = (Derived)base;
						System.out.println(x.getMyStatus());
						
						if(base instanceof Other) {
							Other x1 = (Other)base;
							System.out.println(x1.GetValue());
						}
					}
				}
				
				
				}
					
					
					
				public static void g() {
					String s = null;
					System.out.println(s.length());
				
				}
		
		
	
	public static void main(String[] args) {
		f();
		boolean a = true;   // 1 bit
		byte b = 12;        // 8 bit
		short s = 1020;    // 16 bit
		int ix = 1_000_000;  //32 bit
		long l = 2_000_000_000;  // 64 bit
		
		float f = 1.34F;   // 32 bit bisogna utilizzare la F per distinguerlo dai double
		double d = 12.567; // 64 bit
		
		if(a == true) {
			ix = (int)l;
			int x = 12;
		}
		
		String s1 = "Hello";
		String s2 = new String ("hello");
		
		int[] days = new int[12];
		
		//loop for
		for(int i = 0; i < days.length; i++) {
			days[i] = i;
			System.out.println(days[i]);
		}
		
		for (int value : days) {
			System.out.println(value);
		}
		
		 //int[] days = new int[12]; //  days è un array di interi, array di 12 elementi inizializzati a zero
		// days[0] = 31;
		// days[1] = 28;
//      // ...
		// days [11] = 31;
		
		
		
		
		 // vogliamo inizializzare in array, esempio in gennaio voglio mettere 31
		 days[0] = 31;
		 
		 Integer[] days2 = new Integer[12];
		 days2[0] = 31; // new Integer(31);
		 
		 // la new serve solo per gli oggetti reference
		
		
	}
	}


