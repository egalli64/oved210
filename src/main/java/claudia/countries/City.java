package claudia.countries;

//proprietà 
//city: name e country ID

public class City {

	String id;
	String name;
	
	public City (String id, String name) {
		this.id = id;
		this.name = name;
}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + "]";
	}
	
	
}