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
	private static final Logger log =
			LoggerFactory.getLogger(GreenController.class);
	private static String user;
	
	@Autowired
	private GreenClientsRepository repo;
	
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
	public String login(
			Model model) {
		model.addAttribute("user", GreenController.user);

		return "/project/green/response";
		
	}
	
	@GetMapping("/project/green/clients")
	public String allClients(Model model) {
		log.trace("get all clients");
		model.addAttribute("clients", repo.findAll());
		return "/project/green/clients"; 
	}
	//hotels
	
	@Autowired
	private GreenhotelRepository green;
	
	@GetMapping("/project/green/hotels")
	public String allHotels(Model model) {
		log.trace("get all hotels");
		model.addAttribute("hotels", green.findAll());
		return "project/green/hotels";
	}
	
	//booking
	@Autowired
	private BookingsRepository book;
	
	@GetMapping("/project/green/bookings")
	public String allBookings(Model model) {
		log.trace("get all bookings");
		model.addAttribute("bookings", book.findAll());
		return "project/green/bookings";
	}
	
	
}


