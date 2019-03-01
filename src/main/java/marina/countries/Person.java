package marina.countries;

public class Person {

	private String name;
	private City city;

	public Person(String name, City city) {

		this.name = name;
		this.city = city;
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public City getCity() {
		return city;
	}

}
