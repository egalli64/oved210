package gloria.countries;

public class City {
	
	private String ids; 
	private String cityNames;
	private String name;
	
	public City (String ids, String cityNames, String name) {
		
	    this.ids = ids; 
		this.cityNames = cityNames;
		this.name = name; 

	}

	@Override
	public String toString() {
		return "City [ids = "+ids+", cityNames = "+cityNames+" , name = "+name+"]";
		
	}

	
		
	}
	
	