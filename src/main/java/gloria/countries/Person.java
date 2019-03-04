package gloria.countries;

public class Person {
	
	private String name;
	private City place;
	
public Person (String name, City place) {
	
	this.place = place;
	this.name = name;
	
			
}

@Override
public String toString() {
	return "Person [name = "+name+" , place = "+place+"]";

}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public City getPlace() {
	return place;
}

public void setPlace(City place) {
	this.place = place;
}





}
