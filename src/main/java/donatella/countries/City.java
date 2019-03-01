package donatella.countries;

public class City {
	
//	*
//	properties:
//	name (ex:"Milan")
//	countryId (ex:IT")
	 
	private String name;
	private String cityId;
	
	public City (String name, String countryId) {
		this.name=name;
		this.cityId=countryId;
		
	}

	public String getName() {
		return name;
	}

	public String getCityId() {
		return cityId;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", cityId=" + cityId + "]";
	}

}
 