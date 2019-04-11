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
	public String create(@RequestParam String clientName, @RequestParam String email, @RequestParam String phone,

			Model model) {
		
		log.trace("get all clients");
		model.addAttribute("clients", repo.findAll());
		
		if (clientName.isEmpty()) { 
			String errorMessage = String.format("***Client name is missing!***");
			model.addAttribute("errorMessage", errorMessage);
			
			return "/project/red/clients";
		}
		
		Client client = new Client(clientName, email, phone);
		repo.save(client);
		model.addAttribute("clients", repo.findAll());
		
		String clientSaved = String.format("***New client inserted!***");
		model.addAttribute("clientSaved", clientSaved); 
		
		return "/project/red/clients";
		
	}

	@GetMapping("/project/red/deleteClient")
	public String delete(@RequestParam Long clientId,

			Model model) {
		
		log.trace("get all clients");
		model.addAttribute("clients", repo.findAll());
		
		
		if (clientId == null){ 
			String errorMessage = String.format("***Impossible to remove without parameters!***");
			model.addAttribute("errorMessage", errorMessage);
			
			return "/project/red/clients";
		}
		
		Long Id = clientId;
		repo.deleteById(Id);
		model.addAttribute("clients", repo.findAll());
		
		String clientDeleted = String.format("***Client deleted!***");
		model.addAttribute("clientDeleted", clientDeleted);
	
		
		return "/project/red/clients";

	}
	
}