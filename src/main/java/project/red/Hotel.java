	package project.red;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "RED_HOTELS")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HotGen")
	@SequenceGenerator(sequenceName = "RED_HOTEL_SEQ", allocationSize = 1, name = "HotGen")
	
	@Column(name="hotel_id")
	private long hotelId;
	
	@Column(name="hotel_name")
	private String hotelName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="room_counter")
	private long roomCounter;
	
	@OneToMany(mappedBy="hotel", cascade = CascadeType.ALL)
	private Set<Booking> bookings;
	

	public Hotel(long hotelId, String hotelName, String city, long roomCounter) {
		this.hotelId = hotelId;

		this.hotelName = hotelName;
		this.city = city;
		this.roomCounter = roomCounter;
	}

	public Hotel(String hotelName, String city, long roomCounter) {

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

	public Set<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", city=" + city + ", roomCounter="
				+ roomCounter + ", bookings=" + bookings + "]";
	}





}
