package project.red;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "RED_BOOKINGS")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BokGen")
	@SequenceGenerator(sequenceName = "red_bookings_seq", allocationSize = 1, name = "BokGen")
	private long bookingId;

	private long hotelId;
	private long clientId;
	private String clientName;
	private Date checkIn;
	private Date checkOut;
	private long payment;

	public Booking(long bookingId, long hotelId, long clientId, String clientName, Date checkIn, Date checkOut,
			long payment) {
		this.bookingId = bookingId;
		this.hotelId = hotelId;
		this.clientId = clientId;
		this.clientName = clientName;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.payment = payment;
	}

	public Booking(long hotelId, long clientId, String clientName, Date checkIn, Date checkOut, long payment) {

		this.hotelId = hotelId;
		this.clientId = clientId;
		this.clientName = clientName;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
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

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
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

	public long getPayment() {
		return payment;
	}

	public void setPayment(long payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", hotelId=" + hotelId + ", clientId=" + clientId + ", clientName="
				+ clientName + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", payment=" + payment + "]";
	}

}
