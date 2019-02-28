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

	@Override
	public String toString() {
		return "City [CountryId=" + CountryId + ", CityName=" + CityName + "]";
	}

	

	
	}
	
	
