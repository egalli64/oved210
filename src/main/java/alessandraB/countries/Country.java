package alessandraB.countries;

// dovrò avere un paio di proprietà:
// id (for ex. "IT")
// name (for ex. "Italy")

public class Country {
	String id;  
	String name;

	public Country(String id, String name) {
		this.id = id;
		this.name = name;
			
	}

	@Override
	public String toString() {
		return "Country [id =" + id + ", name =" + name + "]";
	}

}