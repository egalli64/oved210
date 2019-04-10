package project.red;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingController {
	private static final Logger log = LoggerFactory.getLogger(BookingController.class);

	@Autowired
	private BookingRepository repo;

	@GetMapping("/project/red/bookings")
	public String allBookings(Model model) {
		log.trace("get all bookings");
		model.addAttribute("bookings", repo.findAll());
		return "/project/red/bookings";
	}
}