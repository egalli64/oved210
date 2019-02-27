package alessandraB;


public class PersonUser {
	public static void main(String[] args) {
		System.out.println( " How many people ?" + Person.getCounter());
		
		final int NR_PEOPLE = 5;
		
		Person[] people = new Person [NR_PEOPLE];
		
		people[0] = new Person(5,  0.37);
		people[1] = new Person(42, 1.85);
		people[2] = new Person(21, 1.72);
		people[3] = new Person(74, 2.04);
		people[4] = new Person(18, 1.61);

		System.out.println( " How many people ?" + Person.getCounter());
		
		
	//print array
		
		
 for(int i = 0; i < NR_PEOPLE; i++) {
   if(people[i].getAge() < 45 && people[i].getHeight() > 1.70) { //la && vuol 
	  System.out.println("Person " + i +" : " + people[i]);      //dire che valgono 
	  } else {                                                  //entrambe le condizioni
		System.out.println(" // ");
		System.out.println( " How many people ?" + Person.getCounter());
			
			
	// stesso modo ma utilizzando "for each":
	// for(Person person : people) {  // i due punti sono il modo per il "for each", per ogni persona di people
	//  if(person.getAge() > 40) {
	//    syso(person);
    }
	}
	}
}
	

