package project.blue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping("/project/blue/clients/all")
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
		log.trace("get all clients");
	try {	BlueClient client = new BlueClient();
		
		client.setClientName(name);
		client.setEmail(email);
		client.setPhone(phone);
		
		repClient.save(client);
	model.addAttribute("clients", repClient.findAll());
	
	String SaveClient = String.format("--New client inserted!--");
	model.addAttribute("SaveClient", SaveClient);
	}
		catch (Exception ex){ 
		String duplicatedmail = String.format("--Mail already existing!--");
		model.addAttribute("duplicatedmail", duplicatedmail);
	}
		return "project/blue/clients";
	}

	//controller remove clients
	@GetMapping("/project/blue/clients/remove")
	
	public String removeClient(@RequestParam Long id, Model model) {
		log.trace("delete client");

	try {

		repClient.deleteById(id);

		model.addAttribute("clients", repClient.findAll());
		String deleteClient = String.format("--Client deleted!--");
		model.addAttribute("deleteClient", deleteClient);
		
		} catch (Exception ex){ 
			String unexistingdId = String.format("--Unexisting Id!--");
			model.addAttribute("unexistingdId", unexistingdId);
		}
		
		return "/project/blue/clients";

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
