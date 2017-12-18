package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@Controller
public class pidController {
	@Autowired
 pidProperties props;
	@Autowired
	State state;
	@RequestMapping(value = "/pid")	
	
	public String pid_calc(Model model) {


	state.setstate(props);
	
	//int et=props.getsv()-pidutils.getTemp();
		
	model.addAttribute("hw", state.getbrasenhaim());
	model.addAttribute("et", state.getet());
	return "pid";
	}
}