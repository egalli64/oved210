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
	HotelRepository repo;
	
	@Autowired
	BookingRepository brepo;
	
	@Autowired
	ClientRepository crepo;

	@GetMapping("/project/red/bookings")
	public String allBookings(Model model) {
		log.trace("get all bookings");
		model.addAttribute("bookings", brepo.findAll());
		return "/project/red/bookings";
	}
	
	@GetMapping("/project/red/prepareBooking")
	public String prepare(Model model) {
		model.addAttribute("bookings", brepo.findAll());
		model.addAttribute("hotels", repo.findAll());
		model.addAttribute("clients", crepo.findAll());
	return "/project/red/insertBooking";
}

	@GetMapping("/project/red/insertBooking")
	public String create(@RequestParam long hotelId,
						 @RequestParam long clientId, 
						 @RequestParam Date checkIn,
						 @RequestParam Date checkOut, 
						 @RequestParam String payment,
							Model model) {
		
		Optional<Hotel> hotel = repo.findById(hotelId);
		Optional<Client> client = crepo.findById(clientId);
		
		if (client.isPresent() && hotel.isPresent()) {
			Client cur = client.get();
			Hotel cus = hotel.get();
			Booking booking = new Booking (cus, cur, checkIn, checkOut, payment);
			log.trace("get new booking");
			brepo.save(booking);
			model.addAttribute("bookings", brepo.findAll());
			
			model.addAttribute("bookingSaved", "***Booking saved!***");
			return "/project/red/bookings";
		}

		model.addAttribute("bookings", brepo.findAll());
		model.addAttribute("unexistingdId", "***Unexisting Id!***");
		return "/project/red/insertBooking";
	}
	
	@GetMapping("/project/red/deleteBooking")
	public String delete(@RequestParam Long bookingId,

			Model model) {

		log.trace("get deleted booking");
		model.addAttribute("bookings", brepo.findAll());

		if (bookingId == null) {
			String errorMessage = String.format("***Impossible to remove without inserting Id!***");
			model.addAttribute("errorMessage", errorMessage);

			return "/project/red/bookings";
		}

		try {
			brepo.deleteById(bookingId);
			model.addAttribute("bookings", brepo.findAll());
			model.addAttribute("bookingDeleted", "***Booking deleted!***");

		} catch (Exception ex) {
			model.addAttribute("unexistingdId", "***Unexisting Id!***");
		}

		return "/project/red/bookings";

	}
	
	@GetMapping("/project/red/editBooking")
	public String edit(@RequestParam long bookingId,
			Model model) {

		log.trace("edit booking");

		Optional<Booking> opt = brepo.findById(bookingId);
	
		if (opt.isPresent()) {
			Booking booking = opt.get();
				
			model.addAttribute("bookingId", booking.getBookingId());
			model.addAttribute("hotelId", booking.getHotel());
			model.addAttribute("clientId", booking.getClient());
			model.addAttribute("checkIn", booking.getCheckIn());
			model.addAttribute("checkOut", booking.getCheckOut());
			model.addAttribute("payment", booking.getPayment());
		}

		return "/project/red/editBooking";

	}
	
	@GetMapping("/project/red/saveBooking")
	public String save (@RequestParam long bookingId, @RequestParam Hotel hotel, @RequestParam Client client, @RequestParam Date checkIn,
			@RequestParam Date checkOut, @RequestParam String payment,
			
			Model model) {

		log.trace("saving modified booking");

		Booking booking = new Booking (bookingId, hotel, client, checkIn, checkOut, payment);
		
		brepo.save(booking);
		model.addAttribute("messageEdit", "***Booking modified!***");
		model.addAttribute("bookings", brepo.findAll());

		return "/project/red/bookings";
	}
}