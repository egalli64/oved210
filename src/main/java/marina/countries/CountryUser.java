package marina.countries;

public class CountryUser {

	public static void main(String[] args) {

		String[] ids = { "IT", "FR", "ES", "CH" };
		String[] names = { "Italy", "France", "Spain", "Switzerland" };
		String[] cityNames = { "Rome", "Paris", "Madrid", "Bern" };

		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i] + ", " + names[i] + ", " + cityNames[i]);
		}

		Country[] countries = new Country[ids.length];
		System.out.println(" Countries has " + countries.length + " elements");

		for (int i = 0; i < countries.length; i++) {
			countries[i] = new Country(ids[i], names[i]);
		}

		City[] cities = new City[cityNames.length];
		for (int i = 0; i < cities.length; i++) {
			cities[i] = new City(ids[i], cityNames[i]);
			System.out.println(cities[i]);
		}

		System.out.println("***************");

//		for (int i = 0; i < cities.length; i++) {
//			if (cities[i].getCountryId().equals("IT")) {
//				System.out.println(cities[i].getName());
//			}

		for (Country country : countries) {
			String countryId = country.getId();

			for (City city : cities) {
				String cid = city.getCountryId();
				if (cid.equals(countryId)) {

					System.out.println(country.getName() + ": " + city.getName());
				}
			}
			System.out.println();

			System.out.println("***People from Europe***");

			String[] personNames = { "Carlo", "Pierre", "Miguel", "Micheal" };

			Person[] persons = new Person[personNames.length];

			for (int i = 0; i < persons.length; i++) {
				persons[i] = new Person(personNames[i], cities[i]);
			}

			for (Person person : persons) {
				System.out.println(person);

			}

		}
	}

}
