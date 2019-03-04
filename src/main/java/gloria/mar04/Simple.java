package gloria.mar04;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Hello, what's your name?");
			String name = scanner.nextLine();
			System.out.println("Hello, " + name + "!");

			System.out.println("What's your age," + name + "?");
			int age = scanner.nextInt();

			System.out.println(name + ", you are" + age);

			// tutte le possibili eccezioni che possono essere tirate nel nostro try-catch.

		} catch (InputMismatchException ime) {
			System.out.println("I was excepting your name as a string and your age as an integer!");

		} catch (NoSuchElementException | IllegalStateException ex) {
			System.out.println("Bum!");

		} catch (Exception ex) {    // in questo modo scrivendo direttamente EXCEPTION gli dico di comprendermi
									// tutte le eccezioni, senza stare a specificare quale, come nei casi
									// precedenti.
			System.out.println("Bum!");

		} finally {
			System.out.println("The program end here.");
		}

	}

}
