package claudia.countries;

public class CityUser extends CountryUser { 
	public static void main(String[] args) {
		
		String[]ids = {"IT", "FR", "ES", "BE"};
		String[]citynames = {"Rome", "Paris", "Madrid", "Bruxsell"};
		
		for(int i = 0; i < ids.length; i++) {
		System.out.println(ids[i] + "," + citynames[i]);}
		
		City[] cities = new City[4];
		
		
		cities[0] = new City("IT", "Rome");
		cities[1] = new City("FR", "Paris");
		cities[2] = new City("ES", "Madrid");
		cities[3] = new City("BE", "Bruxsell"); 
		

		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
	}

}
