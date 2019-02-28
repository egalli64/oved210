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
			cities[i] = new City(ids[i], cityNames[i]);
			System.out.println(countries[i] + cityNames[i]);
		}

	}
}
