package francesca;

import java.util.Random;
import java.util.Scanner;

public class Looper2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	
	int target = random.nextInt(100);
	int value = -1;
	while(target != value) {
	System.out.println("Guess a number is [0:100]:");
	value = scanner.nextInt();
	System.out.println("Your choice is :" + value);
	if (value > target) {
		System.out.println("Too low");
	} else if(value > target);
	
	
	
    }
	scanner.close();
	
}
}
