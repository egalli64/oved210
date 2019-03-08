package elmonda.mar04;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Simple {
	public static void main(String[] args) { // per importare comando scrivere: scannere ctrl+space. usiamo un oggetto
												// scanner
		// per crearmi yun oggetto scanner devo dire a java di trovarmi l'oggetto
		// scanner. importare significa che sto usando scanner che deriva da java util
		// ora lo devo inizializzare;
//	Scanner Scanner = new Scanner(System.in);   // lo scanner mi permette di gestire il testo immesso dall'utente, gli stamperò prima qualcosa per dirgli cosa voglio che ci metta dentro

		// System.out.println("Hello, what's your name?"); // sto dicendo chiamami la
		// print line

		try (Scanner scanner = new Scanner(System.in)) { // try per le eccezioni, in questo caso è un costrutto che vuol
															// dire ti apro un blocco in cui cerco di fare qualcosa
			// prendimi questa risorsa "oggetto" che ha al suo interno il metodo close,
			// dentro ci posso mettere solo cose che possono essere chiuse e java alla fine
			// del blocco sa che me le deve chiudere;

			// per eseguirlo rus as. per esegurlo dal promp dei comandi, scrivere nella
			// directory oved java elmonda.mar04.Simple
			// fin qui il programma ci stampa la nostra richiesta
			// Scanner scanner = new Scanner(System.in);
			System.out.println("Hello, what's your name?");
			String name = scanner.nextLine();

			System.out.println("Hello," + name + "!");

			// scanner.close();
			System.out.println("what's you age, " + name + "?"); // chiedo al mio utente qul è la sua età
			int age = scanner.nextInt(); // l'utende dovrebbe darmi un intero, metto l'intero nella new age

			System.out.println(name + ", you are" + age); // stampo di nuovo il nome e l'età
			// l'eccezione è il modo in cui java dice al codice utente che è successo
			// qulcosa su cui non sa come lavorarci
			// se chiedo un intero, e ottengo una stringa che non è un intero, la cosa più
			// semplice è fare una ctche delle eccezioni
			// ho chiesto un intero e mi ha dato altro quindi l'unica cosa che posso fare è
			// tirare un'eccezione
		} catch (InputMismatchException ex) { // ci possono essere più blocchi catche una per ogni tipo di eccezi.
			System.out.println("I was excepting your name as a string and your age a integer!");
		} catch (NoSuchElementException nsee) {
			// posso avere più eccezioni che eseguono lo stesso codice e lo faccio |
			// }catch(NoSuchElementException | IllegalStateException) {
			System.out.println("Bum!");
		} finally {
			System.out.println("The program ends here.");
		}
	}
}