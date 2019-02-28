package gloria.countries;

public class CityUser {
	
	public static void main(String[] args) {
		
		String[] ids = { "IT", "FR", "ES", "CH", "RA"};
		String[] name = { "ITALIA", "FRANCE", "SPAIN", "SWITZERLAND", "ARGETINA"};
		String[] cityNames = {"Roma", "Paris", "Madrid", "Bern", "Buenos Aires"};

		City[] cities = new City [5];

		for (int i = 0; i < 5; i++) {
			System.out.println(ids[i] + "," + name[i] + "," + cityNames[i]);
		}
				}

}
