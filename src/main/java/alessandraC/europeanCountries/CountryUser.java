package alessandraC.europeanCountries;

public class CountryUser {
	private static Object countryId;

	public static void main(String[] args) {
		/**
		 * array di countries IT, Italy FR, France ES, Spain CH, Switzerland
		 */
		String[] ids = { "IT", "FR", "ES", "CH", "BE" };
		String[] names = { "Italy", "France", "Spain", "Switzerland", "Belge" };
		String[] cityNames = { "Rome", "Paris", "Madrid", "Bern", "Bruxelles" };

		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i] + ", " + names[i] + ", " + cityNames[i]);
		}

		Country[] countries = new Country[ids.length];
		for (int i = 0; i < countries.length; i++) {
			countries[i] = new Country(ids[i], names[i]);
		}

		System.out.println("Countries has " + countries.length + " elements" + "cities");

		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i]);
		}

		City[] cities = new City[cityNames.length];
		for (int i = 0; i < cities.length; i++) {
			cities[i] = new City(cityNames[i], ids[i]);
			System.out.println(cities[i]);
		}

//		for (int i = 0; i < cities.length; i++) {
//			if (cities[i].getCountryId().equals("IT")) {
//				System.out.println(cities [i].getName());
//			}

		for (Country country : countries) {
			String countryId = country.getId();
			for (City city : cities) {
				String cid = city.getCountryId();
				if (cid.equals(countryId)) {
					System.out.println(country.getName() + ": " + city.getName());
				}
			}
		}

		String[] personNames = { "Carlo", "Pierre", "Miguel" };
		
		Person[] persons = new Person[personNames.length];

		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person(personNames[i], cities[i]);

			System.out.println(persons[i]);
			

		}
		

	}
}
