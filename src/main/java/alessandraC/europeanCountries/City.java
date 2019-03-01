package alessandraC.europeanCountries;

/*
 * properties
 * name (example: "Milan")
 * countryId (example: " IT")
 */

public class City {
	public String name;
	public String countryId;

	public City(String name, String countryId) {
		this.name = name;
		this.countryId = countryId;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", countryId=" + countryId + "]";
	}

	public String getCountryId() {
		return countryId;
	}

	public String getName() {
		return name;
	}
}