package marina.apr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MathController {
	private static final Logger log= LoggerFactory.getLogger(MathController.class);

//	@GetMapping("/marina/add")
//	public String add(
//			@RequestParam int x, 
//			@RequestParam int y, 
//			Model model) {
//		log.trace("add:" + x + ", " + y );
//		
//		model.addAttribute("x", x);
//		model.addAttribute("y", y);
//		model.addAttribute("result", x + y);
//		
//		return "marina/result";
//	}
	
	
	@GetMapping("/marina/operation")
	public String operation(
			@RequestParam(name = "a") double a, 
			@RequestParam(name = "b") double b,
			@RequestParam(name = "c") double c,
			Model model) {
		
		model.addAttribute("avg", a + b + c / 3);
		Double maximum = Math.max(a, b);
		model.addAttribute("max", Math.max(maximum,c));
		Double minimum = Math.min(a, b);
		model.addAttribute("min", Math.min(minimum, c));
		
		return "marina/result";
	}
	
	
	
	
	
	
	
}
