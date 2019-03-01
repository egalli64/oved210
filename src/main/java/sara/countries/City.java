package sara.countries;


public class City {
	private String name;
	private String countryId;
	
	public City (String name, String countryId)  {
		this.name = name;
		this.countryId = countryId;
		
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", countryId=" + countryId + "]";
	}

	public String getName() {
		return name;
	}

	public String getCountryId() {
		return countryId;
	}
	
	
	
	
	
}

