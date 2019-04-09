package project.green;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreenClientsController {
	private static final Logger log =
			LoggerFactory.getLogger(GreenClientsController.class);
	@Autowired
	private GreenClientsRepository repo;
	
	@GetMapping("/project/green/clients")
	public String allClients(Model model) {
		log.trace("get all clients");
		model.addAttribute("clients", repo.findAll());
		return "/project/green/clients"; 
	}
	

}

