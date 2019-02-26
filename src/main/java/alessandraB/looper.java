package alessandraB;

public class looper {
public static void main(String[] args) {
	for(int i = 0; i < 10; i++) {
		System.out.println("For loop " + i);
	}
	int i = 0; 
	while(i < 10) {
		System.out.println("While loop" + i); i += 1;
	}
	 i = 0; 
			 do {
				 System.out.println(" Do-while loop" + i);
				 i += 1;
	 }
	 while(i < 10);
}
}
