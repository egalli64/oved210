package gloria;

import java.util.Random;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		public class Guesser {
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				Random random = new Random();

				int target = random.nextInt(100);
				int value;
				do {
					System.out.println("Guess a number in [0:100]:");
					value = scanner.nextInt();
					System.out.println("your choice is:" + value);
					if (value < target) {
						System.out.println("Too low");
					}
					if (value > target) {
						System.out.println("Too high");
					}
				} while (target != value);

				System.out.println("Well done!");
				scanner.close();
			}

		}
		
	
	}
}
