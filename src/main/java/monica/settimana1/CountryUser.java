package monica.settimana1;

public class CountryUser {
	public static void f() {

		Country[] countries = new Country[3];   //continua..

		// System.out.println ("Countries has " + countries.length + " element");
	}

	public static void main(String[] args) {
		String[] ids = { "IT", "FR", "ES", "CH", "BE" }; // ids è un array di stringhe (così e più rapido)
		String[] names = { "Italy", "France", "Spain", "Switzerland", "Belgio" }; // ids è un array di stringhe
		String[] cityNames = { "Rome", "Paris", "Madrid", "Bern", "Bruxelles" };
		String[] peopleNames = { "carlo", "pierre", "Miguel" };

		People[] people = new People[peopleNames.length];

		people[0] = new People("carlo", new City("Rome", "IT"));
		people[1] = new People("pierre", new City("Paris", "FR"));
		people[2] = new People("Miguel", new City("Madrid", "ES"));

//        for (int i = 0; i < peopleNames.length; i++) { 
//
//        
//        	System.out.println( people [i] );
//        }
//        
//        
//        
//        System.out.println("**************");
//		for (int i = 0; i < ids.length; i++) {     // faccio un for loop per stammpare i valori delle array di stringhe 
//			System.out.println(ids[i] + "," + names[i]);
//		}
//		System.out.println("**************");
//		
//		City[] cities= new City[ids.length]; 
//		System.out.println("City has " + cityNames.length+ "element");
//		
//		System.out.println("**************");
//		
//		for (int i=0; i < cities.length; i++) {
//			cities[i]= new City (cityNames[i], ids[i]);
//			System.out.println(ids[i] + "," + cityNames[i] );
//			
//			
//			}
//		System.out.println("**************");
//		

//		
//		System.out.println("**************");
//		for (int i = 0; i < countries.length; i++) {   //loop con il for 
//			countries[i] = new Country(ids[i], names[i]);
//		}
//		
//		
//		for (int i=0; i< 4 ; i++) {
//			countries[i] = new Country ( names[i] ,cityNames[i]);
//			System.out.println (names[i] + ", " + cityNames[i] );
//		} 
//
//		System.out.println("**************");
//		
//		Country[] coutries = new Country[ ids.length];
//		for (int i=0; i< 4; i++) {
//		System.out.println(names[i] + ", " + cityNames[i] );
//		} 
//		
//		System.out.println("**************");

		// scritto da lui soluzione di quello che ho fatto sopra

		// da copiare dai suoi file

		// metodo alternativo

//		countries[0] = new Country("IT", "ITALIA");
//		countries[1] = new Country("FR", "FRANCE");
//		countries[2] = new Country("ES", "SPAIN");
//		countries[3] = new Country("CH", "SWITZERLAND");
//		countries[4] = new Country("BE", "BELGIO");

		// for (int i = 0; i < countries.length; i++) {
		// System.out.println(countries[i]);

	}
}
