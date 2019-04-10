package project.green;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKINGS")
public class Booking {
	@Id
	private long booking_id;
	private long hotel_id;
	private long client_id;
	private long availability;
	private long payment;

	public Booking() {
	}

	public long getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(long booking_id) {
		this.booking_id = booking_id;
	}

	public long getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(long hotel_id) {
		this.hotel_id = hotel_id;
	}

	public long getClient_id() {
		return client_id;
	}

	public void setClient_id(long client_id) {
		this.client_id = client_id;
	}

	public long getAvailability() {
		return availability;
	}

	public void setAvailability(long availability) {
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
		return "Bookings [booking_id=" + booking_id + ", hotel_id=" + hotel_id + ", client_id=" + client_id
				+ ", availability=" + availability + ", payment=" + payment + "]";
	}

}