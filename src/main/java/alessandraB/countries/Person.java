package alessandraB.countries;

public class Person {
	
	//proprietà:
	//nome --> string name
	//città in cui vive --> string cityName

	String namePerson;
	String cityName;
	
	public Person(String namePerson, String cityName) {
		this.namePerson = namePerson;
		this.cityName = cityName;
		
		
	
}
	public String getNamePerson() {
		return namePerson;
	}
	public String getCityName() {
		return cityName;
	}
	@Override
	public String toString() {
		return "Person [namePerson=" + namePerson + ", cityName=" + cityName + "]";
	}}
