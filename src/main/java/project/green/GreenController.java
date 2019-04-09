package project.green;

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

import elmonda.jdbcSpring.Region;

@Controller
public class GreenController {
	private static final Logger logger = LoggerFactory.getLogger(GreenController.class);
	
	@Value("${admin}")
	private String admin;
	
	@Value("${admin.password}")
	private String adminPassword;

	@PostMapping("/project/green/login")
	public String login( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		logger.debug("Login attempt for user: " + user);

		model.addAttribute("user", user);

		if (user.equals(admin) && password.equals(adminPassword)) {
			return "/project/green/welcomegreen";
		}

		logger.info("No login for" + user + "/" + password);
		return "elmonda/rejected";
	}
}
