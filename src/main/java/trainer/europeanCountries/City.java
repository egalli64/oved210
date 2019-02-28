package trainer.europeanCountries;

/*
 * properties:
 *  name (ex: "Milan")
 *  countryId (ex: "IT")
 */
public class City {
	private String countryId;
	private String name;
	
	public City(String countryId, String name) {
		this.countryId = countryId;
		this.name = name;
	}

	public String getCountryId() {
		return countryId;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "City [countryId=" + countryId + ", name=" + name + "]";
	}
}
