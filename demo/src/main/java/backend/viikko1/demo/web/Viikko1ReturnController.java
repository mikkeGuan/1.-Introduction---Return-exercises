package backend.viikko1.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Viikko1ReturnController {

	@RequestMapping("/index")
	public @ResponseBody String indeksi(){
		return "This is the main page";
	}

	@RequestMapping("/contact")
	public @ResponseBody String kontakti() {
		return "This is the contact page";
	}
	@RequestMapping("/hello")
	public  @ResponseBody String location(@RequestParam String location, @RequestParam String name) {
		return "Welcome to the " + location + " " + name;
	}
	
}
