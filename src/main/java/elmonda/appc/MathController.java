package elmonda.appc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MathController {
	private static final Logger log = LoggerFactory.getLogger(Oved210Controller.class);
	@GetMapping("/elmonda/add")
	public String add(//
			@RequestParam double a, //
			@RequestParam double b,//
			@RequestParam double c,	
			Model model) {//
		log.trace("add:" + a +", " + b +", " + c);
				
		
		model.addAttribute("a",a);
		model.addAttribute("b",b);
		model.addAttribute("c",c);
		model.addAttribute("avg",(a + b + c)/3);
		
		Double maximum = Math.max(a, b);
		model.addAttribute("max", Math.max(maximum, c));
		
		Double minimum = Math.min(a,  b);
		model.addAttribute("min", Math.min(minimum, c));
		
		

		
		
		
	

		return "/elmonda/result";
	}
}
