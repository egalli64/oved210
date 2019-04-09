package trainer.apr;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import trainer.jdbcSpring.Region;

@Controller
public class OvedController {
	private static final Logger logger = LoggerFactory.getLogger(OvedController.class);

	@Value("${admin}")
	private String admin;

	@Value("${admin.password}")
	private String adminPassword;

	@RequestMapping(value = {"/trainer", "/trainer/"})
	public String getAdminUi() {
		return "/trainer/index.html";
	}
	
	@PostMapping("/trainer/login")
	public String login( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		logger.debug("Login attempt for user: " + user);
		model.addAttribute("user", user);

		if (user.equals(admin) && password.equals(adminPassword)) {
			return "trainer/welcome";
		}

		logger.info("No login for " + user + "/" + password);
		return "trainer/rejected";
	}

	@GetMapping("/trainer/simple")
	public String simple(Model model) {
		logger.trace("Enter simple()");

		// JPA emulation
		List<Region> regions = Arrays.asList(
			new Region(1, "Europe"),
			new Region(2, "Antartica")
		);

		model.addAttribute("regions", regions);
		model.addAttribute("errorMessage",
				"Something went wrong");
		return "trainer/simple";
	}
}
