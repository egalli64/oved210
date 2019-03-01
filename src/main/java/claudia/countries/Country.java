package claudia.countries;

public class Country {
	
	private String id;
	private String name;
	
	public Country (String id, String name) {
		this.id = id;
		this.name = name;
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


	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
