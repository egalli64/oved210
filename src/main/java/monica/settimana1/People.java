package monica.settimana1;

public class People {
	String peopleName;
	City city;

	public People(String peopleNames, City city) {
		this.peopleName = peopleNames;
		this.city = city;
		

	}

	@Override
	public String toString() {
		return "People [peopleName=" + peopleName + ", city=" + city + "]";
	}

	public String getPeopleName() {
		return peopleName;
	}

	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	


	
	}


