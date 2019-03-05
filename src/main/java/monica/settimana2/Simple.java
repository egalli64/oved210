package monica.settimana2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {
			System.out.println("Hello, what's your name?");
			String name = scanner.nextLine();
			System.out.println("Hello," + name + "!");

			System.out.println("what's you age " + name + "?");
			int age = scanner.nextInt();

			System.out.println(name + ",you are " + age);
		} catch (InputMismatchException ime) {
			System.out.println("I was expecting your name as a string and your age as an integer! ");
		} catch (NoSuchElementException | IllegalStateException ex) {
			System.out.println("Bum!");

		}

		finally {
			System.out.println("the program ends here.");
		}
	}

}

