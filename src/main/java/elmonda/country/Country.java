package elmonda.country;

//public abstract class Country {
/**
 * properties:
 * id ( for example: "IT")
 * name ( for example: "Italy")
 */
public class Country {
	String id;
	String name;
	
	Country (String name, String id) {
		this.id = id;
		this.name = name;
		
}

	@Override
	public String toString() {
		return "Country [id="+id+", name= "+name+ "]";
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	


}
