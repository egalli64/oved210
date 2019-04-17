package project.blue;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlueController {
	private static final Logger log = LoggerFactory.getLogger(BlueController.class);
	private static String user;
	private static String password;
	
	@Value("${admin}")
	private String admin;

	@Value("${admin.password}")
	private String adminPassword;


	@Autowired
	private BlueClientRepository repClient;

	@PostMapping("/project/blue/login")
	public String login( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		
		if (user.equals(admin) && password.equals(adminPassword)) {
			return "project/blue/response";
		}
		return "project/blue/reject";
	}


	@GetMapping("/project/blue/login")
	public String login(Model model) {
		model.addAttribute("user", BlueController.user);

		return "/project/blue/response";
	}

	@GetMapping("/project/blue/clients/all")
	public String allClients(Model model) {
		log.trace("get all clients");
		try {
			model.addAttribute("clients", repClient.findAll());
		} catch (Exception ex) {
			log.error("Can't get clients", ex);
			return "/project/blue/reject";
		}
		return "/project/blue/clients";
	}

	// controller per tornare hotelDescription
	@GetMapping("/project/blue/city/view")
	public String viewCity(Model model) {
		return "/project/blue/hotelDescription";  // TODO: da modificare 
	}
	// controller add clients
	@GetMapping("/project/blue/clients/add")
	public String addClient( //
			@RequestParam String name, //
			@RequestParam String email, //
			@RequestParam Long phone, //
			@RequestParam int mode,
			Model model) {
		log.trace("get all clients");
		try {
			BlueClient client = new BlueClient();

			client.setClientName(name);
			client.setEmail(email);
			client.setPhone(phone);
			

			repClient.save(client);
			model.addAttribute("clients", repClient.findAll());
			model.addAttribute("SaveClient", "--New client inserted!--");
		} catch (Exception ex) {
			model.addAttribute("duplicatedmail", "--Mail already existing!--");
		}
		if(mode== 0 ) {
		return "/project/blue/clients";
		}else {
			return viewCity(model);
		}
	}

	// controller remove clients
	
	@GetMapping("/project/blue/clients/remove")

	public String removeClient(@RequestParam Long id, Model model) {
		log.trace("delete client");

		try {

			repClient.deleteById(id);

			model.addAttribute("clients", repClient.findAll());
			String deleteClient = String.format("--Client deleted!--");
			model.addAttribute("deleteClient", deleteClient);

		} catch (Exception ex) {
			String unexistingdId = String.format("--Unexisting Id!--");
			model.addAttribute("unexistingdId", unexistingdId);
		}

		return "/project/blue/clients";

	}

	// controller edit clients
	
	@GetMapping("/project/blue/editClient")
	public String editClientFirst( //
			@RequestParam Long clientId, //
			Model model) {
		log.trace("edit client");

		Optional<BlueClient> opt = repClient.findById(clientId);
		if (opt.isPresent()) {
			BlueClient client = opt.get();

			model.addAttribute("clientId", client.getClientId());
			model.addAttribute("clientName", client.getClientName());
			model.addAttribute("email", client.getEmail());
			model.addAttribute("phone", client.getPhone());
		}
		return "/project/blue/editClient";
	}

	@GetMapping("/project/blue/editReadClient")
	public String editClientSecond( //
			@RequestParam Long clientId, @RequestParam String clientName, //
			@RequestParam String email, //
			@RequestParam Long phone, //

			Model model) {
		log.trace("edit client");

		BlueClient client = new BlueClient(clientId, clientName, email, phone);

		repClient.save(client);

		model.addAttribute("editClient", "--Client modified!--");
		model.addAttribute("clients", repClient.findAll());

		return "/project/blue/clients";
	}
	
	
	

	
	
}
