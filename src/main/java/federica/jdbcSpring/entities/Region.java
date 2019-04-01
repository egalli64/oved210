package federica.jdbcSpring.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "REGIONS")

public class Region {
	@Id
	@Column(name = "REGION_ID")
    private long id;
	
	@Column(name = "REGION_NAME")
    private String name; //ho dichiarato le proprietà che corrispondono alle colonne della tabella SQL, trattato come java bean, quindi ho bisogno di getter and setter. USO IL BEAN PER CONVERTIRE LE CHIAMATE ALLA TABELLA REGIONS.
    
	@OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
    Set<Country> countries;
	
	public Region() {
	}
	
    public Set<Country> getCountries() {
		return countries;
	}
	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
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
		return "Region [id=" + id + ", name=" + name + "]";
	}
}