package mariangela.europeanCountries;

public class Country {

	protected String id;
	protected String name;

	public Country(String id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", ";

	}

}
