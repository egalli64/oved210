package alessandraB.April;

import javax.validation.constraints.Max;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoubleABC {

		private static final Logger log = LoggerFactory.getLogger(OvedApp.class);

		@GetMapping("/alessandraB/abc")
		public String find(@RequestParam double a, //
				@RequestParam double b, //
				@RequestParam double c,
				Model model) { //
			log.trace("add:"+ a + "," + b + "," + c); // il nome del log indica il livello di logging (il trace è il più basso, debug
										// è più in alto, info fa vedere info warning ed error)
			
			
			model.addAttribute("a", a);
			model.addAttribute("b", b);
			model.addAttribute("c", c);
			
//			double max;
//			if(a > b) {
//				if(a > c) {
//					max = a;
//				}
//				else {
//					max = c;
//				}
//			} else {
//				if(b > c) {
//					max = b;
//				}
//				else {
//					max = c;
//				}				
//			}
			
			double max = Math.max(Math.max(a, b), c);	
            model.addAttribute("max",max);
            
			double min = Math.min(Math.min(a, b), c);	 
			model.addAttribute("min",min);
			double avg = ((a + b + c)/3);
			model.addAttribute("avg", avg);
			return "/alessandraB/order";

		}
}


		



