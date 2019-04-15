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
	private Date availability;
	private Long payment;
	
	
	public BlueBooking(Long hotelId, Long clientId, Date availability, Long payment) {
		this.hotelId = hotelId;
		this.clientId = clientId;
		this.availability = availability;
		this.payment = payment;
		
	}
	
	public BlueBooking(Long clientId, Date availability, Long payment) {
		this.clientId = clientId;
		this.availability = availability;
		this.payment = payment;
	}
	
	protected BlueBooking() {
		
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


	public Date getAvailability() {
		return availability;
	}


	public void setAvailability(Date availability) {
		this.availability = availability;
	}


	public Long getPayment() {
		return payment;
	}


	public void setPayment(Long payment) {
		this.payment = payment;
	}


	@Override
	public String toString() {
		return "BlueBooking [bookingId=" + bookingId + ", hotelId=" + hotelId + ", clientId=" + clientId
				+ ", availability=" + availability + ", payment=" + payment + "]";
	}


	

}