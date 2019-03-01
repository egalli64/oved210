package monica.simple;

public class Simple {

	public static void main(String[] args) {
		boolean a = true;
		byte b = 12;
		short s = 1020;
		int ix = 1_000_000;
		long l = 2_000_000_000;
		float f = 1.34F;
		double d = 12.657;

		if (a == true) {
			ix = (int) l;

//			con il cast costringo java a eseguire un comando,in questo caso dico che il long entra in un intero
//			java butta via la parte più significativa del long e lo mette nell'intero
			int ij = 12;

		}

		String s1 = "Hello";
		String s2 = new String("Hello");

//			creazione oggetto stringa, s1 vive nello scope e va nello stack dove c'è l'indirizzo, hello va nello heap

//			int[] days = new int [12];
//			days[0] = 31;

		Integer[] days2 = new Integer[12];
		days2[0] = 31;

		int[] days = { 31, 28, 31, 30 };
		// for(int i = 0; i < days.length; i++) {
		// days[i] = i;
		// System.out.println(days[i]);

//			modi per inizializzare l'array
		// }

		for (int value : days) {
			System.out.println(value);
//			stampa i valori di days

		}
//			public void operation() {
//				int x = 3;
//				int y = 5;
//			}
//			
//			public static void f() {
//				Base base = new Base(23, "hello";)
//				System.out.println(base);

		Derived derived = new Derived(12, "hi");
		System.out.println(derived);

		Other other = new Other(21, "hihi");
		System.out.println(other);

		Base[] bases = new Base[2];

		bases[0] = derived;
		bases[1] = other;

		for (Base base : bases) {
			System.out.println(base);
			base.doSomething();
			if (base instanceof Derived) {
				Derived x = (Derived) base;
				System.out.println(x.getMyStatus());
			}
		if (base instanceof Other){
			Other x = (Other) base;
			System.out.println(x.getValue());
			
		}
		
		}
	}

}
