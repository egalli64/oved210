package project.green;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingsController {
	private static final Logger log = LoggerFactory.getLogger(BookingsController.class);

	@Autowired
	private BookingsRepository repo;

	@GetMapping("/project/green/bookings")
	public String AllBookings(Model model) {
		log.trace("get all Bookings");
		model.addAttribute("Bookings", repo.findAll());
		return "/project/green/bookings";
	}
}