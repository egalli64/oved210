package alessandraB.countries;

public class CountryUser {
	public static void main(String[] args) {

		// voglio costruire un array di countries e poi stamparlo:
		// IT, Italy
		// FR, France
		// ES, Spain
		// CH, Switzerland

		String[] ids = { "IT", "FR", "ES", "CH", "UK" }; // un array di stringhe che contiene tutti gli ids
		String[] names = { "Italy", "France", " Spain", "Switzerland", "United Kingdom" };// un array di stringhe che																							// contiene tutti gli stati
		String[] cityNames = { "Milan", "Paris", "Barcellona", "Zurigo", "Londra" };

		for (int i = 0; i < ids.length; i++) {

			System.out.println(ids[i] + ", " + names[i] + ", " + cityNames[i]);
		}

		System.out.println("******");

		City[] cities = new City[cityNames.length];

		for (int i = 0; i < cityNames.length; i++) {
			cities[i] = new City(cityNames[i], ids[i]);
			
			System.out.println(cities[i]);
		}

		Country[] countries = new Country[ids.length];

		// ids.length è uguale a 5, è come se scrivessi:
		// Country[] countries = new Country [5];

		System.out.println("Country has " + ids.length + " elements");
		// length è il numero di elementi in country (è come se fosse 4)

		countries[0] = new Country(" IT", " Italy");
		countries[1] = new Country(" FR", " France");
		countries[2] = new Country(" ES", " Spain");
		countries[3] = new Country(" CH", " Switzerland");
		countries[4] = new Country(" UK", " United Kingdom");

		for (int i = 0; i < countries.length; i++) {
			// è uguale a scrivere : for(int i = 0; i < 5 ; i++)

			System.out.println(countries[i]);
		}
		System.out.println("*******");

		for (Country country : countries) {
			System.out.println(country);

		}
	}

}