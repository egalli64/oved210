package project.red;

import java.util.Optional;

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
	private ClientRepository crepo;

	@GetMapping("/project/red/clients")
	public String allClients(Model model) {
		log.trace("get all clients");
		model.addAttribute("clients", crepo.findAll());
		return "/project/red/clients";
	}

	@GetMapping("/project/red/insertClient")
	public String create(@RequestParam String clientName, @RequestParam String email, @RequestParam String phone,

			Model model) {
		model.addAttribute("clientName", clientName);
		model.addAttribute("email", email);
		model.addAttribute("phone", phone);

		log.trace("get new client");

		if (clientName.isEmpty()) {
			model.addAttribute("errorClient", "***Client name is missing!***");

			return "/project/red/insertClient";
		}
		try {
			Client client = new Client(clientName, email, phone);
			crepo.save(client);
			model.addAttribute("clients", crepo.findAll());

			String clientSaved = String.format("***New client inserted!***");
			model.addAttribute("clientSaved", clientSaved);

			return "/project/red/clients";
		} catch (Exception ex) {
			model.addAttribute("errorEmail", "***Mail already existing!***");
			model.addAttribute("email", email);

			return "/project/red/insertClient";
		}

	}

	@GetMapping("/project/red/deleteClient")
	public String delete(@RequestParam Long clientId,

			Model model) {

		log.trace("get deleted client");
		model.addAttribute("clients", crepo.findAll());

		if (clientId == null) {
			String errorMessage = String.format("***Impossible to remove without inserting Id!***");
			model.addAttribute("errorMessage", errorMessage);

			return "/project/red/clients";
		}

		try {
			crepo.deleteById(clientId);
			model.addAttribute("clients", crepo.findAll());

			String clientDeleted = String.format("***Client deleted!***");
			model.addAttribute("clientDeleted", clientDeleted);

		} catch (Exception ex) {
			String unexistingdId = String.format("***Unexisting Id!***");
			model.addAttribute("unexistingdId", unexistingdId);
		}

		return "/project/red/clients";

	}

	@GetMapping("/project/red/editClient")
	public String edit(@RequestParam long clientId, Model model) {

		log.trace("edit client");

		Optional<Client> opt = crepo.findById(clientId);
		if (opt.isPresent()) {
			Client client = opt.get();

			model.addAttribute("clientId", client.getClientId());
			model.addAttribute("clientName", client.getClientName());
			model.addAttribute("email", client.getEmail());
			model.addAttribute("phone", client.getPhone());
		}

		return "/project/red/editClient";

	}

	@GetMapping("/project/red/saveClient")
	public String save(@RequestParam long clientId, //
			@RequestParam String clientName, //
			@RequestParam String email, //
			@RequestParam String phone, //
			Model model) {
		
		model.addAttribute("clientName", clientName);
		model.addAttribute("email", email);
		model.addAttribute("phone", phone);

		log.trace("saving modified client");

		if (clientName.isEmpty()) {
			model.addAttribute("errorClient", "***Client name is missing!***");

			return "/project/red/editClient";
		}
		try {
			Client client = new Client(clientId, clientName, email, phone);

			crepo.save(client);
			model.addAttribute("messageEdit", "***Client modified!***");
			model.addAttribute("clients", crepo.findAll());

		} catch (Exception ex) {
			model.addAttribute("errorEmail", "***Mail already existing!***");
			model.addAttribute("email", email);

			return "/project/red/editClient";
		}

		return "/project/red/clients";
	}
}