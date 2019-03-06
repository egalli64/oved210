package elmonda.country;

/*
 * properties
 * String name
 * City city
 */
public class Person {
	private String name;
	private City city;

	Person(String name, City city) {

		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

}
