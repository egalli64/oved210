package monica.controller_applicat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OvedController {
	private static final Logger logger = LoggerFactory.getLogger(OvedController.class);


	@PostMapping("/monica/login")
	public String login( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		logger.debug("Login attempt for user: " + user);

		model.addAttribute("user", user);
		return "monica/response";
	}
}
