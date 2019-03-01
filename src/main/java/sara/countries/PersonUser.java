package sara.countries;


public class PersonUser {

	public static void main (String [] args) {
	
		System.out.println("*** People from Europe ***");
		
		
		String[] name = {"Sara", "Gloria", "Jean"};
						
		Person[] people = new Person [3];
					
		people[0] = new Person (" Sara", new City("Rome" , "IT"));
		people[1] = new Person (" Gloria", new City("Milan" , "IT"));
		people[2] = new Person (" Jean", new City("London" , "UK"));
						
 
			for (int i = 0; i < 3; i++) {   
				
			System.out.println(people[i]); 
			
			}
}
			
			
}
