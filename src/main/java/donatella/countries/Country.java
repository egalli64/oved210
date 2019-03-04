package donatella.countries;

public class Country {

//** 
//	* properties
// id (for example:"IT")
//  name (for example: "Italy")

	String id;
	String name;

	public Country(String id, String name) {
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
