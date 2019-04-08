package sara.APRILE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MathController {
	private static final Logger log = LoggerFactory.getLogger(Oved210Controller.class);

	@GetMapping("/sara/add")
	public String add( //
			@RequestParam int x, //
			@RequestParam int y, //
			Model model) { //
		log.trace("add:" + x + "," + y);
		
		model.addAttribute("x", x);
		model.addAttribute("y", y);
		model.addAttribute("result", x + y);
		
		return "/sara/result";
	}
}
