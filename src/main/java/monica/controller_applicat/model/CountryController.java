package monica.controller_applicat.model;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.LoggerFactory;

@Controller
public class CountryController {
	private static final Logger log = LoggerFactory.getLogger(CountryController.class);

	@Autowired
	private CountryRepository count;

	@GetMapping("/monica/countries")
	public String allCountries(Model model) {
		log.trace("get all countries");
		model.addAttribute("countries", count.findAll());
		return "/monica/countries";

	}

}
