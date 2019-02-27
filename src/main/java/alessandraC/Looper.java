package alessandraC;

public class Looper {
public static void main(String[] args) {
	System.out.println("*** For loop ***");
	for (int i = 0; i <10; i++) {
		System.out.println("hello + i");
	}
	
	int i = 0;
	while(i < 10) {
		System.out.println("hello" + i);
		i += 1;
	}
	
	i = 0;
	do  {
		System.out.println("*** while***" + i);
		i +=1;
	} while (i < 10);
	
}
}
