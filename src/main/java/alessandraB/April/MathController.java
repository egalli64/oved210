package alessandraB.April;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MathController {
	private static final Logger log = LoggerFactory.getLogger(OvedApp.class);

	@GetMapping("/alessandraB/add")
	public String add(@RequestParam int x, //
			@RequestParam int y, //
			Model model) { //
		log.trace("add:"+ x + "," + y); // il nome del log indica il livello di logging (il trace è il più basso, debug
									// è più in alto, info fa vedere info warning ed error)
		
		
		model.addAttribute("x", x);
		model.addAttribute("y", y);
		
		int result = x + y;
		model.addAttribute("result", result);

		return "/alessandraB/result";

	}

}
