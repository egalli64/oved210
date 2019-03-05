package monica.settimana1;

public class City {
String cityName;
String CountryId;

public City ( String cityName, String countryID) {
	this.cityName = cityName;
	this.CountryId = countryID;
	
}

@Override
public String toString() {
	return "City [cityName=" + cityName + ", countryID=" + CountryId + "]";
}

public String getCityName() {
	return cityName;
}

public void setCityName(String cityName) {
	this.cityName = cityName;
}

}