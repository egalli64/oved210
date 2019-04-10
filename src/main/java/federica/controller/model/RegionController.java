package federica.controller.model;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RegionController {
	private static final Logger log = LoggerFactory.getLogger(RegionController.class);

@Autowired
private RegionRepository repo;

@GetMapping("/federica/regions")
public String allregions(Model model) {
	log.trace("get all regions");
	model.addAttribute("regions", repo.findAll());
	return "/federica/regions";
	
}
}
