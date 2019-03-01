package mariangela.europeanCountries;

public class CountryUser {
	public static void main(String[] args) {

		String[] ids = { "IT", "FR", "ES", "CH", "BE" };
		String[] names = { "Italy", "France", "Spain", "Switzerland", "Belgium" };
		String[] cityNames = { "Rome", "Paris", "Madrid", "Bern", "Brussels" };
		String[] personNames = { "Carlo", "Pierre", "Miguel" };

		Country[] countries = new Country[ids.length];
		for (int i = 0; i < ids.length; i++) {
			countries[i] = new Country(ids[i], names[i]);
			System.out.println(ids[i] + ", " + names[i] + ", " + cityNames[i]);
		}

		System.out.println("*******");

		City[] cities = new City[cityNames.length];
		for (int i = 0; i < cityNames.length; i++) {
			cities[i] = new City(cityNames[i], ids[i]);
			System.out.println(countries[i] + cityNames[i]);
		}
		System.out.println("****");

		for (Country country : countries) {
			String countryId = country.getId();

			for (City city : cities) {
				String cid = city.getCountryId();
				if (cid.equals(countryId)) {
					System.out.println(country.getName() + ": " + city.getName());

				}

			}

		}
		System.out.println("***People from Europe***");
		
		Person[] persons = new Person[personNames.length];
		for (int i = 0; i < personNames.length; i++) {
			persons[i] = new Person(personNames[i], cities[i]);
	
		}
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
