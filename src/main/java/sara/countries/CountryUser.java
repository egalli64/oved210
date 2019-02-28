package sara.countries;

public class CountryUser {
	public static void main(String[] args) {

		Country[] countries = new Country[5];

		countries[0] = new Country("IT", "Italy");
		countries[1] = new Country("FR", "France");
		countries[2] = new Country("ES", "Spain");
		countries[3] = new Country("CH", "Switzerland");
		countries[4] = new Country("BE", "Belgium");

		for (int i = 0; i < 5; i++) {
			System.out.println(countries[i]);
		}

		System.out.println("***");

		// esempio: per associare le città alle nazioni con lo stesso id
		City[] cities = new City[3];
		cities[0] = new City("Milan", "IT");
		cities[1] = new City("London", "UK");
		cities[2] = new City("Paris", "FR");
		
		for (Country country : countries) {
			String countryId = country.getId();

			for (City city : cities) {
				String cityId = city.getCountryId();

				if (cityId.equals(countryId)) {
					System.out.println(country.getName() + "," + city.getName());
				}
				
			}
		}
	}

}
// un altro metodo

// String[] id = { "IT", "FR", "ES", "CH" };
// String[] name = { "Italy", "France", "Spain", "Switzerland" };

// Country[] countries = new Country[ids.length];
//oppure
//countries[i] = new Country(id[i], name[i]);

// for (int i = 0; i < countries.length; i++) {

// System.out.println(ids[i] + "," + name[i] + "," countries[i]);
// }

//altro modo per System
// System.out.println("Countries has " + countries.lenght + "elements")
// }
