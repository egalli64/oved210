package project.blue;

import java.sql.Date;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlueControllerBooking {
	private static final Logger log = LoggerFactory.getLogger(BlueController.class);

	
	@Autowired
	private BlueBookingRepository repBooking;
	
	@GetMapping("/project/blue/bookings")
	public String allBookings(Model model) {
		log.trace("get all bookings");
		try {
			model.addAttribute("bookings", repBooking.findAll());
		} catch (Exception ex) {
			log.error("Can't get bookings", ex);
			return "/project/blue/reject";
		}
		return "/project/blue/bookings";
	}
	
	
	// controller add bookings
	
	@GetMapping("/project/blue/bookings/addBooking")
	public String addBooking( //
			@RequestParam Long bookingId, //
			@RequestParam Long hotelId, //
			@RequestParam Long clientId , //
			@RequestParam Date availability , //
			@RequestParam Long payment, //
			Model model) {
		log.trace("get all bookings");

			BlueBooking booking = new BlueBooking();

			booking.setBookingId(bookingId);
			booking.setHotelId(hotelId);
			booking.setClientId(clientId);
			booking.setAvailability(availability);
			booking.setPayment(payment);
		
	
			repBooking.save(booking);
			model.addAttribute("bookings", repBooking.findAll());

			String SaveBooking = String.format("--New booking inserted!--");
			model.addAttribute("SaveBooking", SaveBooking);

		return "/project/blue/bookings";
	}
	
	//controller remove bookings
	
	@GetMapping("/project/blue/bookings/remove")

	public String removeBooking(@RequestParam Long bookingId, Model model) {
		log.trace("delete booking");

		try {

			repBooking.deleteById(bookingId);

			model.addAttribute("bookings", repBooking.findAll());
			String deleteBooking = String.format("--Booking deleted!--");
			model.addAttribute("deleteBooking", deleteBooking);
		

		} catch (Exception ex) {
			String unexistingdId = String.format("--Unexisting Id!--");
			model.addAttribute("unexistingdId", unexistingdId);
		}

		return "/project/blue/bookings";

	}
	
	
	// controller edit bookings
	
	@GetMapping("/project/blue/editBooking")
	public String editBookingFirst( //
			@RequestParam Long bookingId, //
			Model model) {
		log.trace("edit booking");

		Optional<BlueBooking> opt = repBooking.findById(bookingId);
		if (opt.isPresent()) {
			BlueBooking booking = opt.get();

			model.addAttribute("bookingId", booking.getBookingId());
			model.addAttribute("hotelId", booking.getHotelId());
			model.addAttribute("clientId", booking.getClientId());
			model.addAttribute("availability", booking.getAvailability());
			model.addAttribute("payment", booking.getPayment());

		}
		return "/project/blue/editBooking";
	}

	@GetMapping("/project/blue/editReadBooking")
	public String editBookingSecond( //
			@RequestParam Long bookingId, // 
			@RequestParam Long hotelId, // 
			@RequestParam Long clientId, // 
			@RequestParam Date availability, // 
			@RequestParam Long payment, // 
		

			Model model) {
		log.trace("edit booking");

	
		BlueBooking booking = new BlueBooking(bookingId, hotelId, availability, payment);

		repBooking.save(booking);

		model.addAttribute("editBooking", "--Booking modified!--");
		model.addAttribute("bookings", repBooking.findAll());

		return "/project/blue/bookings";	
	
	
	}
	
	
	
}