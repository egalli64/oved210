package alessandraB.April.country;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRIES")
public class Country {
	@Id
	private String countryId;
	private String countryName;
	
	public Country() {
	
	}


	public String getCountryId() {
		return countryId;
	}




	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}




	public String getCountryName() {
		return countryName;
	}




	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}



	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
	}



	

}
