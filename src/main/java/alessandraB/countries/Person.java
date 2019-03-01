package alessandraB.countries;

public class Person {

	// proprietà:
	// nome --> string name
	// città in cui vive --> string cityName

	String namePerson;
	City city;
	Country country;

	public Person(String namePerson, City city, Country country) {
		this.namePerson = namePerson;
		this.city = city;
		this.country = country;

	}

	public String getNamePerson() {
		return namePerson;
	}

	public City getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Person [namePerson=" + namePerson + ", city=" + city + ", country=" + country + "]";
	}

	
}
