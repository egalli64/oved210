package alessandraB.jdbcSpring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRIES") // region è un java bean che serve per tenere insieme id e name, una specie di
							// contenitore
							// devo creare un REPOSITORY come insieme delle chiamate alla tabella Regions
							// --> classe Java RegionRepository
public class Country {
	@Id // id determina univocamente l'entità dell'oggetto, un po' come se fosse la
		// primary key
	@Column(name = "COUNTRY_ID")
	private String id;

	@Column(name = "COUNTRY_NAME")
	private String name;

	@ManyToOne
	@JoinColumn(name = "REGION_ID")
	private Region region;

	public Country() {

	}

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
		return "Country [id=" + id + ", name=" + name + ", region = " + region + "]";
	}

}
