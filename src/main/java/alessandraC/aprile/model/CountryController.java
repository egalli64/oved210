package alessandraC.aprile.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {
	private static final Logger log = LoggerFactory.getLogger(CountryController.class);

	@Autowired
	private RegionRepository repo;
	
	@GetMapping("/alessandraC/countries")
	public String allRegions(Model model) {
		log.trace("get all countries");
		model.addAttribute("countries", repo.findAll());
		return "/alessandraC/countries";
		
	}

}

	


