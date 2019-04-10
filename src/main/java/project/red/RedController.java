package project.red;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedController {
	private static final Logger logger = LoggerFactory.getLogger(RedController.class);
	
	private static String user = null;

	@Value("${admin}")
	private String admin;

	@Value("${admin.password}")
	private String adminPassword;

	@PostMapping("/project/red/login")
	public String login( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		logger.debug("Login attempt for user: " + user);

		model.addAttribute("user", user);

		if (user.equals(admin) && password.equals(adminPassword)) {
			RedController.user = user;
			return "/project/red/welcome";
		}
		return "/project/red/reject";
	}
	

	@GetMapping("/project/red/login")
	public String backToLogin(Model model) {
		logger.debug("Back to login for: " + RedController.user);

		model.addAttribute("user", user);

		return "/project/red/welcome";
	}

}