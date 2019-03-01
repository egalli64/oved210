package donatella.countries;

public class CountryUser {
	public static void main(String[] args) {
//		/**
//		* array di countries
//		*IT, Italy
//		*FR, France
//		*ES, Spain
//		*CH, Switzerland
//		*/
		
		String[] ids = {"IT","FR","ES","CH","BE"};
		String[] names= {"Italy","France","Spain","Switzerlan","Belgium"};
		String[] cityNames= {"Rome","Paris","Madrid"," Zurigo","Bern"};
		
		

		
		Country[] countries = new Country[ids.length];
		
            for(int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]+","+names[i] + "," + cityNames[i]);
			
		} 
		
		
		System.out.println("*********");
		
		countries[0]= new Country("IT","Italy");
		countries[1]= new Country("FR","France");
		countries[2]= new Country("ES", "Spain");
		countries[3]= new Country("CH","Switzerlan");
		countries[3]= new Country("BE", "Belgium");
		
		System.out.println("*********");
		City[]cities= new City[ids.length];
		
		cities[0]=new City("IT", "Rome");
		cities[1]=new City ("FR", "Parigi");
		cities[2]=new City ("ES", "Madrid");
		cities[3]=new City ("CH","Zurigo");
		cities[3]=new City ("BE","Bern");
		
	
		
	
	
	for(int i=0; i < countries.length; i++) {
	System.out.println(countries[i]);
	
	
	
	  for(int p = 0; p < ids.length; p++) {
		  cities[p] = new City(names[p],ids[p]);
		  
		  System.out.println(ids[i]+"," + names[i] +"," + cityNames[i]);
	  }
	
	System.out.println("Countries has"+ countries.length + "elements");
	
//	for(Country country: countries) {
//		System.out.println(country);
	}
	
	System.out.println("***");
	
	for(Country country : countries) {
	
	for(City city : cities) {
		String cid = country.getId();
		String ccid= city.getCityId();
		
		if(cid.equals(ccid)) {
			System.out.println(city.getName() + "," + country.getName());
			
			
		}
	}
	}
	}
	

	@Override
	public String toString() {
		return "CountryUser [toString()=" + super.toString() + "]";
	}}
	

	
