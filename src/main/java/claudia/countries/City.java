package claudia.countries;

//proprietà 
//city: name e country ID

public class City {

	String CountryId;
	String CityName;
	
	public City (String CountryId, String CityName) {
		this.CountryId = CountryId;
		this.CityName = CityName;
}

	
	
	public String getCountryId() {
		return CountryId;
	}



	public void setCountryId(String countryId) {
		CountryId = countryId;
	}



	public String getCityName() {
		return CityName;
	}



	public void setCityName(String cityName) {
		CityName = cityName;
	}



	@Override
	public String toString() {
		return "City [CountryId=" + CountryId + ", CityName=" + CityName + "]";
	}

	

	
	}
	
	
