package alessandraB.mar04;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner; // sto usando l'oggetto Scanner della classe Scanner che arriva da Java util

public class Simple {
	public static void main(String[] args) {
		// Scanner leggerà l'input come arriva dalla tastiera
		// e gli permetterà di gestirlo
		// System è dentro un package che si chiama Javalang

		System.out.println("Hello, what's your name?");

		try (Scanner scanner = new Scanner(System.in)) {
	    String name = scanner.nextLine();

			System.out.println("Hello, " + name + "!");

		    // se utilizzo questo metodo try, chiudendo il blocco, posso evitare di mettere
			// scanner.close();
			// JAVA sa che il try prevede già al suo interno il metodo close, quindi non
			// devo ripeterlo

		//Scanner scanner = new Scanner(System.in);
		//String name = scanner.nextLine();

		//System.out.println("Hello, " + name + "!");

		System.out.println("What's you age, " + name + "?");
		int age = scanner.nextInt();

		System.out.println(name + ", you are " + age);

		scanner.close(); // scanner va chiuso perchè se no si perdono risorse utilizzate per produrre la
							// stringa
							// il metodo close libera le risorse utilizzate da scanner

	} catch (InputMismatchException ime) {
		System.out.println("I was expecting your name as a string and your age as an integer");
	    //il catch deve essere all'interno di try, cioè prova a stamparmi questa stringa in try, se qualcosa
		//non torna perchè anzichè inserire un intero in age ma inserisci ad esempio una parola, fa in modo
		//che mi risulti "I was expecting..", e alla fine "the program ends here".
	} catch (NoSuchElementException nscee) {
		System.out.println("Boom");
	} catch (IllegalStateException ise) {
		System.out.println("Boom Boom!");
	} // oppure posso scrivere catch (InputMismatchException ime | NoSuchElementException nscee) {
      // System.out.println("Boom");    la barra verticale | vuol dire "or" , se si verifica un errore
	  // o l'altro fai uscire Boom.
		
		finally {
		System.out.println("The program ends here.");
	}
} }
