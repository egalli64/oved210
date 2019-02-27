package elmonda;

import java.util.Random;

public class PersonUser {

	private final static int NR_PERSONS = 5;

	public static void main(String[] args) {

		
		 Random random = new Random();
		Person[] persons = new Person[NR_PERSONS];

		// INITIALIZE ARRAY
		for (int i = 0; i < NR_PERSONS; i++) {
			persons[i] = new Person(20 + random.nextInt(40), 1.50 + random.nextDouble());

		//	persons[1].setAge(22);   // mi ritorna l'età della persona 1
		}
		// PRINT ARRAY
		for (int i = 0; i < NR_PERSONS; i++) {
			System.out.println("Person" + i + ": " + persons[i]);
		}

		System.out.println("***");

		for (int i = 0; i < NR_PERSONS; i++) {
			if (persons[i].getAge() > 40) {
				System.out.println("Person" + i + ": " + persons[i]);
			
			}
			System.out.println("***");                        // metodo più semplice ( equivalente alla riga 25)
			for (Person person : persons) {
				if (person.getHeight() > 1.70) {
					System.out.println(person);
				}
			}
				System.out.println("***");
				for (Person person : persons) {
					if (person.getHeight() <= 1.72) {
						System.out.println(person);
					}
				}
					System.out.println("***");
					for (Person person : persons) {
						if ((person.getAge() < 40) && (person.getHeight() > 1.70)) {
							System.out.println(person); // ||--> basta una delle due condizioni e accetto
					
				}
				
			}
		}
	
		System.out.println("***");
		persons [0] = new Person(5, 0.37);
		persons [1] = new Person(42, 1.85);
		persons [2] = new Person(21, 1.72);
		persons [3] = new Person(74, 2.04);
		persons [4] = new Person(18, 1.61);
	
		for (Person person : persons) {
			if ((person.getAge() < 40) && (person.getHeight() > 1.70)) {
				System.out.println(person);
			

	}
}
	}   // esempio: finchè esiste kid...
}
