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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
