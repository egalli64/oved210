package project.green;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "GREEN_BOOKINGS")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BookingGen")
	@SequenceGenerator(sequenceName = "green_bookings_seq", allocationSize = 1, name = "BookingGen")
	private Long bookingId;
	
	@ManyToOne
	@JoinColumn (name="HOTEL_ID")
	private GreenHotel hotel;

	@ManyToOne
	@JoinColumn(name="CLIENT_ID")
	private GreenClient client;
	
	private Date checkIn;
	private Date checkOut;
	private String payment;

	//new
	public Booking(Long bookingId, GreenHotel hotel, GreenClient client, Date checkIn,  Date checkOut, String payment) {
		this.bookingId = bookingId;
		this.hotel = hotel;
		this.client =client;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.payment=payment;
	}

	// edit
	public Booking(GreenHotel hotel, GreenClient client, Date checkIn,  Date checkOut, String payment) {
		this.hotel = hotel;
		this.client = client;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.payment=payment;
	}


	public Booking() {
		
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public GreenHotel getHotel() {
		return hotel;
	}

	public void setHotel(GreenHotel hotel) {
		this.hotel = hotel;
	}

	public GreenClient getClient() {
		return client;
	}

	public void setClient(GreenClient client) {
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

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", hotel=" + hotel + ", client=" + client + ", checkIn=" + checkIn
				+ ", checkOut=" + checkOut + ", payment=" + payment + "]";
	}

}