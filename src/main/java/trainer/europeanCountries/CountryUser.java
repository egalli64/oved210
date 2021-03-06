package trainer.europeanCountries;

public class CountryUser {
	public static void f() {
		Country[] countries = new Country[3];
		try {
			countries[0] = new Country(null, "Fake");			
		} catch(IllegalArgumentException iae) {
			System.out.println(iae);
		}
	}
	
	public static void main(String[] args) {
		f();
		
		String[] ids = { "IT", "FR", "ES", "CH" };
		String[] names = { "Italy", "France", "Spain", "Switzerland" };
		String[] cityNames = { "Rome", "Paris", "Madrid", "Bern" };

		if (ids.length != names.length || ids.length != cityNames.length) {
			System.out.println("Unexpected!");
			return;
		}

		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i] + ", " + names[i] + ", " + cityNames);
		}

		Country[] countries = new Country[ids.length];
		System.out.println("Countries has " + countries.length + " elements");
		for (int i = 0; i < countries.length; i++) {
			countries[i] = new Country(ids[i], names[i]);
		}

		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i]);
		}

		for (Country country : countries) {
			System.out.println(country);
		}

		City[] cities = new City[ids.length];
		for (int i = 0; i < cities.length; i++) {
			cities[i] = new City(ids[i], cityNames[i]);
		}

		for (City city : cities) {
			System.out.println(city);
		}

		System.out.println("***");

		for (Country country : countries) {
			System.out.print(country.getName() + ": ");
			String countryId = country.getId();

			for (City city : cities) {
				String cid = city.getCountryId();
				if (cid.equals(countryId)) {
					System.out.print(city.getName());
					System.out.print(" ");
				}
			}
			System.out.println("***");
			for (City city : cities) {
				String cid = city.getCountryId();
				if (cid.equals(countryId)) {
					System.out.println(city.getName());
					System.out.println("");

				}

			}
		}

		System.out.println("*** People from Europe ***");

		String[] personNames = { "Carlo", "Pierre", "Miguel", "Pirmin" };
		Person[] persons = new Person[personNames.length];
		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person(personNames[i], cities[i]);
		}

		for (Person person : persons) {
			System.out.print(person + " - ");
			String id = person.getCity().getCountryId();
			for (Country country : countries) {
				if (country.getId().equals(id)) {
					System.out.println(country.getName());
					break;
				}
			}
		}

		System.out.println("*******");
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons + ids[i] + names[i]);
		}
	}

}
