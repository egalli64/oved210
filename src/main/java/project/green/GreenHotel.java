package project.green;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "GREEN_HOTELS")
public class GreenHotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Generate")
	@SequenceGenerator(sequenceName = "Green_hotel_seq", allocationSize = 1, name = "Generate")
	private long hotelId;
	
	private String hotelName;
	private String city;
	private long roomCounter;
	
	
	public GreenHotel(long hotelId, String hotelName, String city, Long roomCounter) {
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.city = city;
		this.roomCounter = roomCounter;
	}
	public GreenHotel( String hotelName, String city, Long roomCounter) {
		this.hotelName = hotelName;
		this.city = city;
		this.roomCounter = roomCounter;	
	}
	
	public GreenHotel() {

		
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
	public long getRoomCounter() {
		return roomCounter;
	}
	public void setRoomCounter(long roomCounter) {
		this.roomCounter = roomCounter;
	}
	@Override
	public String toString() {
		return "GreenHotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", city=" + city + ", roomCounter="
				+ roomCounter + "]";
	}
}
