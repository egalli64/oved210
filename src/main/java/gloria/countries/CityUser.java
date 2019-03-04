package gloria.countries;

public class CityUser {
	
	public static void main(String[] args) {
		
		String[] ids = { "IT", "FR", "ES", "CH", "RA"};
		String[] names = { "ITALIA", "FRANCE", "SPAIN", "SWITZERLAND", "ARGETINA"};
		String[] cityNames = {"Roma", "Paris", "Madrid", "Bern", "Buenos Aires"};

		City[] cities = new City [5];

		for (int i = 0; i < 5; i++) {
		
		System.out.println(ids[i] + "," + names[i] + "," + cityNames[i]);
		
		}
				
				
		System.out.println("***");
		
		City[] otherCities = new City [cityNames.length];
		
		for (int i=0; i < cityNames.length; i++) {
		
		System.out.println("cityNames is " + cityNames[i]);
			
			
		}
		
			
		}
		
}			
		//System.out.println("the cityName of" + names[i] + "is" + cityNames[i]);
		
	



