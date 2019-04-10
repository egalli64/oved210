package project.red;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RED_BOOKINGS")
public class Booking {
	@Id
	private long bookingId;
	private long hotelId;
	private long clientId;
	private Date checkIn;
	private long payment;

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

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public long getPayment() {
		return payment;
	}

	public void setPayment(long payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", hotelId=" + hotelId + ", clientId=" + clientId + ", checkIn="
				+ checkIn + ", payment=" + payment + "]";
	}

}
