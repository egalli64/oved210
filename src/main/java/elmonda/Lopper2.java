package elmonda;

import java.util.Random;


public class lopper2 {
	public static void main(String[] args) {	
		Scanner scanner = Scanner(System.in);
		Random random = new Random();
		
		int target = random.nextInt(100);
		int value = -1
				
	 while (target != value) {
		 System.out.println("Guess a number in [0:100]:");		
		 value = scanner.nextInt();	
		 System.out.println("your choice is" + value);
	 }
		if (value > target) {
			System.out.println("Too high");
		}


	System.out.println("well done!");
	scanner.close();
}
}