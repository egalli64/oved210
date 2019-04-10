package project.red;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "RED_HOTELS")
public class Hotel {
	@Id
	private long hotelId;
	private String hotelName;
	private String city;
	private long roomCounter;
	
	public Hotel() {
		
	}

	public long getHotelId() {
		return hotelId;
	}

	public void setHotelId(long hotelId) {
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

	public long getRoomCounter() {
		return roomCounter;
	}

	public void setRoomCounter(long roomCounter) {
		this.roomCounter = roomCounter;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", city=" + city + ", roomCounter="
				+ roomCounter + "]";
	}



	
}
