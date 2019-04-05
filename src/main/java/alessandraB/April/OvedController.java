package alessandraB.April;

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

import alessandraB.jdbcSpring.entities.Region;

@Controller
public class OvedController {
	private static final Logger logger = LoggerFactory.getLogger(OvedController.class);

	// this is not a good idea!
	@Value("${admin}")
	private String admin;
	@Value("${admin.password}")
	private String adminPassword;

	@PostMapping("/alessandraB/request")
	public String loginSecondVersion( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		logger.debug("Login attempt for user: " + user);

		model.addAttribute("user", user);

		if (user.equals(admin) && password.equals(adminPassword)) {
			return "/alessandraB/response";
		} else {
			return "/alessandraB/error";
		}
	}

	@GetMapping("/alessandraB/simple")
	public String simple(Model model) {
		logger.trace("Enter simple()");

		// JPA EMULATION
		List<Region> regions = Arrays.asList(

				new Region(1, "Europe"), new Region(2, "Antartica"));

		model.addAttribute("regions", regions);
		

		return "alessandraB/simple";

	}
}
