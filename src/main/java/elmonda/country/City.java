package elmonda.country;

/*
 * properties:
 * name (ex: "Milan")
 * countryId (ex: "IT")
 */
public class City {
	private String id;
	private String name;

	public City(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + "]";
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
