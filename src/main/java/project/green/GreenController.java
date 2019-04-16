package project.green;


import java.sql.Date;
import java.util.Optional;

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

//controller per added
	@GetMapping("/project/green/client/add")
	public String create(@RequestParam String clientName, 
			@RequestParam String email, @RequestParam Long phone,
			Model model) {
		if (clientName.isEmpty()) {
			model.addAttribute("message", "Can't create client without a name!");
			model.addAttribute("clients", repoClient.findAll());
			return "/project/green/clients";
		}

		log.trace("get all clients");
		try {
			repoClient.save(new GreenClients(clientName, email, phone));
			model.addAttribute("message", String.format("NewClient %s %s correctly created", clientName, email));
		} catch (Exception dive) {
			String message = String.format("Can't create NewClient %s %s", clientName, email);
			log.error(message);
			model.addAttribute("message", message);
		}
		model.addAttribute("clients", repoClient.findAll());
		return "/project/green/clients";
	}

	@GetMapping("/project/green/removeClients")
	public String removeClients(@RequestParam Long clientId, Model model) {

		log.trace("get delete client");
		try {
			repoClient.deleteById(clientId);
			model.addAttribute("messageRemoved", String.format("Well Done!", clientId));
			model.addAttribute("clients", repoClient.findAll());


		} catch (Exception dive) {
			String messageRemove = String.format("Can't remove client without ID!", clientId);
			log.error(messageRemove);
			model.addAttribute("messageRemove", messageRemove);

		}
		model.addAttribute("clients", repoClient.findAll());
		return "/project/green/clients";
	}
	
	@GetMapping("/project/green/client/edit")
	public String editClient(@RequestParam long clientId, Model model) {
		
		log.trace("get edit client");
		
		 Optional<GreenClients> opzione = repoClient.findById(clientId);
		 if (opzione.isPresent()) {
			 GreenClients client = opzione.get();
			 
			 model.addAttribute("clientId", client.getClientId());
			 model.addAttribute("clientName", client.getClientName());
			 model.addAttribute("email", client.getEmail());
			 model.addAttribute("phone", client.getPhone());
		 }
		
		return "/project/green/client/edit";	
	}
	
	
	@GetMapping("/project/green/client/saveedit")
	public String saveeditClient(
			@RequestParam long clientId, 
			@RequestParam String clientName, 
			@RequestParam String email, 
			@RequestParam Long phone,			
			Model model) {
	
		log.trace("save editing client");
		
		GreenClients client = new GreenClients(clientId, clientName, email, phone);
		
		
		repoClient.save(client);
		model.addAttribute("clientEdit", "well done!");
		model.addAttribute("clients", repoClient.findAll());
		return "/project/green/clients";
	}

	
	

	@GetMapping("/project/green/hotels")
	public String allHotels(Model model) {
		log.trace("get all hotels");
		model.addAttribute("hotels", repoHotel.findAll());
		return "project/green/hotels";
	}
	
	
	//////hotel 

	@GetMapping("/project/green/hotels/add")
	public String createhotel(
			@RequestParam String hotelName, 
			@RequestParam String city, 
			@RequestParam Long roomCounter,
			Model model) {
		if (hotelName.isEmpty()) {
			model.addAttribute("message", "Can't create hotel without a name!");
			model.addAttribute("hotel", repoHotel.findAll());
			return "/project/green/hotels";
		}

		log.trace("get all hotels");
		try {
			
			repoHotel.save(new GreenHotel(hotelName, city, roomCounter));
			model.addAttribute("message", String.format("NewHotel is correctly created", hotelName, city, roomCounter));
		} catch (Exception dive) {
			String message = String.format("Can't create NewHotel", hotelName, city, roomCounter);
			log.error(message);
			model.addAttribute("message", message);
		}
		model.addAttribute("hotels", repoHotel.findAll());
		return "/project/green/hotels";
	}
	
	@GetMapping("/project/green/removeHotels")
	public String removeHotel(@RequestParam Long hotelId, Model model) {

		log.trace("delete hotel");
		try {
			repoHotel.deleteById(hotelId);
			model.addAttribute("deleteHotel", "Hotel Deleted");
		} catch (Exception ex) {
			String messageRemove = String.format("Can't delete Hotel", hotelId);
			log.error(messageRemove);
			model.addAttribute("messageRemove", messageRemove);
		}
		
		model.addAttribute("hotels", repoHotel.findAll());
		
		return "/project/green/hotels";
	}
	
	/////edit hotel
	@GetMapping("/project/green/hotel/edit")
	public String editHotels(@RequestParam long hotelId, Model model) {
		
		log.trace("get edit hotel");
		
		 Optional<GreenHotel> opzione = repoHotel.findById(hotelId);
		 if (opzione.isPresent()) {
			 GreenHotel hotel = opzione.get();
			 
			 model.addAttribute("hotelId", hotel.getHotelId());
			 model.addAttribute("hotelName", hotel.getHotelName());
			 model.addAttribute("city", hotel.getCity());
			 model.addAttribute("roomCounter", hotel.getRoomCounter());
		 }
		
		return "/project/green/hotel/edit";	
	}
	
	
	@GetMapping("/project/green/hotel/saveedit")
	public String saveeditHotel(
			@RequestParam Long hotelId,
			@RequestParam String hotelName, 
			@RequestParam String city, 
			@RequestParam Long roomCounter,		
			Model model) {
	
		log.trace("save editing hotel");
		
		GreenHotel hotel = new GreenHotel(hotelId, hotelName, city, roomCounter);
		
		
		repoHotel.save(hotel);
		model.addAttribute("editingDone", "HOTEL MODIFIED");
		model.addAttribute("hotels", repoHotel.findAll());
		return "/project/green/hotels";
	}

	


	
	@GetMapping("/project/green/bookings")
	public String allBookings(Model model) {
		log.trace("get all bookings");
		model.addAttribute("bookings", repoBooking.findAll());
		return "project/green/bookings";
	}
	
	@GetMapping("/project/green/addBooking")
	public String createbooking(

			@RequestParam Long hotelId, @RequestParam Long clientId, @RequestParam Date availability,
			@RequestParam Long payment,

			Model model) {
		log.trace("get new booking");

		Booking booking = new Booking(hotelId, clientId, availability, payment);
		repoBooking.save(booking);
		
		model.addAttribute("addBookings", "New Booking inserted!");
		model.addAttribute("bookings", repoBooking.findAll());

		String SaveNewBooking = String.format("booking insered");
		model.addAttribute("SaveNewBooking", SaveNewBooking);

		return "/project/green/bookings";

	}
	
	@GetMapping("/project/green/removeBooking")
	public String removeBooking(@RequestParam Long BookingId, Model model) {

		log.trace("delete hotel");
		try {
			repoBooking.deleteById(BookingId);
			model.addAttribute("deleteBooking", "Booking Deleted");
		} catch (Exception ex) {
			String RemoveBooking = String.format("Can't delete Booking", BookingId);
			log.error(RemoveBooking);
			model.addAttribute("RemoveBooking", RemoveBooking);
		}
		
		model.addAttribute("bookings", repoHotel.findAll());
		
		return "/project/green/bookings";
	}

}
//	 @GetMapping("/project/green/clients")
//	    public String orderGreenClients( //
//	            @RequestParam String by, //
//	            Model model) {
//	        log.debug("Order clients by clientName" + by);
//
//	        List<GreenClients> clients;
//	        switch (by) {
//	        case "ClientName":
//	          //  clients = repoClient.findByClientNameOrderByClientName(clients);
//	            break;
//	        default:
//	        //	clients = repoClient.findByClientNameOrderByClientName(clients);
//	            break;
//	        }
//
//	     //   model.addAttribute("clients", clients);
//	        return "project/green/clients";
//	    }

	