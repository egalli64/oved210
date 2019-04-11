package project.blue;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

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
	private BlueClientRepository repClient;

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
		model.addAttribute("clients", repClient.findAll());
		return "/project/blue/clients";
	}

	
	// controller per aggiungere il cliente///

	@GetMapping("/project/blue/clients/add")
	public String addClient( //
			@RequestParam String name, //
			@RequestParam String email, //
			@RequestParam Long phone, //
			Model model) {
		BlueClient client = new BlueClient();

		client.setClientName(name);
		client.setEmail(email);
		client.setPhone(phone);
		
		
		repClient.save(client);

		// log.trace("get all clients");
		
	model.addAttribute("clients", repClient.findAll());
	
//		allClients(model);
		return "project/blue/clients";
	}

	//controller remove clients
	@GetMapping("/project/blue/clients/remove")
	public String removeClient( //
			@RequestParam Long clientId,
			Model model) {
		
		
		repClient.deleteById(clientId);

		// log.trace("get all clients");
		
//		allClients(model);
		return "project/blue/clients";
	}
	
	
	
	
	
	
	
	// controller Hotels

	@Autowired
	private BlueHotelRepository repHotel;

	@GetMapping("/project/blue/hotels")
	public String allHotels(Model model) {
		log.trace("get all hotels");
		model.addAttribute("hotels", repHotel.findAll());
		return "project/blue/hotels";
	}

	// controller Bookings

	@Autowired
	private BlueBookingRepository repBooking;

	@GetMapping("/project/blue/bookings")
	public String allBookings(Model model) {
		log.trace("get all bookings");
		model.addAttribute("bookings", repBooking.findAll());
		return "project/blue/bookings";
	}
	
	
	
	
}
