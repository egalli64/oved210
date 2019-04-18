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
			// @RequestParam Long bookingId, //
			@RequestParam Long hotelId, //
			@RequestParam Long clientId, //
			@RequestParam Date checkIn, //
			@RequestParam Date checkOut, //
			@RequestParam Long room, @RequestParam int mode, //
			Model model) {
		log.trace("get all bookings");

		BlueBooking booking = new BlueBooking();

		// booking.setBookingId(bookingId);
		booking.setHotelId(hotelId);
		booking.setClientId(clientId);
		booking.setCheckIn(checkIn);
		booking.setCheckOut(checkOut);
		booking.setRoom(room);

		repBooking.save(booking);

		switch (mode) {
		case 5:
			model.addAttribute("bookings", repBooking.findAll());
			model.addAttribute("SaveBooking", "--New booking inserted!--");
			return "/project/blue/bookings";
		default:
			model.addAttribute("booking", booking);
			return "/project/blue/confirm";
		}
	}

	//controller remove bookings
	
	@GetMapping("/project/blue/bookings/remove")
	public String removeBooking(@RequestParam Long id, Model model) {
		log.trace("delete booking");
 
		try {

			repBooking.deleteById(id);

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
			model.addAttribute("checkIn", booking.getCheckIn());
			model.addAttribute("checkOut", booking.getCheckOut());
			model.addAttribute("room", booking.getRoom());
		}
		return "/project/blue/editBooking";
	}

	@GetMapping("/project/blue/editReadBooking")
	public String editBookingSecond( //
			@RequestParam Long bookingId, // 
			@RequestParam Long hotelId, // 
			@RequestParam Long clientId, // 
			@RequestParam Date checkIn, // 
			@RequestParam Date checkOut, // 
			@RequestParam Long room, // 
		

			Model model) {
		log.trace("edit booking");

	
		BlueBooking book = new BlueBooking(bookingId, hotelId, clientId, checkIn, checkOut, room);

		repBooking.save(book);

		model.addAttribute("editBooking", "--Booking modified!--");
		model.addAttribute("bookings", repBooking.findAll());

		return "/project/blue/bookings";	
	
	
	}
	
	
	
}