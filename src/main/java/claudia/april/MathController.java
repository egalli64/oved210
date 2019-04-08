package claudia.april;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MathController {
	private static final Logger log = LoggerFactory.getLogger(Oved210Application.class);

	@GetMapping("/claudia/add")
	public String add(//
			@RequestParam int x, //
			@RequestParam int y, //
			Model model) {//
		log.trace("add:" + x + ", " + y);

		model.addAttribute("x", x);
		model.addAttribute("y", y);
		model.addAttribute("result", x + y);
		return "/claudia/result";
	}

	@GetMapping("/claudia/calc")
	public String calc(//
			@RequestParam double a, //
			@RequestParam double b, //
			@RequestParam double c, //
			Model model) {//
		log.trace("calc:" + a + ", "+ b);

		model.addAttribute("a", a);
		model.addAttribute("b", b);
		model.addAttribute("c", c);
		model.addAttribute("max", Math.max(c, Math.max(a, b)));
		model.addAttribute("min", Math.min(c, Math.min(a, b)));
		model.addAttribute("average", (a + b + c) / 3);
		return "/claudia/result2";
	}
}