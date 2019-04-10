package project.blue;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "BLUE_BOOKINGS")
public class BlueBooking {

	@Id
	private Long bookingId;
	private Long hotelId;
	private Long clientId;
	private Date availability;
	private Long payment;
	
	public BlueBooking() {
	
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


	public Long getPayment() {
		return payment;
	}

	public void setPayment(Long payment) {
		this.payment = payment;
	}


	public Date getAvailability() {
		return availability;
	}


	public void setAvailability(Date availability) {
		this.availability = availability;
	}


	@Override
	public String toString() {
		return "BlueBooking [bookingId=" + bookingId + ", hotelId=" + hotelId + ", clientId=" + clientId
				+ ", availability=" + availability + ", payment=" + payment + "]";
	}

	

}