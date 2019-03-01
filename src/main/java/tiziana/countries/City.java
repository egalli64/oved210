package tiziana.countries;

public class City {
	private String countryId;
	private String cityname;
	
	
	public City(String countryId, String cityname) {
		    this.countryId=countryId;
			this.cityname=cityname;
	
	
}

	@Override
	public String toString() {
		return "City [countryId=" + countryId + ", cityname=" + cityname + "]";
	}

	public String getCountryId() {
		return countryId;
	}

	public String getName() {
		return cityname;
	}

	
	
	
	
}
