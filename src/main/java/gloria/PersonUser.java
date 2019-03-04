package gloria;

import java.util.Random;

public class PersonUser {
	// constant
	private final static int NR_PERSONS = 5;

	public static void main(String[] args) {
		Random random = new Random();

		Person[] persons = new Person[NR_PERSONS];

		System.out.println("How many persons?" + Person.getCounter());
		
		try {

		persons[0] = new Person(5, -0.37);
		persons[1] = new Person(42, 1.85);
		persons[2] = new Person(21, 1.72);
		persons[3] = new Person(74, 2.04);
		persons[4] = new Person(18, 1.61);
		
		}catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return;
		}

		System.out.println("How many persons?" + Person.getCounter());

		// initialize array
		for (int i = 0; i < NR_PERSONS; i++) {

//			persons[i] = new Person(20 + random.nextInt(40), 1.50 + random.nextDouble());

		}

		// print array
		for (int i = 0; i < NR_PERSONS; i++) {
			System.out.println("Person" + i + ":" + persons[i]);

		}

		System.out.println("***"); // per separare il testo

		// procedimento per ottenere da un intervallo le persone ( in questo caso) con
		// una certa caratteristica da noi richiesta.
		// faccio prima il FOR e poi l'IF nel quale con il GET vado a pescare le persone
		// con quella caratteristica
		for (int i = 0; i < NR_PERSONS; i++) { // per luppare su tutte le mie persone
			if (persons[i].getAge() > 40) { // per avere SOLO le persone con età superiore a 40 anni
				System.out.println("Person" + i + ":" + persons[i]);

			}
		}

		System.out.println("***");
		// in questo caso effettuo la ricerca per altezza > di 1.70, il for riamen
		// identico e cambia solo l'if
		for (int i = 0; i < NR_PERSONS; i++) {
			if (persons[i].getHeight() > 1.70) {
				System.out.println("Person" + i + ":" + persons[i]);

			}
		}

		System.out.println("***");

		for (Person person : persons) { // for each, si chiede di luppare su tutti gli elementi dell'array senza
										// specificare nella scrittura
			if (person.getHeight() > 1.70) {
				System.out.println(person);

			}
		}

		System.out.println("***");

		// mi si richiede di trovare tra tutte le persone quelle con altezza > 1.70 e
		// quelle con età > 45
		// se avessi voluto l'"O" avrei messo anzichè l'and, il simbolo ||
		for (int i = 0; i < NR_PERSONS; i++) {
			if (persons[i].getHeight() > 1.70 && persons[i].getAge() < 40) {
				// devo utilizzare quindi &&
				System.out.println("Person" + i + ":" + persons[i]);

			}
		}

	}
}
