package project.green;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenController {
	private static final Logger log = LoggerFactory.getLogger(GreenController.class);
	private static String user;

	@Autowired
	private GreenClientsRepository repoClient;

	@Autowired
	private GreenhotelRepository repoHotel;

	@Autowired
	private BookingsRepository repoBooking;

	@PostMapping("/project/green/login")
	public String login( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {

		GreenController.user = user;
		model.addAttribute("user", user);

		return "/project/green/welcomegreen";
	}

	@GetMapping("/project/green/login")
	public String login(Model model) {
		model.addAttribute("user", GreenController.user);

		return "/project/green/welcomegreen";

	}

	@GetMapping("/project/green/clients")
	public String allClients(Model model) {
		log.trace("get all clients");
		model.addAttribute("clients", repoClient.findAll());
		return "/project/green/clients";
	}

	@GetMapping("/project/green/addedClients")
	public String create(
			@RequestParam String clientName,
			@RequestParam String email,
			@RequestParam Long phone,
			Model model) {

		GreenClients client = new GreenClients();

		client.setClientName(clientName);
		client.setEmail(email);
		client.setPhone(phone);
		repoClient.save(client);

		log.trace("get all clients");
		model.addAttribute("clients", repoClient.findAll());
		return "/project/green/clients";
	}

	@GetMapping("/project/green/hotels")
	public String allHotels(Model model) {
		log.trace("get all hotels");
		model.addAttribute("hotels", repoHotel.findAll());
		return "project/green/hotels";
	}

	@GetMapping("/project/green/bookings")
	public String allBookings(Model model) {
		log.trace("get all bookings");
		model.addAttribute("bookings", repoBooking.findAll());
		return "project/green/bookings";
	}

}