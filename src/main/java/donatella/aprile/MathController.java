package donatella.aprile;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MathController {
	private static final Logger log = LoggerFactory.getLogger(MathController.class);
	

	@GetMapping("/donatella/add")
	public String add(//
			@RequestParam int x, //
			@RequestParam int y, //
			Model model) {//
		log.trace("add:"+x + "," + y);

		model.addAttribute("x",x);
		model.addAttribute("y",y);
		model.addAttribute("resul",x +y);
		return "/donatella/result";
	}
	
@GetMapping("/donatella/find")
public String find(
		@RequestParam double a,
		@RequestParam double b,
		@RequestParam double c,
		Model model) {
	log.trace("");
	model.addAttribute("a",a);
	model.addAttribute("b",b);
	model.addAttribute("c",c);
	model.addAttribute("min",Math.min(c,Math.min(a, b)));
	model.addAttribute("max",Math.max(c,Math.max(a, b)));
	model.addAttribute("avg",(a+b+c)/3);
	return"/donatella/result2";
	
}
		
}
