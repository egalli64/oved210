package claudia.countries;

import trainer.europeanCountries.City;

public class CountryUser {	
		public static void main(String[] args) {
		
		String[]ids = {"IT", "FR", "ES", "BE"};
		String[]names = {"Italy", "France", "Spain", "Belgium"};
		String[]citynames = {"Rome", "Paris", "Madrid", "Bruxsell"};
		
		for(int i = 0; i < ids.length; i++) {
			System.out.println(ids[i] + "," + names[i]);
			
			System.out.println("**********");
		}
	
		 Country[] countries = new Country[4];
			
			
			countries[0] = new Country("IT", "Italy");
			countries[1] = new Country("FR", "France");
			countries[2] = new Country("ES", "Spain");
			countries[3] = new Country("BE", "Belgium");
		
			City[] cities = new City[4];
			
			
			cities[0] = new City("IT", "Rome");
			cities[1] = new City("FR", "Paris");
			cities[2] = new City("ES", "Madrid");
			cities[3] = new City("BE", "Bruxsell"); 
			
			System.out.println("**********");
			
			System.out.println(citynames[0]);
			System.out.println(citynames[1]);
			System.out.println(citynames[2]);
			System.out.println(citynames[3]);
			
			System.out.println("**********");
		
		for(int i = 0; i < countries.length; i++) {
			System.out.println(countries[i]);
		}
			
//			for (Country country : countries) {
//				System.out.println(country);
//			}
			
//			è la stessa cosa di sopra
			
		  	System.out.println("**********");
			System.out.println("Countries has " + countries.length + " elements");
	
	for (Country country : countries) {
		System.out.println(country.getName() + ": ");
		String countryId = country.getId();
		
	for (City city : cities) {
		String cid = city.getCountryId();
	
	if(cid.equals(countryId)){
		System.out.println(city.getName());
		
	}
}
	}
	}
}
