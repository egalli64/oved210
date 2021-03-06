package trainer.europeanCountries;

public class Country {
	private String id;
	private String name;

	public Country(String id, String name) {
		if (id == null || id.length() != 2) {
			throw new IllegalArgumentException("Bad id");
		}

		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + "]";
	}
}
