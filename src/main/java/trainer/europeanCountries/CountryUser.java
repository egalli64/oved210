package trainer.europeanCountries;

public class CountryUser {
	public static void main(String[] args) {
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
			System.out.println();
		}
	}
}
