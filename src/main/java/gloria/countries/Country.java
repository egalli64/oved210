package gloria.countries;

public class Country {
	private String id;
	private String name;
	
	
	public Country (String name, String id) {
		
		this.id = id;
		this.name = name;
		
	}


	@Override
	public String toString() {
		return "Country [id = " +id+ ", name = " +name+ "]";
	}
	
}
