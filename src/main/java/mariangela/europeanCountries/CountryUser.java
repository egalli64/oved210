package mariangela.europeanCountries;

public class CountryUser {
	public static void main(String[] args) {

		String[] ids = { "IT", "FR", "ES", "CH", "BE" };
		String[] names = { "Italy", "France", "Spain", "Switzerland", "Belgium" };
		String[] cityNames = { "Rome", "Paris", "Madrid", "Bern", "Brussels" };

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
			System.out.println(country.getName() + ": ");
			String countryId = country.getId();

			for (City city : cities) {
				String cid = city.getCountryId();
				if (cid.equals(countryId)) {
					System.out.println(city.getName());
					System.out.println(" ");
				}
			}
		}
	}
}
