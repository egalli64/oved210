package marina.countries;

public class City {

	private String CountryId;
	private String cityName;

	public City(String CountryId, String cityName) {

		this.CountryId = CountryId;
		this.cityName = cityName;

	}

	@Override
	public String toString() {
		return "City [CountryId = " + CountryId + ", cityName = " + cityName + "]";
	}

	public String getCountryId() {
		return CountryId;
	}
	
	public String getName() {
		return cityName;
	}
	
	
}
