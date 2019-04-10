package project.red;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {
	private static final Logger log = LoggerFactory.getLogger(ClientController.class);

	@Autowired
	private ClientRepository repo;

	@GetMapping("/project/red/clients")
	public String allClients(Model model) {
		log.trace("get all clients");
		model.addAttribute("clients", repo.findAll());
		return "/project/red/clients";
	}
	
	@GetMapping("/project/red/insertClient")
	public String create(
			@RequestParam String clientName, 
			@RequestParam String email,
			@RequestParam String phone, 
			@RequestParam long hotelId,

			Model model) {
//		model.addAttribute("Name", clientName);
//		model.addAttribute("Email", email);
//		model.addAttribute("Phone", phone);
//		model.addAttribute("Hotel Id", hotelId);
		
		Client client = new Client(clientName, email, phone, hotelId);
		repo.save(client);
		
		log.trace("get all clients");
		model.addAttribute("clients", repo.findAll());
		
		return "/project/red/clients";
	}	
}