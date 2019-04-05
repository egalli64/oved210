package dd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Oved210Controller {
	private static final Logger logger = LoggerFactory.getLogger(Oved210Controller.class);

	// this is not a good idea!
	@GetMapping("/login")
	public String loginByGet( //
			@RequestParam(name = "user", defaultValue = "Unknown") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		logger.warn("GET login attempt for user: " + user);

		model.addAttribute("user", user);
		model.addAttribute("password", password);
		return "welcome";
	}

	@PostMapping("/login")
	public String login( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		logger.debug("Login attempt for user: " + user);

		model.addAttribute("user", user);
		return "welcome";
	}
}
