package mariangela.europeanCountries;

public class City {
	protected String cityName;
	protected String id;

	public City(String cityName, String id) {

		this.cityName = cityName;
		this.id = id;

	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", id=" + id + "]";
	}

}
