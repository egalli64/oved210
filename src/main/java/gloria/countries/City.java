package gloria.countries;

public class City {
	
	private String ids; 
	private String cityNames;
	private String names;
	
	public City (String ids, String cityNames, String names) {
		
	    this.ids = ids; 
		this.cityNames = cityNames;
		this.names = names; 

	}

	@Override
	public String toString() {
		return "City [ids = "+ids+", cityNames = "+cityNames+" , names = "+names+"]";
		
	}

	public String getIds() {
		return ids;
	}

	public String getCityNames() {
		return cityNames;
	}

	public String getNames() {
		return names;
	}

	
		
	}
	
	