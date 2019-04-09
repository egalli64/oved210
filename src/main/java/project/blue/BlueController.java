package project.blue;


import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



import org.slf4j.LoggerFactory;


	@Controller
	public class BlueController {
		private static final Logger log = LoggerFactory.getLogger(BlueController.class);

		@Autowired
		private BlueClientRepository blue;

		@GetMapping("project/blue/clients")
		public String allClients(Model model) {
			log.trace("get all clients");
			model.addAttribute("clients", blue.findAll());
			return "project/blue/clients";

		}

	}

	
	
	

