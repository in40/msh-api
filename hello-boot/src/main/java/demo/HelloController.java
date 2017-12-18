package demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	private String message = "Hello World";

	@RequestMapping(value = "/")
	String home() {
		return "home";
	}


	
	@RequestMapping("/jsp")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/hello2")
	public String hello(@RequestParam String name) {
	//	return props.getGreeting()+name;
		return "myView";
	}
}
