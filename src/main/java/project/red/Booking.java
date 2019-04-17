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

	@Column(name="booking_id")
	private long bookingId;
	
	@Column (name="check_in")
	private Date checkIn;
	
	@Column (name="check_out")
	private Date checkOut;

	@Column (name="payment")
	private String payment;

	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;

	@ManyToOne
	@JoinColumn (name="hotel_id")
	private Hotel hotel;

		
	public Booking(long bookingId, Hotel hotel, Client client, Date checkIn, Date checkOut,
			String payment) {
		this.bookingId = bookingId;
		this.hotel = hotel;
		this.client = client;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.payment = payment;
	}

	public Booking(Hotel hotel, Client client, Date checkIn, Date checkOut, String payment) {

		this.hotel = hotel;
		this.client = client;
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


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", payment="
				+ payment + ", client=" + client + ", hotel=" + hotel + "]";
	}



}
