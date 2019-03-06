package elmonda.country;

import trainer.europeanCountries.City;

public class CountryUser {
public static void main(String[] args) {
	
	/** array di countries
	 * IT, Italy
	 * FR, France
	 * ES, Spain
	 * CH, Switzerland
	 */
 // String[] ids = { "IT", "FR", "ES", "CH"};
	//String[] names = { "Italy", "France", "Spain", "Switzerland"};
	
	 //for(int i = 0; i < ids.length; i++) {
		// System.out.println(ids[i] + "," + names[i]);
 

	
	Country[] countries = new Country[4];
	
	countries[0] = new Country("IT", "Italy");
	countries[1] = new Country("FR", "France");
	countries[2] = new Country("ES", "Spain");
	countries[3] = new Country("CH", "Switzerland");
	
	// per stampare gli elementi che ci sono nella mia arrey
	for(int i = 0; i < 4; i++) {
		System.out.println(countries[i]);
		
		
}	
	
	System.out.println("***");
	
	String[] ids = {"IT", "FR", "ES", "CH", "BB"};
	String[] names = {"Italy", "France", "Spain", "Switzerland", "Belgio"};
	
Country[] otherCountries = new Country[ids.length];
	
	for (int i=0; i < otherCountries.length; i++) {
		otherCountries[i] = new Country(ids[i], names[i]);
	System.out.println(ids[i] + "," + names [i]); // questo per ottenere la sigla dei paesi e il nome per esteso
		 
	}
	
	//oppure posso anche fare:
		System.out.println("otherCountries has" + otherCountries.length + "elements"); // questo per ottenere invece il numero dei paesi inseriti
		
	// String[] ids = { "IT", "FR", "ES", "CH" };
	// String[] names = { "Italy", "France", "Spain", "Switzerland" };
	// String[] cityNames = { "Rome", "Paris", "Madrid", "Bern" };
	
	//if (ids.length != names.length || ids.length != cityNames.length);
	// System.out.println("Unexpected!");
	// return;
	//}

	// for (int i = 0; i < ids.length; i++) {
	// System.out.println("");


	// array di countries
	// IT, Italy
	//FR, France
	//ES, sPAIN
	//ch, Switzerland
		
		System.out.println("***People from Europe***");
		
		String[] personNames = { "Carlo", "Pierre", "Miguel", "Pirmin"}; // con lo string mi creo il costruttore
		
		
		
}

}








