package elmonda.country;

public class CityUser {
	public static void main(String[] args) {
		String[] ids = { "IT", "FR", "ES", "CH", "BB" };
//		String[] name = { "ITALIA", "FRANCE", "SPAIN", "SWITZERLAND", "BELGIO" };
		String[] cityNames = { "Roma", "Paris", "Madrid", "Bern", "Bruxelles" };
		
		City[] cities = new City[ids.length];
		for (int i = 0; i < cities.length; i++) {
			cities[i] = new City(ids[i], cityNames[i]);
		}

		System.out.println("***");
// equal ritorna true quando le due stringhe sono uguali. 
//			 equals compara le due stringhe  e verifica che siano uguali

		System.out.println("Spain: ");
		for (City city : cities) {
			String cid = city.getId();
			if (cid.equals("ES")) {
				System.out.println(city.getName());	
				
			}
		}
	}
}
