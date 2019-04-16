package project.red;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "RED_BOOKINGS")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BokGen")
	@SequenceGenerator(sequenceName = "red_bookings_seq", allocationSize = 1, name = "BokGen")

	@Column(name="BOOKING_ID")
	private long bookingId;

	@Column (name="hotel_id")
	private long hotelId;
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;
		
	private long clientId;
	
	@Column (name="check_in")
	private Date checkIn;
	
	@Column (name="check_out")
	private Date checkOut;

	@Column (name="payment")
	private String payment;

	
	
	
	public Booking(long bookingId, long hotelId, long clientId, Date checkIn, Date checkOut,
			String payment) {
		this.bookingId = bookingId;
		this.hotelId = hotelId;
		this.clientId = clientId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.payment = payment;
	}

	public Booking(long hotelId, long clientId, Date checkIn, Date checkOut, String payment) {

		this.hotelId = hotelId;
		this.clientId = clientId;
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


	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", hotelId=" + hotelId + ", clientId=" + clientId + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", payment=" + payment + "]";
	}

}
