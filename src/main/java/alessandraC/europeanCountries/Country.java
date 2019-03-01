package alessandraC.europeanCountries;

/**
 * properties id (for example: "IT") name (for example: "Italy")
 */

public class Country {
	private String id;
	private String name;
	
	

	public Country(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	
	}
	
	
