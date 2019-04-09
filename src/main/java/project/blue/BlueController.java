package project.blue;


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

		@Autowired
		private BlueClientRepository blue;


		@PostMapping("/project/blue/login")
		public String login( //
				@RequestParam(name = "user") String user, //
				@RequestParam(name = "password") String password, //
				Model model) {
			model.addAttribute("user", user);
			
			return "/project/blue/response";
		}

		
		@GetMapping("/project/blue/clients")
		public String allClients(Model model) {
			log.trace("get all clients");
			model.addAttribute("clients", blue.findAll());
			return "project/blue/clients";

		}

	}

	
	
	

