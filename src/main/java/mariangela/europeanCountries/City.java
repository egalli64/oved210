package mariangela.europeanCountries;

public class City {
	protected String name;
	protected String countryId;

	public City(String name, String countryId) {

		this.name = name;
		this.countryId = countryId;
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}



}
