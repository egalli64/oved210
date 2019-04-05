package alessandraC.aprile;
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

import alessandraC.jdbcSpring.Region;

@Controller
public class Oved210Controller {
	private static final Logger logger = LoggerFactory.getLogger(Oved210Controller.class);
	
	@Value("${admin}")
	private String admin;
	
	@Value("${admin.password}")
	private String adminPassword;

	// this is not a good idea!
//	@GetMapping("/alessandraC/login")
//	public String loginByGet( //
//			@RequestParam(name = "user", defaultValue = "Unknown") String user, //
//			@RequestParam(name = "password") String password, //
//			Model model) {
//		logger.debug("Login attempt for user: " + user);
//
//		model.addAttribute("user", user);
//		
//		
	

	@PostMapping("/alessandraC/login")
	public String login( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		logger.debug("Login attempt for user: " + user);
		model.addAttribute("user", user);
			if(user.equals(admin) && password.equals(adminPassword))  {
			
			
			return "alessandraC/welcome";
			} 
				return "alessandraC/rejected";
			}
	
	@GetMapping("/alessandraC/simple")
	public String simple(Model model) {
		logger.trace("Enter simple()");
		
		
		
		//JPA emulation
		List<Region> regions = Arrays.asList(
				new Region(1, "Europe"),
				new Region(2, "Antartica")
		);
		
		model.addAttribute("regions", regions);
				return "alessandraC/simple";
		
	}
		

	
	}



