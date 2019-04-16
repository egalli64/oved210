package trainer.apr.model;

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
	private String name;

	@OneToMany(mappedBy="region", cascade = CascadeType.ALL)
	private Set<Country> countries;
	
	public Region() {
	}

	public Region(long id, String name) {
		this.id = id;
		this.name = name;
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

	public Set<Country> getCountries() {
		return countries;
	}
}
