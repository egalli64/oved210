package tiziana.controller;

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

import tiziana.jdbcSpring.Region;

@Controller
public class Oved210Controller {
	private static final Logger logger = LoggerFactory.getLogger(Oved210Controller.class);

	@Value("${admin}")
	private String admin;

	@Value("${admin.password}")
	private String adminPassword;

	@PostMapping("/tiziana/login")
	public String login( //
			@RequestParam(name = "user") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		logger.debug("Login attempt for user: " + user);
	
		model.addAttribute("user", user);
		
		if(user.equals(admin) && password.equals(adminPassword)) {
			
		return "tiziana/welcome";
	}
		return "tiziana/reject";
	
	}
	
	
	
	
	
	@GetMapping("/tiziana/simple")
	public String simple(Model model) {
		logger.trace("Enter simple()");
		
		//JPA emulation
		List<Region> regions = Arrays.asList(   //sto creando una lista di regioni
				new Region(1, "Europe"),        //creo il costruttore in Region(jdbcSpring)
				new Region(2, "Antartica")
		);
		
		
		model.addAttribute("regions", regions);
		return "tiziana/simple";
	}


	
	
	
//this is not a good idea!
	@GetMapping("/tiziana/login")
	public String loginByGet( //
			@RequestParam(name = "user", defaultValue = "Unknown") String user, //
			@RequestParam(name = "password") String password, //
			Model model) {
		logger.warn("GET login attempt for user: " + user);

		model.addAttribute("user", user);
		model.addAttribute("password", password);
		return "welcome";
	}
}
