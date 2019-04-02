package claudia.jdbcSpring.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private String name;
	
	@OneToMany(mappedBy = "region", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	Set<Country> countries;
	
	
	
	public Region() {

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

	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", name=" + name  + "]";
	}

}
