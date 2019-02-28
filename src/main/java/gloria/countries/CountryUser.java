package gloria.countries;

public class CountryUser {
	public static void main(String[] args) {
			
	Country[] countries = new Country [4]; // ho creato un oggetto che si chiama countries in un array di Country
		
		countries [0] = new Country ("IT", "Italy");
		countries [1] = new Country ("FR", "France");
		countries [2] = new Country ("ES", "Spain");
		countries [3] = new Country ("CH", "Switzerland");
		
		for (int i = 0; i < 4; i++) {
			System.out.println(countries [i]);
			
		}
			
		
				
	System.out.println("***");
	//faccio la prova con un altro metodo di sviluppo 
		
	
	String[] ids = {"IT", "FR", "ES", "CH", "RA"};
	String[] names = {"Italy", "France", "Spain", "Switzerland", "Argentina"};
	
	Country[] otherCountries = new Country[ids.length];
	
	for (int i=0; i < otherCountries.length; i++) {
		otherCountries[i] = new Country(ids[i], names[i]);
	System.out.println(ids[i] + "," + names [i]); // questo per ottenere la sigla dei paesi e il nome per esteso
		 
	}
	
	//oppure posso anche fare:
	System.out.println("otherCountries has" + otherCountries.length + "elements"); // questo per ottenere invece il numero dei paesi inseriti

	}
}
	
//	System.out.println("***");
//
//	
//	for (Country country : countries) {
//			String cid = country.getId();
//		
//	for(City city : cities ) {
//		String ccid= city.getIds();
//		
//	if(cid.equals(ccid)) {
//				
//		
//		
//	System.out.println(city.getIds() + "," + city.getCityNames());
//			
//	}
//	}
		
	//}


	
//Country[]countries = new Country[4]
//System.out.println ("Countries has" + countries.length + "elements")
//countries[0] = new Country ("IT", "Italy")...
//for(int i=0; i < countries.length e questo lo scrive così in modo tale che se mai dovessi cambiare il numero di countries me lo considera automaticamente, senno sew dovessi ettere il numero specifico di paesi dovrei poi andarlo a cambiare manualmente; i++){
//System.out.println(countries[i]);
//}

//***//

//	String[] ids = {"IT", "FR", "ES", "CH"};
//	String[] names = {"Italy", "France", "Spain", "Switzerland"};
//	for (int i=0; i<ids.length; i++) { 
//	System.out.println(ids[i]+ ","+ names[i]);
// }

//***//

//Country[]countries = new Country [ids.length];
//System.out.println ("Countries has" + countries.length + "elements")
//for(int i=0; i < countries.length; i++); {
//countries[i] = new Country(ids[i], names[i]);
// }
	
 

