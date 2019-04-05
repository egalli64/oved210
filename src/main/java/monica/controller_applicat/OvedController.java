package monica.controller_applicat;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import monicaJdbc.Region;

@Controller
public class OvedController {
	private static final Logger logger = LoggerFactory.getLogger(OvedController.class);

		@Value("${admin}")   //stiamo dicendo a spring che nel file di configurazione dobbiamo prendere admin 
		private String admin;
		@Value("${admin.password}") //in questo caso nel file di configurazione deve prendere admin.password
		private String adminPassword;

	//@PostMapping("/monica/login")
	//public String loginFirstVersion( //
			//@RequestParam(name = "user") String user, //
			//@RequestParam(name = "password") String password, //
			//Model model) {
		//logger.debug("Login attempt for user: " + user);

		//model.addAttribute("user", user);
		//return "monica/response";
	//}
	
	@PostMapping("/monica/login")
	public String loginSecondVersion( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {

		logger.debug("Login attempt for user: " + user);
		model.addAttribute("user", user);

		if (user.equals(admin) && password.equals(adminPassword)) {
			return "monica/response";
		}

		return "monica/rejected";
	}
	
	@GetMapping("/monica/simple")
	public String simple(Model model) {
		logger.trace("Enter simple()");

		
		//JPA emulation (simulazione che ritorna un paio di regioni)
		List<Region> regions = Arrays.asList(

				new Region(1, "Europe"), 
				new Region(2, "Antartica")

		);
		

		model.addAttribute("regions", regions);
		return "monica/simple";
		
	}
	
	
	
}