package sara.countries;

/**
 * array di countries
 * IT, Italy
 * FR, France
 * ES, Spain
 * CH, Switzerland
 */

public class CountryUser { 
	public static void main(String[] args) {
					
				
		Country[] countries = new Country [5];
		
		countries[0] = new Country ("IT", "Italy");
		countries[1] = new Country ("FR", "France");
		countries[2] = new Country ("ES", "Spain");
		countries[3] = new Country ("CH", "Switzerland");
		countries[4] = new Country ("BE", "Belgium");
		
		for (int i = 0; i < 5; i++) {
			
		System.out.println(countries[i]); 
	}
}
}
	

    // un altro metodo
	
	// Strings[] ids = { "IT", "FR", "ES", "CH" };
	// Strings[] names = { "Italy", "France", "Spain", "Switzerland" };

	// Country[] countries = new Country[ids.lenght];
	// for (int i = 0; i < countries.lenght; i++) {
	// countries[i] = new Country(ids[i], names[i]);
    // System.out.println("Countries has " + countries.lenght + "elements")
	// }
