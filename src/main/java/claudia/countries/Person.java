package claudia.countries;


//proprietà: string name, city place
public class Person {
	private String name;
	private City City;
	
	
	public Person (String name, City City) {
		this.name = name;
		this.City = City;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return City;
	}

	public void setCity(City city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", City=" + City + "]";
	}
	
	
	
	
	
	}
	
	


