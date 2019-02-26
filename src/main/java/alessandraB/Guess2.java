package alessandraB;

import java.util.Random;
import java.util.Scanner;

public class Guess2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	      Random random = new Random();
	     
	      int target = random.nextInt(100);
		  int value = 3;
		  
do {
		System.out.println("Guess a number in [0:100] : "); 
		value = scanner.nextInt();
		  
if(target < value);
value = scanner.nextInt();
System.out.println("Your choice is too high:" + value); 

	
if ( target >  value); 
value = scanner.nextInt();
System.out.println("Your choice is too low:" + value);

} while(target!= value);
	System.out.println("well done!" + value);

	}
}

