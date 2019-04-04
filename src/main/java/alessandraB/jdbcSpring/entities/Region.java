package alessandraB.jdbcSpring.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "REGIONS")  //region è un java bean che serve per tenere insieme id e name, una specie di contenitore
                          // devo creare un REPOSITORY come insieme delle chiamate alla tabella Regions --> classe Java RegionRepository
public class Region {
  @Id //id determina univocamente l'entità dell'oggetto, un po' come se fosse la primary key
  @Column(name = "REGION_ID")
  private long id;

  
  @Column(name = "REGION_NAME")
  private String  name;
  
  @OneToMany(mappedBy = "region", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  Set <Country> countries; 
  
  
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
	return "Region [id=" + id + ", name=" + name + "]";
}
  


  }


