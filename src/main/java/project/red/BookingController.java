package project.red;

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
public class BookingController {
	private static final Logger log = LoggerFactory.getLogger(BookingController.class);

	@Autowired
	private BookingRepository repo;

	@GetMapping("/project/red/bookings")
	public String allBookings(Model model) {
		log.trace("get all bookings");
		model.addAttribute("bookings", repo.findAll());
		return "/project/red/bookings";
	}

	@GetMapping("/project/red/insertClient")
	public String create(@RequestParam long hotelId, @RequestParam long clientId, @RequestParam String clientName, @RequestParam Date checkIn,
							@RequestParam Date chekOut, @RequestParam long payment,
							
							Model model) {

		log.trace("get new booking");

		if (clientName.isEmpty()) {
			model.addAttribute("errorClient", "***Client name is missing!***");

			return "/project/red/insertClient";
		}
		if (hotelId == 0) {
			model.addAttribute("errorClient", "***Hotel name is missing!***");

			return "/project/red/insertBooking";
		}
		
			Booking booking = new Booking (hotelId, clientId, clientName, checkIn, chekOut, payment);
			repo.save(booking);
			model.addAttribute("bookings", repo.findAll());

			model.addAttribute("bookingSaved", "***Booking saved!***");

			return "/project/red/bookings";

	}
	
	@GetMapping("/project/red/deleteClient")
	public String delete(@RequestParam Long bookingId,

			Model model) {

		log.trace("get deleted booking");
		model.addAttribute("bookings", repo.findAll());

		if (bookingId == null) {
			String errorMessage = String.format("***Impossible to remove without inserting Id!***");
			model.addAttribute("errorMessage", errorMessage);

			return "/project/red/bookings";
		}

		try {
			repo.deleteById(bookingId);
			model.addAttribute("bookings", repo.findAll());
			model.addAttribute("bookingDeleted", "***Booking deleted!***");

		} catch (Exception ex) {
			model.addAttribute("unexistingdId", "***Unexisting Id!***");
		}

		return "/project/red/bookings";

	}
	
	@GetMapping("/project/red/editClient")
	public String edit(@RequestParam long bookingId, Model model) {

		log.trace("edit client");

		Optional<Booking> opt = repo.findById(bookingId);
		if (opt.isPresent()) {
			Booking booking = opt.get();
			
			model.addAttribute("bookingId", booking.getBookingId());
			model.addAttribute("clientId", booking.getClientId());
			model.addAttribute("clientName", booking.getClientName());
			model.addAttribute("checkIn", booking.getCheckIn());
			model.addAttribute("checkOut", booking.getCheckOut());
			model.addAttribute("payment", booking.getPayment());
		}

		return "/project/red/editBooking";

	}
	
	@GetMapping("/project/red/saveClient")
	public String save (@RequestParam long bookingId, @RequestParam long hotelId, @RequestParam long clientId, @RequestParam String clientName, @RequestParam Date checkIn,
			@RequestParam Date chekOut, @RequestParam long payment,
			
			Model model) {

		log.trace("saving modified booking");

		Booking booking = new Booking (bookingId, hotelId, clientId, clientName, checkIn, chekOut, payment);
		
		repo.save(booking);
		model.addAttribute("messageEdit", "***Booking modified!***");
		model.addAttribute("bookings", repo.findAll());

		return "/project/red/bookings";
	}
}