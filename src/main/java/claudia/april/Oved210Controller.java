package claudia.april;

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

import claudia.jdbcSpring.entities.Region;

@Controller
public class Oved210Controller {
	private static final Logger logger = LoggerFactory.getLogger(Oved210Controller.class);
	
	@Value("${admin}")
	private String admin;
	@Value("${admin.password}")
	private String adminPassword;
	
	// this is not a good idea!
	@GetMapping("/claudia/login")
	public String loginByGet( //
			@RequestParam(name = "user", defaultValue = "Unknown") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		logger.warn("GET login attempt for user: " + user);

		model.addAttribute("user", user);
		model.addAttribute("password", password);
		return "/claudia/welcome";
	}

	//@PostMapping("/claudia/login")
	//public String loginFirst( //
			//@RequestParam(name = "user") String user, //
			//@RequestParam(name = "password") String password, //
			//Model model) {
		//logger.debug("Login attempt for user: " + user);
		//model.addAttribute("user", user);
		//return "claudia/welcome";
	//}
	
	@PostMapping("/claudia/login")
	public String login( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		logger.debug("Login attempt for user: " + user);
		model.addAttribute("user", user);
		
		if(user.equals(admin) && password.equals(adminPassword)) {
			return "claudia/welcome";
		}
		
		return "claudia/notWelcome";
	}
	@GetMapping("/claudia/simple")
	public String simple(Model model) {
		logger.trace("Enter simple()");
		
		//JPA emulation
		List<Region> regions = Arrays.asList(
				new Region(1, "Europe"),
				new Region(2, "Americas")
				);
		
		model.addAttribute("regions", regions);
		logger.trace(regions.toString());
		return "claudia/simple";
	}
}
