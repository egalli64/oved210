package project.blue;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "BLUE_BOOKINGS")
public class BlueBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BookingGen")
	@SequenceGenerator(sequenceName = "BLUE_BOOKINGS_SEQ", allocationSize = 1, name = "BookingGen")
	private Long bookingId;
	private Long hotelId;
	private Long clientId;
	private Date checkIn;
	private Date checkOut;
	private Long room;
	
	
	public BlueBooking(Long bookingId, Long hotelId, Long clientId, Date checkIn,Date checkOut, Long room) {
		this.bookingId = bookingId;
		this.hotelId = hotelId;
		this.clientId = clientId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.room = room;
		
	}
	
	public BlueBooking(Long hotelId, Long clientId, Date checkIn, Date checkOut, Long room) {
		
		this.hotelId = hotelId;
		this.clientId = clientId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.room = room;
	}

	protected BlueBooking(){
		
	}
	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public Long getRoom() {
		return room;
	}

	public void setRoom(Long room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "BlueBooking [bookingId=" + bookingId + ", hotelId=" + hotelId + ", clientId=" + clientId + ", checkIn="
				+ checkIn + ", checkOut=" + checkOut + ", room=" + room + "]";
	}
	


	

}