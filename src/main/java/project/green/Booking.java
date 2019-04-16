package project.green;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "GREEN_BOOKINGS")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BookingGen")
	@SequenceGenerator(sequenceName = "green_bookings_seq", allocationSize = 1, name = "BookingGen")
	private long bookingId;
	private long hotelId;
	private long clientId;
	private Date availability;
	private long payment;

	public Booking(Long bookingId, Long hotelId, Long clientId, Date availability, Long payment) {
		this.bookingId = bookingId;
		this.hotelId = hotelId;
		this.clientId =clientId;
		this.availability = availability;
		this.payment=payment;
	}
	public Booking(Long hotelId, Long clientId, Long payment) {
		this.hotelId = hotelId;
		this.clientId = clientId;
		this.payment = payment;
	}
	public Booking() {
	}
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public long getHotelId() {
		return hotelId;
	}
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
	public long getClientId() {
		return clientId;
	}
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	public Date getAvailability() {
		return availability;
	}
	public void setAvailability(Date availability) {
		this.availability = availability;
	}
	public long getPayment() {
		return payment;
	}
	public void setPayment(long payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", hotelId=" + hotelId + ", clientId=" + clientId + ", availability="
				+ availability + ", payment=" + payment + "]";
	}
}