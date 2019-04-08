package monica.controller_applicat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




@Controller
public class MathController {
	private static final Logger log = LoggerFactory.getLogger(OvedController.class);
	
	@GetMapping("/monica/add")
	public String Add (
			@RequestParam(name= "valueX") int x, //
			@RequestParam(name= "valueY") int y, //
			Model model) { //
		
		log.trace("add:" + x +  "," + y );
		
		model.addAttribute("x", x);
		model.addAttribute("y", y);
		model.addAttribute("result", x + y );
		
		return "/monica/result";
	
	}
	
	@GetMapping("monica/double")
	public String Value(
			@RequestParam(name= "valueX") double x,
			@RequestParam(name= "valueY") double y,
			@RequestParam(name= "valueZ") double z,
			Model model) {
		double max = Math.max(Math.max(x, y),z);
		double min = Math.min(Math.min(x, y),z);
		
		
		model.addAttribute("Max", max);
		model.addAttribute("Min", min);
		model.addAttribute("Avg", x + y + z/ 3 );
		
		
	return "/monica/doubleResult";
	
		}
}
