package backend.viikko1.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EkaController {

	@RequestMapping("/")
	public @ResponseBody String hello(@RequestParam(required = false)String nimi) {
		return "Terve maailma" + " Mikke";
	}

	@RequestMapping("/about")
	public @ResponseBody String tietoja() {
		return "Moi maailma";
	}
}
