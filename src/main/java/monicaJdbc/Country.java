package monicaJdbc;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity  
@Table(name = "COUNTRIES")
public class Country {

	@Id   
	@Column(name = "COUNTRY_ID")
	private String id; 
	
	@Column(name = "COUNTRY_NAME")
	private String name;

	@ManyToOne   // specifico che tipo di fk è in sql
	@JoinColumn(name = "REGION_ID")
	private Region region;  // questo è un oggetto  perchè se lasciavamo "private Long r_id" risultava il numero della tabella 
	
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

	

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + " , " +  region + "]";
	}

	
	

	
	
}
