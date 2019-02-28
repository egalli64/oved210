package sara.countries;

public class CityUser {
	
	public static void main (String [] args) {
		
	City[] cities = new City [3];
		
		cities[0] = new City ("Milan", "IT");
		cities[1] = new City ("London", "UK");
		cities[2] = new City ("Paris", "FR");

		for (int i = 0; i < 3; i++) {
			
		System.out.println(cities[i]); 
	}
		
		
		System.out.println("***");
		
		
{
		String[] name = { "Milan", "London", "Paris" };

		String[] countryId = { "IT", "UK", "FR" };
		
		
		City[] otherCities  = new City [countryId.length];
		
		for (int i = 0; i < countryId.length; i++) {
		
			 System.out.println(name[i] + "," + countryId[i]);

		}
	  
}
	}
}

		
		

	  

