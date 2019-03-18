package tiziana.PrimaSettimana;

public class PersonUser2 {
	private final static int NR_PERSONS = 5;

	public static void main(String[] args) {

		Person2[] persons = new Person2[NR_PERSONS];
		
		System.out.println("How many persons?"+ Person2.getCounter());
	
		
		persons[0] = new Person2(5, 0.37);
		persons[1] = new Person2(42, 1.85);
		persons[2] = new Person2(21, 1.72);
		persons[3] = new Person2(74, 2.04);
		persons[4] = new Person2(18, 1.31);
		
		System.out.println("How many persons?"+ Person2.getCounter());

		for (int i = 0; i < NR_PERSONS; i++) {
			System.out.println("Person" + i + ":" + persons[i]);
		}
		
		System.out.println("*****");

		for (int i = 0; i < NR_PERSONS; i++) {
			if (persons[i].getAge() > 40) {
				System.out.println("Person" + i + ":" + persons[i]);
			}
		}
	
		System.out.println("*****");


		
  for(Person2 person:persons) {
	if(person.getHeight() < 1.70) {
		System.out.println(person);
		
	}
  }
  
  
  
 
  System.out.println("******");
  
  
	for (int i = 0; i < NR_PERSONS; i++) {
		if (persons[i].getAge() <40 && persons[i].getHeight() >1.70) {
			System.out.println("Person" + i + ":" + persons[i]);
		}
	}
	
	
  
  
 
   
	}
}
