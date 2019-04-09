package elmonda.appc.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RegionController {
	private static final Logger log =
			LoggerFactory.getLogger(RegionController.class);
	
	@Autowired
	private RegionRepository repo;
	
	@GetMapping("/elmonda/regions")
	public String allRegions(Model model) {
		log.trace("get all regions");
		model.addAttribute("regions", repo.findAll());
		return "/elmonda/regions"; 
	}
	

}
