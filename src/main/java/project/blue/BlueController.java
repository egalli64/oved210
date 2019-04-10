package project.blue;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.LoggerFactory;

@Controller
public class BlueController {
	private static final Logger log = LoggerFactory.getLogger(BlueController.class);
	private static String user;

	// controller Clients

	@Autowired
	private BlueClientRepository blue;

	@PostMapping("/project/blue/login")
	public String login( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {

		BlueController.user = user;
		model.addAttribute("user", user);

		return "/project/blue/response";
	}

	@GetMapping("/project/blue/login")
	public String login(
			Model model) {
		model.addAttribute("user", BlueController.user);

		return "/project/blue/response";
	}

	@GetMapping("/project/blue/clients")
	public String allClients(Model model) {
		log.trace("get all clients");
		model.addAttribute("clients", blue.findAll());
		return "project/blue/clients";
	}

	// controller Hotels

	@Autowired
	private BlueHotelRepository hot;

	@GetMapping("/project/blue/hotels")
	public String allHotels(Model model) {
		log.trace("get all hotels");
		model.addAttribute("hotels", hot.findAll());
		return "project/blue/hotels";
	}

	// controller Bookings

	@Autowired
	private BlueBookingRepository boo;

	@GetMapping("/project/blue/bookings")
	public String allBookings(Model model) {
		log.trace("get all bookings");
		model.addAttribute("bookings", boo.findAll());
		return "project/blue/bookings";
	}

}
