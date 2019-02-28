package gloria.countries;

public class PersonUser {
	
	public static void main(String[] args) {
		
		String [] name = {"Silvio", "Tina", "Veronica"};
		Person [] persons = new Person [3];
		
		persons [0] = new Person ("Silvio", new City ("Argentina", "RA", "Buenos Aires"));
		persons [1] = new Person ("Tina", new City ("Calabria", "IT", "vibo"));
		persons [2] =new Person ("Veronica", new City ("Milano", "IT", "San donato"));
		
		
		
		for (int i=0; i < 3; i++) {
			
		
			System.out.println(persons[i]);
		}
		
		
			
		}
		
								
	}


