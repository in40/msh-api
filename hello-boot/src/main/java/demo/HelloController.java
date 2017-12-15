package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class HelloController {

	@Autowired
	HelloProperties props;
	
	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {
		return props.getGreeting()+name;

	}
}