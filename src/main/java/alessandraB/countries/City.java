package alessandraB.countries;

// proprietà:
// cityName (ex. "Milan")
// countryID (ex. "IT")

//Crea un array di cities e countries
public class City {
	private String cityName;
	private String countryID;

	public City(String cityName, String countryID) {
		this.cityName = cityName;
		this.countryID = countryID;

	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", countryID=" + countryID + "]";
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryID() {
		return countryID;
	}

	public void setCountryID(String countryID) {
		this.countryID = countryID;
	}
}
