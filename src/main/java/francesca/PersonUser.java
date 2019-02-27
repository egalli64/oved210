package francesca;

import java.util.Random;

public class PersonUser {
	// constant
	private final static int NR_PERSONS = 5;
	
	public static void main(String[] args) {
		Random random = new Random();
	Person[] persons = new Person[NR_PERSONS];
		
		
		// per inizializzare array
		for(int i = 0; i < NR_PERSONS; i++) {
		 persons[i] = new Person(20 + random.nextInt(40), 1.50 + random.nextDouble());
			
		}
		
		
		// print array
		for (int i = 0; i< NR_PERSONS; i++) {
			System.out.println("Person" + i + ":" + persons[i]);
		}
			
			System.out.println("***"); //per separare il testo
			
		 for (Person person : persons) {
				if (person.getHeight() > 1.70) {
					System.out.println(person);
				}
					
					System.out.println("***");
					
					for(int i = 0; i < NR_PERSONS; i++) {
						if (persons[i].getAge() > 40) {
							System.out.println("Person" + i + ":" + persons[i]);
						}
					}
// Person kid =
					Person kid = persons[4].createkid();
					System.out.println("New person: " + kid);
					
					
			}
			
		}
	}
	


