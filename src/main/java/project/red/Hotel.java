package project.red;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "RED_HOTELS")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HotGen")
	@SequenceGenerator(sequenceName = "RED_HOTELS_SEQ", allocationSize = 1, name = "HotGen")
	private long hotelId;

	private String hotelName;
	private String city;
	private long roomCounter;

	public Hotel( String hotelName, String city, long roomCounter) {
		
		this.hotelName = hotelName;
		this.city = city;
		this.roomCounter = roomCounter;
	}

	public Hotel (long hotelId, String hotelName, String city, long roomCounter) {
		
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.city = city;
		this.roomCounter = roomCounter;
	}

	protected Hotel() {

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
