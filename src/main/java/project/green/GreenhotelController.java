package project.green;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenhotelController {
	private static final Logger log = LoggerFactory.getLogger(GreenhotelController.class);

	@Autowired
	private GreenhotelRepository repo;

	@GetMapping("/project/green/GreenHotel")
	public String allGreenHotels(Model model) {
		log.trace("get all GreenHotel");
		model.addAttribute("GreenHotel", repo.findAll());
		return "/project/green/GreenHotel";
	}
}
