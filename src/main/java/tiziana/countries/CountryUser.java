package tiziana.countries;

public class CountryUser {
	public static void main(String[] args) {
		String[] ids = { "IT", "FR", "ES", "CH", "BE" };
		String[] names = { "Italy", "France", "Spain", "Switzerland", "Belgium" };
		String[] cityNames = { "Rome", "Paris", "Madrid", "Bern", "Bruxelles" };
		{

		}
		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i] + "," + names[i] + "," + cityNames[i]);
		}

		City[] cities = new City[ids.length];
		for (int i = 0; i < cities.length; i++) {
			cities[i] = new City(ids[i], cityNames[i]);
		}

		Country[] countries = new Country[ids.length];
		System.out.println("Countries has" + countries.length + "elemements");
		for (int i = 0; i < countries.length; i++) {
			countries[i] = new Country(ids[i], names[i]);
		}

//			countries[0]= new Country("IT","Italy");
//			countries[1]= new Country("FR","France");
//			countries[2]= new Country("ES","Espain");
//			countries[3]= new Country("CH", "Switzerland");
//			countries[4]= new Country("BE","Belgium");

		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i] + cityNames[i]);

		}

//			for(Country country: countries) {
//				System.out.println(country);
//
//	
//	        for(City city: cities)  {
//	        	System.out.println(city);
//	        }

		for (Country country : countries) {
			String countryId = country.getId();

			for (City city : cities) {
				String cid = city.getCountryId();
				if (cid.equals(countryId)) {
					System.out.print(country.getName() + ": " + city.getName());
					System.out.println(" ");

				}

			}

		}

		System.out.println("*****People from Europe*****");

		String[] personNames = { "Luca", "Pierre", "Miguel" };

		Person[] persons = new Person[personNames.length];
		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person(personNames[i], cities[i]);

			for (Person person : persons) {
				System.out.println(person);

			}

		}

	}
}
