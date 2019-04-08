package alessandraC.aprile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MathController {
	private static final Logger log = LoggerFactory.getLogger(MathController.class);
	
	@GetMapping("/alessandraC/add")
	public String add(
			@RequestParam(name = "x")int x,  //
			@RequestParam(name = "y")int y,  //
			Model model) {  //
		log.trace("add:" + x + ", " + y);
		model.addAttribute("x", x);
		model.addAttribute("y", y);
		model.addAttribute("result", x + y);
		return "alessandraC/result";
	}
	
	@GetMapping("/alessandraC/functions")
	public String add(
			@RequestParam(name = "a")double a,  //
			@RequestParam(name = "b")double b,  //
			@RequestParam(name = "c")double c,  //
			Model model) {  //
		
		Double min = Math.min(a, b);
		model.addAttribute("min", Math.min(min, c));
		Double max = Math.max(a, b);
		model.addAttribute("max", Math.max(max, c));
		model.addAttribute("avg", (a + b + c)/3 );
		return "alessandraC/result";
}
}


	

		
	

	
