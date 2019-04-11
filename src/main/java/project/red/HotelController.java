package project.red;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


	@Controller
	public class HotelController {
		private static final Logger log = LoggerFactory.getLogger(HotelController.class);

		@Autowired
		private HotelRepository repo;

		@GetMapping("/project/red/hotels")
		public String allHotels(Model model) {
			log.trace("get all hotels");
			model.addAttribute("hotels", repo.findAll());
			return "/project/red/hotels";
		}
	}
