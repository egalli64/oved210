package tiziana;

public class PersonUser {
	private final static int NR_PERSONS = 5;
	
	public static void main(String[] args) {

		Person[] persons = new Person[NR_PERSONS];
		
		persons[0] = new Person(5, 0.37);
		persons[1] = new Person(42, 1.85);
		persons[2] = new Person(21, 1.72);
		persons[3] = new Person(74, 2.04);
		persons[4] = new Person(18, 1.31);

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


		
  for(Person person:persons) {
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
