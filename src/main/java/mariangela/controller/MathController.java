package mariangela.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MathController {
	private static final Logger log = LoggerFactory.getLogger(MathController.class);

	@GetMapping("/mariangela/form")
	public String add( //
			@RequestParam int x, //
			@RequestParam int y, //
			Model model) { //
		log.trace("enter add()");

		model.addAttribute("x", x);
		model.addAttribute("y", y);
		model.addAttribute("result", x + y);

		return "/mariangela/result";
	}

		@GetMapping("/mariangela/avg")
		public String add( //
				@RequestParam double x, //
				@RequestParam double y, //
				@RequestParam double z, //
			 //
				Model model) { //
			log.trace("enter mma()");

			model.addAttribute("x", x);
			model.addAttribute("y", y);
			model.addAttribute("z", z);
			model.addAttribute("avg", (x + y + z) / 3);
			double maximum = Math.max(x, y);
			model.addAttribute("MAX", Math.max(maximum, z));
			double minimum = Math.min(x, y);
			model.addAttribute("min", Math.min(minimum, z) );

			return "/mariangela/result2";
		}

	
}
