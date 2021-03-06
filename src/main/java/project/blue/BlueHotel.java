package project.blue;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "BLUE_HOTELS")
public class BlueHotel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HotelGen")
	@SequenceGenerator(sequenceName = "BLUE_HOTELS_SEQ", allocationSize = 1, name = "HotelGen")
	private Long hotelId;
	private String hotelName;
	private String city;
	private Long roomCounter;
	
	public BlueHotel(long hotelId, String hotelName, String city, long roomCounter) {
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.city = city;
		this.roomCounter = roomCounter;		
	}
	
	public BlueHotel(String hotelName, String city, Long roomCounter) {
		
		this.hotelName = hotelName;
		this.city = city;
		this.roomCounter = roomCounter;	
	}
protected BlueHotel() {
		
	}

public Long getHotelId() {
	return hotelId;
}

public void setHotelId(Long hotelId) {
	this.hotelId = hotelId;
}

public String getHotelName() {
	return hotelName;
}

public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Long getRoomCounter() {
	return roomCounter;
}

public void setRoomCounter(Long roomCounter) {
	this.roomCounter = roomCounter;
}

@Override
public String toString() {
	return "BlueHotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", city=" + city + ", roomCounter="
			+ roomCounter + "]";
}
	

	
}
