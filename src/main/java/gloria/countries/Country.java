package gloria.countries;

public class Country {
	private String name;
	private String id;
	
	public Country (String id, String name) {
		
		this.id = id;
		this.name = name;
		
	}


	@Override
	public String toString() {
		return "Country [id = " +id+ ", name = " +name+ "]";
	}


	public String getName() {
		return name;
	}


	public String getId() {
		return id;
	}
	
	
	
}
