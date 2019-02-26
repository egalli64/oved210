package marina;

import java.util.Random;
import java.util.Scanner;

public class Guesser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int target = random.nextInt(100);
		int value;
		do {
			System.out.println("Guess a number in [0:100]: ");
			
			value = scanner.nextInt();
			
			System.out.println("Your choice is: " + value);

			if (value < target) {
			
				System.out.println("too low");
			}
			if (value > target) {
				System.out.println("too high");

			}
		} while (target != value);

		System.out.println("Well done!");

		scanner.close();

	}

}